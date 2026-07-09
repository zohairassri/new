package yv;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public interface f {
    static /* synthetic */ Object b(f fVar, boolean z11, af0.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryUserDetails");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return fVar.d(z11, cVar);
    }

    Object a(af0.c cVar);

    Object c(af0.c cVar);

    Object d(boolean z11, af0.c cVar);
}
