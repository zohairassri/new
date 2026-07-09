package com.amazonaws.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class AbstractBase32Codec implements Codec {
    private static final int BITS_3 = 3;
    private static final int BITS_4 = 4;
    private static final int BITS_5 = 5;
    private static final int BIT_MULTIPLIER = 8;
    private static final int MASK_2BITS = 3;
    private static final int MASK_3BITS = 7;
    private static final int MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private static final byte PAD = 61;
    private final byte[] alpahbets;

    protected AbstractBase32Codec(byte[] bArr) {
        this.alpahbets = bArr;
    }

    private final void decode1to4bytes(int i11, byte[] bArr, int i12, byte[] bArr2, int i13) {
        int i14 = i13 + 1;
        int iPos = pos(bArr[i12]) << 3;
        int i15 = i12 + 2;
        int iPos2 = pos(bArr[i12 + 1]);
        bArr2[i13] = (byte) (iPos | ((iPos2 >>> 2) & 7));
        if (i11 == 1) {
            CodecUtils.sanityCheckLastPos(iPos2, 3);
            return;
        }
        int i16 = i13 + 2;
        int iPos3 = ((iPos2 & 3) << 6) | (pos(bArr[i15]) << 1);
        int i17 = i12 + 4;
        int iPos4 = pos(bArr[i12 + 3]);
        bArr2[i14] = (byte) (iPos3 | ((iPos4 >>> 4) & 1));
        if (i11 == 2) {
            CodecUtils.sanityCheckLastPos(iPos4, 15);
            return;
        }
        int i18 = i13 + 3;
        int i19 = i12 + 5;
        int iPos5 = pos(bArr[i17]);
        bArr2[i16] = (byte) ((15 & (iPos5 >>> 1)) | ((iPos4 & 15) << 4));
        if (i11 == 3) {
            CodecUtils.sanityCheckLastPos(iPos5, 1);
            return;
        }
        int iPos6 = ((iPos5 & 1) << 7) | (pos(bArr[i19]) << 2);
        int iPos7 = pos(bArr[i12 + 6]);
        bArr2[i18] = (byte) (iPos6 | ((iPos7 >>> 3) & 3));
        CodecUtils.sanityCheckLastPos(iPos7, 7);
    }

    private final void decode5bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int iPos = pos(bArr[i11]) << 3;
        int iPos2 = pos(bArr[i11 + 1]);
        bArr2[i12] = (byte) (iPos | ((iPos2 >>> 2) & 7));
        int iPos3 = ((iPos2 & 3) << 6) | (pos(bArr[i11 + 2]) << 1);
        int iPos4 = pos(bArr[i11 + 3]);
        bArr2[i12 + 1] = (byte) (iPos3 | ((iPos4 >>> 4) & 1));
        int iPos5 = pos(bArr[i11 + 4]);
        bArr2[i12 + 2] = (byte) (((iPos4 & 15) << 4) | ((iPos5 >>> 1) & 15));
        int iPos6 = ((iPos5 & 1) << 7) | (pos(bArr[i11 + 5]) << 2);
        int iPos7 = pos(bArr[i11 + 6]);
        bArr2[i12 + 3] = (byte) (iPos6 | ((iPos7 >>> 3) & 3));
        bArr2[i12 + 4] = (byte) (pos(bArr[i11 + 7]) | ((iPos7 & 7) << 5));
    }

    private final void encode1byte(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = i12 + 1;
        byte[] bArr3 = this.alpahbets;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 3) & 31];
        int i14 = i12 + 2;
        bArr2[i13] = bArr3[(b11 & 7) << 2];
        int i15 = 0;
        while (i15 < 6) {
            bArr2[i14] = PAD;
            i15++;
            i14++;
        }
    }

    private final void encode2bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        int i13 = i11 + 1;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 3) & 31];
        byte b12 = bArr[i13];
        bArr2[i12 + 1] = bArr3[((b11 & 7) << 2) | ((b12 >>> 6) & 3)];
        int i14 = i12 + 3;
        bArr2[i12 + 2] = bArr3[(b12 >>> 1) & 31];
        int i15 = i12 + 4;
        bArr2[i14] = bArr3[(b12 & 1) << 4];
        int i16 = 0;
        while (i16 < 4) {
            bArr2[i15] = PAD;
            i16++;
            i15++;
        }
    }

    private final void encode3bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 3) & 31];
        byte b12 = bArr[i11 + 1];
        bArr2[i12 + 1] = bArr3[((b11 & 7) << 2) | ((b12 >>> 6) & 3)];
        bArr2[i12 + 2] = bArr3[(b12 >>> 1) & 31];
        int i13 = i12 + 4;
        byte b13 = bArr[i11 + 2];
        bArr2[i12 + 3] = bArr3[((b13 >>> 4) & 15) | ((b12 & 1) << 4)];
        int i14 = i12 + 5;
        bArr2[i13] = bArr3[(b13 & 15) << 1];
        int i15 = 0;
        while (i15 < 3) {
            bArr2[i14] = PAD;
            i15++;
            i14++;
        }
    }

    private final void encode4bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 3) & 31];
        byte b12 = bArr[i11 + 1];
        bArr2[i12 + 1] = bArr3[((b11 & 7) << 2) | ((b12 >>> 6) & 3)];
        bArr2[i12 + 2] = bArr3[(b12 >>> 1) & 31];
        byte b13 = bArr[i11 + 2];
        bArr2[i12 + 3] = bArr3[((b12 & 1) << 4) | ((b13 >>> 4) & 15)];
        byte b14 = bArr[i11 + 3];
        bArr2[i12 + 4] = bArr3[((b14 >>> 7) & 1) | ((b13 & 15) << 1)];
        bArr2[i12 + 5] = bArr3[(b14 >>> 2) & 31];
        bArr2[i12 + 6] = bArr3[(b14 & 3) << 3];
        bArr2[i12 + 7] = PAD;
    }

    private final void encode5bytes(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = this.alpahbets;
        byte b11 = bArr[i11];
        bArr2[i12] = bArr3[(b11 >>> 3) & 31];
        byte b12 = bArr[i11 + 1];
        bArr2[i12 + 1] = bArr3[((b11 & 7) << 2) | ((b12 >>> 6) & 3)];
        bArr2[i12 + 2] = bArr3[(b12 >>> 1) & 31];
        byte b13 = bArr[i11 + 2];
        bArr2[i12 + 3] = bArr3[((b12 & 1) << 4) | ((b13 >>> 4) & 15)];
        byte b14 = bArr[i11 + 3];
        bArr2[i12 + 4] = bArr3[((b13 & 15) << 1) | ((b14 >>> 7) & 1)];
        bArr2[i12 + 5] = bArr3[(b14 >>> 2) & 31];
        byte b15 = bArr[i11 + 4];
        bArr2[i12 + 6] = bArr3[((b15 >>> 5) & 7) | ((b14 & 3) << 3)];
        bArr2[i12 + 7] = bArr3[b15 & 31];
    }

    @Override // com.amazonaws.util.Codec
    public final byte[] decode(byte[] bArr, int i11) {
        int i12;
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 8 bytes but found: " + i11);
        }
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 < 6 && i13 > -1 && bArr[i13] == 61) {
            i13--;
            i14++;
        }
        if (i14 != 0) {
            int i15 = 4;
            if (i14 != 1) {
                i12 = 3;
                if (i14 != 3) {
                    if (i14 == 4) {
                        i15 = 2;
                        i12 = i15;
                    } else {
                        if (i14 != 6) {
                            throw new IllegalArgumentException("Invalid number of paddings " + i14);
                        }
                        i12 = 1;
                    }
                }
            } else {
                i12 = i15;
            }
        } else {
            i12 = 5;
        }
        int i16 = ((i11 / 8) * 5) - (5 - i12);
        byte[] bArr2 = new byte[i16];
        int i17 = 0;
        int i18 = 0;
        while (i18 < i16 - (i12 % 5)) {
            decode5bytes(bArr, i17, bArr2, i18);
            i17 += 8;
            i18 += 5;
        }
        if (i12 < 5) {
            decode1to4bytes(i12, bArr, i17, bArr2, i18);
        }
        return bArr2;
    }

    @Override // com.amazonaws.util.Codec
    public final byte[] encode(byte[] bArr) {
        int length = bArr.length / 5;
        int length2 = bArr.length % 5;
        int i11 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 8];
            int i12 = 0;
            while (i11 < bArr.length) {
                encode5bytes(bArr, i11, bArr2, i12);
                i11 += 5;
                i12 += 8;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 8];
        int i13 = 0;
        while (i11 < bArr.length - length2) {
            encode5bytes(bArr, i11, bArr3, i13);
            i11 += 5;
            i13 += 8;
        }
        if (length2 == 1) {
            encode1byte(bArr, i11, bArr3, i13);
            return bArr3;
        }
        if (length2 == 2) {
            encode2bytes(bArr, i11, bArr3, i13);
            return bArr3;
        }
        if (length2 == 3) {
            encode3bytes(bArr, i11, bArr3, i13);
            return bArr3;
        }
        if (length2 != 4) {
            return bArr3;
        }
        encode4bytes(bArr, i11, bArr3, i13);
        return bArr3;
    }

    protected abstract int pos(byte b11);
}
