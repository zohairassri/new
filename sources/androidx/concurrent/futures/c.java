package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f6320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f6321c = f.x();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6322d;

        a() {
        }

        private void e() {
            this.f6319a = null;
            this.f6320b = null;
            this.f6321c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            f fVar = this.f6321c;
            if (fVar != null) {
                fVar.a(runnable, executor);
            }
        }

        void b() {
            this.f6319a = null;
            this.f6320b = null;
            this.f6321c.t(null);
        }

        public boolean c(Object obj) {
            this.f6322d = true;
            d dVar = this.f6320b;
            boolean z11 = dVar != null && dVar.c(obj);
            if (z11) {
                e();
            }
            return z11;
        }

        public boolean d() {
            this.f6322d = true;
            d dVar = this.f6320b;
            boolean z11 = dVar != null && dVar.b(true);
            if (z11) {
                e();
            }
            return z11;
        }

        public boolean f(Throwable th2) {
            this.f6322d = true;
            d dVar = this.f6320b;
            boolean z11 = dVar != null && dVar.d(th2);
            if (z11) {
                e();
            }
            return z11;
        }

        protected void finalize() {
            f fVar;
            d dVar = this.f6320b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f6319a));
            }
            if (this.f6322d || (fVar = this.f6321c) == null) {
                return;
            }
            fVar.t(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface InterfaceC0118c {
        Object a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d implements com.google.common.util.concurrent.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference f6323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a f6324b = new a();

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String p() {
                a aVar = (a) d.this.f6323a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f6319a + "]";
            }
        }

        d(a aVar) {
            this.f6323a = new WeakReference(aVar);
        }

        @Override // com.google.common.util.concurrent.e
        public void a(Runnable runnable, Executor executor) {
            this.f6324b.a(runnable, executor);
        }

        boolean b(boolean z11) {
            return this.f6324b.cancel(z11);
        }

        boolean c(Object obj) {
            return this.f6324b.t(obj);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            a aVar = (a) this.f6323a.get();
            boolean zCancel = this.f6324b.cancel(z11);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        boolean d(Throwable th2) {
            return this.f6324b.u(th2);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f6324b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f6324b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f6324b.isDone();
        }

        public String toString() {
            return this.f6324b.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j11, TimeUnit timeUnit) {
            return this.f6324b.get(j11, timeUnit);
        }
    }

    public static com.google.common.util.concurrent.e a(InterfaceC0118c interfaceC0118c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f6320b = dVar;
        aVar.f6319a = interfaceC0118c.getClass();
        try {
            Object objA = interfaceC0118c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f6319a = objA;
            return dVar;
        } catch (Exception e11) {
            dVar.d(e11);
            return dVar;
        }
    }
}
