package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bt2 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws2 f24141a;

    private bt2(ws2 ws2Var) {
        this.f24141a = ws2Var;
    }

    public static bt2 b(ws2 ws2Var) {
        return new bt2(ws2Var);
    }

    public static String c(ws2 ws2Var) {
        String strE = ws2Var.e();
        q75.b(strE);
        return strE;
    }

    public final String a() {
        return c(this.f24141a);
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final /* synthetic */ Object zzb() {
        return c(this.f24141a);
    }
}
