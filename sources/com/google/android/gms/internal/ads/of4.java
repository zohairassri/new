package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class of4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final pf4 f31928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f31929b;

    of4(pf4 pf4Var, long[] jArr) {
        this.f31928a = pf4Var;
        this.f31929b = jArr;
    }

    of4(of4 of4Var) {
        this.f31928a = new pf4(of4Var.f31928a);
        this.f31929b = Arrays.copyOf(of4Var.f31929b, 10);
    }
}
