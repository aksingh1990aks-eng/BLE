"""
ido_forge.py
============
Forensically derived IDO/ZH watchface bundle FORGER + STREAMER.
"""
from __future__ import annotations

import argparse
import asyncio
import hashlib
import logging
import struct
import sys
import math
from pathlib import Path
from typing import Optional

# ============================================================================
# GATT / transport constants
# ============================================================================
DEFAULT_ADDRESS = "D6:35:06:D0:A2:FA"
DEFAULT_USER_ID = "629cac508942951614"

BASE = "0000-1000-8000-00807f9b34fb"
RX_UUID = f"16186f01-{BASE}"
TX_UUID = f"16186f02-{BASE}"
F03_UUID = f"16186f03-{BASE}"
F04_UUID = f"16186f04-{BASE}"
F05_UUID = f"16186f05-{BASE}"

FRAME_CLAIM = bytes.fromhex("000000000100")
FRAME_GO    = bytes.fromhex("000001010000")
FRAME_DONE  = bytes.fromhex("000001000000")
PAYLOAD_PFX = bytes.fromhex("0100")

# OTA-specific constants
CHUNKS_PER_BLOCK = 22
# 174 data + 2 byte index = 176 total BLE payload (safely under 177 MTU)
CHUNK_PAYLOAD_BYTES = 174                          

MAGIC = bytes.fromhex("afafaf02")

# ============================================================================
# Protobuf Encoder
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

def cmd_prepare_install_watch_face(face_id: str, file_size_bytes: int) -> bytes:
    file_size_kb = file_size_bytes // 1000
    info = (
        pb_str(1, face_id)
        + pb_uint(2, file_size_kb)
        + pb_uint(3, file_size_kb)
        + pb_uint(4, 1)
    )
    return pb_uint(1, 83) + pb_msg(7, pb_msg(4, info))

# ============================================================================
# BUNDLE FORGER
# ============================================================================
class IdoBundle:
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
            f"IDO bundle:\n  magic: {self.raw[:4].hex()}\n  declared_size: {self.declared_sz}\n"
            f"  total size: {len(self.raw)} bytes\n"
        )

    def replace_body_with_image(self, image_path: Path, width: int = 240, height: int = 286) -> bytes:
        try:
            from PIL import Image
        except ImportError:
            sys.exit("Pillow required: pip install pillow")

        img = Image.open(image_path).convert("RGBA")
        img.thumbnail((width, height), Image.Resampling.LANCZOS)
        bg = Image.new("RGB", (width, height), (0, 0, 0))
        bg.paste(img, ((width - img.width) // 2, (height - img.height) // 2), img if img.mode == "RGBA" else None)

        new_body = bytearray()
        px = bg.load()
        for y in range(height):
            for x in range(width):
                r, g, b = px[x, y]
                v = ((r & 0xF8) << 8) | ((g & 0xFC) << 3) | (b >> 3)
                new_body.append(v & 0xFF)
                new_body.append((v >> 8) & 0xFF)

        target_len = len(self.body)
        if len(new_body) > target_len:
            new_body = bytes(new_body[:target_len])
        else:
            new_body = bytes(new_body) + b"\x00" * (target_len - len(new_body))

        return self.raw[:self.HEADER_LEN] + new_body

def cmd_forge(args: argparse.Namespace):
    template = IdoBundle(Path(args.template).read_bytes())
    new_bin = template.replace_body_with_image(Path(args.image), args.width, args.height)
    Path(args.output).write_bytes(new_bin)
    print(f"\n[+] forged bundle -> {args.output}  ({len(new_bin)} bytes)")

# ============================================================================
# OTA STREAMER
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
        # Permissive ACK checking to prevent missing the watch's flags
        if raw.startswith(b"\x00\x00\x01\x01"):
            self._f04_go.set()
        elif raw.startswith(b"\x00\x00\x01\x00"):
            self._f04_done.set()
        else:
            self.log.info(f"[*] Watch f04 message: {raw.hex()}")

    async def connect(self):
        from bleak import BleakClient
        self.log.info("connecting to %s", self.address)
        self.client = BleakClient(self.address)
        await self.client.connect()
        await self.client.start_notify(RX_UUID, self._on_rx)
        await self.client.start_notify(TX_UUID, self._on_tx)
        await self.client.start_notify(F04_UUID, self._on_f04)
        self.log.info("Channels subscribed")

    async def disconnect(self):
        if self.client and self.client.is_connected:
            await self.client.disconnect()

    async def _send_f02(self, payload: bytes) -> Optional[bytes]:
        while not self._rx_q.empty():
            self._rx_q.get_nowait()
        self._tx_go.clear()
        await self.client.write_gatt_char(TX_UUID, FRAME_CLAIM, response=False)
        await asyncio.wait_for(self._tx_go.wait(), timeout=3.0)
        await self.client.write_gatt_char(TX_UUID, PAYLOAD_PFX + payload, response=False)
        try:
            return await asyncio.wait_for(self._rx_q.get(), timeout=8.0)
        except asyncio.TimeoutError:
            return None

    async def stream_face(self, bundle: bytes, face_id: str):
        self.log.info(f"[*] PREPARE_INSTALL_WATCH_FACE id={face_id} size={len(bundle)}")
        reply = await self._send_f02(cmd_prepare_install_watch_face(face_id, len(bundle)))
        if not reply or b"\x2a\x02\x08\x00" not in reply:
            raise RuntimeError(f"Watch did not return READY: {reply}")
        self.log.info("[+] watch is READY. Opening data pipe...")

        total = len(bundle)
        STREAM_HEADER = bytes.fromhex("12000100001000000000000000000000000000000000") + struct.pack("<I", total)
        first_chunk_filebytes = CHUNK_PAYLOAD_BYTES - len(STREAM_HEADER)

        offset = 0
        block_idx = 1
        is_first_chunk = True

        while offset < total:
            # 1. Calculate EXACT chunks needed for this block (Fixes 99% crash)
            bytes_remaining = total - offset
            if is_first_chunk:
                if bytes_remaining <= first_chunk_filebytes:
                    chunks_this_block = 1
                else:
                    chunks_this_block = 1 + math.ceil((bytes_remaining - first_chunk_filebytes) / CHUNK_PAYLOAD_BYTES)
            else:
                chunks_this_block = math.ceil(bytes_remaining / CHUNK_PAYLOAD_BYTES)
                
            chunks_this_block = min(chunks_this_block, CHUNKS_PER_BLOCK)
            
            # 2. Dynamic Block Claim Header
            block_header = bytes([0, 0, 0, 0, chunks_this_block, 0])
            
            self._f04_go.clear()
            self._f04_done.clear()
            await self.client.write_gatt_char(F04_UUID, block_header, response=False)
            await asyncio.wait_for(self._f04_go.wait(), timeout=5.0)

            # 3. Stream Chunks
            for chunk_idx in range(1, chunks_this_block + 1):
                if offset >= total: break
                
                if is_first_chunk:
                    take = min(first_chunk_filebytes, total - offset)
                    payload = struct.pack("<H", chunk_idx) + STREAM_HEADER + bundle[offset:offset+take]
                    is_first_chunk = False
                else:
                    take = min(CHUNK_PAYLOAD_BYTES, total - offset)
                    payload = struct.pack("<H", chunk_idx) + bundle[offset:offset+take]
                    
                await self.client.write_gatt_char(F04_UUID, payload, response=False)
                offset += take
                
                # Robust pacing to prevent Windows cache flood
                await asyncio.sleep(0.08)

            # 4. Wait for Block ACK & Flash memory flush
            await asyncio.wait_for(self._f04_done.wait(), timeout=25.0)
            percent = 100.0 * offset / total
            self.log.info(f"[*] block {block_idx} sent ({chunks_this_block} chunks) | {offset}/{total} bytes [{percent:.1f}%]")
            
            block_idx += 1
            # Let watch NVRAM commit to disk before next block
            await asyncio.sleep(1.0)
            
        self.log.info("[+++] BLACKOUT COMPLETE. WATCH UI FLASHED [+++]")


def cmd_inject(args: argparse.Namespace):
    bundle = Path(args.face).read_bytes()
    async def run():
        s = IdoStreamer(args.address, args.user_id)
        try:
            await s.connect()
            s.log.info("[*] EXECUTING ROOT AUTHENTICATION...")
            await asyncio.sleep(1.5) # Let OS subscriptions settle
            
            await s._send_f02(pb_uint(1, 0) + pb_msg(99, pb_uint(4, 0)))
            await asyncio.sleep(0.5)
            await s._send_f02(pb_uint(1, 16))
            await asyncio.sleep(0.5)
            
            auth_reply = await s._send_f02(pb_uint(1, 19) + pb_msg(3, pb_str(6, args.user_id)))
            if auth_reply and b"\x3a\x04\x08\x01\x10\x01" in auth_reply:
                s.log.info("[!!!] LEVEL 0 (ROOT) ACCESS GRANTED [!!!]")
            else:
                s.log.warning("[!] Auth unrecognized, but proceeding...")
            
            await asyncio.sleep(1.0)
            await s.stream_face(bundle, args.face_id)
        finally:
            await s.disconnect()

    logging.basicConfig(level=logging.INFO, format="%(asctime)s | %(message)s", datefmt="%H:%M:%S")
    asyncio.run(run())

def cmd_go(args: argparse.Namespace):
    cmd_forge(argparse.Namespace(template=args.template, image=args.image, output=args.output, width=args.width, height=args.height))
    cmd_inject(argparse.Namespace(face=args.output, face_id=args.face_id, address=args.address, user_id=args.user_id))

def main():
    p = argparse.ArgumentParser(description="ido_forge -- pack & inject IDO/ZH watchfaces.")
    sub = p.add_subparsers(dest="cmd", required=True)

    # The FORGE command
    p_forge = sub.add_parser("forge")
    p_forge.add_argument("--template", required=True, type=Path)
    p_forge.add_argument("--image",    required=True, type=Path)
    p_forge.add_argument("--output",   required=True, type=Path)
    p_forge.add_argument("--width",    type=int, default=240)
    p_forge.add_argument("--height",   type=int, default=286)
    p_forge.set_defaults(fn=cmd_forge)

    # The INJECT command (What we need for Test 1)
    p_inject = sub.add_parser("inject")
    p_inject.add_argument("--face",    required=True, type=Path)
    p_inject.add_argument("--face-id", required=True)
    p_inject.add_argument("--address", default=DEFAULT_ADDRESS)
    p_inject.add_argument("--user-id", default=DEFAULT_USER_ID)
    p_inject.set_defaults(fn=cmd_inject)

    # The GO command (Forge + Inject)
    p_go = sub.add_parser("go")
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