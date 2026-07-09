package f2;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f93421a;

    public o(PathMeasure pathMeasure) {
        this.f93421a = pathMeasure;
    }

    @Override // f2.k1
    public boolean a(float f11, float f12, h1 h1Var, boolean z11) {
        PathMeasure pathMeasure = this.f93421a;
        if (h1Var instanceof l) {
            return pathMeasure.getSegment(f11, f12, ((l) h1Var).q(), z11);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // f2.k1
    public void b(h1 h1Var, boolean z11) {
        Path pathQ;
        PathMeasure pathMeasure = this.f93421a;
        if (h1Var == null) {
            pathQ = null;
        } else {
            if (!(h1Var instanceof l)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathQ = ((l) h1Var).q();
        }
        pathMeasure.setPath(pathQ, z11);
    }

    @Override // f2.k1
    public float getLength() {
        return this.f93421a.getLength();
    }
}
