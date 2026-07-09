package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public static Object a(ri4 ri4Var) {
        try {
            return ri4Var.zza();
        } catch (Exception e11) {
            throw new zzhlm(e11);
        }
    }

    public zzhlm(String str, Throwable th2) {
        super(str, th2);
    }

    public zzhlm(Throwable th2) {
        super(th2);
    }
}
