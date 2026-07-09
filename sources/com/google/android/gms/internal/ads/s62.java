package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f34536a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34537b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34538c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34539d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f34540e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f34541f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f34542g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f34543h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f34544i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f34545j = new Object();

    public final synchronized void a(long j11) {
        synchronized (this.f34541f) {
            this.f34536a = j11;
        }
    }

    public final synchronized long b() {
        long j11;
        synchronized (this.f34541f) {
            j11 = this.f34536a;
        }
        return j11;
    }

    public final void c(int i11) {
        synchronized (this.f34542g) {
            this.f34537b = i11;
        }
    }

    public final int d() {
        int i11;
        synchronized (this.f34542g) {
            i11 = this.f34537b;
        }
        return i11;
    }

    public final void e(long j11) {
        synchronized (this.f34543h) {
            this.f34538c = j11;
        }
    }

    public final long f() {
        long j11;
        synchronized (this.f34543h) {
            j11 = this.f34538c;
        }
        return j11;
    }

    public final synchronized void g(long j11) {
        synchronized (this.f34544i) {
            this.f34539d = j11;
        }
    }

    public final synchronized long h() {
        long j11;
        synchronized (this.f34544i) {
            j11 = this.f34539d;
        }
        return j11;
    }

    public final synchronized void i(long j11) {
        synchronized (this.f34545j) {
            this.f34540e = j11;
        }
    }

    public final synchronized long j() {
        long j11;
        synchronized (this.f34545j) {
            j11 = this.f34540e;
        }
        return j11;
    }
}
