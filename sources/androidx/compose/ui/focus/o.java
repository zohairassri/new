package androidx.compose.ui.focus;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface o extends x2.j {
    static /* synthetic */ boolean B0(o oVar, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i12 & 1) != 0) {
            i11 = d.f5050b.b();
        }
        return oVar.N(i11);
    }

    boolean N(int i11);

    d2.n X();
}
