package ea0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: ea0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1002a {
        public static /* synthetic */ void a(a aVar, String str, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: firstFrameRendered");
            }
            if ((i11 & 2) != 0) {
                l11 = null;
            }
            aVar.b(str, l11);
        }

        public static /* synthetic */ void b(a aVar, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startupActivityInitEnd");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            aVar.e(l11);
        }

        public static /* synthetic */ void c(a aVar, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startupActivityInitStart");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            aVar.c(l11);
        }

        public static /* synthetic */ void d(a aVar, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startupActivityPostCreated");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            aVar.a(l11);
        }

        public static /* synthetic */ void e(a aVar, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startupActivityPreCreated");
            }
            if ((i11 & 1) != 0) {
                l11 = null;
            }
            aVar.f(l11);
        }

        public static /* synthetic */ void f(a aVar, String str, Long l11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startupActivityResumed");
            }
            if ((i11 & 2) != 0) {
                l11 = null;
            }
            aVar.d(str, l11);
        }
    }

    void a(Long l11);

    void b(String str, Long l11);

    void c(Long l11);

    void d(String str, Long l11);

    void e(Long l11);

    void f(Long l11);
}
