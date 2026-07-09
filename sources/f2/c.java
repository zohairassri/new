package f2;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final ColorFilter a(float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    public static final float[] b(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && e()) {
            return k0.f93402a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final ColorFilter c(long j11, int i11) {
        return w.f93443a.a(j11, i11);
    }

    public static final ColorFilter d(androidx.compose.ui.graphics.d dVar) {
        return dVar.a();
    }

    public static final boolean e() {
        return true;
    }
}
