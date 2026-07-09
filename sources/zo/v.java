package zo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import zo.v;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a implements u, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f142492a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final u f142493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f142494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Object f142495d;

        a(u uVar) {
            this.f142493b = (u) o.k(uVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f142492a = new Object();
        }

        @Override // zo.u
        public Object get() {
            if (!this.f142494c) {
                synchronized (this.f142492a) {
                    try {
                        if (!this.f142494c) {
                            Object obj = this.f142493b.get();
                            this.f142495d = obj;
                            this.f142494c = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return j.a(this.f142495d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f142494c) {
                obj = "<supplier that returned " + this.f142495d + ">";
            } else {
                obj = this.f142493b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b implements u {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final u f142496d = new u() { // from class: zo.w
            @Override // zo.u
            public final Object get() {
                return v.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f142497a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile u f142498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f142499c;

        b(u uVar) {
            this.f142498b = (u) o.k(uVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // zo.u
        public Object get() {
            u uVar = this.f142498b;
            u uVar2 = f142496d;
            if (uVar != uVar2) {
                synchronized (this.f142497a) {
                    try {
                        if (this.f142498b != uVar2) {
                            Object obj = this.f142498b.get();
                            this.f142499c = obj;
                            this.f142498b = uVar2;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return j.a(this.f142499c);
        }

        public String toString() {
            Object obj = this.f142498b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f142496d) {
                obj = "<supplier that returned " + this.f142499c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class c implements u, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f142500a;

        c(Object obj) {
            this.f142500a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return k.a(this.f142500a, ((c) obj).f142500a);
            }
            return false;
        }

        @Override // zo.u
        public Object get() {
            return this.f142500a;
        }

        public int hashCode() {
            return k.b(this.f142500a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f142500a + ")";
        }
    }

    public static u a(u uVar) {
        return ((uVar instanceof b) || (uVar instanceof a)) ? uVar : uVar instanceof Serializable ? new a(uVar) : new b(uVar);
    }

    public static u b(Object obj) {
        return new c(obj);
    }
}
