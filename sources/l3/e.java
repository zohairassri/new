package l3;

import l3.d0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final d0 a(d0.a aVar) {
        return aVar.j();
    }

    public static final int b(boolean z11, boolean z12) {
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    public static final int c(d0 d0Var, int i11) {
        return b(d0Var.compareTo(a(d0.f113094b)) >= 0, y.f(i11, y.f113204b.a()));
    }
}
