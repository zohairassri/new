package h3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f99812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f99813b;

    public i0(g0 g0Var, f0 f0Var) {
        this.f99812a = g0Var;
        this.f99813b = f0Var;
    }

    public final f0 a() {
        return this.f99813b;
    }

    public final g0 b() {
        return this.f99812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f99813b, i0Var.f99813b) && Intrinsics.areEqual(this.f99812a, i0Var.f99812a);
    }

    public int hashCode() {
        g0 g0Var = this.f99812a;
        int iHashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
        f0 f0Var = this.f99813b;
        return iHashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f99812a + ", paragraphSyle=" + this.f99813b + ')';
    }

    public i0(boolean z11) {
        this(null, new f0(z11));
    }
}
