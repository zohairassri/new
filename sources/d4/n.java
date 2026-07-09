package d4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f89224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f89225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f89226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f89227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f89228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f89229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f89230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f89231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f89232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f89233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f89234k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f89236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f89237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f89238o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f89235l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f89239p = false;

    private float c(float f11) {
        this.f89239p = false;
        float f12 = this.f89227d;
        if (f11 <= f12) {
            float f13 = this.f89224a;
            return (f13 * f11) + ((((this.f89225b - f13) * f11) * f11) / (f12 * 2.0f));
        }
        int i11 = this.f89233j;
        if (i11 == 1) {
            return this.f89230g;
        }
        float f14 = f11 - f12;
        float f15 = this.f89228e;
        if (f14 < f15) {
            float f16 = this.f89230g;
            float f17 = this.f89225b;
            return f16 + (f17 * f14) + ((((this.f89226c - f17) * f14) * f14) / (f15 * 2.0f));
        }
        if (i11 == 2) {
            return this.f89231h;
        }
        float f18 = f14 - f15;
        float f19 = this.f89229f;
        if (f18 > f19) {
            this.f89239p = true;
            return this.f89232i;
        }
        float f21 = this.f89231h;
        float f22 = this.f89226c;
        return (f21 + (f22 * f18)) - (((f22 * f18) * f18) / (f19 * 2.0f));
    }

    private void f(float f11, float f12, float f13, float f14, float f15) {
        this.f89239p = false;
        this.f89232i = f12;
        if (f11 == 0.0f) {
            f11 = 1.0E-4f;
        }
        float f16 = f11 / f13;
        float f17 = (f16 * f11) / 2.0f;
        if (f11 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f12 - ((((-f11) / f13) * f11) / 2.0f)) * f13);
            if (fSqrt < f14) {
                this.f89234k = "backward accelerate, decelerate";
                this.f89233j = 2;
                this.f89224a = f11;
                this.f89225b = fSqrt;
                this.f89226c = 0.0f;
                float f18 = (fSqrt - f11) / f13;
                this.f89227d = f18;
                this.f89228e = fSqrt / f13;
                this.f89230g = ((f11 + fSqrt) * f18) / 2.0f;
                this.f89231h = f12;
                this.f89232i = f12;
                return;
            }
            this.f89234k = "backward accelerate cruse decelerate";
            this.f89233j = 3;
            this.f89224a = f11;
            this.f89225b = f14;
            this.f89226c = f14;
            float f19 = (f14 - f11) / f13;
            this.f89227d = f19;
            float f21 = f14 / f13;
            this.f89229f = f21;
            float f22 = ((f11 + f14) * f19) / 2.0f;
            float f23 = (f21 * f14) / 2.0f;
            this.f89228e = ((f12 - f22) - f23) / f14;
            this.f89230g = f22;
            this.f89231h = f12 - f23;
            this.f89232i = f12;
            return;
        }
        if (f17 >= f12) {
            this.f89234k = "hard stop";
            this.f89233j = 1;
            this.f89224a = f11;
            this.f89225b = 0.0f;
            this.f89230g = f12;
            this.f89227d = (2.0f * f12) / f11;
            return;
        }
        float f24 = f12 - f17;
        float f25 = f24 / f11;
        if (f25 + f16 < f15) {
            this.f89234k = "cruse decelerate";
            this.f89233j = 2;
            this.f89224a = f11;
            this.f89225b = f11;
            this.f89226c = 0.0f;
            this.f89230g = f24;
            this.f89231h = f12;
            this.f89227d = f25;
            this.f89228e = f16;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f13 * f12) + ((f11 * f11) / 2.0f));
        float f26 = (fSqrt2 - f11) / f13;
        this.f89227d = f26;
        float f27 = fSqrt2 / f13;
        this.f89228e = f27;
        if (fSqrt2 < f14) {
            this.f89234k = "accelerate decelerate";
            this.f89233j = 2;
            this.f89224a = f11;
            this.f89225b = fSqrt2;
            this.f89226c = 0.0f;
            this.f89227d = f26;
            this.f89228e = f27;
            this.f89230g = ((f11 + fSqrt2) * f26) / 2.0f;
            this.f89231h = f12;
            return;
        }
        this.f89234k = "accelerate cruse decelerate";
        this.f89233j = 3;
        this.f89224a = f11;
        this.f89225b = f14;
        this.f89226c = f14;
        float f28 = (f14 - f11) / f13;
        this.f89227d = f28;
        float f29 = f14 / f13;
        this.f89229f = f29;
        float f31 = ((f11 + f14) * f28) / 2.0f;
        float f32 = (f29 * f14) / 2.0f;
        this.f89228e = ((f12 - f31) - f32) / f14;
        this.f89230g = f31;
        this.f89231h = f12 - f32;
        this.f89232i = f12;
    }

    @Override // d4.m
    public float a() {
        return this.f89235l ? -e(this.f89238o) : e(this.f89238o);
    }

    @Override // d4.m
    public boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f89232i - this.f89237n) < 1.0E-5f;
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f89239p = false;
        this.f89236m = f11;
        boolean z11 = f11 > f12;
        this.f89235l = z11;
        if (z11) {
            f(-f13, f11 - f12, f15, f16, f14);
        } else {
            f(f13, f12 - f11, f15, f16, f14);
        }
    }

    public float e(float f11) {
        float f12;
        float f13;
        float f14 = this.f89227d;
        if (f11 <= f14) {
            f12 = this.f89224a;
            f13 = this.f89225b;
        } else {
            int i11 = this.f89233j;
            if (i11 == 1) {
                return 0.0f;
            }
            f11 -= f14;
            f14 = this.f89228e;
            if (f11 >= f14) {
                if (i11 == 2) {
                    return 0.0f;
                }
                float f15 = f11 - f14;
                float f16 = this.f89229f;
                if (f15 >= f16) {
                    return 0.0f;
                }
                float f17 = this.f89226c;
                return f17 - ((f15 * f17) / f16);
            }
            f12 = this.f89225b;
            f13 = this.f89226c;
        }
        return f12 + (((f13 - f12) * f11) / f14);
    }

    @Override // d4.m
    public float getInterpolation(float f11) {
        float fC = c(f11);
        this.f89237n = fC;
        this.f89238o = f11;
        boolean z11 = this.f89235l;
        float f12 = this.f89236m;
        return z11 ? f12 - fC : f12 + fC;
    }
}
