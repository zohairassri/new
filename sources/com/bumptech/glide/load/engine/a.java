package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.o;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f18960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f18961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f18962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f18963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f18964f;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class ThreadFactoryC0289a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class RunnableC0290a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f18965a;

            RunnableC0290a(Runnable runnable) {
                this.f18965a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f18965a.run();
            }
        }

        ThreadFactoryC0289a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0290a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ed.e f18968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f18969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        gd.c f18970c;

        c(ed.e eVar, o oVar, ReferenceQueue referenceQueue, boolean z11) {
            super(oVar, referenceQueue);
            this.f18968a = (ed.e) zd.k.d(eVar);
            this.f18970c = (oVar.f() && z11) ? (gd.c) zd.k.d(oVar.e()) : null;
            this.f18969b = oVar.f();
        }

        void a() {
            this.f18970c = null;
            clear();
        }
    }

    a(boolean z11) {
        this(z11, Executors.newSingleThreadExecutor(new ThreadFactoryC0289a()));
    }

    synchronized void a(ed.e eVar, o oVar) {
        c cVar = (c) this.f18961c.put(eVar, new c(eVar, oVar, this.f18962d, this.f18959a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f18964f) {
            try {
                c((c) this.f18962d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        gd.c cVar2;
        synchronized (this) {
            this.f18961c.remove(cVar.f18968a);
            if (cVar.f18969b && (cVar2 = cVar.f18970c) != null) {
                this.f18963e.a(cVar.f18968a, new o(cVar2, true, false, cVar.f18968a, this.f18963e));
            }
        }
    }

    synchronized void d(ed.e eVar) {
        c cVar = (c) this.f18961c.remove(eVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized o e(ed.e eVar) {
        c cVar = (c) this.f18961c.get(eVar);
        if (cVar == null) {
            return null;
        }
        o oVar = (o) cVar.get();
        if (oVar == null) {
            c(cVar);
        }
        return oVar;
    }

    void f(o.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f18963e = aVar;
            }
        }
    }

    a(boolean z11, Executor executor) {
        this.f18961c = new HashMap();
        this.f18962d = new ReferenceQueue();
        this.f18959a = z11;
        this.f18960b = executor;
        executor.execute(new b());
    }
}
