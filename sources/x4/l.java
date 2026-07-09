package x4;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
        Gravity.apply(i11, i12, i13, rect, rect2, i14);
    }

    public static int b(int i11, int i12) {
        return Gravity.getAbsoluteGravity(i11, i12);
    }
}
