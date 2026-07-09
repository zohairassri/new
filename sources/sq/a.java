package sq;

import xp.z;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f127283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f127284b;

    public a(Class cls, Object obj) {
        this.f127283a = (Class) z.b(cls);
        this.f127284b = z.b(obj);
    }

    public Object a() {
        return this.f127284b;
    }

    public Class b() {
        return this.f127283a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f127283a, this.f127284b);
    }
}
