package a3;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* JADX INFO: renamed from: a3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C0002c {
        static void a(View view, int i11) {
            view.setImportantForContentCapture(i11);
        }
    }

    public static a3.a a(View view) {
        return a3.a.b(a.a(view));
    }

    public static a3.b b(View view) {
        ContentCaptureSession contentCaptureSessionA = b.a(view);
        if (contentCaptureSessionA == null) {
            return null;
        }
        return a3.b.g(contentCaptureSessionA, view);
    }

    public static void c(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0002c.a(view, i11);
        }
    }
}
