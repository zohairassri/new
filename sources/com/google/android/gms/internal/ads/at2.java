package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class at2 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws2 f23488a;

    private at2(ws2 ws2Var) {
        this.f23488a = ws2Var;
    }

    public static at2 b(ws2 ws2Var) {
        return new at2(ws2Var);
    }

    public static boolean c(ws2 ws2Var) {
        return ws2Var.g();
    }

    @Override // com.google.android.gms.internal.ads.w75
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.f23488a.g());
    }
}
