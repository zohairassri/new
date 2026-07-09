package we0;

import kotlin.jvm.internal.Intrinsics;
import we0.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class u {
    public static final Object a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new t.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof t.b) {
            throw ((t.b) obj).f135195a;
        }
    }
}
