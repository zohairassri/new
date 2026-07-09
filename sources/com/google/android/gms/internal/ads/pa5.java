package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class pa5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qb5 f32806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32809e;

    public pa5(qb5 qb5Var) {
        this.f32806b = qb5Var;
    }

    public final void a(int i11) {
        this.f32805a = 1 == ((this.f32805a ? 1 : 0) | i11);
        this.f32807c += i11;
    }

    public final void b(qb5 qb5Var) {
        this.f32805a |= this.f32806b != qb5Var;
        this.f32806b = qb5Var;
    }

    public final void c(int i11) {
        if (this.f32808d && this.f32809e != 5) {
            jx3.a(i11 == 5);
            return;
        }
        this.f32805a = true;
        this.f32808d = true;
        this.f32809e = i11;
    }

    final /* synthetic */ boolean d() {
        return this.f32805a;
    }
}
