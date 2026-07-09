package sa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface j {
    default void a(m id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        e(id2.b(), id2.a());
    }

    i b(String str, int i11);

    List c();

    void d(i iVar);

    void e(String str, int i11);

    default i f(m id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return b(id2.b(), id2.a());
    }

    void g(String str);
}
