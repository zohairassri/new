package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ys2 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws2 f38700a;

    private ys2(ws2 ws2Var) {
        this.f38700a = ws2Var;
    }

    public static ys2 b(ws2 ws2Var) {
        return new ys2(ws2Var);
    }

    @Override // com.google.android.gms.internal.ads.w75
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.f38700a.f());
    }
}
