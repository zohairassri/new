package ec0;

import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.Map;
import mc0.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: ec0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1015a {
        public static boolean a(a aVar) {
            return aVar.o(null);
        }

        public static boolean b(a aVar) {
            return aVar.y(null, null);
        }

        public static boolean c(a aVar, ErrorCode errorCode) {
            return aVar.y(errorCode, null);
        }

        public static boolean d(a aVar, Long l11) {
            return aVar.y(null, l11);
        }
    }

    k a();

    boolean c(String str);

    boolean f();

    String g();

    boolean j(Long l11);

    boolean o(Long l11);

    boolean s(ErrorCode errorCode);

    boolean start();

    boolean stop();

    boolean v(String str, Long l11, Map map);

    boolean x(String str, String str2);

    boolean y(ErrorCode errorCode, Long l11);
}
