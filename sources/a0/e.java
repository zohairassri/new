package a0;

import g0.b0;
import z.e1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final int a(b0 b0Var) {
        return (int) (b0Var.a() == e1.f141092a ? b0Var.b() & 4294967295L : b0Var.b() >> 32);
    }

    public static final int b(g0.m mVar, e1 e1Var) {
        return e1Var == e1.f141092a ? z3.n.l(mVar.n()) : z3.n.k(mVar.n());
    }

    public static final int c(g0.m mVar, e1 e1Var) {
        return (int) (e1Var == e1.f141092a ? mVar.b() & 4294967295L : mVar.b() >> 32);
    }
}
