package androidx.transition;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class o0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f12980a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(d0 d0Var, int i11) {
        int[] iArr;
        if (d0Var == null || (iArr = (int[]) d0Var.f12932a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i11];
    }

    @Override // androidx.transition.a0
    public void a(d0 d0Var) {
        View view = d0Var.f12933b;
        Integer numValueOf = (Integer) d0Var.f12932a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        d0Var.f12932a.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        d0Var.f12932a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.transition.a0
    public String[] b() {
        return f12980a;
    }

    public int e(d0 d0Var) {
        Integer num;
        if (d0Var == null || (num = (Integer) d0Var.f12932a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(d0 d0Var) {
        return d(d0Var, 0);
    }

    public int g(d0 d0Var) {
        return d(d0Var, 1);
    }
}
