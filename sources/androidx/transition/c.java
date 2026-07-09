package androidx.transition;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class c implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f12924a;

    c(float[] fArr) {
        this.f12924a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public float[] evaluate(float f11, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f12924a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i11 = 0; i11 < fArr3.length; i11++) {
            float f12 = fArr[i11];
            fArr3[i11] = f12 + ((fArr2[i11] - f12) * f11);
        }
        return fArr3;
    }
}
