package t;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f127660a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u0 f127661b = new m0(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List list, int i11) {
        int size = list.size();
        if (i11 < 0 || i11 >= size) {
            u.d.c("Index " + i11 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List list, int i11, int i12) {
        int size = list.size();
        if (i11 > i12) {
            u.d.a("Indices are out of order. fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            u.d.c("fromIndex (" + i11 + ") is less than 0.");
        }
        if (i12 > size) {
            u.d.c("toIndex (" + i12 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final u0 f() {
        u0 u0Var = f127661b;
        Intrinsics.checkNotNull(u0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return u0Var;
    }

    public static final m0 g(Object obj) {
        m0 m0Var = new m0(1);
        m0Var.n(obj);
        return m0Var;
    }

    public static final m0 h(Object obj, Object obj2) {
        m0 m0Var = new m0(2);
        m0Var.n(obj);
        m0Var.n(obj2);
        return m0Var;
    }
}
