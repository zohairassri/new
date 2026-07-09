package fb0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface a extends c {

    /* JADX INFO: renamed from: fb0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1046a {
        public static /* synthetic */ void a(a aVar, String str, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDebug");
            }
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            aVar.l(str, th2);
        }

        public static /* synthetic */ void b(a aVar, String str, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
            }
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            aVar.d(str, th2);
        }

        public static /* synthetic */ void c(a aVar, String str, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logInfo");
            }
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            aVar.g(str, th2);
        }

        public static /* synthetic */ void d(a aVar, String str, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWarning");
            }
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            aVar.p(str, th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum b {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    void d(String str, Throwable th2);

    void g(String str, Throwable th2);

    void l(String str, Throwable th2);

    void p(String str, Throwable th2);

    void u(String str);
}
