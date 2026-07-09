package ud;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f131315a = new ArrayList();

    /* JADX INFO: renamed from: ud.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class C1793a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f131316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ed.d f131317b;

        C1793a(Class cls, ed.d dVar) {
            this.f131316a = cls;
            this.f131317b = dVar;
        }

        boolean a(Class cls) {
            return this.f131316a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, ed.d dVar) {
        this.f131315a.add(new C1793a(cls, dVar));
    }

    public synchronized ed.d b(Class cls) {
        for (C1793a c1793a : this.f131315a) {
            if (c1793a.a(cls)) {
                return c1793a.f131317b;
            }
        }
        return null;
    }
}
