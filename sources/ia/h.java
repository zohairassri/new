package ia;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f103493a = a.f103494a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f103494a = new a();

        private a() {
        }

        public final h a() {
            return Build.VERSION.SDK_INT >= 34 ? i.f103495b : j.f103496b;
        }
    }

    float a(Context context);
}
