package ia;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f103486a = a.f103487a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f103487a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f103488b;

        static {
            String simpleName = b.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            f103488b = simpleName;
        }

        private a() {
        }

        public final b a() {
            return Build.VERSION.SDK_INT >= 30 ? e.f103491b : d.f103490b;
        }

        public final String b() {
            return f103488b;
        }
    }

    Rect a(Activity activity);
}
