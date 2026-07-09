package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g75 implements i75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r75 f26843a;

    public static void a(r75 r75Var, r75 r75Var2) {
        g75 g75Var = (g75) r75Var;
        if (g75Var.f26843a != null) {
            throw new IllegalStateException();
        }
        g75Var.f26843a = r75Var2;
    }

    @Override // com.google.android.gms.internal.ads.w75
    public final Object zzb() {
        r75 r75Var = this.f26843a;
        if (r75Var != null) {
            return r75Var.zzb();
        }
        throw new IllegalStateException();
    }
}
