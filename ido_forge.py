"""
ido_forge.py
============

Forensically derived IDO/ZH watchface bundle FORGER + STREAMER for the
NoiseFit Crew (and other IDO-OS watches using the AF AF AF 02 format).

Reverse-engineered from a complete OTA capture (com.noisefit/cache/logs/logs.txt
window 21:03:38..51) of the official app installing watch_face_id=990
(file size = 67145 bytes, block count = 18, total time = 10.869 s).

THE FORENSIC FINDINGS (every claim below is grounded in the captured log)
-------------------------------------------------------------------------
1.  CONNECTION FACTS
    - Device : NoiseFit Crew, MAC D6:35:06:D0:A2:FA, fw 1.0.5, sn 10005
    - SDK    : ZH_SDK_20260402_V2.3.1
    - GATT   : non-standard base 00807f9b34fb, 5 channels f01..f05.
               Watchface OTA exclusively uses notify channel f04 ("PROTOBUF_04",
               UUID 16186f04-0000-1000-8000-00807f9b34fb).
    - MTU    : negotiated 180, app-MTU 177 (standard IDO behavior).

2.  THE PRE-FLIGHT (on f02 — the regular control channel)
    Phone -> Watch:  SEWear { id=83, watch_face { watch_face_prepare_info {
                       id="990", target_file_size=67, transfer_file_size=67,
                       is_replaceable=true } } }
        Wire (after PAYLOAD_PFX 01 00):
            08 53                       SEWear.id = 83
            3A 0D                       field 7 (watch_face) len=13
              22 0B                       field 4 (watch_face_prepare_info) len=11
                0A 03 39 39 30              field 1 = "990"
                10 43                       field 2 (target_file_size) = 67
                18 43                       field 3 (transfer_file_size) = 67
                20 01                       field 4 (is_replaceable) = 1

    Watch -> Phone:  SEWear { id=83, watch_face { watchface_result_info {
                       prepare_status: READY (= 0) } } }
        Wire: 08 53 3A 04 2A 02 08 00

    Note: target_file_size in the prepare-install message is in KILOBYTES
    rounded down. 67145 bytes -> 67 kB. Both target and transfer are equal
    when uploading from scratch (no resume).

3.  THE STREAMING PROTOCOL (on f04)
    Notation: < = phone->watch, > = watch->phone.

    For each "block" (max 22 chunks per block, 18 blocks total for this 67 kB face):
        <  TX f04: 00 00 00 00 16 00       block-claim header (last byte 0x16 = 22)
        >  RX f04: 00 00 01 01 00 00       block GO ack
        <  TX f04: 01 00 <176 file bytes>  chunk #1 of this block
        <  TX f04: 02 00 <176 file bytes>  chunk #2
        <  TX f04: 03 00 <176 file bytes>  chunk #3
        ...
        <  TX f04: 16 00 <176 file bytes>  chunk #22 (last in block)
        >  RX f04: 00 00 01 00 00 00       block-done ack

    The chunk payload count per block is variable; only the LAST block has
    fewer than 22 chunks. In the captured trace block 18 had 11 chunks.

    The first chunk of the FIRST block has a special 24-byte STREAM HEADER
    inserted BEFORE the file bytes:
        offset    bytes              meaning
          0..1    01 00              chunk index = 1
          2..3    12 00              "starting-chunk" marker (0x12 = 18 = block count)
          4..5    01 00              another marker (block index 1?)
          6..7    00 10              max chunk size LE = 0x1000? Or 16?
          8..23   00 * 16            16 bytes of zeros (= MD5 if resuming, else 0)
         24..27   49 06 01 00        u32 LE TOTAL FILE SIZE (= 0x10649 = 67145)
         28..    AF AF AF 02 ...     start of the actual file bytes

        Wire (chunk 1 of block 1):
            01 00 12 00 01 00 00 10 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
            49 06 01 00 AF AF AF 02 ...

    For all subsequent chunks (and all chunks of blocks 2..18) the prefix is
    just the 2-byte chunk index `NN 00` followed by 176 bytes of file data.

4.  THE BUNDLE FILE FORMAT (the bytes you stream)
    24-byte HEADER (offsets in the file):
        0..3    AF AF AF 02         magic
        4..7    u32 LE              opaque ID #1 (varies per face)
                                     - 0x4A82C in this sample
        8..11   u32 LE              opaque "checksum A" (signature; not std hash)
                                     - 0x9AB6984C in this sample
        12..15  u32 LE              SUB-SECTION SIZE (= 66969 here)
                                     - main usable payload length
        16..19  u32 LE              opaque "checksum B" (signature; not std hash)
                                     - 0xB342E84C in this sample
        20..23  u32 LE              reserved (= 0)
    Then the body (67145 - 24 = 67121 bytes) is the actual face payload.

    The two opaque checksum fields (offsets 8 and 16) DO NOT match any common
    hash (CRC32, MD5, SHA1, adler32, sum, XOR) of any obvious slice of the
    body. They appear to be:
        - signatures issued by the IDO Watch Face Builder tool, OR
        - hashes computed with a custom algorithm (rolling/keyed)
    For our purposes we keep them VERBATIM from a known-good face and embed
    the new pixel content into the body slot. This is the "Trojan replay"
    approach: re-use a valid manifest, swap the inner pixels.

5.  POST-TRANSFER
    No REPORT_INSTALL_WATCH_FACE_RESULT (id=84) was seen in the capture.
    The phone declared success after receiving the final block-done ack on f04
    and printed: "sent successfully = time : 10869 ms, data size : 65.57 KB,
    speed : 6.03 kb/s, lost packets : 0".
    The watch then auto-activates the new face. There is NO need to follow up
    with SET_WATCH_FACE (id=81) -- the watch does it itself.

USAGE
-----
    # Forge a NEW bundle by replacing pixels in a known-good template
    python3 ido_forge.py forge --template watchface.zip --image my.png \
                               --output forged.bin

    # Stream that bundle to the watch (assumes you've authed already)
    python3 ido_forge.py inject --face forged.bin --face-id 991

    # All in one
    python3 ido_forge.py go --template watchface.zip --image my.png --face-id 991
"""
from __future__ import annotations

import argparse
import asyncio
import hashlib
import logging
import struct
import sys
from pathlib import Path
from typing import Optional

# ============================================================================
# GATT / transport constants -- copied from noisefit_crew_root.py
# ============================================================================
DEFAULT_ADDRESS = "D6:35:06:D0:A2:FA"
DEFAULT_USER_ID = "629cac508942951614"  # replace with your bound userId

BASE = "0000-1000-8000-00807f9b34fb"
RX_UUID = f"16186f01-{BASE}"
TX_UUID = f"16186f02-{BASE}"
F03_UUID = f"16186f03-{BASE}"
F04_UUID = f"16186f04-{BASE}"      # the OTA channel
F05_UUID = f"16186f05-{BASE}"

FRAME_CLAIM = bytes.fromhex("000000000100")
FRAME_GO    = bytes.fromhex("000001010000")
FRAME_DONE  = bytes.fromhex("000001000000")
PAYLOAD_PFX = bytes.fromhex("0100")

# OTA-specific constants (from log forensics)
BLOCK_HEADER_TX  = bytes.fromhex("000000001600")  # phone->watch: claim block, max 22 chunks
BLOCK_GO_RX      = bytes.fromhex("000001010000")  # watch ack: GO
BLOCK_DONE_RX    = bytes.fromhex("000001000000")  # watch ack: block complete
CHUNKS_PER_BLOCK = 22
CHUNK_PAYLOAD_BYTES = 176                          # = app_mtu(177) - 1

MAGIC = bytes.fromhex("afafaf02")

# ============================================================================
# Hand-rolled protobuf encoder (no protoc dependency)
# ============================================================================
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

def _tag(field: int, wire: int) -> bytes:
    return _varint((field << 3) | wire)

def pb_uint(field: int, value: int) -> bytes:
    return _tag(field, 0) + _varint(value)

def pb_str(field: int, value: str) -> bytes:
    raw = value.encode("utf-8")
    return _tag(field, 2) + _varint(len(raw)) + raw

def pb_msg(field: int, body: bytes) -> bytes:
    return _tag(field, 2) + _varint(len(body)) + body


def cmd_prepare_install_watch_face(face_id: str, file_size_bytes: int,
                                    is_replaceable: bool = True) -> bytes:
    """
    SEWear { id=83, watch_face { watch_face_prepare_info {
        id, target_file_size, transfer_file_size=target, is_replaceable } } }

    NOTE: in the captured trace, 67145 bytes -> target_file_size=67.
    The official IDO ThemeManager uses DECIMAL kilobytes (bytes // 1000),
    NOT binary kibibytes. 67145 // 1000 = 67. We replicate that exactly.
    """
    file_size_kb = file_size_bytes // 1000           # decimal kB (matches official app)
    info = (
        pb_str(1, face_id)                              # id
        + pb_uint(2, file_size_kb)                      # target_file_size (KB)
        + pb_uint(3, file_size_kb)                      # transfer_file_size (KB)
        + pb_uint(4, 1 if is_replaceable else 0)        # is_replaceable
    )
    inner = pb_msg(4, info)                              # watch_face_prepare_info field=4
    return pb_uint(1, 83) + pb_msg(7, inner)             # watch_face field=7


# ============================================================================
# BUNDLE FORGER
# ============================================================================
class IdoBundle:
    """Represents the parsed 24-byte header + body of an IDO watchface bundle."""

    HEADER_LEN = 24

    def __init__(self, raw: bytes):
        if len(raw) < self.HEADER_LEN or raw[:4] != MAGIC:
            raise ValueError("not an IDO watchface bundle (missing AF AF AF 02 magic)")
        self.raw = raw
        self.opaque_id   = struct.unpack("<I", raw[4:8])[0]
        self.checksum_a  = struct.unpack("<I", raw[8:12])[0]
        self.declared_sz = struct.unpack("<I", raw[12:16])[0]
        self.checksum_b  = struct.unpack("<I", raw[16:20])[0]
        self.reserved    = struct.unpack("<I", raw[20:24])[0]
        self.body        = raw[self.HEADER_LEN:]

    def info(self) -> str:
        return (
            f"IDO bundle:\n"
            f"  magic         : {self.raw[:4].hex()}\n"
            f"  opaque_id     : 0x{self.opaque_id:08x}\n"
            f"  checksum_a    : 0x{self.checksum_a:08x}\n"
            f"  declared_size : {self.declared_sz}\n"
            f"  checksum_b    : 0x{self.checksum_b:08x}\n"
            f"  reserved      : 0x{self.reserved:08x}\n"
            f"  body length   : {len(self.body)} bytes\n"
            f"  total size    : {len(self.raw)} bytes\n"
            f"  md5(full)     : {hashlib.md5(self.raw).hexdigest()}\n"
        )

    def replace_body_with_image(self, image_path: Path,
                                 width: int = 240, height: int = 286) -> bytes:
        """
        Replace the body with a fresh RGB565 raster of the supplied image,
        keeping the header (and all opaque signatures) intact.

        WARNING: Watches that strictly verify the body against the header's
        opaque signatures will reject this. We embed a fresh RGB565 frame
        truncated/padded to the original body length to preserve the
        declared sub-section size invariant.
        """
        try:
            from PIL import Image
        except ImportError:
            sys.exit("Pillow required: pip install pillow")

        img = Image.open(image_path).convert("RGBA")
        img.thumbnail((width, height), Image.Resampling.LANCZOS)
        bg = Image.new("RGB", (width, height), (0, 0, 0))
        bg.paste(img, ((width - img.width) // 2,
                       (height - img.height) // 2),
                 img if img.mode == "RGBA" else None)

        # encode RGB565 LE row-major
        new_body = bytearray()
        px = bg.load()
        for y in range(height):
            for x in range(width):
                r, g, b = px[x, y]
                v = ((r & 0xF8) << 8) | ((g & 0xFC) << 3) | (b >> 3)
                new_body.append(v & 0xFF)
                new_body.append((v >> 8) & 0xFF)

        # Match the original body length exactly (truncate or pad with zeros)
        target_len = len(self.body)
        if len(new_body) > target_len:
            new_body = bytes(new_body[:target_len])
        else:
            new_body = bytes(new_body) + b"\x00" * (target_len - len(new_body))

        return self.raw[:self.HEADER_LEN] + new_body


def cmd_forge(args: argparse.Namespace):
    template = IdoBundle(Path(args.template).read_bytes())
    print(template.info())
    new_bin = template.replace_body_with_image(
        Path(args.image), args.width, args.height
    )
    Path(args.output).write_bytes(new_bin)
    print(f"\n[+] forged bundle -> {args.output}  ({len(new_bin)} bytes)")
    print(f"[+] md5            = {hashlib.md5(new_bin).hexdigest()}")


# ============================================================================
# OTA STREAMER (the Bleak injector)
# ============================================================================
class IdoStreamer:
    def __init__(self, address: str, user_id: str):
        self.address = address
        self.user_id = user_id
        self.client = None
        self.log = logging.getLogger("forge")
        self._tx_go = asyncio.Event()
        self._f04_go = asyncio.Event()
        self._f04_done = asyncio.Event()
        self._rx_q: asyncio.Queue[bytes] = asyncio.Queue()

    # --------- notification dispatchers
    def _on_tx(self, _ch, data: bytearray):
        if bytes(data) == FRAME_GO:
            self._tx_go.set()

    def _on_rx(self, _ch, data: bytearray):
        raw = bytes(data)
        if raw == FRAME_CLAIM:
            asyncio.create_task(self.client.write_gatt_char(RX_UUID, FRAME_GO))
        elif raw[:2] == PAYLOAD_PFX:
            asyncio.create_task(self.client.write_gatt_char(RX_UUID, FRAME_DONE))
            self._rx_q.put_nowait(raw[2:])

    def _on_f04(self, _ch, data: bytearray):
        raw = bytes(data)
        if raw == BLOCK_GO_RX:
            self._f04_go.set()
        elif raw == BLOCK_DONE_RX:
            self._f04_done.set()

    def _on_other(self, _ch, _data: bytearray):
        pass

    async def connect(self):
        from bleak import BleakClient
        self.log.info("connecting to %s", self.address)
        self.client = BleakClient(self.address)
        await self.client.connect()
        await self.client.start_notify(RX_UUID, self._on_rx)
        await self.client.start_notify(TX_UUID, self._on_tx)
        await self.client.start_notify(F03_UUID, self._on_other)
        await self.client.start_notify(F04_UUID, self._on_f04)
        await self.client.start_notify(F05_UUID, self._on_other)
        self.log.info("all 5 channels subscribed")

    async def disconnect(self):
        if self.client and self.client.is_connected:
            await self.client.disconnect()

    async def _send_f02(self, payload: bytes) -> Optional[bytes]:
        """Send a SEWear command on f02 and await its reply on f01."""
        while not self._rx_q.empty():
            self._rx_q.get_nowait()
        self._tx_go.clear()
        await self.client.write_gatt_char(TX_UUID, FRAME_CLAIM, response=False)
        await asyncio.wait_for(self._tx_go.wait(), timeout=2.0)
        await self.client.write_gatt_char(TX_UUID, PAYLOAD_PFX + payload,
                                           response=False)
        try:
            return await asyncio.wait_for(self._rx_q.get(), timeout=8.0)
        except asyncio.TimeoutError:
            return None

    # -------- the OTA streamer (matches captured pattern verbatim)
    async def stream_face(self, bundle: bytes, face_id: str):
        # ---- 1. Standard auth handshake (assume already done in mode_go)
        # ---- 2. PREPARE_INSTALL_WATCH_FACE on f02
        self.log.info("[*] PREPARE_INSTALL_WATCH_FACE id=%s size=%d",
                      face_id, len(bundle))
        reply = await self._send_f02(
            cmd_prepare_install_watch_face(face_id, len(bundle))
        )
        if not reply or b"\x2a\x02\x08\x00" not in reply:
            raise RuntimeError(
                f"watch did not return prepare_status=READY: {reply!r}"
            )
        self.log.info("[+] watch is READY")

        # ---- 3. Stream blocks on f04
        # Each block holds <= 22 chunks of 176 bytes each = 3872 bytes per block
        bytes_per_block = CHUNKS_PER_BLOCK * CHUNK_PAYLOAD_BYTES
        total = len(bundle)
        # The first chunk-1 has a 24-byte stream header inlined before the
        # file body, so it carries (176-24) = 152 bytes of file content.
        STREAM_HEADER_LEN = 24
        first_chunk_filebytes = CHUNK_PAYLOAD_BYTES - STREAM_HEADER_LEN  # 152

        # Build the 24-byte stream header (used only on chunk 1 of block 1)
        # 01 00 12 00 01 00 00 10 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 + u32_le(file_size)
        stream_header = (
            bytes.fromhex("0100120001000010")     # 8 bytes
            + bytes(16)                            # 16 zero bytes (resume offset / md5 placeholder)
        )
        # Wait -- the chunk index "01 00" is the chunk index, not part of the header.
        # Let me re-derive: the stream header WITHOUT chunk index is 24 bytes:
        #   12 00 01 00 00 10 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00  (22 bytes)
        # plus u32 LE file_size (4 bytes) = 26 bytes total. Hmm.
        # Re-checking the log:
        #   01 00 12 00 01 00 00 10 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 49 06 01 00 AF AF AF 02 ...
        #   ^^^^^                                                              ^^^^^^^^^^^ ^^^^^^^^^^^
        #   chunk idx                                                          file size   start of file
        # bytes 0..1 = chunk index (01 00)
        # bytes 2..27 = stream header (26 bytes)
        # bytes 28..  = file body
        # so chunk-1-payload = 26 (header) + (176-26)=150 file bytes. Wait, log says payload was 176.
        # Let me recount the log line:
        #   01 00 [12 00 01 00 00 10 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 49 06 01 00] [AF AF AF 02 2C A8 04 00 ...]
        # That's 2 + 26 + N bytes total where N = (size of "AF AF AF 02 ...remaining") to fill the
        # 178-byte chunk (176 payload after the 2-byte chunk index header).
        # So actual chunk-1 file bytes = 176 - 26 = 150 bytes of file content.
        # Subsequent chunks of block 1 carry 176 file bytes each.

        # Correct stream header (BARE, without chunk index):
        STREAM_HEADER = (
            bytes.fromhex("12000100001000000000000000000000000000000000")  # 22 bytes
            + struct.pack("<I", total)                                       # 4 bytes file size
        )  # = 26 bytes
        first_chunk_filebytes = CHUNK_PAYLOAD_BYTES - len(STREAM_HEADER)  # 176-26 = 150

        offset = 0
        block_idx = 1
        is_first_chunk = True
        while offset < total:
            # Block claim
            self._f04_go.clear()
            self._f04_done.clear()
            await self.client.write_gatt_char(F04_UUID, BLOCK_HEADER_TX,
                                               response=False)
            await asyncio.wait_for(self._f04_go.wait(), timeout=4.0)

            # Build up to 22 chunks
            chunks_in_block = 0
            for chunk_idx in range(1, CHUNKS_PER_BLOCK + 1):
                if offset >= total:
                    break
                if is_first_chunk:
                    take = min(first_chunk_filebytes, total - offset)
                    payload = (struct.pack("<H", chunk_idx)
                               + STREAM_HEADER
                               + bundle[offset:offset+take])
                    is_first_chunk = False
                else:
                    take = min(CHUNK_PAYLOAD_BYTES, total - offset)
                    payload = (struct.pack("<H", chunk_idx)
                               + bundle[offset:offset+take])
                await self.client.write_gatt_char(F04_UUID, payload,
                                                   response=False)
                offset += take
                chunks_in_block += 1
                # tiny pacing — without it some firmware revs drop chunks
                await asyncio.sleep(0.012)

            # Wait for block-done ack
            await asyncio.wait_for(self._f04_done.wait(), timeout=10.0)
            self.log.info("[*] block %d sent (%d chunks, %d/%d bytes, %.1f%%)",
                          block_idx, chunks_in_block, offset, total,
                          100.0 * offset / total)
            block_idx += 1

        self.log.info("[+++] WATCHFACE STREAMED. Watch should now show new face.")


def cmd_inject(args: argparse.Namespace):
    bundle = Path(args.face).read_bytes()
    if bundle[:4] != MAGIC:
        sys.exit("error: file does not have AF AF AF 02 magic")
    face_id = args.face_id

    async def run():
        s = IdoStreamer(args.address, args.user_id)
        try:
            await s.connect()
            # NOTE: we assume you've already authed via noisefit_crew_root.py.
            # If not, integrate the auth handshake here (or import that module).
            await s.stream_face(bundle, face_id)
        finally:
            await s.disconnect()

    logging.basicConfig(
        level=logging.INFO,
        format="%(asctime)s.%(msecs)03d %(levelname).1s | %(message)s",
        datefmt="%H:%M:%S",
    )
    asyncio.run(run())


def cmd_go(args: argparse.Namespace):
    """Forge + inject in one shot."""
    forge_args = argparse.Namespace(
        template=args.template, image=args.image,
        output=args.output, width=args.width, height=args.height,
    )
    cmd_forge(forge_args)
    inject_args = argparse.Namespace(
        face=args.output, face_id=args.face_id,
        address=args.address, user_id=args.user_id,
    )
    cmd_inject(inject_args)


# ============================================================================
# CLI
# ============================================================================
def main():
    p = argparse.ArgumentParser(
        description="ido_forge -- pack & inject IDO/ZH watchfaces."
    )
    sub = p.add_subparsers(dest="cmd", required=True)

    p_forge = sub.add_parser("forge", help="forge a watchface bundle")
    p_forge.add_argument("--template", required=True, type=Path,
                          help="path to a known-good watchface bundle")
    p_forge.add_argument("--image",    required=True, type=Path,
                          help="path to PNG/JPG to embed")
    p_forge.add_argument("--output",   required=True, type=Path,
                          help="path to write the forged bundle")
    p_forge.add_argument("--width",    type=int, default=240)
    p_forge.add_argument("--height",   type=int, default=286)
    p_forge.set_defaults(fn=cmd_forge)

    p_inject = sub.add_parser("inject", help="stream a bundle to a watch")
    p_inject.add_argument("--face",    required=True, type=Path)
    p_inject.add_argument("--face-id", required=True)
    p_inject.add_argument("--address", default=DEFAULT_ADDRESS)
    p_inject.add_argument("--user-id", default=DEFAULT_USER_ID)
    p_inject.set_defaults(fn=cmd_inject)

    p_go = sub.add_parser("go", help="forge + inject in one step")
    p_go.add_argument("--template", required=True, type=Path)
    p_go.add_argument("--image",    required=True, type=Path)
    p_go.add_argument("--output",   default=Path("forged.bin"), type=Path)
    p_go.add_argument("--face-id",  required=True)
    p_go.add_argument("--width",    type=int, default=240)
    p_go.add_argument("--height",   type=int, default=286)
    p_go.add_argument("--address",  default=DEFAULT_ADDRESS)
    p_go.add_argument("--user-id",  default=DEFAULT_USER_ID)
    p_go.set_defaults(fn=cmd_go)

    args = p.parse_args()
    args.fn(args)


if __name__ == "__main__":
    main()
