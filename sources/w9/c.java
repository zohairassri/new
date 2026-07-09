package w9;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class c {
    public static void a(String str, int i11) {
        Trace.beginAsyncSection(str, i11);
    }

    public static void b(String str, int i11) {
        Trace.endAsyncSection(str, i11);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
