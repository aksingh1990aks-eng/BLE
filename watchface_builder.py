"""
NoiseFit Crew Watchface Builder
================================

Converts an image (PNG/JPG/etc.) into an IDO-format .bin that we can attempt
to flash onto the watch via noisefit_crew_root.py install_face.

This script implements MULTIPLE FORMAT HYPOTHESES and prints which one was
used.  The first attempts will probably be rejected by the firmware -- but
each rejection teaches us about the verification logic.  See the
`--format` flag for the available hypotheses.

USAGE:
  python3 watchface_builder.py <input.png> -o out.bin [--format minimal]
                                                     [--width 240]
                                                     [--height 286]
                                                     [--bg-rgb 0,255,0]

After building, install with:
  python3 noisefit_crew_root.py install_face <face_id> out.bin

CONFIRMED FACTS (from your watchface.zip fragment):
  - magic header     = AF AF AF 02 (4 bytes)
  - byte 4..7        = u32le (0x00031870 in your sample) -- unknown, possibly
                       (width<<16 | type) or a layer descriptor
  - byte 8..11       = u32le (0x134e7812 in your sample) -- looks like CRC32
                       of the body, OR a 32-bit-shift signature.  Treated as
                       CRC32 by default.
  - byte 12..15      = u32le declared body size (29950 in your sample)
  - body             = pixels in RGB565 little-endian
  - body trailer     = 110 extra bytes between declared end and EOF (110 ==
                       4 * 8-bit MD5 chars? or 110 = CRC + padding to align?)
"""
import argparse
import hashlib
import struct
import sys
import zlib
from pathlib import Path


# ===========================================================================
# Header builders -- one per format hypothesis
# ===========================================================================
MAGIC = b'\xAF\xAF\xAF\x02'

def build_header_minimal(body: bytes) -> bytes:
    """Hypothesis 1: replicate the EXACT 16-byte layout of your fragment."""
    # Use the body length as the declared size, leave the unknown fields zero.
    declared_size = len(body)
    crc = zlib.crc32(body) & 0xFFFFFFFF
    return MAGIC + struct.pack('<III', 0x00031870, crc, declared_size)


def build_header_simple(body: bytes) -> bytes:
    """Hypothesis 2: same magic, simpler trailer."""
    return MAGIC + struct.pack('<III', 0, zlib.crc32(body) & 0xFFFFFFFF, len(body))


def build_header_with_dims(body: bytes, w: int, h: int) -> bytes:
    """Hypothesis 3: encode width/height in the unknown u32 field."""
    dim = (w << 16) | h
    crc = zlib.crc32(body) & 0xFFFFFFFF
    return MAGIC + struct.pack('<III', dim, crc, len(body))


HEADER_BUILDERS = {
    'minimal': build_header_minimal,
    'simple':  build_header_simple,
    'dims':    build_header_with_dims,
}


# ===========================================================================
# Pixel conversion
# ===========================================================================
def rgb_to_565(r: int, g: int, b: int) -> int:
    """Pack 8-8-8 RGB into 16-bit RGB565."""
    return ((r & 0xF8) << 8) | ((g & 0xFC) << 3) | (b >> 3)


def image_to_rgb565_bytes(image_path: Path, w: int, h: int,
                          bg_rgb: tuple[int, int, int]) -> bytes:
    """Convert an image to a stream of little-endian RGB565 pixels.
    Resizes/crops to (w, h) using PIL.  Pixels are written in row-major order.
    """
    try:
        from PIL import Image
    except ImportError:
        sys.exit("error: pip install pillow")

    img = Image.open(image_path).convert('RGBA')

    # Fit-to-frame: scale the image so its longer side matches, then center on
    # a background of bg_rgb.
    img.thumbnail((w, h), Image.Resampling.LANCZOS)
    bg = Image.new('RGB', (w, h), bg_rgb)
    paste_x = (w - img.width) // 2
    paste_y = (h - img.height) // 2
    bg.paste(img, (paste_x, paste_y), img if img.mode == 'RGBA' else None)
    rgb = bg

    # Encode RGB565 little-endian, row-major
    out = bytearray()
    px = rgb.load()
    for y in range(h):
        for x in range(w):
            r, g, b = px[x, y]
            v = rgb_to_565(r, g, b)
            out.append(v & 0xFF)
            out.append((v >> 8) & 0xFF)
    return bytes(out)


# ===========================================================================
# Header reverse-engineering (compares ours to the reference fragment)
# ===========================================================================
def diagnose(reference_path: Path, our_bin: bytes):
    """Compare structural properties of our build vs. the reference fragment."""
    ref = reference_path.read_bytes()
    print()
    print('=== reference vs. ours (structural comparison) ===')
    print(f'{"":24}  {"REFERENCE":>14}  {"OURS":>14}')
    print(f'{"size":<24}  {len(ref):>14}  {len(our_bin):>14}')
    print(f'{"magic[0:4]":<24}  {ref[:4].hex():>14}  {our_bin[:4].hex():>14}')
    print(f'{"u32[4:8]":<24}  '
          f'{struct.unpack("<I", ref[4:8])[0]:>14x}  '
          f'{struct.unpack("<I", our_bin[4:8])[0]:>14x}')
    print(f'{"u32[8:12] (CRC?)":<24}  '
          f'{struct.unpack("<I", ref[8:12])[0]:>14x}  '
          f'{struct.unpack("<I", our_bin[8:12])[0]:>14x}')
    print(f'{"u32[12:16] (body)":<24}  '
          f'{struct.unpack("<I", ref[12:16])[0]:>14}  '
          f'{struct.unpack("<I", our_bin[12:16])[0]:>14}')

    # Verify our CRC matches the actual body
    our_body = our_bin[16:]
    our_crc = zlib.crc32(our_body) & 0xFFFFFFFF
    declared_crc = struct.unpack('<I', our_bin[8:12])[0]
    crc_ok = '✓' if our_crc == declared_crc else '✗'
    print(f'{"our CRC self-check":<24}  {"":>14}  '
          f'{our_crc:>14x} {crc_ok}')

    # Check if reference's CRC field actually matches the body
    ref_body = ref[16:]
    ref_crc_actual = zlib.crc32(ref_body) & 0xFFFFFFFF
    ref_crc_field  = struct.unpack('<I', ref[8:12])[0]
    print(f'{"ref CRC if computed":<24}  {ref_crc_actual:>14x}  {"":>14}')
    print(f'{"ref CRC field matches?":<24}  '
          f'{"YES" if ref_crc_actual == ref_crc_field else "NO":>14}')


# ===========================================================================
# CLI
# ===========================================================================
def main():
    p = argparse.ArgumentParser()
    p.add_argument('input', type=Path, help='input PNG/JPG')
    p.add_argument('-o', '--output', type=Path, default=Path('out.bin'))
    p.add_argument('--width', type=int, default=240,
                   help='target width (default 240, common for NoiseFit)')
    p.add_argument('--height', type=int, default=286,
                   help='target height (default 286)')
    p.add_argument('--format', choices=HEADER_BUILDERS.keys(),
                   default='minimal',
                   help='header format hypothesis')
    p.add_argument('--bg-rgb', type=str, default='0,255,0',
                   help='background fill color R,G,B (default green to match'
                        ' your reference fragment)')
    p.add_argument('--reference', type=Path,
                   default=Path('/projects/sandbox/BLE/watchface.zip'),
                   help='reference fragment for diagnostic comparison')
    args = p.parse_args()

    if not args.input.exists():
        sys.exit(f'error: {args.input} not found')

    bg = tuple(int(x) for x in args.bg_rgb.split(','))
    if len(bg) != 3:
        sys.exit('error: --bg-rgb needs three comma-separated values')

    print(f'[*] reading {args.input}')
    print(f'[*] target dims: {args.width} x {args.height}')
    print(f'[*] background: rgb{bg}')
    body = image_to_rgb565_bytes(args.input, args.width, args.height, bg)
    print(f'[+] body: {len(body)} bytes ({args.width*args.height} pixels)')

    print(f'[*] header format: {args.format}')
    if args.format == 'dims':
        header = build_header_with_dims(body, args.width, args.height)
    else:
        header = HEADER_BUILDERS[args.format](body)
    print(f'[+] header: {header.hex(" ")}')

    out = header + body
    print(f'[+] total: {len(out)} bytes')
    print(f'[+] md5  : {hashlib.md5(out).hexdigest()}')

    args.output.write_bytes(out)
    print(f'[+] wrote {args.output}')

    if args.reference.exists():
        diagnose(args.reference, out)

    print()
    print('=== next step ===')
    print(f'  python3 noisefit_crew_root.py install_face my_face_001 '
          f'{args.output}')


if __name__ == '__main__':
    main()
