package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f23951a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aj2 f23952b;

    public final void a(boolean z11) {
        this.f23951a.set(true);
    }

    public final boolean b() {
        return this.f23951a.get();
    }

    final void c(aj2 aj2Var) {
        this.f23952b = aj2Var;
    }

    final aj2 d() {
        return this.f23952b;
    }
}
