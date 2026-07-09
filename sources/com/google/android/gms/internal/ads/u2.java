package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f35876a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f35877b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static t2 a(byte[] bArr) {
        return b(new gf2(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.t2 b(com.google.android.gms.internal.ads.gf2 r11, boolean r12) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u2.b(com.google.android.gms.internal.ads.gf2, boolean):com.google.android.gms.internal.ads.t2");
    }

    private static int c(gf2 gf2Var) {
        int iJ = gf2Var.j(5);
        return iJ == 31 ? gf2Var.j(6) + 32 : iJ;
    }

    private static int d(gf2 gf2Var) throws zzat {
        int iJ = gf2Var.j(4);
        if (iJ == 15) {
            if (gf2Var.c() >= 24) {
                return gf2Var.j(24);
            }
            throw zzat.b("AAC header insufficient data", null);
        }
        if (iJ < 13) {
            return f35876a[iJ];
        }
        throw zzat.b("AAC header wrong Sampling Frequency Index", null);
    }
}
