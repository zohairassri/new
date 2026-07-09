package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class z0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f5967a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f5968b = new int[2];

    @Override // androidx.compose.ui.platform.y0
    public void a(@NotNull View view, @NotNull float[] fArr) {
        this.f5967a.reset();
        view.transformMatrixToGlobal(this.f5967a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f5968b);
        int[] iArr = this.f5968b;
        int i11 = iArr[0];
        int i12 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f5968b;
        this.f5967a.postTranslate(iArr2[0] - i11, iArr2[1] - i12);
        f2.j.b(fArr, this.f5967a);
    }
}
