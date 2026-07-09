package gj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f98864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f98865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f98866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f98867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f98868e;

    public /* synthetic */ f(float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15);
    }

    public final float a() {
        return this.f98865b;
    }

    public final float b() {
        return this.f98868e;
    }

    public final float c() {
        return this.f98867d;
    }

    public final float d() {
        return this.f98864a;
    }

    public final float e() {
        return this.f98866c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return z3.h.k(this.f98864a, fVar.f98864a) && z3.h.k(this.f98865b, fVar.f98865b) && z3.h.k(this.f98866c, fVar.f98866c) && z3.h.k(this.f98867d, fVar.f98867d) && z3.h.k(this.f98868e, fVar.f98868e);
    }

    public int hashCode() {
        return (((((((z3.h.l(this.f98864a) * 31) + z3.h.l(this.f98865b)) * 31) + z3.h.l(this.f98866c)) * 31) + z3.h.l(this.f98867d)) * 31) + z3.h.l(this.f98868e);
    }

    public String toString() {
        return "SwipeRefreshIndicatorSizes(size=" + ((Object) z3.h.n(this.f98864a)) + ", arcRadius=" + ((Object) z3.h.n(this.f98865b)) + ", strokeWidth=" + ((Object) z3.h.n(this.f98866c)) + ", arrowWidth=" + ((Object) z3.h.n(this.f98867d)) + ", arrowHeight=" + ((Object) z3.h.n(this.f98868e)) + ')';
    }

    private f(float f11, float f12, float f13, float f14, float f15) {
        this.f98864a = f11;
        this.f98865b = f12;
        this.f98866c = f13;
        this.f98867d = f14;
        this.f98868e = f15;
    }
}
