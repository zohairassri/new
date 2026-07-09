package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class qf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final pf4 f33628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f33629b;

    qf4(pf4 pf4Var, long[] jArr) {
        this.f33628a = pf4Var;
        this.f33629b = jArr;
    }

    static /* synthetic */ qf4 a(qf4 qf4Var, of4 of4Var) {
        b(qf4Var, of4Var);
        return qf4Var;
    }

    private static qf4 b(qf4 qf4Var, of4 of4Var) {
        pf4 pf4Var = of4Var.f31928a;
        pf4 pf4Var2 = qf4Var.f33628a;
        long[] jArr = pf4Var2.f32927a;
        long[] jArr2 = pf4Var.f32927a;
        long[] jArr3 = of4Var.f31929b;
        yf4.e(jArr, jArr2, jArr3);
        long[] jArr4 = pf4Var2.f32928b;
        long[] jArr5 = pf4Var.f32928b;
        long[] jArr6 = pf4Var.f32929c;
        yf4.e(jArr4, jArr5, jArr6);
        yf4.e(pf4Var2.f32929c, jArr6, jArr3);
        yf4.e(qf4Var.f33629b, jArr2, jArr5);
        return qf4Var;
    }

    qf4() {
        this(new pf4(), new long[10]);
    }

    qf4(of4 of4Var) {
        this();
        b(this, of4Var);
    }
}
