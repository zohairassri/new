package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class lq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f30401a = new AtomicBoolean(false);

    public lq0(String str) {
    }

    public final boolean a() {
        return this.f30401a.get();
    }

    public final void b() {
        this.f30401a.set(true);
    }

    public final void c() {
        this.f30401a.set(false);
    }

    public final void d() {
        this.f30401a.set(false);
    }
}
