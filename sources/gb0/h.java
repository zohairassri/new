package gb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f98463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f98464b;

    public h(Object obj, boolean z11) {
        this.f98463a = obj;
        this.f98464b = z11;
    }

    public final boolean a() {
        return this.f98464b;
    }

    public final Object b() {
        return this.f98463a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f98463a, hVar.f98463a) && this.f98464b == hVar.f98464b;
    }

    public int hashCode() {
        Object obj = this.f98463a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + Boolean.hashCode(this.f98464b);
    }

    public String toString() {
        return "LogRequest(payload=" + this.f98463a + ", defer=" + this.f98464b + ')';
    }
}
