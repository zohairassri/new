package je0;

import be0.g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f105576a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f105577b = new AtomicReference();

    /* JADX INFO: renamed from: je0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class C1301a extends AtomicReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f105578a;

        C1301a() {
        }

        public Object a() {
            Object objB = b();
            e(null);
            return objB;
        }

        public Object b() {
            return this.f105578a;
        }

        public C1301a c() {
            return (C1301a) get();
        }

        public void d(C1301a c1301a) {
            lazySet(c1301a);
        }

        public void e(Object obj) {
            this.f105578a = obj;
        }

        C1301a(Object obj) {
            e(obj);
        }
    }

    public a() {
        C1301a c1301a = new C1301a();
        e(c1301a);
        f(c1301a);
    }

    C1301a a() {
        return (C1301a) this.f105577b.get();
    }

    C1301a c() {
        return (C1301a) this.f105577b.get();
    }

    @Override // be0.h
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    C1301a d() {
        return (C1301a) this.f105576a.get();
    }

    void e(C1301a c1301a) {
        this.f105577b.lazySet(c1301a);
    }

    C1301a f(C1301a c1301a) {
        return (C1301a) this.f105576a.getAndSet(c1301a);
    }

    @Override // be0.h
    public boolean isEmpty() {
        return c() == d();
    }

    @Override // be0.h
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C1301a c1301a = new C1301a(obj);
        f(c1301a).d(c1301a);
        return true;
    }

    @Override // be0.g, be0.h
    public Object poll() {
        C1301a c1301aC;
        C1301a c1301aA = a();
        C1301a c1301aC2 = c1301aA.c();
        if (c1301aC2 != null) {
            Object objA = c1301aC2.a();
            e(c1301aC2);
            return objA;
        }
        if (c1301aA == d()) {
            return null;
        }
        do {
            c1301aC = c1301aA.c();
        } while (c1301aC == null);
        Object objA2 = c1301aC.a();
        e(c1301aC);
        return objA2;
    }
}
