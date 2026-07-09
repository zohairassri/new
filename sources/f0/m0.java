package f0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface m0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f93138a = new a();

        a() {
        }

        public final Void a(int i11) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void a(m0 m0Var, Object obj, Object obj2, kf0.n nVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        m0Var.d(obj, obj2, nVar);
    }

    static /* synthetic */ void c(m0 m0Var, int i11, Function1 function1, Function1 function12, kf0.o oVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i12 & 2) != 0) {
            function1 = null;
        }
        if ((i12 & 4) != 0) {
            function12 = a.f93138a;
        }
        m0Var.g(i11, function1, function12, oVar);
    }

    static /* synthetic */ void e(m0 m0Var, Object obj, Object obj2, kf0.o oVar, int i11, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            obj2 = null;
        }
        m0Var.f(obj, obj2, oVar);
    }

    void d(Object obj, Object obj2, kf0.n nVar);

    void f(Object obj, Object obj2, kf0.o oVar);

    void g(int i11, Function1 function1, Function1 function12, kf0.o oVar);
}
