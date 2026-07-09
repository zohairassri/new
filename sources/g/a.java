package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1087a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f95280a;

        public C1087a(Object obj) {
            this.f95280a = obj;
        }

        public final Object a() {
            return this.f95280a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C1087a b(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object c(int i11, Intent intent);
}
