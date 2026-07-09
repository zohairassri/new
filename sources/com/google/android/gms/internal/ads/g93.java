package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class g93 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f26871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h93 f26872b;

    g93(h93 h93Var, float f11) {
        this.f26871a = f11;
        Objects.requireNonNull(h93Var);
        this.f26872b = h93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26872b.f27596a.g().e(this.f26871a);
    }
}
