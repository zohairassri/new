package d4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class k implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f89214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f89215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f89216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f89217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f89218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f89219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f89220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f89221j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f89212a = 0.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f89213b = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f89222k = 0;

    private void c(double d11) {
        if (d11 <= 0.0d) {
            return;
        }
        double d12 = this.f89214c;
        double d13 = this.f89212a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d12 / ((double) this.f89220i)) * d11) * 4.0d)) + 1.0d);
        double d14 = d11 / ((double) iSqrt);
        int i11 = 0;
        while (i11 < iSqrt) {
            float f11 = this.f89218g;
            double d15 = this.f89215d;
            float f12 = this.f89219h;
            double d16 = d12;
            double d17 = ((-d12) * (((double) f11) - d15)) - (((double) f12) * d13);
            float f13 = this.f89220i;
            double d18 = d13;
            double d19 = ((double) f12) + (((d17 / ((double) f13)) * d14) / 2.0d);
            double d21 = ((((-((((double) f11) + ((d14 * d19) / 2.0d)) - d15)) * d16) - (d19 * d18)) / ((double) f13)) * d14;
            double d22 = ((double) f12) + (d21 / 2.0d);
            float f14 = f12 + ((float) d21);
            this.f89219h = f14;
            float f15 = f11 + ((float) (d22 * d14));
            this.f89218g = f15;
            int i12 = this.f89222k;
            if (i12 > 0) {
                if (f15 < 0.0f && (i12 & 1) == 1) {
                    this.f89218g = -f15;
                    this.f89219h = -f14;
                }
                float f16 = this.f89218g;
                if (f16 > 1.0f && (i12 & 2) == 2) {
                    this.f89218g = 2.0f - f16;
                    this.f89219h = -this.f89219h;
                }
            }
            i11++;
            d12 = d16;
            d13 = d18;
        }
    }

    @Override // d4.m
    public float a() {
        return 0.0f;
    }

    @Override // d4.m
    public boolean b() {
        double d11 = ((double) this.f89218g) - this.f89215d;
        double d12 = this.f89214c;
        double d13 = this.f89219h;
        return Math.sqrt((((d13 * d13) * ((double) this.f89220i)) + ((d12 * d11) * d11)) / d12) <= ((double) this.f89221j);
    }

    public void d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i11) {
        this.f89215d = f12;
        this.f89212a = f16;
        this.f89213b = false;
        this.f89218g = f11;
        this.f89216e = f13;
        this.f89214c = f15;
        this.f89220i = f14;
        this.f89221j = f17;
        this.f89222k = i11;
        this.f89217f = 0.0f;
    }

    @Override // d4.m
    public float getInterpolation(float f11) {
        c(f11 - this.f89217f);
        this.f89217f = f11;
        if (b()) {
            this.f89218g = (float) this.f89215d;
        }
        return this.f89218g;
    }
}
