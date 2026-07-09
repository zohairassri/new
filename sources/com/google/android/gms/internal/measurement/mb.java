package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final nb f40558a;

    static {
        if (lb.w()) {
            lb.z();
        }
        f40558a = new qb();
    }

    static int a(CharSequence charSequence) {
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                throw new pb(i12, length2);
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

    static int b(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        return f40558a.b(charSequence, bArr, i11, i12);
    }

    static /* synthetic */ int c(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
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

    static boolean d(byte[] bArr) {
        return f40558a.d(bArr, 0, bArr.length);
    }

    static String e(byte[] bArr, int i11, int i12) {
        return f40558a.c(bArr, i11, i12);
    }

    static boolean f(byte[] bArr, int i11, int i12) {
        return f40558a.d(bArr, i11, i12);
    }
}
