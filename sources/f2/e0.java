package f2;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f93357a = new e0();

    private e0() {
    }

    public final void a(Canvas canvas, boolean z11) {
        if (z11) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
