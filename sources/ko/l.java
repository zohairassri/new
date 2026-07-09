package ko;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f111566a;

    public l(float f11) {
        this.f111566a = f11;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // ko.d
    public float a(RectF rectF) {
        return this.f111566a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f111566a == ((l) obj).f111566a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f111566a)});
    }
}
