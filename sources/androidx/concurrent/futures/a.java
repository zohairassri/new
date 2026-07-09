package androidx.concurrent.futures;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements com.google.common.util.concurrent.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f6294d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f6295e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f6296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f6297g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f6298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f6299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile h f6300c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f6301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f6302d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f6303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f6304b;

        static {
            if (a.f6294d) {
                f6302d = null;
                f6301c = null;
            } else {
                f6302d = new c(false, null);
                f6301c = new c(true, null);
            }
        }

        c(boolean z11, Throwable th2) {
            this.f6303a = z11;
            this.f6304b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f6305b = new d(new C0117a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f6306a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class C0117a extends Throwable {
            C0117a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f6306a = (Throwable) a.f(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f6307d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f6308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f6309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f6310c;

        e(Runnable runnable, Executor executor) {
            this.f6308a = runnable;
            this.f6309b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f6315e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f6311a = atomicReferenceFieldUpdater;
            this.f6312b = atomicReferenceFieldUpdater2;
            this.f6313c = atomicReferenceFieldUpdater3;
            this.f6314d = atomicReferenceFieldUpdater4;
            this.f6315e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f6314d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f6315e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f6313c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f6312b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f6311a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6299b != eVar) {
                        return false;
                    }
                    aVar.f6299b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6298a != obj) {
                        return false;
                    }
                    aVar.f6298a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f6300c != hVar) {
                        return false;
                    }
                    aVar.f6300c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f6318b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f6317a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f6316c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f6317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f6318b;

        h(boolean z11) {
        }

        void a(h hVar) {
            a.f6296f.d(this, hVar);
        }

        void b() {
            Thread thread = this.f6317a;
            if (thread != null) {
                this.f6317a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f6296f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, QueryKeys.PAGE_LOAD_TIME), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, QueryKeys.TIME_ON_VIEW_IN_MINUTES), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, QueryKeys.PAGE_LOAD_TIME), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f6296f = gVar;
        if (th != null) {
            f6295e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f6297g = new Object();
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        try {
            Object objN = n(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(v(objN));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e12) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e12.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException e(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static Object f(Object obj) {
        obj.getClass();
        return obj;
    }

    private e g(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f6299b;
        } while (!f6296f.a(this, eVar2, e.f6307d));
        while (true) {
            e eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                return eVar3;
            }
            eVar2 = eVar.f6310c;
            eVar.f6310c = eVar3;
        }
    }

    static void h(a aVar) {
        aVar.q();
        aVar.c();
        e eVarG = aVar.g(null);
        while (eVarG != null) {
            e eVar = eVarG.f6310c;
            k(eVarG.f6308a, eVarG.f6309b);
            eVarG = eVar;
        }
    }

    private static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e11) {
            f6295e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    private Object l(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f6304b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6306a);
        }
        if (obj == f6297g) {
            return null;
        }
        return obj;
    }

    static Object n(Future future) {
        Object obj;
        boolean z11 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void q() {
        h hVar;
        do {
            hVar = this.f6300c;
        } while (!f6296f.c(this, hVar, h.f6316c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f6318b;
        }
    }

    private void r(h hVar) {
        hVar.f6317a = null;
        while (true) {
            h hVar2 = this.f6300c;
            if (hVar2 == h.f6316c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f6318b;
                if (hVar2.f6317a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f6318b = hVar4;
                    if (hVar3.f6317a == null) {
                        break;
                    }
                } else if (!f6296f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String v(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.e
    public final void a(Runnable runnable, Executor executor) {
        f(runnable);
        f(executor);
        e eVar = this.f6299b;
        if (eVar != e.f6307d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6310c = eVar;
                if (f6296f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f6299b;
                }
            } while (eVar != e.f6307d);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        Object obj = this.f6298a;
        if (obj == null) {
            if (f6296f.b(this, obj, f6294d ? new c(z11, new CancellationException("Future.cancel() was called.")) : z11 ? c.f6301c : c.f6302d)) {
                if (z11) {
                    o();
                }
                h(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j11);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6298a;
        if (obj != null) {
            return l(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f6300c;
            if (hVar != h.f6316c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f6296f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                r(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f6298a;
                            if (obj2 != null) {
                                return l(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(hVar2);
                    } else {
                        hVar = this.f6300c;
                    }
                } while (hVar != h.f6316c);
            }
            return l(this.f6298a);
        }
        while (nanos > 0) {
            Object obj3 = this.f6298a;
            if (obj3 != null) {
                return l(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j12 = -nanos;
            long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(jConvert);
            boolean z11 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z11) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z11) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6298a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6298a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String p() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean t(Object obj) {
        if (obj == null) {
            obj = f6297g;
        }
        if (!f6296f.b(this, null, obj)) {
            return false;
        }
        h(this);
        return true;
    }

    public String toString() {
        String strP;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strP = p();
            } catch (RuntimeException e11) {
                strP = "Exception thrown from implementation: " + e11.getClass();
            }
            if (strP != null && !strP.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strP);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected boolean u(Throwable th2) {
        if (!f6296f.b(this, null, new d((Throwable) f(th2)))) {
            return false;
        }
        h(this);
        return true;
    }

    protected final boolean w() {
        Object obj = this.f6298a;
        return (obj instanceof c) && ((c) obj).f6303a;
    }

    protected void c() {
    }

    protected void o() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6298a;
            if (obj2 != null) {
                return l(obj2);
            }
            h hVar = this.f6300c;
            if (hVar != h.f6316c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f6296f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6298a;
                            } else {
                                r(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return l(obj);
                    }
                    hVar = this.f6300c;
                } while (hVar != h.f6316c);
            }
            return l(this.f6298a);
        }
        throw new InterruptedException();
    }
}
