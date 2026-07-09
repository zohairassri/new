package androidx.transition;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class a {

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C0199a {
        static void a(Canvas canvas) {
            canvas.disableZ();
        }

        static void b(Canvas canvas) {
            canvas.enableZ();
        }
    }

    static void a(Canvas canvas, boolean z11) {
        if (z11) {
            C0199a.b(canvas);
        } else {
            C0199a.a(canvas);
        }
    }
}
