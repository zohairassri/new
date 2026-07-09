package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i4 f39960a;

    static {
        if (g4.C() && g4.D()) {
            int i11 = e1.f39903a;
        }
        f39960a = new j4();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b11 = bArr[i11 - 1];
        if (i13 == 0) {
            if (b11 > -12) {
                return -1;
            }
            return b11;
        }
        if (i13 == 1) {
            byte b12 = bArr[i11];
            if (b11 > -12 || b12 > -65) {
                return -1;
            }
            return (b12 << 8) ^ b11;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b13 = bArr[i11];
        byte b14 = bArr[i11 + 1];
        if (b11 > -12 || b13 > -65 || b14 > -65) {
            return -1;
        }
        return (b14 << 16) ^ ((b13 << 8) ^ b11);
    }

    static int b(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int length = charSequence.length();
        int i16 = 0;
        while (true) {
            i13 = i11 + i12;
            if (i16 >= length || (i15 = i16 + i11) >= i13 || (cCharAt = charSequence.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i11 + length;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 < 128 && i17 < i13) {
                bArr[i17] = (byte) cCharAt2;
                i17++;
            } else if (cCharAt2 < 2048 && i17 <= i13 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i17 > i13 - 3) {
                    if (i17 > i13 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i14 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i14)))) {
                            throw new k4(i16, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                    }
                    int i19 = i16 + 1;
                    if (i19 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i19);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i21 = i17 + 3;
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i21] = (byte) ((codePoint & 63) | 128);
                            i16 = i19;
                        } else {
                            i16 = i19;
                        }
                    }
                    throw new k4(i16 - 1, length);
                }
                bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i22 = i17 + 2;
                bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i17 += 3;
                bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
            }
            i16++;
        }
        return i17;
    }

    static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt < 2048) {
                i13 += (127 - cCharAt) >>> 31;
                i12++;
            } else {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char cCharAt2 = charSequence.charAt(i12);
                    if (cCharAt2 < 2048) {
                        i11 += (127 - cCharAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                throw new k4(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i13) + 4294967296L));
    }

    static boolean d(byte[] bArr) {
        return f39960a.b(bArr, 0, bArr.length);
    }

    static boolean e(byte[] bArr, int i11, int i12) {
        return f39960a.b(bArr, 0, i12);
    }
}
