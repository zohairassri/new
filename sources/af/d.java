package af;

import java.io.File;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public static /* synthetic */ File a(d dVar, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWritableFile");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return dVar.b(z11);
        }
    }

    File a(File file);

    File b(boolean z11);

    int d();

    List e();

    File f();

    File g(Set set);
}
