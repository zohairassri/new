package d2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface h {
    static /* synthetic */ void e(h hVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        hVar.w(z11);
    }

    boolean f(int i11);

    void w(boolean z11);
}
