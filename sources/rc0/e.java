package rc0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import w.c1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f124724e = new e().k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f124725f = new e().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f124726a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Throwable f124727b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f124728c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f124729d = new Object();

    public static /* synthetic */ void a(e eVar, AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicInteger atomicInteger, e eVar2) {
        if (!eVar.f()) {
            atomicBoolean.set(true);
            Throwable thD = eVar.d();
            if (thD != null) {
                c1.a(atomicReference, null, thD);
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (atomicBoolean.get()) {
                eVar2.c((Throwable) atomicReference.get());
            } else {
                eVar2.k();
            }
        }
    }

    private e c(Throwable th2) {
        synchronized (this.f124729d) {
            try {
                if (this.f124726a == null) {
                    this.f124726a = Boolean.FALSE;
                    this.f124727b = th2;
                    Iterator it = this.f124728c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this;
    }

    public static e h(Collection collection) {
        if (collection.isEmpty()) {
            return j();
        }
        final e eVar = new e();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            final e eVar2 = (e) it.next();
            eVar2.l(new Runnable() { // from class: rc0.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.a(this.f124718a, atomicBoolean, atomicReference, atomicInteger, eVar);
                }
            });
        }
        return eVar;
    }

    public static e i() {
        return f124725f;
    }

    public static e j() {
        return f124724e;
    }

    public e b() {
        return c(null);
    }

    public Throwable d() {
        Throwable th2;
        synchronized (this.f124729d) {
            th2 = this.f124727b;
        }
        return th2;
    }

    public boolean e() {
        boolean z11;
        synchronized (this.f124729d) {
            z11 = this.f124726a != null;
        }
        return z11;
    }

    public boolean f() {
        boolean z11;
        synchronized (this.f124729d) {
            try {
                Boolean bool = this.f124726a;
                z11 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z11;
    }

    public e g(long j11, TimeUnit timeUnit) {
        if (e()) {
            return this;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        l(new Runnable() { // from class: rc0.d
            @Override // java.lang.Runnable
            public final void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j11, timeUnit);
            return this;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this;
        }
    }

    public e k() {
        synchronized (this.f124729d) {
            try {
                if (this.f124726a == null) {
                    this.f124726a = Boolean.TRUE;
                    Iterator it = this.f124728c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public e l(Runnable runnable) {
        boolean z11;
        synchronized (this.f124729d) {
            if (this.f124726a != null) {
                z11 = true;
            } else {
                this.f124728c.add(runnable);
                z11 = false;
            }
        }
        if (z11) {
            runnable.run();
        }
        return this;
    }
}
