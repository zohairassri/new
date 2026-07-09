package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f133904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f133905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f133906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f133907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f133908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f133909f;

    public y(float f11, float f12, float f13, float f14) {
        this.f133904a = f11;
        this.f133905b = f12;
        this.f133906c = f13;
        this.f133907d = f14;
        if (!((Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13) || Float.isNaN(f14)) ? false : true)) {
            e1.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f11 + ", " + f12 + ", " + f13 + ", " + f14 + '.');
        }
        long jB = f2.u.b(0.0f, f12, f14, 1.0f, new float[5], 0);
        this.f133908e = Float.intBitsToFloat((int) (jB >> 32));
        this.f133909f = Float.intBitsToFloat((int) (jB & 4294967295L));
    }

    private final void b(float f11) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f133904a + ", " + this.f133905b + ", " + this.f133906c + ", " + this.f133907d + ") has no solution at " + f11);
    }

    @Override // w.e0
    public float a(float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            float fMax = Math.max(f11, 1.1920929E-7f);
            float fE = f2.u.e(0.0f - fMax, this.f133904a - fMax, this.f133906c - fMax, 1.0f - fMax);
            if (Float.isNaN(fE)) {
                b(f11);
            }
            f11 = f2.u.c(this.f133905b, this.f133907d, fE);
            float f12 = this.f133908e;
            float f13 = this.f133909f;
            if (f11 < f12) {
                f11 = f12;
            }
            if (f11 > f13) {
                return f13;
            }
        }
        return f11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f133904a == yVar.f133904a && this.f133905b == yVar.f133905b && this.f133906c == yVar.f133906c && this.f133907d == yVar.f133907d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f133904a) * 31) + Float.hashCode(this.f133905b)) * 31) + Float.hashCode(this.f133906c)) * 31) + Float.hashCode(this.f133907d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f133904a + ", b=" + this.f133905b + ", c=" + this.f133906c + ", d=" + this.f133907d + ')';
    }
}
