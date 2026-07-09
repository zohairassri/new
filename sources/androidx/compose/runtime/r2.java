package androidx.compose.runtime;

import o1.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface r2 extends o1.f, i0, e0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface a extends f.a {
        @Override // o1.f.a
        r2 build();
    }

    @Override // androidx.compose.runtime.e0
    default Object b(d0 d0Var) {
        return j0.b(this, d0Var);
    }

    @Override // o1.f
    a builder();

    r2 p(d0 d0Var, n5 n5Var);
}
