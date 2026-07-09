package q5;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import t.f1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f122378g = new ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f122382d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f122379a = new f1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f122380b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1623a f122381c = new C1623a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f122383e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f122384f = false;

    /* JADX INFO: renamed from: q5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class C1623a {
        C1623a() {
        }

        void a() {
            a.this.f122383e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f122383e);
            if (a.this.f122380b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface b {
        boolean a(long j11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C1623a f122386a;

        c(C1623a c1623a) {
            this.f122386a = c1623a;
        }

        abstract void a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Choreographer f122387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f122388c;

        /* JADX INFO: renamed from: q5.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class ChoreographerFrameCallbackC1624a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC1624a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                d.this.f122386a.a();
            }
        }

        d(C1623a c1623a) {
            super(c1623a);
            this.f122387b = Choreographer.getInstance();
            this.f122388c = new ChoreographerFrameCallbackC1624a();
        }

        @Override // q5.a.c
        void a() {
            this.f122387b.postFrameCallback(this.f122388c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f122384f) {
            for (int size = this.f122380b.size() - 1; size >= 0; size--) {
                if (this.f122380b.get(size) == null) {
                    this.f122380b.remove(size);
                }
            }
            this.f122384f = false;
        }
    }

    public static a d() {
        ThreadLocal threadLocal = f122378g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return (a) threadLocal.get();
    }

    private boolean f(b bVar, long j11) {
        Long l11 = (Long) this.f122379a.get(bVar);
        if (l11 == null) {
            return true;
        }
        if (l11.longValue() >= j11) {
            return false;
        }
        this.f122379a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j11) {
        if (this.f122380b.size() == 0) {
            e().a();
        }
        if (!this.f122380b.contains(bVar)) {
            this.f122380b.add(bVar);
        }
        if (j11 > 0) {
            this.f122379a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j11));
        }
    }

    void c(long j11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i11 = 0; i11 < this.f122380b.size(); i11++) {
            b bVar = (b) this.f122380b.get(i11);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j11);
            }
        }
        b();
    }

    c e() {
        if (this.f122382d == null) {
            this.f122382d = new d(this.f122381c);
        }
        return this.f122382d;
    }

    public void g(b bVar) {
        this.f122379a.remove(bVar);
        int iIndexOf = this.f122380b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f122380b.set(iIndexOf, null);
            this.f122384f = true;
        }
    }
}
