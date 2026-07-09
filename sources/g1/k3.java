package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f96572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f96573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f96574c;

    public /* synthetic */ k3(float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13);
    }

    public final float a() {
        return this.f96574c;
    }

    public final float b() {
        return this.f96572a;
    }

    public final float c() {
        return z3.h.h(this.f96572a + this.f96573b);
    }

    public final float d() {
        return this.f96573b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return z3.h.k(this.f96572a, k3Var.f96572a) && z3.h.k(this.f96573b, k3Var.f96573b) && z3.h.k(this.f96574c, k3Var.f96574c);
    }

    public int hashCode() {
        return (((z3.h.l(this.f96572a) * 31) + z3.h.l(this.f96573b)) * 31) + z3.h.l(this.f96574c);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) z3.h.n(this.f96572a)) + ", right=" + ((Object) z3.h.n(c())) + ", width=" + ((Object) z3.h.n(this.f96573b)) + ", contentWidth=" + ((Object) z3.h.n(this.f96574c)) + ')';
    }

    private k3(float f11, float f12, float f13) {
        this.f96572a = f11;
        this.f96573b = f12;
        this.f96574c = f13;
    }
}
