package tb0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface a extends Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: tb0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1761a {
        public static void a(a aVar, Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void b(a aVar, Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void c(a aVar, Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void d(a aVar, Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void e(a aVar, Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        public static void f(a aVar, Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public static void g(a aVar, Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStopped(Activity activity);
}
