package f2;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f93402a = new k0();

    private k0() {
    }

    public final float[] a(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return i0.a(colorMatrix.getArray());
    }
}
