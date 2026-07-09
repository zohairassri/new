package yq;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f140872d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f140873e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f140874a = h.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f140875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f140876c;

    e() {
    }

    private synchronized long a(int i11) {
        if (c(i11)) {
            return (long) Math.min(Math.pow(2.0d, this.f140876c) + this.f140874a.e(), f140873e);
        }
        return f140872d;
    }

    private static boolean c(int i11) {
        if (i11 != 429) {
            return i11 >= 500 && i11 < 600;
        }
        return true;
    }

    private static boolean d(int i11) {
        return (i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404;
    }

    private synchronized void e() {
        this.f140876c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f140876c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            com.google.firebase.installations.h r0 = r4.f140874a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f140875b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yq.e.b():boolean");
    }

    public synchronized void f(int i11) {
        if (d(i11)) {
            e();
            return;
        }
        this.f140876c++;
        this.f140875b = this.f140874a.a() + a(i11);
    }
}
