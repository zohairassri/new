package y0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f138852a = new LinkedHashMap();

    public final void a(Object obj, float f11) {
        this.f138852a.put(obj, Float.valueOf(f11));
    }

    public final Map b() {
        return this.f138852a;
    }
}
