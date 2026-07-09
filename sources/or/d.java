package or;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f120654b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f120655a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f120654b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f120654b;
                if (dVar == null) {
                    dVar = new d();
                    f120654b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f120655a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f120655a);
        }
        return setUnmodifiableSet;
    }
}
