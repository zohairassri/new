package nc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface b {
    static b a() {
        return d.get().a();
    }

    static b current() {
        b bVarCurrent = d.get().current();
        return bVarCurrent != null ? bVarCurrent : a();
    }

    Object b(c cVar);

    default b c(h hVar) {
        return hVar.e(this);
    }

    b d(c cVar, Object obj);
}
