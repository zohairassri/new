package g0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final int a(b0 b0Var) {
        boolean z11 = b0Var.a() == z.e1.f141092a;
        List listI = b0Var.i();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < listI.size()) {
            int iB = b(z11, b0Var, i11);
            if (iB == -1) {
                i11++;
            } else {
                int iMax = 0;
                while (i11 < listI.size() && b(z11, b0Var, i11) == iB) {
                    iMax = Math.max(iMax, (int) (z11 ? ((m) listI.get(i11)).b() & 4294967295L : ((m) listI.get(i11)).b() >> 32));
                    i11++;
                }
                i12 += iMax;
                i13++;
            }
        }
        return (i12 / i13) + b0Var.h();
    }

    private static final int b(boolean z11, b0 b0Var, int i11) {
        return z11 ? ((m) b0Var.i().get(i11)).a() : ((m) b0Var.i().get(i11)).h();
    }
}
