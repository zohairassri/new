package q5;

import q5.b;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f122422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f122423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f122424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f122425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f122426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f122427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f122428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f122429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f122430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b.p f122431j;

    public f() {
        this.f122422a = Math.sqrt(1500.0d);
        this.f122423b = 0.5d;
        this.f122424c = false;
        this.f122430i = Double.MAX_VALUE;
        this.f122431j = new b.p();
    }

    private void b() {
        if (this.f122424c) {
            return;
        }
        if (this.f122430i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d11 = this.f122423b;
        if (d11 > 1.0d) {
            double d12 = this.f122422a;
            this.f122427f = ((-d11) * d12) + (d12 * Math.sqrt((d11 * d11) - 1.0d));
            double d13 = this.f122423b;
            double d14 = this.f122422a;
            this.f122428g = ((-d13) * d14) - (d14 * Math.sqrt((d13 * d13) - 1.0d));
        } else if (d11 >= 0.0d && d11 < 1.0d) {
            this.f122429h = this.f122422a * Math.sqrt(1.0d - (d11 * d11));
        }
        this.f122424c = true;
    }

    public float a() {
        return (float) this.f122430i;
    }

    public boolean c(float f11, float f12) {
        return ((double) Math.abs(f12)) < this.f122426e && ((double) Math.abs(f11 - a())) < this.f122425d;
    }

    public f d(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f122423b = f11;
        this.f122424c = false;
        return this;
    }

    public f e(float f11) {
        this.f122430i = f11;
        return this;
    }

    public f f(float f11) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f122422a = Math.sqrt(f11);
        this.f122424c = false;
        return this;
    }

    void g(double d11) {
        double dAbs = Math.abs(d11);
        this.f122425d = dAbs;
        this.f122426e = dAbs * 62.5d;
    }

    b.p h(double d11, double d12, long j11) {
        double dPow;
        double dCos;
        b();
        double d13 = j11 / 1000.0d;
        double d14 = d11 - this.f122430i;
        double d15 = this.f122423b;
        if (d15 > 1.0d) {
            double d16 = this.f122428g;
            double d17 = this.f122427f;
            double d18 = d14 - (((d16 * d14) - d12) / (d16 - d17));
            double d19 = ((d14 * d16) - d12) / (d16 - d17);
            dPow = (Math.pow(2.718281828459045d, d16 * d13) * d18) + (Math.pow(2.718281828459045d, this.f122427f * d13) * d19);
            double d21 = this.f122428g;
            double dPow2 = d18 * d21 * Math.pow(2.718281828459045d, d21 * d13);
            double d22 = this.f122427f;
            dCos = dPow2 + (d19 * d22 * Math.pow(2.718281828459045d, d22 * d13));
        } else if (d15 == 1.0d) {
            double d23 = this.f122422a;
            double d24 = d12 + (d23 * d14);
            double d25 = d14 + (d24 * d13);
            dPow = Math.pow(2.718281828459045d, (-d23) * d13) * d25;
            double dPow3 = d25 * Math.pow(2.718281828459045d, (-this.f122422a) * d13);
            double d26 = this.f122422a;
            dCos = (d24 * Math.pow(2.718281828459045d, (-d26) * d13)) + (dPow3 * (-d26));
        } else {
            double d27 = 1.0d / this.f122429h;
            double d28 = this.f122422a;
            double d29 = d27 * ((d15 * d28 * d14) + d12);
            dPow = Math.pow(2.718281828459045d, (-d15) * d28 * d13) * ((Math.cos(this.f122429h * d13) * d14) + (Math.sin(this.f122429h * d13) * d29));
            double d31 = this.f122422a;
            double d32 = this.f122423b;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d13);
            double d33 = this.f122429h;
            double dSin = (-d33) * d14 * Math.sin(d33 * d13);
            double d34 = this.f122429h;
            dCos = ((-d31) * dPow * d32) + (dPow4 * (dSin + (d29 * d34 * Math.cos(d34 * d13))));
        }
        b.p pVar = this.f122431j;
        pVar.f122418a = (float) (dPow + this.f122430i);
        pVar.f122419b = (float) dCos;
        return pVar;
    }

    public f(float f11) {
        this.f122422a = Math.sqrt(1500.0d);
        this.f122423b = 0.5d;
        this.f122424c = false;
        this.f122430i = Double.MAX_VALUE;
        this.f122431j = new b.p();
        this.f122430i = f11;
    }
}
