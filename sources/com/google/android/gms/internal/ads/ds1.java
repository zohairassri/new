package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ds1 extends nr1 implements th1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private th1 f25242f;

    @Override // com.google.android.gms.internal.ads.th1
    public final synchronized void N() {
        th1 th1Var = this.f25242f;
        if (th1Var != null) {
            th1Var.N();
        }
    }

    @Override // com.google.android.gms.internal.ads.th1
    public final synchronized void V() {
        th1 th1Var = this.f25242f;
        if (th1Var != null) {
            th1Var.V();
        }
    }

    protected final synchronized void c(yl.a aVar, f50 f50Var, am.x xVar, h50 h50Var, am.e eVar, th1 th1Var) {
        super.b(aVar, f50Var, xVar, h50Var, eVar);
        this.f25242f = th1Var;
    }
}
