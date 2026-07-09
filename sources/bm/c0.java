package bm;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f14784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14785e;

    public c0(String str, double d11, double d12, double d13, int i11) {
        this.f14781a = str;
        this.f14783c = d11;
        this.f14782b = d12;
        this.f14784d = d13;
        this.f14785e = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return com.google.android.gms.common.internal.m.a(this.f14781a, c0Var.f14781a) && this.f14782b == c0Var.f14782b && this.f14783c == c0Var.f14783c && this.f14785e == c0Var.f14785e && Double.compare(this.f14784d, c0Var.f14784d) == 0;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.m.b(this.f14781a, Double.valueOf(this.f14782b), Double.valueOf(this.f14783c), Double.valueOf(this.f14784d), Integer.valueOf(this.f14785e));
    }

    public final String toString() {
        return com.google.android.gms.common.internal.m.c(this).a("name", this.f14781a).a("minBound", Double.valueOf(this.f14783c)).a("maxBound", Double.valueOf(this.f14782b)).a("percent", Double.valueOf(this.f14784d)).a("count", Integer.valueOf(this.f14785e)).toString();
    }
}
