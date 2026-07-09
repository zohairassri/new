package xp;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface d {
    default Object a(Class cls) {
        return d(a0.b(cls));
    }

    vq.a b(a0 a0Var);

    default Set c(Class cls) {
        return f(a0.b(cls));
    }

    default Object d(a0 a0Var) {
        vq.b bVarE = e(a0Var);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }

    vq.b e(a0 a0Var);

    default Set f(a0 a0Var) {
        return (Set) g(a0Var).get();
    }

    vq.b g(a0 a0Var);

    default vq.b h(Class cls) {
        return e(a0.b(cls));
    }

    default vq.a i(Class cls) {
        return b(a0.b(cls));
    }
}
