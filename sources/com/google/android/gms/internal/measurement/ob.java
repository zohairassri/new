package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class ob {
    static /* synthetic */ void a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws zzji {
        if (e(b12) || (((b11 << 28) + (b12 + 112)) >> 30) != 0 || e(b13) || e(b14)) {
            throw zzji.c();
        }
        int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
        cArr[i11] = (char) ((i12 >>> 10) + 55232);
        cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
    }

    static /* synthetic */ void b(byte b11, byte b12, byte b13, char[] cArr, int i11) throws zzji {
        if (e(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || e(b13)))) {
            throw zzji.c();
        }
        cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
    }

    static /* synthetic */ void c(byte b11, byte b12, char[] cArr, int i11) throws zzji {
        if (b11 < -62 || e(b12)) {
            throw zzji.c();
        }
        cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
    }

    static /* synthetic */ void d(byte b11, char[] cArr, int i11) {
        cArr[i11] = (char) b11;
    }

    private static boolean e(byte b11) {
        return b11 > -65;
    }
}
