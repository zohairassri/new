package ud;

import ed.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f131329a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f131330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k f131331b;

        a(Class cls, k kVar) {
            this.f131330a = cls;
            this.f131331b = kVar;
        }

        boolean a(Class cls) {
            return this.f131330a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f131329a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f131329a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) this.f131329a.get(i11);
            if (aVar.a(cls)) {
                return aVar.f131331b;
            }
        }
        return null;
    }
}
