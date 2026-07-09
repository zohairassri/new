package com.comscore.util;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Base64Coder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f19454a = new char[64];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f19455b;

    static {
        char c11 = 'A';
        int i11 = 0;
        while (c11 <= 'Z') {
            f19454a[i11] = c11;
            c11 = (char) (c11 + 1);
            i11++;
        }
        char c12 = 'a';
        while (c12 <= 'z') {
            f19454a[i11] = c12;
            c12 = (char) (c12 + 1);
            i11++;
        }
        char c13 = '0';
        while (c13 <= '9') {
            f19454a[i11] = c13;
            c13 = (char) (c13 + 1);
            i11++;
        }
        char[] cArr = f19454a;
        cArr[i11] = '+';
        cArr[i11 + 1] = '/';
        f19455b = new byte[128];
        int i12 = 0;
        while (true) {
            byte[] bArr = f19455b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            f19455b[f19454a[i13]] = (byte) i13;
        }
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }

    public static byte[] decode(char[] cArr) {
        int i11;
        char c11;
        int length = cArr.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && cArr[length - 1] == '=') {
            length--;
        }
        int i12 = (length * 3) / 4;
        byte[] bArr = new byte[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 = i11) {
            char c12 = cArr[i14];
            i11 = i14 + 2;
            char c13 = cArr[i14 + 1];
            char c14 = 'A';
            if (i11 < length) {
                char c15 = cArr[i11];
                i11 = i14 + 3;
                c11 = c15;
            } else {
                c11 = 'A';
            }
            if (i11 < length) {
                c14 = cArr[i11];
                i11++;
            }
            if (c12 > 127 || c13 > 127 || c11 > 127 || c14 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f19455b;
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c13];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c14];
            if (b11 < 0 || b12 < 0 || b13 < 0 || b14 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i15 = (b11 << 2) | (b12 >>> 4);
            int i16 = ((b12 & 15) << 4) | (b13 >>> 2);
            int i17 = ((b13 & 3) << 6) | b14;
            int i18 = i13 + 1;
            bArr[i13] = (byte) i15;
            if (i18 < i12) {
                bArr[i18] = (byte) i16;
                i18 = i13 + 2;
            }
            if (i18 < i12) {
                i13 = i18 + 1;
                bArr[i18] = (byte) i17;
            } else {
                i13 = i18;
            }
        }
        return bArr;
    }

    public static char[] encode(byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14 = ((i11 * 4) + 2) / 3;
        char[] cArr = new char[((i11 + 2) / 3) * 4];
        int i15 = 0;
        int i16 = 0;
        while (i15 < i11) {
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            int i18 = b11 & 255;
            if (i17 < i11) {
                int i19 = bArr[i17] & 255;
                i17 = i15 + 2;
                i12 = i19;
            } else {
                i12 = 0;
            }
            if (i17 < i11) {
                i13 = bArr[i17] & 255;
                i17++;
            } else {
                i13 = 0;
            }
            int i21 = ((b11 & 3) << 4) | (i12 >>> 4);
            int i22 = ((i12 & 15) << 2) | (i13 >>> 6);
            int i23 = i13 & 63;
            char[] cArr2 = f19454a;
            cArr[i16] = cArr2[i18 >>> 2];
            int i24 = i16 + 2;
            cArr[i16 + 1] = cArr2[i21];
            char c11 = '=';
            cArr[i24] = i24 < i14 ? cArr2[i22] : '=';
            int i25 = i16 + 3;
            if (i25 < i14) {
                c11 = cArr2[i23];
            }
            cArr[i25] = c11;
            i16 += 4;
            i15 = i17;
        }
        return cArr;
    }
}
