package h90;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f100549a;

    public static void a(i iVar, i iVar2) {
        b((b) iVar, iVar2);
    }

    private static void b(b bVar, i iVar) {
        h.b(iVar);
        if (bVar.f100549a != null) {
            throw new IllegalStateException();
        }
        bVar.f100549a = iVar;
    }

    @Override // ve0.a
    public Object get() {
        i iVar = this.f100549a;
        if (iVar != null) {
            return iVar.get();
        }
        throw new IllegalStateException();
    }
}
