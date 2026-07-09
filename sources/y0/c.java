package y0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    static /* synthetic */ void b(c cVar, float f11, float f12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        cVar.a(f11, f12);
    }

    void a(float f11, float f12);
}
