package androidx.compose.runtime;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    Object a();

    void b(int i11, int i12);

    void c(int i11, int i12, int i13);

    void clear();

    default void d(Function2 function2, Object obj) {
        function2.invoke(a(), obj);
    }

    void e(int i11, Object obj);

    void g(int i11, Object obj);

    void h(Object obj);

    void i();

    void k();

    default void f() {
    }

    default void j() {
    }
}
