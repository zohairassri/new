package com.amazonaws.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class Base64Codec implements Codec {
    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_6 = 6;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private static final int OFFSET_0_VALUE = 52;
    private static final int OFFSET_OF_0 = -4;
    private static final int OFFSET_OF_PLUS = -19;
    private static final int OFFSET_OF_SLASH = -16;
    private static final int OFFSET_OF_a = 71;
    private static final int OFFSET_PLUS_VALUE = 62;
    private static final int OFFSET_SLASH_VALUE = 63;
    private static final int OFFSET_a_VALUE = 26;
    private static final byte PAD = 61;
    private final byte[] alpahbets;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class LazyHolder {
        private static final byte[] DECODED = decodeTable();

        private LazyHolder() {
        }

        private static byte[] decodeTable() {
            byte[] bArr = new byte[123];
            for (int i11 = 0; i11 <= 122; i11++) {
                if (i11 >= 65 && i11 <= 90) {
                    bArr[i11] = (byte) (i11 - 65);
                } else if (i11 >= 48 && i11 <= 57) {
                    bArr[i11] = (byte) (i11 + 4);
                } else if (i11 == 43) {
                    bArr[i11] = (byte) (i11 + 19);
                } else if (i11 == 47) {
                    bArr[i11] = (byte) (i11 + 16);
                } else if (i11 < 97 || i11 > 122) {
                    bArr[i11] = -1;
                } else {
                    bArr[i11] = (byte) (i11 - 71);
                }
            }
            return bArr;
        }
    }

    Base64Codec() {
        this.alpahbets = CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    @Override // com.amazonaws.util.Codec
    public byte[] decode(byte[] bArr, int i11) {
        int i12;
        if (i11 % 4 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 4 bytes but found: " + i11);
        }
        int i13 = i11 - 1;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i12 = 2;
            if (i15 >= 2 || i13 <= -1 || bArr[i13] != 61) {
                break;
            }
            i13--;
            i15++;
        }
        if (i15 == 0) {
            i12 = 3;
        } else if (i15 != 1) {
            if (i15 != 2) {
                throw new Error("Impossible");
            }
            i12 = 1;
        }
        int i16 = ((i11 / 4) * 3) - (3 - i12);
        byte[] bArr2 = new byte[i16];
        int i17 = 0;
        while (i17 < i16 - (i12 % 3)) {
            decode4bytes(bArr, i14, bArr2, i17);
            i14 += 4;
            i17 += 3;
        }
        if (i12 < 3) {
            decode1to3bytes(i12, bArr, i14, bArr2, i17);
        }
        return bArr2;
    }

    void decode1to3bytes(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        int i14 = i13 + 1;
        int iPos = pos(bArr[i12]) << 2;
        int i15 = i12 + 2;
        int iPos2 = pos(bArr[i12 + 1]);
        bArr2[i13] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        if (i11 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 15);
            return;
        }
        int i16 = i13 + 2;
        int i17 = i12 + 3;
        int iPos3 = pos(bArr[i15]);
        bArr2[i14] = (byte) (((iPos2 & 15) << 4) | (15 & (iPos3 >>> 2)));
        if (i11 == 2) {
            CodecUtils.sanityCheckLastPos(iPos3, 3);
        } else {
            bArr2[i16] = (byte) (pos(bArr[i17]) | ((iPos3 & 3) << 6));
        }
    }

    void decode4bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iPos = pos(bArr[i11]) << 2;
        int iPos2 = pos(bArr[i11 + 1]);
        bArr2[i12] = (byte) (iPos | ((iPos2 >>> 4) & 3));
        int iPos3 = pos(bArr[i11 + 2]);
        bArr2[i12 + 1] = (byte) (((iPos2 & 15) << 4) | ((iPos3 >>> 2) & 15));
        bArr2[i12 + 2] = (byte) (pos(bArr[i11 + 3]) | ((iPos3 & 3) << 6));
    }

    @Override // com.amazonaws.util.Codec
    public byte[] encode(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i11 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i12 = 0;
            while (i11 < bArr.length) {
                encode3bytes(bArr, i11, bArr2, i12);
                i11 += 3;
                i12 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i13 = 0;
        while (i11 < bArr.length - length2) {
            encode3bytes(bArr, i11, bArr3, i13);
            i11 += 3;
            i13 += 4;
        }
        if (length2 == 1) {
            encode1byte(bArr, i11, bArr3, i13);
            return bArr3;
        }
        if (length2 != 2) {
            return bArr3;
        }
        encode2bytes(bArr, i11, bArr3, i13);
        return bArr3;
    }

    void encode1byte(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 2) & 63];
        bArr2[i12 + 1] = bArr3[(b11 & 3) << 4];
        bArr2[i12 + 2] = PAD;
        bArr2[i12 + 3] = PAD;
    }

    void encode2bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        int i13 = i11 + 1;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 2) & 63];
        byte b12 = bArr[i13];
        bArr2[i12 + 1] = bArr3[((b11 & 3) << 4) | ((b12 >>> 4) & 15)];
        bArr2[i12 + 2] = bArr3[(b12 & 15) << 2];
        bArr2[i12 + 3] = PAD;
    }

    void encode3bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 2) & 63];
        byte b12 = bArr[i11 + 1];
        bArr2[i12 + 1] = bArr3[((b11 & 3) << 4) | ((b12 >>> 4) & 15)];
        byte b13 = bArr[i11 + 2];
        bArr2[i12 + 2] = bArr3[((b13 >>> 6) & 3) | ((b12 & 15) << 2)];
        bArr2[i12 + 3] = bArr3[b13 & 63];
    }

    protected int pos(byte b11) {
        byte b12 = LazyHolder.DECODED[b11];
        if (b12 > -1) {
            return b12;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b11) + "'");
    }

    protected Base64Codec(byte[] bArr) {
        this.alpahbets = bArr;
    }
}
