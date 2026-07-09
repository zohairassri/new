package z5;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class d implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f141776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f141777b;

    protected d(float[] fArr) {
        this.f141776a = fArr;
        this.f141777b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f141776a;
        int iMin = Math.min((int) ((fArr.length - 1) * f11), fArr.length - 2);
        float f12 = this.f141777b;
        float f13 = (f11 - (iMin * f12)) / f12;
        float[] fArr2 = this.f141776a;
        float f14 = fArr2[iMin];
        return f14 + (f13 * (fArr2[iMin + 1] - f14));
    }
}
