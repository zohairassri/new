package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class hu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ej3 f27963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f27964b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27965c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27966d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f27967e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27968f;

    hu3(int i11, jg3 jg3Var, ej3 ej3Var) {
        this.f27968f = i11;
        this.f27963a = ej3Var;
    }

    public final void a() {
        if (this.f27964b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f27965c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th2) {
        if (this.f27964b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f27967e = th2;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f27964b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f27966d = SystemClock.uptimeMillis();
        this.f27963a.b(this.f27968f - 1, atomicBoolean.get() ? this.f27966d - this.f27965c : -1L, this.f27967e, null);
    }
}
