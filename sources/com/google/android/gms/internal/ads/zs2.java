package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class zs2 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws2 f39392a;

    private zs2(ws2 ws2Var) {
        this.f39392a = ws2Var;
    }

    public static zs2 b(ws2 ws2Var) {
        return new zs2(ws2Var);
    }

    public static boolean c(ws2 ws2Var) {
        return ws2Var.h();
    }

    @Override // com.google.android.gms.internal.ads.w75
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.f39392a.h());
    }
}
