package t;

import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class c0 implements Map.Entry, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f127512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f127513b;

    public c0(Object obj, Object obj2) {
        this.f127512a = obj;
        this.f127513b = obj2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f127512a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f127513b;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
