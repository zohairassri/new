package ne;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.h1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: ne.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1490a {
        public static /* synthetic */ Map a(a aVar, Map map, String str, String str2, Set set, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateAttributes");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                set = h1.e();
            }
            return aVar.a(map, str, str2, set);
        }
    }

    Map a(Map map, String str, String str2, Set set);

    List b(List list);

    Map c(Map map);
}
