package h90;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f100556a;

    private g(int i11) {
        this.f100556a = a.b(i11);
    }

    public static g b(int i11) {
        return new g(i11);
    }

    public Map a() {
        return this.f100556a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f100556a);
    }

    public g c(Object obj, Object obj2) {
        this.f100556a.put(obj, obj2);
        return this;
    }
}
