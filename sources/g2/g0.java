package g2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f97916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f97917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f97918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f97919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f97920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f97921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f97922g;

    public g0(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f97916a = d11;
        this.f97917b = d12;
        this.f97918c = d13;
        this.f97919d = d14;
        this.f97920e = d15;
        this.f97921f = d16;
        this.f97922g = d17;
        if (Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (h0.b(d11)) {
            return;
        }
        if (d15 < 0.0d || d15 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d15);
        }
        if (d15 == 0.0d && (d12 == 0.0d || d11 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d15 >= 1.0d && d14 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d12 == 0.0d || d11 == 0.0d) && d14 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d14 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d12 < 0.0d || d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f97917b;
    }

    public final double b() {
        return this.f97918c;
    }

    public final double c() {
        return this.f97919d;
    }

    public final double d() {
        return this.f97920e;
    }

    public final double e() {
        return this.f97921f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Double.compare(this.f97916a, g0Var.f97916a) == 0 && Double.compare(this.f97917b, g0Var.f97917b) == 0 && Double.compare(this.f97918c, g0Var.f97918c) == 0 && Double.compare(this.f97919d, g0Var.f97919d) == 0 && Double.compare(this.f97920e, g0Var.f97920e) == 0 && Double.compare(this.f97921f, g0Var.f97921f) == 0 && Double.compare(this.f97922g, g0Var.f97922g) == 0;
    }

    public final double f() {
        return this.f97922g;
    }

    public final double g() {
        return this.f97916a;
    }

    public final boolean h() {
        return this.f97916a == -3.0d;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f97916a) * 31) + Double.hashCode(this.f97917b)) * 31) + Double.hashCode(this.f97918c)) * 31) + Double.hashCode(this.f97919d)) * 31) + Double.hashCode(this.f97920e)) * 31) + Double.hashCode(this.f97921f)) * 31) + Double.hashCode(this.f97922g);
    }

    public final boolean i() {
        return this.f97916a == -2.0d;
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f97916a + ", a=" + this.f97917b + ", b=" + this.f97918c + ", c=" + this.f97919d + ", d=" + this.f97920e + ", e=" + this.f97921f + ", f=" + this.f97922g + ')';
    }

    public /* synthetic */ g0(double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(d11, d12, d13, d14, d15, (i11 & 32) != 0 ? 0.0d : d16, (i11 & 64) != 0 ? 0.0d : d17);
    }
}
