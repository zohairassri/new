package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface b1 extends z.l1 {
    static /* synthetic */ int e(b1 b1Var, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return b1Var.f(i11, i12);
    }

    int a();

    int b();

    void c(int i11, int i12);

    int f(int i11, int i12);

    int g();

    int h();
}
