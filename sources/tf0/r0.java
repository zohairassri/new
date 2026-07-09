package tf0;

import we0.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class r0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(af0.c cVar) {
        Object objB;
        if (cVar instanceof yf0.h) {
            return ((yf0.h) cVar).toString();
        }
        try {
            t.a aVar = we0.t.f135193b;
            objB = we0.t.b(cVar + '@' + b(cVar));
        } catch (Throwable th2) {
            t.a aVar2 = we0.t.f135193b;
            objB = we0.t.b(we0.u.a(th2));
        }
        if (we0.t.e(objB) != null) {
            objB = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) objB;
    }
}
