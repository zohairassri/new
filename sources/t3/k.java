package t3;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f129332a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            aVar.b(str, th2);
        }

        public final void a(String str, Throwable th2) {
            Log.e("PreviewLogger", str, th2);
        }

        public final void b(String str, Throwable th2) {
            Log.w("PreviewLogger", str, th2);
        }

        private a() {
        }
    }
}
