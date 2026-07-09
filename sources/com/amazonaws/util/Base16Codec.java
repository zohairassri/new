package com.amazonaws.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class Base16Codec implements Codec {
    private static final int BITS_4 = 4;
    private static final int MASK_4BITS = 15;
    private static final int OFFSET_OF_A = 55;
    private static final int OFFSET_OF_a = 87;
    private static final int OFFSET_VALUE = 10;
    private final byte[] alpahbets = CodecUtils.toBytesDirect("0123456789ABCDEF");

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[103];
            for (int i11 = 0; i11 <= 102; i11++) {
                if (i11 >= 48 && i11 <= 57) {
                    bArr[i11] = (byte) (i11 - 48);
                } else if (i11 >= 65 && i11 <= 70) {
                    bArr[i11] = (byte) (i11 - 55);
                } else if (i11 < 97 || i11 > 102) {
                    bArr[i11] = -1;
                } else {
                    bArr[i11] = (byte) (i11 - 87);
                }
            }
            return bArr;
        }
    }

    Base16Codec() {
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i11) {
        if (i11 % 2 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 2 bytes but found: " + i11);
        }
        int i12 = i11 / 2;
        byte[] bArr2 = new byte[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = i13 + 1;
            int iPos = pos(bArr[i13]) << 4;
            i13 += 2;
            bArr2[i14] = (byte) (pos(bArr[i15]) | iPos);
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            byte[] bArr3 = this.alpahbets;
            bArr2[i11] = bArr3[(b11 >>> 4) & 15];
            i11 += 2;
            bArr2[i12] = bArr3[b11 & 15];
        }
        return bArr2;
    }

    protected int pos(byte b11) {
        byte b12 = LazyHolder.DECODED[b11];
        if (b12 > -1) {
            return b12;
        }
        throw new IllegalArgumentException("Invalid base 16 character: '" + ((char) b11) + "'");
    }
}
