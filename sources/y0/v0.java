package y0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f139510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf0.n f139511b;

    public v0(Object obj, kf0.n nVar) {
        this.f139510a = obj;
        this.f139511b = nVar;
    }

    public final Object a() {
        return this.f139510a;
    }

    public final kf0.n b() {
        return this.f139511b;
    }

    public final Object c() {
        return this.f139510a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.areEqual(this.f139510a, v0Var.f139510a) && Intrinsics.areEqual(this.f139511b, v0Var.f139511b);
    }

    public int hashCode() {
        Object obj = this.f139510a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f139511b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f139510a + ", transition=" + this.f139511b + ')';
    }
}
