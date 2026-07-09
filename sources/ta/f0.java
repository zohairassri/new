package ta;

import androidx.work.m0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f129529e = androidx.work.z.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final m0 f129530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f129531b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f129532c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f129533d = new Object();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void b(sa.m mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f129534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sa.m f129535b;

        b(f0 f0Var, sa.m mVar) {
            this.f129534a = f0Var;
            this.f129535b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f129534a.f129533d) {
                try {
                    if (((b) this.f129534a.f129531b.remove(this.f129535b)) != null) {
                        a aVar = (a) this.f129534a.f129532c.remove(this.f129535b);
                        if (aVar != null) {
                            aVar.b(this.f129535b);
                        }
                    } else {
                        androidx.work.z.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f129535b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public f0(m0 m0Var) {
        this.f129530a = m0Var;
    }

    public void a(sa.m mVar, long j11, a aVar) {
        synchronized (this.f129533d) {
            androidx.work.z.e().a(f129529e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f129531b.put(mVar, bVar);
            this.f129532c.put(mVar, aVar);
            this.f129530a.b(j11, bVar);
        }
    }

    public void b(sa.m mVar) {
        synchronized (this.f129533d) {
            try {
                if (((b) this.f129531b.remove(mVar)) != null) {
                    androidx.work.z.e().a(f129529e, "Stopping timer for " + mVar);
                    this.f129532c.remove(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
