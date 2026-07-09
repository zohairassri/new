package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25572d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f25576h;

    protected e3(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f25569a = j11;
        this.f25570b = j12;
        this.f25573e = j14;
        this.f25574f = j15;
        this.f25575g = j16;
        this.f25571c = j17;
        this.f25576h = a(j12, 0L, j14, j15, j16, j17);
    }

    protected static long a(long j11, long j12, long j13, long j14, long j15, long j16) {
        if (j14 + 1 >= j15 || 1 + j12 >= j13) {
            return j14;
        }
        long j17 = (long) ((j11 - j12) * ((j15 - j14) / (j13 - j12)));
        String str = yy2.f38899a;
        return Math.max(j14, Math.min(((j14 + j17) - j16) - (j17 / 20), j15 - 1));
    }

    private final void i() {
        this.f25576h = a(this.f25570b, this.f25572d, this.f25573e, this.f25574f, this.f25575g, this.f25571c);
    }

    final /* synthetic */ long b() {
        return this.f25574f;
    }

    final /* synthetic */ long c() {
        return this.f25575g;
    }

    final /* synthetic */ long d() {
        return this.f25570b;
    }

    final /* synthetic */ long e() {
        return this.f25569a;
    }

    final /* synthetic */ void f(long j11, long j12) {
        this.f25572d = j11;
        this.f25574f = j12;
        i();
    }

    final /* synthetic */ void g(long j11, long j12) {
        this.f25573e = j11;
        this.f25575g = j12;
        i();
    }

    final /* synthetic */ long h() {
        return this.f25576h;
    }
}
