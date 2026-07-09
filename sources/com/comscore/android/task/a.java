package com.comscore.android.task;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f19399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f19400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f19401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Exception f19407i;

    a(Runnable runnable) {
        this(runnable, 0L);
    }

    long a() {
        return this.f19403e;
    }

    Exception b() {
        return this.f19407i;
    }

    long c() {
        return this.f19402d;
    }

    long d() {
        long jCurrentTimeMillis = this.f19402d - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            return jCurrentTimeMillis;
        }
        return 0L;
    }

    long e() {
        return this.f19404f;
    }

    Runnable f() {
        return this.f19401c;
    }

    boolean g() {
        return this.f19406h;
    }

    boolean h() {
        return this.f19405g;
    }

    boolean i() {
        return this.f19400b.get();
    }

    boolean j() {
        return this.f19404f > 0;
    }

    boolean k() {
        return this.f19399a.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f19399a.set(true);
        try {
            this.f19401c.run();
        } catch (Exception e11) {
            this.f19407i = e11;
        }
        this.f19399a.set(false);
        this.f19400b.set(true);
    }

    a(Runnable runnable, long j11) {
        this(runnable, j11, 0L);
    }

    a(Runnable runnable, long j11, long j12) {
        this(runnable, j11, j12, true);
    }

    a(Runnable runnable, long j11, long j12, boolean z11) {
        this.f19401c = runnable;
        this.f19402d = System.currentTimeMillis() + (j11 <= 0 ? 0L : j11);
        this.f19405g = j11 > 0;
        this.f19403e = System.currentTimeMillis();
        this.f19404f = j12;
        this.f19399a = new AtomicBoolean();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f19400b = atomicBoolean;
        atomicBoolean.set(false);
        this.f19399a.set(false);
        this.f19407i = null;
        this.f19406h = z11;
    }
}
