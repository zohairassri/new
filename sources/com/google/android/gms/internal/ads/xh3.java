package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xh3 {
    public static String a(byte[] bArr, boolean z11) {
        return c(z11).h(bArr, 0, bArr.length);
    }

    public static byte[] b(String str, boolean z11) {
        byte[] bArrI = c(z11).i(str);
        if (bArrI.length != 0 || str.length() <= 0) {
            return bArrI;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static j34 c(boolean z11) {
        return z11 ? j34.k().f() : j34.j();
    }
}
