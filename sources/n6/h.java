package n6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f117421a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f117422b;

    public synchronized Map a() {
        try {
            if (this.f117422b == null) {
                this.f117422b = Collections.unmodifiableMap(new HashMap(this.f117421a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f117422b;
    }
}
