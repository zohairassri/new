package kg0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class j2 {
    public static /* synthetic */ void c(j2 j2Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i12 & 1) != 0) {
            i11 = j2Var.d() + 1;
        }
        j2Var.b(i11);
    }

    public abstract Object a();

    public abstract void b(int i11);

    public abstract int d();
}
