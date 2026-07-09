package com.instacart.library.truetime;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47595b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cs.a f47596a = null;

    a() {
    }

    private boolean b() {
        if (this.f47596a != null) {
            return false;
        }
        c.d(f47595b, "Cannot use disk caching strategy for TrueTime. CacheInterface unavailable");
        return true;
    }

    void a(b bVar) {
        if (b()) {
            return;
        }
        long jD = bVar.d();
        long jC = bVar.c();
        long j11 = jD - jC;
        c.a(f47595b, String.format("Caching true time info to disk sntp [%s] device [%s] boot [%s]", Long.valueOf(jD), Long.valueOf(jC), Long.valueOf(j11)));
        this.f47596a.b("com.instacart.library.truetime.cached_boot_time", j11);
        this.f47596a.b("com.instacart.library.truetime.cached_device_uptime", jC);
        this.f47596a.b("com.instacart.library.truetime.cached_sntp_time", jD);
    }

    void c() {
        d(this.f47596a);
    }

    void d(cs.a aVar) {
        if (aVar != null) {
            aVar.clear();
        }
    }

    void e(cs.a aVar) {
        this.f47596a = aVar;
    }

    long f() {
        if (b()) {
            return 0L;
        }
        return this.f47596a.a("com.instacart.library.truetime.cached_device_uptime", 0L);
    }

    long g() {
        if (b()) {
            return 0L;
        }
        return this.f47596a.a("com.instacart.library.truetime.cached_sntp_time", 0L);
    }

    boolean h() {
        if (b() || this.f47596a.a("com.instacart.library.truetime.cached_boot_time", 0L) == 0) {
            return false;
        }
        boolean z11 = SystemClock.elapsedRealtime() < f();
        c.b(f47595b, "---- boot time changed " + z11);
        return !z11;
    }
}
