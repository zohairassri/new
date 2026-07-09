package k6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h6.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f107658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f107659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f107660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f107661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f107662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f107663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f107664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f107665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f107666i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a(Object obj, h6.o oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f107667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f107668b = new o.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f107669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f107670d;

        public c(Object obj) {
            this.f107667a = obj;
        }

        public void a(int i11, a aVar) {
            if (this.f107670d) {
                return;
            }
            if (i11 != -1) {
                this.f107668b.a(i11);
            }
            this.f107669c = true;
            aVar.invoke(this.f107667a);
        }

        public void b(b bVar) {
            if (this.f107670d || !this.f107669c) {
                return;
            }
            h6.o oVarE = this.f107668b.e();
            this.f107668b = new o.b();
            this.f107669c = false;
            bVar.a(this.f107667a, oVarE);
        }

        public void c(b bVar) {
            this.f107670d = true;
            if (this.f107669c) {
                this.f107669c = false;
                bVar.a(this.f107667a, this.f107668b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f107667a.equals(((c) obj).f107667a);
        }

        public int hashCode() {
            return this.f107667a.hashCode();
        }
    }

    public r(Looper looper, i iVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, iVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i11, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i11, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(Message message) {
        Iterator it = this.f107661d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f107660c);
            if (this.f107659b.b(1)) {
                break;
            }
        }
        return true;
    }

    private void m() {
        if (this.f107666i) {
            k6.a.g(Thread.currentThread() == this.f107659b.f().getThread());
        }
    }

    public void c(Object obj) {
        k6.a.e(obj);
        synchronized (this.f107664g) {
            try {
                if (this.f107665h) {
                    return;
                }
                this.f107661d.add(new c(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        m();
        Iterator it = this.f107661d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f107660c);
        }
        this.f107661d.clear();
    }

    public r e(Looper looper, i iVar, b bVar) {
        return new r(this.f107661d, looper, iVar, bVar, this.f107666i);
    }

    public r f(Looper looper, b bVar) {
        return e(looper, this.f107658a, bVar);
    }

    public void g() {
        m();
        if (this.f107663f.isEmpty()) {
            return;
        }
        if (!this.f107659b.b(1)) {
            o oVar = this.f107659b;
            oVar.l(oVar.a(1));
        }
        boolean zIsEmpty = this.f107662e.isEmpty();
        this.f107662e.addAll(this.f107663f);
        this.f107663f.clear();
        if (zIsEmpty) {
            while (!this.f107662e.isEmpty()) {
                ((Runnable) this.f107662e.peekFirst()).run();
                this.f107662e.removeFirst();
            }
        }
    }

    public void i(final int i11, final a aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f107661d);
        this.f107663f.add(new Runnable() { // from class: k6.q
            @Override // java.lang.Runnable
            public final void run() {
                r.a(copyOnWriteArraySet, i11, aVar);
            }
        });
    }

    public void j() {
        m();
        synchronized (this.f107664g) {
            this.f107665h = true;
        }
        Iterator it = this.f107661d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f107660c);
        }
        this.f107661d.clear();
    }

    public void k(Object obj) {
        m();
        for (c cVar : this.f107661d) {
            if (cVar.f107667a.equals(obj)) {
                cVar.c(this.f107660c);
                this.f107661d.remove(cVar);
            }
        }
    }

    public void l(int i11, a aVar) {
        i(i11, aVar);
        g();
    }

    private r(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, i iVar, b bVar, boolean z11) {
        this.f107658a = iVar;
        this.f107661d = copyOnWriteArraySet;
        this.f107660c = bVar;
        this.f107664g = new Object();
        this.f107662e = new ArrayDeque();
        this.f107663f = new ArrayDeque();
        this.f107659b = iVar.d(looper, new Handler.Callback() { // from class: k6.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f107654a.h(message);
            }
        });
        this.f107666i = z11;
    }
}
