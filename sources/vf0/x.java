package vf0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface x {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public static /* synthetic */ boolean a(x xVar, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return xVar.u(th2);
        }
    }

    Object d(Object obj, af0.c cVar);

    void g(Function1 function1);

    Object i(Object obj);

    boolean u(Throwable th2);

    boolean v();
}
