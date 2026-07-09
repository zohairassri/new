package y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    private static final int a(int i11, int i12, boolean z11) {
        return f(i11, i12, !z11);
    }

    public static final int b(int i11, int i12, int i13, boolean z11) {
        return i12 >= i13 ? f(i12, i13, z11) : g(i11, i12, i13, z11) ? e(i11, i12, z11) : h(i11, i12, i13, z11) ? d(i11, i12, z11) : a(i12, i13, z11);
    }

    public static /* synthetic */ int c(int i11, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            z11 = true;
        }
        return b(i11, i12, i13, z11);
    }

    private static final int d(int i11, int i12, boolean z11) {
        return e(i11, i12, !z11);
    }

    private static final int e(int i11, int i12, boolean z11) {
        return z11 ? i11 : i11 - i12;
    }

    private static final int f(int i11, int i12, boolean z11) {
        if (z11) {
            return 0;
        }
        return i12 - i11;
    }

    private static final boolean g(int i11, int i12, int i13, boolean z11) {
        return h(i11, i12, i13, !z11);
    }

    private static final boolean h(int i11, int i12, int i13, boolean z11) {
        return z11 ? i12 <= i11 : i13 - i12 > i11;
    }
}
