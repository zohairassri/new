package he;

import ye.j;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: he.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1189a {
        public static /* synthetic */ void a(a aVar, String str, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeValue");
            }
            if ((i11 & 2) != 0) {
                cVar = null;
            }
            aVar.c(str, cVar);
        }
    }

    void a(String str, Integer num, b bVar, j jVar);

    void b(String str, Object obj, int i11, c cVar, nf.c cVar2);

    void c(String str, c cVar);
}
