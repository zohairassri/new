package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xs2 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws2 f38170a;

    private xs2(ws2 ws2Var) {
        this.f38170a = ws2Var;
    }

    public static xs2 b(ws2 ws2Var) {
        return new xs2(ws2Var);
    }

    public static String c(ws2 ws2Var) {
        String strA = ws2Var.a();
        q75.b(strA);
        return strA;
    }

    public final String a() {
        return c(this.f38170a);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        return c(this.f38170a);
    }
}
