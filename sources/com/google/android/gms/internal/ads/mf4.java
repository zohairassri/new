package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
class mf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[] f30725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f30726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f30727c;

    mf4(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f30725a = jArr;
        this.f30726b = jArr2;
        this.f30727c = jArr3;
    }

    void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void b(mf4 mf4Var, int i11) {
        lf4.a(this.f30725a, mf4Var.f30725a, i11);
        lf4.a(this.f30726b, mf4Var.f30726b, i11);
        lf4.a(this.f30727c, mf4Var.f30727c, i11);
    }

    mf4(mf4 mf4Var) {
        this.f30725a = Arrays.copyOf(mf4Var.f30725a, 10);
        this.f30726b = Arrays.copyOf(mf4Var.f30726b, 10);
        this.f30727c = Arrays.copyOf(mf4Var.f30727c, 10);
    }
}
