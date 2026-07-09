package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface l2 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a {
        void c(k2 k2Var);
    }

    static int A(int i11) {
        return i11 & 7;
    }

    static boolean D(int i11, boolean z11) {
        int iA = A(i11);
        if (iA != 4) {
            return z11 && iA == 3;
        }
        return true;
    }

    static int F(int i11, int i12, int i13, int i14) {
        return L(i11, i12, i13, 0, 128, i14);
    }

    static int H(int i11) {
        return i11 & 3584;
    }

    static int L(int i11, int i12, int i13, int i14, int i15, int i16) {
        return i11 | i12 | i13 | i14 | i15 | i16;
    }

    static int j(int i11) {
        return i11 & 384;
    }

    static int l(int i11, int i12, int i13, int i14, int i15) {
        return L(i11, i12, i13, i14, i15, 0);
    }

    static int m(int i11) {
        return i11 & 32;
    }

    static int n(int i11) {
        return i11 & 24;
    }

    static int o(int i11) {
        return F(i11, 0, 0, 0);
    }

    static int s(int i11) {
        return i11 & 64;
    }

    void C();

    void N(a aVar);

    int c(androidx.media3.common.a aVar);

    int e();

    String getName();

    int w();
}
