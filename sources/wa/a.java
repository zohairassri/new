package wa;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f134955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f134956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f134957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f134958d;

    public a(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f134955a = z11;
        this.f134956b = z12;
        this.f134957c = z13;
        this.f134958d = z14;
    }

    public static /* synthetic */ a b(a aVar, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = aVar.f134955a;
        }
        if ((i11 & 2) != 0) {
            z12 = aVar.f134956b;
        }
        if ((i11 & 4) != 0) {
            z13 = aVar.f134957c;
        }
        if ((i11 & 8) != 0) {
            z14 = aVar.f134958d;
        }
        return aVar.a(z11, z12, z13, z14);
    }

    public final a a(boolean z11, boolean z12, boolean z13, boolean z14) {
        return new a(z11, z12, z13, z14);
    }

    public final boolean c() {
        return this.f134955a;
    }

    public final boolean d() {
        return this.f134956b;
    }

    public final boolean e() {
        return this.f134957c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f134955a == aVar.f134955a && this.f134956b == aVar.f134956b && this.f134957c == aVar.f134957c && this.f134958d == aVar.f134958d;
    }

    public final boolean f() {
        return this.f134958d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f134955a) * 31) + Boolean.hashCode(this.f134956b)) * 31) + Boolean.hashCode(this.f134957c)) * 31) + Boolean.hashCode(this.f134958d);
    }

    public String toString() {
        return "InternalWorkState(constraintsMet=" + this.f134955a + ", initialDelayMet=" + this.f134956b + ", periodDelayMet=" + this.f134957c + ", isScheduled=" + this.f134958d + ')';
    }

    public /* synthetic */ a(boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14);
    }
}
