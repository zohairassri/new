package com.instacart.library.truetime;

import android.os.SystemClock;
import com.comscore.util.log.LogLevel;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f47602b = "d";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f47603c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f47604d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f47605e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static float f47606f = 100.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f47607g = 100.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f47608h = 750;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f47609i = LogLevel.NONE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47610a = "1.us.pool.ntp.org";

    private static long a() {
        b bVar = f47605e;
        long jC = bVar.k() ? bVar.c() : f47604d.f();
        if (jC != 0) {
            return jC;
        }
        throw new RuntimeException("expected device time from last boot to be cached. couldn't find it.");
    }

    private static long b() {
        b bVar = f47605e;
        long jD = bVar.k() ? bVar.d() : f47604d.g();
        if (jD != 0) {
            return jD;
        }
        throw new RuntimeException("expected SNTP time from last boot to be cached. couldn't find it.");
    }

    public static d c() {
        return f47603c;
    }

    public static void d() {
        f47604d.c();
    }

    public static boolean g() {
        return f47605e.k() || f47604d.h();
    }

    public static Date h() {
        if (!g()) {
            throw new IllegalStateException("You need to call init() on TrueTime at least once.");
        }
        return new Date(b() + (SystemClock.elapsedRealtime() - a()));
    }

    static synchronized void j() {
        b bVar = f47605e;
        if (bVar.k()) {
            f47604d.a(bVar);
        } else {
            c.b(f47602b, "---- SNTP client not available. not caching TrueTime info in disk");
        }
    }

    public void e() {
        f(this.f47610a);
    }

    protected void f(String str) {
        if (g()) {
            c.b(f47602b, "---- TrueTime already initialized from previous boot/init");
        } else {
            i(str);
            j();
        }
    }

    long[] i(String str) {
        return f47605e.h(str, f47606f, f47607g, f47608h, f47609i);
    }

    public synchronized d k(int i11) {
        f47609i = i11;
        return f47603c;
    }

    public synchronized d l(cs.a aVar) {
        f47604d.e(aVar);
        return f47603c;
    }

    public synchronized d m(boolean z11) {
        c.c(z11);
        return f47603c;
    }

    public synchronized d n(String str) {
        this.f47610a = str;
        return f47603c;
    }
}
