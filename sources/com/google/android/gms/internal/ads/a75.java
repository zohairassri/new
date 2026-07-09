package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class a75 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a75 f23112j = new a75(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a75 f23113k = new a75(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a75 f23114l = new a75(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a75 f23115m = new a75(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f23120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f23121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f23122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f23123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f23124i;

    public a75(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f23116a = d15;
        this.f23117b = d16;
        this.f23118c = d17;
        this.f23119d = d11;
        this.f23120e = d12;
        this.f23121f = d13;
        this.f23122g = d14;
        this.f23123h = d18;
        this.f23124i = d19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a75.class != obj.getClass()) {
            return false;
        }
        a75 a75Var = (a75) obj;
        return Double.compare(a75Var.f23119d, this.f23119d) == 0 && Double.compare(a75Var.f23120e, this.f23120e) == 0 && Double.compare(a75Var.f23121f, this.f23121f) == 0 && Double.compare(a75Var.f23122g, this.f23122g) == 0 && Double.compare(a75Var.f23123h, this.f23123h) == 0 && Double.compare(a75Var.f23124i, this.f23124i) == 0 && Double.compare(a75Var.f23116a, this.f23116a) == 0 && Double.compare(a75Var.f23117b, this.f23117b) == 0 && Double.compare(a75Var.f23118c, this.f23118c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f23116a);
        long j11 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f23117b);
        long j12 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f23118c);
        long j13 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f23119d);
        long j14 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f23120e);
        long j15 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f23121f);
        long j16 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f23122g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f23123h);
        long j17 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f23124i);
        return (((((((((((((((((int) j11) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j17)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f23112j)) {
            return "Rotate 0°";
        }
        if (equals(f23113k)) {
            return "Rotate 90°";
        }
        if (equals(f23114l)) {
            return "Rotate 180°";
        }
        if (equals(f23115m)) {
            return "Rotate 270°";
        }
        double d11 = this.f23116a;
        double d12 = this.f23117b;
        double d13 = this.f23118c;
        double d14 = this.f23119d;
        double d15 = this.f23120e;
        double d16 = this.f23121f;
        double d17 = this.f23122g;
        double d18 = this.f23123h;
        double d19 = this.f23124i;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d11);
        sb2.append(", v=");
        sb2.append(d12);
        sb2.append(", w=");
        sb2.append(d13);
        sb2.append(", a=");
        sb2.append(d14);
        sb2.append(", b=");
        sb2.append(d15);
        sb2.append(", c=");
        sb2.append(d16);
        sb2.append(", d=");
        sb2.append(d17);
        sb2.append(", tx=");
        sb2.append(d18);
        sb2.append(", ty=");
        sb2.append(d19);
        sb2.append("}");
        return sb2.toString();
    }
}
