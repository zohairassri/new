package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class n0 extends m0 {
    n0() {
    }

    @Override // androidx.transition.j0
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.j0
    public void d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.j0
    public void e(View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // androidx.transition.j0
    public void f(View view, float f11) {
        view.setTransitionAlpha(f11);
    }

    @Override // androidx.transition.j0
    public void g(View view, int i11) {
        view.setTransitionVisibility(i11);
    }

    @Override // androidx.transition.j0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.j0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
