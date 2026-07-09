package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a {
        static void a(PopupWindow popupWindow, boolean z11) {
            popupWindow.setOverlapAnchor(z11);
        }

        static void b(PopupWindow popupWindow, int i11) {
            popupWindow.setWindowLayoutType(i11);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z11) {
        a.a(popupWindow, z11);
    }

    public static void b(PopupWindow popupWindow, int i11) {
        a.b(popupWindow, i11);
    }

    public static void c(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
        popupWindow.showAsDropDown(view, i11, i12, i13);
    }
}
