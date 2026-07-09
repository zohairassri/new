package ta;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class w implements ua.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f129551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f129552c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f129550a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f129553d = new Object();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w f129554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f129555b;

        a(w wVar, Runnable runnable) {
            this.f129554a = wVar;
            this.f129555b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f129555b.run();
                synchronized (this.f129554a.f129553d) {
                    this.f129554a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f129554a.f129553d) {
                    this.f129554a.a();
                    throw th2;
                }
            }
        }
    }

    public w(Executor executor) {
        this.f129551b = executor;
    }

    void a() {
        Runnable runnable = (Runnable) this.f129550a.poll();
        this.f129552c = runnable;
        if (runnable != null) {
            this.f129551b.execute(runnable);
        }
    }

    @Override // ua.a
    public boolean e0() {
        boolean z11;
        synchronized (this.f129553d) {
            z11 = !this.f129550a.isEmpty();
        }
        return z11;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f129553d) {
            try {
                this.f129550a.add(new a(this, runnable));
                if (this.f129552c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
