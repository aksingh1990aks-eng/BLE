"""
NoiseFit Crew (IDO OS / com.zhapp.ble) — Direct Root Access Client
====================================================================

Master corrected script — based on the live capture from logs.txt and the
post-mortem of the user's first run. All transport layers are validated.

USAGE:
    python3 noisefit_crew_root.py            # default: AUTH path with correct key
    python3 noisefit_crew_root.py recon      # post-auth enumeration of every getter
    python3 noisefit_crew_root.py unbind     # force unbind (use ONLY if you lost the key)
    python3 noisefit_crew_root.py probe      # path C: try data fetches WITHOUT auth

Key facts validated against captured app traffic:
  - GATT base UUID 00807f9b34fb (NOT 00805f) — five 16186fXX channels
  - TX on f02, RX on f01, three aux channels f03/f04/f05 must also be subscribed
  - 6-byte transport: 00 00 00 00 01 00 (claim) / 00 00 01 01 00 00 (go) /
                      01 00 <pb>             (payload) / 00 00 01 00 00 00 (done)
  - MTU is in-band protobuf (id=0), NOT L2CAP exchange_mtu()
  - Auth = INQUIRY_BINDING_STATUS (id=16) -> VERIFY_USER_NUMBER (id=19)
  - Real success marker: bind_account.verify_result.verify_result_type == TRUE
    Wire: 1A 06 3A 04 08 01 10 01    (NOT just "0813" present!)
"""

import asyncio
import logging
import sys
from typing import Optional, Callable

from bleak import BleakClient

# ============================================================================
# CONFIG — change these for your unit
# ============================================================================
ADDRESS = "D6:35:06:D0:A2:FA"

# REAL key extracted verbatim from logs.txt line 13:20:34.909
# (ControlBleTools verifyUserId() 629cac508942951614)
USER_ID = "629cac508942951614"

# ============================================================================
# GATT — NoiseFit Crew uses the non-standard base 00807f9b34fb
# ============================================================================
BASE = "0000-1000-8000-00807f9b34fb"
RX_UUID = f"16186f01-{BASE}"   # PROTOBUF_01 — watch -> phone
TX_UUID = f"16186f02-{BASE}"   # PROTOBUF_02 — phone -> watch
AUX_UUIDS = [f"16186f0{n}-{BASE}" for n in (3, 4, 5)]

# ============================================================================
# Transport framing constants
# ============================================================================
FRAME_CLAIM = bytes.fromhex("000000000100")   # "I want to send you something"
FRAME_GO    = bytes.fromhex("000001010000")   # "go ahead"
FRAME_DONE  = bytes.fromhex("000001000000")   # "frame complete"
PAYLOAD_PFX = bytes.fromhex("0100")           # prefix on every actual payload

# ============================================================================
# SEFunctionId — from WearProtos.java
# ============================================================================
FN = {
    0:   "MTU_REQUEST_CHANGE",
    16:  "INQUIRY_BINDING_STATUS",
    17:  "BINDING_CHECK",
    18:  "BINDING_RESULT",
    19:  "VERIFY_USER_NUMBER",
    23:  "UNBIND_REQUEST",
    32:  "GET_DEVICE_INFO",
    33:  "GET_DEVICE_BATTERY_STATUS",
    34:  "GET_DEVICE_DISCONNECT_REASON",
    48:  "SET_SYSTEM_TIME",
    112: "GET_FITNESS_TYPE_ID_LIST",
    113: "REQUEST_FITNESS_TYPE_ID",
    115: "CONFIRM_FITNESS_TYPE_ID",
    117: "GET_FITNESS_SPORT_ID_LIST",
    130: "REQUEST_WEATHER",
    178: "SEND_SYSTEM_NOTIFICATION",
    180: "SEND_CALL_STATE",
    181: "GET_QUICK_REPLY_LIST",
    195: "SYNC_MUSIC_INFO",
}

# ============================================================================
# Hand-rolled protobuf encoder (no protoc dependency)
# ============================================================================
def varint(n: int) -> bytes:
    out = bytearray()
    while True:
        b = n & 0x7F
        n >>= 7
        if n:
            out.append(b | 0x80)
        else:
            out.append(b)
            return bytes(out)

def tag(field: int, wire: int) -> bytes:
    return varint((field << 3) | wire)

def pb_uint(field: int, value: int) -> bytes:
    return tag(field, 0) + varint(value)

def pb_str(field: int, value: str) -> bytes:
    raw = value.encode("utf-8")
    return tag(field, 2) + varint(len(raw)) + raw

def pb_msg(field: int, body: bytes) -> bytes:
    return tag(field, 2) + varint(len(body)) + body

# ----- SEWear command builders -----
def cmd_mtu_request() -> bytes:
    """SEWear{id=0, ble_connect_parameter_config{phone_type:0}}"""
    return pb_uint(1, 0) + pb_msg(99, pb_uint(4, 0))

def cmd_inquiry_binding() -> bytes:
    return pb_uint(1, 16)

def cmd_verify_user(user_id: str) -> bytes:
    """SEWear{id=19, bind_account{verify_user_number:'<user_id>'}}"""
    bind_account = pb_str(6, user_id)
    return pb_uint(1, 19) + pb_msg(3, bind_account)

def cmd_unbind() -> bytes:
    return pb_uint(1, 23)

def cmd_simple(fid: int) -> bytes:
    return pb_uint(1, fid)

# ============================================================================
# Hand-rolled protobuf DECODER (so we can pretty-print every reply)
# ============================================================================
def decode_pb(data: bytes, depth: int = 0) -> list:
    """Returns a list of (field_no, kind, value) triples; nested messages recurse."""
    fields, _ = _try_decode(data, depth)
    return fields

def _try_decode(data: bytes, depth: int = 0) -> tuple:
    """Strict protobuf decoder. Returns (fields, bytes_consumed).
    Raises on any malformed input so callers can bail back to raw-bytes."""
    if depth > 8:
        raise ValueError("nesting too deep")
    out, i = [], 0
    while i < len(data):
        try:
            t = data[i]; i += 1
            fn, wt = t >> 3, t & 7
            if wt not in (0, 1, 2, 5):
                raise ValueError(f"bad wire type {wt}")
            if fn == 0:
                raise ValueError("field 0 illegal")
            if wt == 0:                                    # varint
                v, sh = 0, 0
                while True:
                    if i >= len(data):
                        raise ValueError("truncated varint")
                    b = data[i]; i += 1
                    v |= (b & 0x7F) << sh
                    sh += 7
                    if not (b & 0x80):
                        break
                    if sh > 63:
                        raise ValueError("varint too long")
                out.append((fn, "uint", v))
            elif wt == 2:                                  # length-delim
                if i >= len(data):
                    raise ValueError("truncated len-delim")
                ln = data[i]; i += 1
                if i + ln > len(data):
                    raise ValueError("len-delim overruns buffer")
                blob = data[i:i+ln]; i += ln
                # Try to decide if this is a string, raw bytes, or nested message.
                # 1. If it's all printable ASCII, it's a string.
                # 2. Else try nested decode and only accept if EVERY byte was consumed
                #    AND no field has a weird wire-type. Otherwise treat as bytes.
                if blob and all(32 <= b < 127 for b in blob):
                    out.append((fn, "str", blob.decode("ascii")))
                else:
                    try:
                        nested, consumed = _try_decode(blob, depth + 1)
                        if consumed == len(blob) and nested:
                            out.append((fn, "msg", nested))
                        else:
                            out.append((fn, "bytes", blob))
                    except Exception:
                        out.append((fn, "bytes", blob))
            elif wt == 1:                                  # 64-bit fixed
                if i + 8 > len(data):
                    raise ValueError("truncated fixed64")
                out.append((fn, "fixed64", data[i:i+8])); i += 8
            elif wt == 5:                                  # 32-bit fixed
                if i + 4 > len(data):
                    raise ValueError("truncated fixed32")
                out.append((fn, "fixed32", data[i:i+4])); i += 4
        except (IndexError, ValueError):
            raise
    return out, i

def fmt_pb(fields: list, indent: int = 0) -> str:
    pad = "  " * indent
    lines = []
    for fn, kind, val in fields:
        if kind == "uint":
            lines.append(f"{pad}field {fn}: {val}")
        elif kind == "msg":
            lines.append(f"{pad}field {fn}: {{")
            lines.append(fmt_pb(val, indent + 1))
            lines.append(f"{pad}}}")
        elif kind == "str":
            lines.append(f'{pad}field {fn}: "{val}"')
        elif kind == "bytes":
            lines.append(f"{pad}field {fn}: {val.hex(' ')}")
        else:
            lines.append(f"{pad}field {fn} ({kind}): {val.hex(' ') if isinstance(val, bytes) else val}")
    return "\n".join(lines)

# ============================================================================
# Reply matchers — these check the ACTUAL semantic outcome, not just the id
# ============================================================================
SUCCESS_VERIFY = bytes.fromhex("3A0408011001")   # verify_result{type=true, binding_status=true}
FAILURE_VERIFY = bytes.fromhex("3A0408001001")   # verify_result{type=FALSE, binding_status=true}

def interpret_verify(body: bytes) -> str:
    if SUCCESS_VERIFY in body:
        return "AUTH_OK"
    if FAILURE_VERIFY in body:
        return "AUTH_REJECTED"
    return "AUTH_UNKNOWN"

def function_id(body: bytes) -> Optional[int]:
    """Extract the SEWear.id (field 1 varint) from a payload."""
    if len(body) < 2 or body[0] != 0x08:
        return None
    val, sh, i = 0, 0, 1
    while i < len(body):
        b = body[i]; i += 1
        val |= (b & 0x7F) << sh
        sh += 7
        if not (b & 0x80):
            return val
    return None

# ============================================================================
# The client
# ============================================================================
class NoiseFitRoot:
    def __init__(self, address: str, user_id: str):
        self.address = address
        self.user_id = user_id
        self.client: Optional[BleakClient] = None
        self.log = logging.getLogger("noisefit")

        self._tx_go = asyncio.Event()      # set when watch grants our claim on f02
        self._rx_payloads: asyncio.Queue[bytes] = asyncio.Queue()
        self._unsolicited_handler: Optional[Callable[[int, bytes], None]] = None

    # ---- notification routers --------------------------------------------------
    def _on_tx(self, _ch, data: bytearray):
        h = bytes(data).hex()
        if h == "000001010000":            # CTS — watch grants our slot
            self._tx_go.set()
        # we ignore other f02 frames; they're just confirmations of our own writes

    def _on_rx(self, _ch, data: bytearray):
        raw = bytes(data)
        h = raw.hex()
        self.log.debug("RX f01 <- %s", h)

        # Watch is requesting permission to push us a payload
        if raw == FRAME_CLAIM:
            # Must respond with GO on the SAME channel (RX_UUID)
            asyncio.create_task(self.client.write_gatt_char(RX_UUID, FRAME_GO))
            return

        # Watch finished pushing — ack to free its buffer
        if raw[:2] == PAYLOAD_PFX:
            asyncio.create_task(self.client.write_gatt_char(RX_UUID, FRAME_DONE))
            self._rx_payloads.put_nowait(raw[2:])    # bare protobuf body
            return

    def _on_aux(self, ch, data: bytearray):
        self.log.debug("RX aux %s <- %s", ch, bytes(data).hex())

    # ---- low-level send: claim / go / payload ---------------------------------
    async def _send(self, payload: bytes, label: str = ""):
        """Run the claim/go dance on f02, then write the payload."""
        if label:
            self.log.info("[*] %s -> %s", label, payload.hex(' '))

        self._tx_go.clear()
        await self.client.write_gatt_char(TX_UUID, FRAME_CLAIM, response=False)
        try:
            await asyncio.wait_for(self._tx_go.wait(), timeout=2.0)
        except asyncio.TimeoutError:
            raise IOError(f"watch never granted slot for {label or 'cmd'}")

        full = PAYLOAD_PFX + payload
        await self.client.write_gatt_char(TX_UUID, full, response=False)

    async def send_cmd(self, pb: bytes, label: str, wait_reply: bool = True,
                       timeout: float = 5.0) -> Optional[bytes]:
        """Send a SEWear command and (optionally) await its reply on f01."""
        # Drain stale frames so we don't grab a leftover REQUEST_WEATHER etc.
        while not self._rx_payloads.empty():
            self._rx_payloads.get_nowait()

        await self._send(pb, label)

        if not wait_reply:
            return None

        deadline = asyncio.get_event_loop().time() + timeout
        target_id = function_id(pb)
        while True:
            remaining = deadline - asyncio.get_event_loop().time()
            if remaining <= 0:
                self.log.warning("[-] timeout waiting for reply to %s", label)
                return None
            try:
                body = await asyncio.wait_for(self._rx_payloads.get(), timeout=remaining)
            except asyncio.TimeoutError:
                return None

            rid = function_id(body)
            # Filter: if we sent id=N, accept reply with id=N. Stash anything else.
            if rid != target_id:
                self.log.info("    [unsolicited id=%s/%s] %s",
                              rid, FN.get(rid, "?"), body.hex(' '))
                if self._unsolicited_handler:
                    self._unsolicited_handler(rid or -1, body)
                continue

            self.log.info("[<-] %s reply (id=%d): %s", label, rid, body.hex(' '))
            decoded = decode_pb(body)
            self.log.info("\n%s", fmt_pb(decoded))
            return body

    # ---- session lifecycle -----------------------------------------------------
    async def connect(self):
        self.log.info("[*] connecting to %s ...", self.address)
        self.client = BleakClient(self.address)
        await self.client.connect()
        self.log.info("[+] GATT link up")

        # Subscribe ALL FIVE notify channels — partial subscription is fatal
        await self.client.start_notify(RX_UUID, self._on_rx)
        await self.client.start_notify(TX_UUID, self._on_tx)
        for u in AUX_UUIDS:
            await self.client.start_notify(u, self._on_aux)
        self.log.info("[+] all 5 channels subscribed")

    async def disconnect(self):
        if self.client and self.client.is_connected:
            await self.client.disconnect()

    # ---- the standard handshake ------------------------------------------------
    async def negotiate_mtu(self) -> int:
        body = await self.send_cmd(cmd_mtu_request(), "MTU_REQUEST_CHANGE")
        if body and len(body) >= 5 and body.startswith(b"\x08\x00\x10"):
            mtu = body[3] | ((body[4] & 0x7F) << 7) if body[3] & 0x80 else body[3]
            self.log.info("[+] watch MTU = %d (app-MTU = %d)", mtu, mtu - 3)
            return mtu
        return 23

    async def authenticate(self) -> str:
        await self.send_cmd(cmd_inquiry_binding(), "INQUIRY_BINDING_STATUS")
        body = await self.send_cmd(cmd_verify_user(self.user_id),
                                   f"VERIFY_USER_NUMBER('{self.user_id}')")
        if body is None:
            return "AUTH_NO_REPLY"
        result = interpret_verify(body)

        banner = "=" * 60
        if result == "AUTH_OK":
            self.log.info("\n%s\n[!!!] LEVEL 0 (ROOT) ACCESS GRANTED\n%s\n", banner, banner)
        elif result == "AUTH_REJECTED":
            self.log.warning(
                "\n%s\n[XXX] AUTH REJECTED — userId mismatch.\n"
                "      verify_result_type=FALSE, binding_status=TRUE\n"
                "      The watch IS bound — but to a different key than '%s'.\n"
                "      Use the original app's verifyUserId, or run 'unbind' first.\n%s\n",
                banner, self.user_id, banner)
        else:
            self.log.warning("[?] unexpected verify reply: %s", body.hex(' '))
        return result


# ============================================================================
# Operation modes
# ============================================================================
async def mode_auth(c: NoiseFitRoot):
    """Default: handshake + auth + read device info / battery."""
    await c.negotiate_mtu()
    result = await c.authenticate()
    if result != "AUTH_OK":
        c.log.warning("[!] continuing in degraded mode (no auth)")

    # Read everything fun
    await c.send_cmd(cmd_simple(32), "GET_DEVICE_INFO")
    await c.send_cmd(cmd_simple(33), "GET_DEVICE_BATTERY_STATUS")
    await c.send_cmd(cmd_simple(34), "GET_DEVICE_DISCONNECT_REASON")

async def mode_recon(c: NoiseFitRoot):
    """After auth: enumerate every read-only getter we know."""
    await c.negotiate_mtu()
    if await c.authenticate() != "AUTH_OK":
        c.log.error("[-] cannot recon without auth; aborting")
        return

    for fid in [32, 33, 34, 112, 117, 181, 195]:
        await c.send_cmd(cmd_simple(fid), FN.get(fid, f"id={fid}"))
        await asyncio.sleep(0.2)

async def mode_unbind(c: NoiseFitRoot):
    """Force the watch to forget its current binding. May require user
    confirmation on the watch screen depending on firmware."""
    await c.negotiate_mtu()
    c.log.warning("[!] sending UNBIND_REQUEST — confirm on watch screen if prompted")
    await c.send_cmd(cmd_unbind(), "UNBIND_REQUEST", timeout=10.0)
    c.log.info("[*] now re-run in 'auth' mode with a fresh USER_ID to re-pair")

async def mode_probe(c: NoiseFitRoot):
    """Path C: skip auth and try data fetches anyway. If they succeed, the
    watch's session gate is broken — that's a real firmware vuln."""
    await c.negotiate_mtu()
    await c.send_cmd(cmd_inquiry_binding(), "INQUIRY_BINDING_STATUS")
    c.log.warning("[!] skipping VERIFY — testing if watch leaks data without auth")

    for fid in [32, 33, 34, 112, 117, 181]:
        body = await c.send_cmd(cmd_simple(fid), f"PROBE {FN.get(fid, fid)}",
                                timeout=2.5)
        if body and len(body) > 4:
            c.log.warning("[!!!] watch leaked %s without auth (%d bytes)",
                          FN.get(fid, fid), len(body))


# ============================================================================
# Entry
# ============================================================================
MODES = {"auth": mode_auth, "recon": mode_recon,
         "unbind": mode_unbind, "probe": mode_probe}

async def main():
    mode = sys.argv[1] if len(sys.argv) > 1 else "auth"
    if mode not in MODES:
        print(f"unknown mode '{mode}'. choices: {list(MODES)}")
        sys.exit(1)

    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s.%(msecs)03d %(levelname).1s | %(message)s",
        datefmt="%H:%M:%S",
    )

    c = NoiseFitRoot(ADDRESS, USER_ID)
    try:
        await c.connect()
        await MODES[mode](c)
        # short tail to absorb any unsolicited frames the watch sends
        await asyncio.sleep(2.0)
    finally:
        await c.disconnect()


if __name__ == "__main__":
    asyncio.run(main())
