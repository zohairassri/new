package ko;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f111515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f111516b;

    public b(float f11, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f111515a;
            f11 += ((b) dVar).f111516b;
        }
        this.f111515a = dVar;
        this.f111516b = f11;
    }

    @Override // ko.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f111515a.a(rectF) + this.f111516b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f111515a.equals(bVar.f111515a) && this.f111516b == bVar.f111516b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111515a, Float.valueOf(this.f111516b)});
    }
}
