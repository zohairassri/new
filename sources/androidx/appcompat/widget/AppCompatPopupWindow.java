package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f2051b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2052a;

    public AppCompatPopupWindow(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context, attributeSet, i11, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        g0 g0VarV = g0.v(context, attributeSet, h.j.PopupWindow, i11, i12);
        int i13 = h.j.PopupWindow_overlapAnchor;
        if (g0VarV.s(i13)) {
            b(g0VarV.a(i13, false));
        }
        setBackgroundDrawable(g0VarV.g(h.j.PopupWindow_android_popupBackground));
        g0VarV.x();
    }

    private void b(boolean z11) {
        if (f2051b) {
            this.f2052a = z11;
        } else {
            androidx.core.widget.j.a(this, z11);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12) {
        if (f2051b && this.f2052a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i11, int i12, int i13, int i14) {
        if (f2051b && this.f2052a) {
            i12 -= view.getHeight();
        }
        super.update(view, i11, i12, i13, i14);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        a(context, attributeSet, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12, int i13) {
        if (f2051b && this.f2052a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12, i13);
    }
}
