package f2;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static /* synthetic */ float[] b(float[] fArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return a(fArr);
    }

    public static int c(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void d(float[] fArr, float f11) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f12 = 1 - f11;
        float f13 = 0.213f * f12;
        float f14 = 0.715f * f12;
        float f15 = f12 * 0.072f;
        fArr[0] = f13 + f11;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[5] = f13;
        fArr[6] = f14 + f11;
        fArr[7] = f15;
        fArr[10] = f13;
        fArr[11] = f14;
        fArr[12] = f15 + f11;
    }

    public static String e(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public static float[] a(float[] fArr) {
        return fArr;
    }
}
