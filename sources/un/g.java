package un;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f131533a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f131534b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f131535c = new Matrix();

    public Matrix a(float f11, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f131533a);
        matrix2.getValues(this.f131534b);
        for (int i11 = 0; i11 < 9; i11++) {
            float[] fArr = this.f131534b;
            float f12 = fArr[i11];
            float f13 = this.f131533a[i11];
            fArr[i11] = f13 + ((f12 - f13) * f11);
        }
        this.f131535c.setValues(this.f131534b);
        return this.f131535c;
    }
}
