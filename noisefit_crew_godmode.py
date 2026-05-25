"""
NoiseFit Crew (IDO OS / com.zhapp.ble) direct BLE client.

Bypasses the Android app and authenticates straight to the watch using the
verifyUserId pulled from a previously-bound app session.

Reverse-engineered from logs.txt (full handshake captured 2026-05-23 13:20:30..36).

------------------------------------------------------------------------------
PROTOCOL CHEATSHEET
------------------------------------------------------------------------------
GATT (custom base UUID 00807f9b34fb -- note 7f, NOT 5f):

  16186f01-0000-1000-8000-00807f9b34fb  notify  (RX from watch -- "PROTOBUF_01")
  16186f02-0000-1000-8000-00807f9b34fb  write+notify (TX to watch -- "PROTOBUF_02")
  16186f03..f05                          notify  (auxiliary channels)

The watch enables 5 notify channels at connect time (f01..f05) and refuses
to talk if any are missing -- partial CCCD subscription is the cause of the
"start_notify on 0020: Unreachable" failure most third-party scripts hit.

------------------------------------------------------------------------------
TRANSPORT FRAMING (the "secret sauce" header, 6 bytes):

  byte[0]  frame type   00=control, 01=payload
  byte[1]  sequence id  (low byte; we use 0x00 like the app does)
  byte[2]  ack flag     00=request, 01=ack
  byte[3]  payload len  (single byte, varint-style for <128)
  byte[4]  reserved 00
  byte[5]  reserved 00

Every protobuf payload is sent as a 3-step dance on f02 (TX):
  1. TX f02:   00 00 00 00 01 00          (control: "I want to send")
  2. RX f02:   00 00 01 01 00 00          (control: "ack, go ahead")
  3. TX f02:   01 00 <pb-bytes>           (payload, len byte at [3])
  4. RX f02:   00 00 01 00 00 00          (control: "frame done")

The watch's reply comes back on f01 with the symmetric dance:
  5. RX f01:   00 00 00 00 01 00
  6. TX f01:   00 00 01 01 00 00          (we ack)
  7. RX f01:   01 00 <pb-bytes>           (the response)
  8. TX f01:   00 00 01 00 00 00          (we end-ack)

------------------------------------------------------------------------------
PROTOBUF (SEWear, see WearProtos.java):

  field 1  id            uint32  SEFunctionId enum
  field 2  change_mtu
  field 3  bind_account
  field 4  device
  ...
  field 99 ble_connect_parameter_config (wire tag 0x9A 0x06)
  field 100 error_code

Function IDs of interest:
  0   MTU_REQUEST_CHANGE
  16  INQUIRY_BINDING_STATUS
  17  BINDING_CHECK         (only for new pairings -- not used here)
  18  BINDING_RESULT        (only for new pairings)
  19  VERIFY_USER_NUMBER    <-- our skeleton key
  32  GET_DEVICE_INFO
  33  GET_DEVICE_BATTERY_STATUS
  34  GET_DEVICE_DISCONNECT_REASON
  48  SET_SYSTEM_TIME
  178 SEND_SYSTEM_NOTIFICATION
  180 SEND_CALL_STATE
  195 SYNC_MUSIC_INFO

------------------------------------------------------------------------------
DEVICE DEFAULTS pulled from logs.txt:
  MAC          D6:35:06:D0:A2:FA
  verifyUserId 629cac508942951614   (replace with your own from app prefs)
  firmware     1.0.5
"""

import asyncio
import logging
from typing import Optional

from bleak import BleakClient, BleakScanner

# ----- defaults from logs.txt; override on the command line if needed --------
DEVICE_MAC      = "D6:35:06:D0:A2:FA"
DEVICE_NAME     = "NoiseFit Crew"
VERIFY_USER_ID  = "629cac508942951614"   # 18-char ASCII; from Android SharedPreferences

# ----- GATT --------------------------------------------------------------------
BASE_SUFFIX = "0000-1000-8000-00807f9b34fb"   # note: 00807f, not 00805f
UUID_F01    = f"16186f01-{BASE_SUFFIX}"   # RX (watch -> phone)
UUID_F02    = f"16186f02-{BASE_SUFFIX}"   # TX (phone -> watch) + RX
UUID_F03    = f"16186f03-{BASE_SUFFIX}"
UUID_F04    = f"16186f04-{BASE_SUFFIX}"
UUID_F05    = f"16186f05-{BASE_SUFFIX}"
NOTIFY_UUIDS = [UUID_F01, UUID_F02, UUID_F03, UUID_F04, UUID_F05]

# ----- transport-frame constants ----------------------------------------------
HDR_CLAIM = bytes.fromhex("000000000100")     # I want to send
HDR_GO    = bytes.fromhex("000001010000")     # ack: go ahead
HDR_DONE  = bytes.fromhex("000001000000")     # frame done

PAYLOAD_PREFIX = bytes.fromhex("0100")        # first 2 bytes of every payload frame

# ----- protobuf helpers (we hand-roll, no protoc dependency) -------------------
def _varint(n: int) -> bytes:
    out = bytearray()
    while True:
        b = n & 0x7F
        n >>= 7
        if n:
            out.append(b | 0x80)
        else:
            out.append(b)
            return bytes(out)

def _tag(field_no: int, wire_type: int) -> bytes:
    return _varint((field_no << 3) | wire_type)

def pb_uint32(field: int, value: int) -> bytes:
    return _tag(field, 0) + _varint(value)

def pb_string(field: int, value: str) -> bytes:
    raw = value.encode("utf-8")
    return _tag(field, 2) + _varint(len(raw)) + raw

def pb_message(field: int, body: bytes) -> bytes:
    return _tag(field, 2) + _varint(len(body)) + body

# ----- SEWear builders --------------------------------------------------------
def cmd_mtu_request() -> bytes:
    """ SEWear { id=0, ble_connect_parameter_config { phone_type=0 } } """
    cfg = pb_uint32(4, 0)            # phone_type = 0 (Android)
    return pb_uint32(1, 0) + pb_message(99, cfg)

def cmd_inquiry_binding_status() -> bytes:
    """ SEWear { id=16 } -- minimal; watch fills in the rest """
    return pb_uint32(1, 16)

def cmd_verify_user_number(user_id: str) -> bytes:
    """ SEWear { id=19, bind_account { verify_user_number = <user_id> } }
        verify_user_number is field 6 of SEBindAccount, type string. """
    bind_account = pb_string(6, user_id)
    return pb_uint32(1, 19) + pb_message(3, bind_account)

def cmd_get_device_info()    -> bytes: return pb_uint32(1, 32)
def cmd_get_battery()        -> bytes: return pb_uint32(1, 33)
def cmd_get_disconnect_rsn() -> bytes: return pb_uint32(1, 34)

# ------------------------------------------------------------------------------
class NoiseFitClient:
    def __init__(self, address: str, user_id: str):
        self.address = address
        self.user_id = user_id
        self.client: Optional[BleakClient] = None

        # f01-stream reassembly
        self._f01_inbox: asyncio.Queue[bytes] = asyncio.Queue()
        self._f02_inbox: asyncio.Queue[bytes] = asyncio.Queue()

        self.app_mtu: int = 23   # default until MTU_REQUEST_CHANGE replies
        self.log = logging.getLogger("noisefit")

    # ---- low-level: notification dispatch ------------------------------------
    def _on_f01(self, _ch, data: bytearray):
        self.log.debug("RX f01 <- %s", data.hex(" "))
        self._f01_inbox.put_nowait(bytes(data))

    def _on_f02(self, _ch, data: bytearray):
        self.log.debug("RX f02 <- %s", data.hex(" "))
        self._f02_inbox.put_nowait(bytes(data))

    def _on_aux(self, ch, data: bytearray):
        self.log.debug("RX aux %s <- %s", ch, data.hex(" "))

    # ---- connection setup -----------------------------------------------------
    async def connect(self):
        self.log.info("scanning for %s ...", self.address)
        dev = await BleakScanner.find_device_by_address(self.address, timeout=15)
        if not dev:
            raise RuntimeError(f"device {self.address} not found")

        self.client = BleakClient(dev)
        await self.client.connect()
        self.log.info("GATT connected; enabling 5 notify channels in order")

        # The firmware demands all 5 CCCDs armed sequentially. This is the fix
        # for the famous "start_notify on 0020: Unreachable" failure.
        await self.client.start_notify(UUID_F01, self._on_f01)
        await self.client.start_notify(UUID_F02, self._on_f02)
        await self.client.start_notify(UUID_F03, self._on_aux)
        await self.client.start_notify(UUID_F04, self._on_aux)
        await self.client.start_notify(UUID_F05, self._on_aux)
        self.log.info("all CCCDs enabled")

    async def disconnect(self):
        if self.client and self.client.is_connected:
            await self.client.disconnect()

    # ---- the framing layer ---------------------------------------------------
    async def _await_frame(self, queue: asyncio.Queue, expect_first_byte: int,
                           timeout: float = 5.0) -> bytes:
        while True:
            frame = await asyncio.wait_for(queue.get(), timeout=timeout)
            if frame and frame[0] == expect_first_byte:
                return frame
            # otherwise keep draining; aux frames can interleave

    async def _send_payload(self, pb_bytes: bytes) -> bytes:
        """
        Implements the full 8-step dance.
        Sends the protobuf as a payload frame on f02, returns the protobuf
        body of the watch's reply (received on f01).
        """
        assert self.client and self.client.is_connected

        # 1. TX f02: claim
        await self.client.write_gatt_char(UUID_F02, HDR_CLAIM, response=False)
        # 2. RX f02: go-ahead
        go = await self._await_frame(self._f02_inbox, 0x00)
        if go[:3] != bytes.fromhex("000001"):
            raise IOError(f"unexpected go frame: {go.hex(' ')}")

        # 3. TX f02: payload  (01 00 <pb...>)
        if len(pb_bytes) > 255:
            raise ValueError("payloads >255B need fragmentation -- not implemented")
        frame = PAYLOAD_PREFIX + pb_bytes
        await self.client.write_gatt_char(UUID_F02, frame, response=False)

        # 4. RX f02: frame-done ack
        done = await self._await_frame(self._f02_inbox, 0x00)
        if done != HDR_DONE:
            self.log.warning("unexpected done ack on f02: %s", done.hex(" "))

        # 5. RX f01: watch wants to send
        claim = await self._await_frame(self._f01_inbox, 0x00)
        if claim != HDR_CLAIM:
            self.log.warning("unexpected claim on f01: %s", claim.hex(" "))

        # 6. TX f01: we ack
        await self.client.write_gatt_char(UUID_F01, HDR_GO, response=False)

        # 7. RX f01: the actual reply
        reply = await self._await_frame(self._f01_inbox, 0x01)
        if reply[:2] != PAYLOAD_PREFIX:
            raise IOError(f"bad reply prefix: {reply.hex(' ')}")
        body = reply[2:]

        # 8. TX f01: end-of-frame ack
        await self.client.write_gatt_char(UUID_F01, HDR_DONE, response=False)

        return body

    # ---- public ops ----------------------------------------------------------
    async def negotiate_mtu(self) -> int:
        self.log.info("MTU_REQUEST_CHANGE")
        body = await self._send_payload(cmd_mtu_request())
        # Reply layout: 08 00  10 <mtu varint>
        # e.g. 08 00 10 B4 01 = id=0, field2 (change_mtu) = 180
        if len(body) >= 5 and body[0:2] == b"\x08\x00" and body[2] == 0x10:
            mtu = body[3] | ((body[4] & 0x7F) << 7) if body[3] & 0x80 else body[3]
            self.app_mtu = mtu - 3
            self.log.info("watch MTU = %d (app payload = %d)", mtu, self.app_mtu)
            return mtu
        self.log.warning("could not parse MTU reply: %s", body.hex(" "))
        return 23

    async def authenticate(self) -> bool:
        self.log.info("INQUIRY_BINDING_STATUS")
        await self._send_payload(cmd_inquiry_binding_status())

        self.log.info("VERIFY_USER_NUMBER %s", self.user_id)
        body = await self._send_payload(cmd_verify_user_number(self.user_id))

        # Expected: 08 13 1A 06 3A 04 08 01 10 01
        # = SEWear{id=19, bind_account{verify_result{verify_result_type:true,
        #                                            binding_status:true}}}
        ok = (b"\x3a\x04\x08\x01\x10\x01" in body)
        self.log.info("auth %s (raw=%s)", "OK" if ok else "FAILED", body.hex(" "))
        return ok

    async def get_battery(self) -> Optional[int]:
        body = await self._send_payload(cmd_get_battery())
        # Expected: 08 21 22 06 12 04 08 1A 10 02
        # = SEWear{id=33, device{battery{capacity:26, charging_state:2}}}
        # capacity is a uint32 inside a nested message; lazy parse:
        for i in range(len(body) - 1):
            if body[i] == 0x08 and body[i+1] not in (0x21, 0x33):
                return body[i+1]
        return None

    async def get_device_info(self) -> bytes:
        return await self._send_payload(cmd_get_device_info())

    # ---- one-shot driver -----------------------------------------------------
    async def session(self):
        await self.connect()
        try:
            await self.negotiate_mtu()
            if not await self.authenticate():
                raise RuntimeError("authentication rejected")
            print(f"AUTHENTICATED. app-MTU = {self.app_mtu}")

            batt = await self.get_battery()
            print(f"battery: {batt}%")

            info = await self.get_device_info()
            print(f"device-info raw: {info.hex(' ')}")
        finally:
            await self.disconnect()


# ---------------------------------------------------------------------------
async def main():
    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s.%(msecs)03d %(levelname)-5s %(name)s | %(message)s",
        datefmt="%H:%M:%S",
    )
    client = NoiseFitClient(DEVICE_MAC, VERIFY_USER_ID)
    await client.session()


if __name__ == "__main__":
    asyncio.run(main())
