package ne0;

import java.io.Serializable;
import sd0.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public enum m {
    COMPLETE;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final vd0.b f117810a;

        a(vd0.b bVar) {
            this.f117810a = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f117810a + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f117811a;

        b(Throwable th2) {
            this.f117811a = th2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ae0.b.c(this.f117811a, ((b) obj).f117811a);
            }
            return false;
        }

        public int hashCode() {
            return this.f117811a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f117811a + "]";
        }
    }

    public static boolean a(Object obj, t tVar) {
        if (obj == COMPLETE) {
            tVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            tVar.onError(((b) obj).f117811a);
            return true;
        }
        tVar.onNext(obj);
        return false;
    }

    public static boolean b(Object obj, t tVar) {
        if (obj == COMPLETE) {
            tVar.onComplete();
            return true;
        }
        if (obj instanceof b) {
            tVar.onError(((b) obj).f117811a);
            return true;
        }
        if (obj instanceof a) {
            tVar.onSubscribe(((a) obj).f117810a);
            return false;
        }
        tVar.onNext(obj);
        return false;
    }

    public static Object c() {
        return COMPLETE;
    }

    public static Object e(vd0.b bVar) {
        return new a(bVar);
    }

    public static Object f(Throwable th2) {
        return new b(th2);
    }

    public static Throwable g(Object obj) {
        return ((b) obj).f117811a;
    }

    public static boolean j(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean k(Object obj) {
        return obj instanceof b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object h(Object obj) {
        return obj;
    }

    public static Object l(Object obj) {
        return obj;
    }
}
