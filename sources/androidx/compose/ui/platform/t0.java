package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
interface t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5879a = a.f5880a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f5880a = new a();

        private a() {
        }

        public final t0 a() {
            return Build.VERSION.SDK_INT >= 30 ? w0.f5945b : v0.f5894b;
        }
    }

    Rect a(Activity activity);
}
