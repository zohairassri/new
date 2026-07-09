package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f133736b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f133737c = 1.0f;

    public m1(float f11) {
        this.f133735a = f11;
    }

    public final float a() {
        return this.f133737c;
    }

    public final float b() {
        double d11 = this.f133736b;
        return (float) (d11 * d11);
    }

    public final void c(float f11) {
        if (f11 < 0.0f) {
            e1.a("Damping ratio must be non-negative");
        }
        this.f133737c = f11;
    }

    public final void d(float f11) {
        this.f133735a = f11;
    }

    public final void e(float f11) {
        if (b() <= 0.0f) {
            e1.a("Spring stiffness constant must be positive.");
        }
        this.f133736b = Math.sqrt(f11);
    }

    public final long f(float f11, float f12, long j11) {
        double dExp;
        double dExp2;
        float f13 = f11 - this.f133735a;
        double d11 = j11 / 1000.0d;
        float f14 = this.f133737c;
        double d12 = ((double) f14) * ((double) f14);
        double d13 = this.f133736b;
        double d14 = ((double) (-f14)) * d13;
        if (f14 > 1.0f) {
            double dSqrt = d13 * Math.sqrt(d12 - ((double) 1));
            double d15 = d14 + dSqrt;
            double d16 = d14 - dSqrt;
            double d17 = f13;
            double d18 = ((d16 * d17) - ((double) f12)) / (d16 - d15);
            double d19 = d17 - d18;
            double d21 = d16 * d11;
            double d22 = d11 * d15;
            dExp2 = (Math.exp(d21) * d19) + (Math.exp(d22) * d18);
            dExp = (d19 * d16 * Math.exp(d21)) + (d18 * d15 * Math.exp(d22));
        } else if (f14 == 1.0f) {
            double d23 = f13;
            double d24 = ((double) f12) + (d13 * d23);
            double d25 = (-d13) * d11;
            double d26 = d23 + (d11 * d24);
            dExp2 = d26 * Math.exp(d25);
            dExp = (d26 * Math.exp(d25) * (-this.f133736b)) + (d24 * Math.exp(d25));
        } else {
            double d27 = 1;
            double dSqrt2 = d13 * Math.sqrt(d27 - d12);
            double d28 = f13;
            double d29 = (d27 / dSqrt2) * (((-d14) * d28) + ((double) f12));
            double d31 = dSqrt2 * d11;
            double d32 = d11 * d14;
            double dExp3 = Math.exp(d32) * ((Math.cos(d31) * d28) + (Math.sin(d31) * d29));
            dExp = (d14 * dExp3) + (Math.exp(d32) * (((-dSqrt2) * d28 * Math.sin(d31)) + (dSqrt2 * d29 * Math.cos(d31))));
            dExp2 = dExp3;
        }
        return z0.a((((long) Float.floatToRawIntBits((float) dExp)) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.f133735a))) << 32));
    }
}
