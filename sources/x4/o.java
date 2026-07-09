package x4;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setMarginEnd(i11);
    }

    public static void d(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setMarginStart(i11);
    }
}
