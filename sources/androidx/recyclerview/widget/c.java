package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f12073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.f f12074c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Object f12075d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Executor f12076e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Executor f12077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f12078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h.f f12079c;

        public a(h.f fVar) {
            this.f12079c = fVar;
        }

        public c a() {
            if (this.f12078b == null) {
                synchronized (f12075d) {
                    try {
                        if (f12076e == null) {
                            f12076e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f12078b = f12076e;
            }
            return new c(this.f12077a, this.f12078b, this.f12079c);
        }
    }

    c(Executor executor, Executor executor2, h.f fVar) {
        this.f12072a = executor;
        this.f12073b = executor2;
        this.f12074c = fVar;
    }

    public Executor a() {
        return this.f12073b;
    }

    public h.f b() {
        return this.f12074c;
    }

    public Executor c() {
        return this.f12072a;
    }
}
