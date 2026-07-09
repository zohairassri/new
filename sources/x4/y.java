package x4;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f137179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f137180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f137181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f137182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f137183e;

    public y(View view) {
        this.f137181c = view;
    }

    private boolean g(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent viewParentH;
        int i16;
        int i17;
        int[] iArr3;
        if (!l() || (viewParentH = h(i15)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f137181c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i17 = iArr[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        z0.d(viewParentH, this.f137181c, i11, i12, i13, i14, i15, iArr3);
        if (iArr != null) {
            this.f137181c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i17;
        }
        return true;
    }

    private ViewParent h(int i11) {
        if (i11 == 0) {
            return this.f137179a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f137180b;
    }

    private int[] i() {
        if (this.f137183e == null) {
            this.f137183e = new int[2];
        }
        return this.f137183e;
    }

    private void n(int i11, ViewParent viewParent) {
        if (i11 == 0) {
            this.f137179a = viewParent;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f137180b = viewParent;
        }
    }

    public boolean a(float f11, float f12, boolean z11) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return z0.a(viewParentH, this.f137181c, f11, f12, z11);
    }

    public boolean b(float f11, float f12) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return z0.b(viewParentH, this.f137181c, f11, f12);
    }

    public boolean c(int i11, int i12, int[] iArr, int[] iArr2) {
        return d(i11, i12, iArr, iArr2, 0);
    }

    public boolean d(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent viewParentH;
        int i14;
        int i15;
        if (!l() || (viewParentH = h(i13)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f137181c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        z0.c(viewParentH, this.f137181c, i11, i12, iArr3, i13);
        if (iArr2 != null) {
            this.f137181c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        g(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public boolean f(int i11, int i12, int i13, int i14, int[] iArr) {
        return g(i11, i12, i13, i14, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i11) {
        return h(i11) != null;
    }

    public boolean l() {
        return this.f137182d;
    }

    public void m(boolean z11) {
        if (this.f137182d) {
            r0.J0(this.f137181c);
        }
        this.f137182d = z11;
    }

    public boolean o(int i11) {
        return p(i11, 0);
    }

    public boolean p(int i11, int i12) {
        if (k(i12)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f137181c;
        for (ViewParent parent = this.f137181c.getParent(); parent != null; parent = parent.getParent()) {
            if (z0.f(parent, view, this.f137181c, i11, i12)) {
                n(i12, parent);
                z0.e(parent, view, this.f137181c, i11, i12);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i11) {
        ViewParent viewParentH = h(i11);
        if (viewParentH != null) {
            z0.g(viewParentH, this.f137181c, i11);
            n(i11, null);
        }
    }
}
