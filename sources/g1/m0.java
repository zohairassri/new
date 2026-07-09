package g1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f96626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf0.n f96627b;

    public m0(Object obj, kf0.n nVar) {
        this.f96626a = obj;
        this.f96627b = nVar;
    }

    public final Object a() {
        return this.f96626a;
    }

    public final kf0.n b() {
        return this.f96627b;
    }

    public final Object c() {
        return this.f96626a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.areEqual(this.f96626a, m0Var.f96626a) && Intrinsics.areEqual(this.f96627b, m0Var.f96627b);
    }

    public int hashCode() {
        Object obj = this.f96626a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f96627b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f96626a + ", transition=" + this.f96627b + ')';
    }
}
