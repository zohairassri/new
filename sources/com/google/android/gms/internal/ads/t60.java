package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35307a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35308b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f35309c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f35310d = new AtomicBoolean(false);

    public final synchronized void a(boolean z11) {
        this.f35307a = z11;
        this.f35310d.set(true);
    }

    public final synchronized void b(boolean z11, float f11) {
        this.f35308b = z11;
        this.f35309c = f11;
    }

    public final synchronized boolean c(boolean z11) {
        if (!this.f35310d.get()) {
            return z11;
        }
        return this.f35307a;
    }

    public final synchronized boolean d() {
        return this.f35308b;
    }

    public final synchronized float e() {
        return this.f35309c;
    }
}
