package bj;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class a {
    public static void a(View view, Runnable runnable) {
        b(view, runnable);
    }

    private static void b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
