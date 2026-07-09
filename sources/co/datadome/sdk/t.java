package co.datadome.sdk;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile t f18118d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Date f18119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18121c = new AtomicBoolean(false);

    private t() {
        this.f18120b = l.f18104b.b(k.ADVANCED_SIGNALS_COLLECTION) ? 600000L : 10000L;
    }

    static t a() {
        if (f18118d == null) {
            synchronized (t.class) {
                try {
                    if (f18118d == null) {
                        f18118d = new t();
                    }
                } finally {
                }
            }
        }
        return f18118d;
    }

    void b(Date date) {
        this.f18119a = date;
    }

    void c(boolean z11) {
        this.f18121c.set(z11);
    }

    boolean d(List list) {
        if (this.f18121c.get()) {
            return false;
        }
        if (this.f18119a != null) {
            return new Date().getTime() - this.f18119a.getTime() > this.f18120b && list.size() >= 5;
        }
        return true;
    }
}
