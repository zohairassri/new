package d4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double[] f89199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f89200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f89201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f89202f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float[] f89197a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double[] f89198b = new double[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double f89203g = 6.283185307179586d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f89204h = false;

    public void a(double d11, float f11) {
        int length = this.f89197a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f89198b, d11);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f89198b = Arrays.copyOf(this.f89198b, length);
        this.f89197a = Arrays.copyOf(this.f89197a, length);
        this.f89199c = new double[length];
        double[] dArr = this.f89198b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f89198b[iBinarySearch] = d11;
        this.f89197a[iBinarySearch] = f11;
        this.f89204h = false;
    }

    double b(double d11) {
        if (d11 <= 0.0d) {
            return 0.0d;
        }
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f89198b, d11);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f89197a;
        float f11 = fArr[iBinarySearch];
        int i11 = iBinarySearch - 1;
        float f12 = fArr[i11];
        double d12 = f11 - f12;
        double[] dArr = this.f89198b;
        double d13 = dArr[iBinarySearch];
        double d14 = dArr[i11];
        double d15 = d12 / (d13 - d14);
        return (d11 * d15) + (((double) f12) - (d15 * d14));
    }

    double c(double d11) {
        if (d11 <= 0.0d) {
            return 0.0d;
        }
        if (d11 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f89198b, d11);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f89197a;
        float f11 = fArr[iBinarySearch];
        int i11 = iBinarySearch - 1;
        float f12 = fArr[i11];
        double d12 = f11 - f12;
        double[] dArr = this.f89198b;
        double d13 = dArr[iBinarySearch];
        double d14 = dArr[i11];
        double d15 = d12 / (d13 - d14);
        return this.f89199c[i11] + ((((double) f12) - (d15 * d14)) * (d11 - d14)) + ((d15 * ((d11 * d11) - (d14 * d14))) / 2.0d);
    }

    public double d(double d11, double d12, double d13) {
        double d14;
        double dSignum;
        double dC = d12 + c(d11);
        double dB = b(d11) + d13;
        switch (this.f89202f) {
            case 1:
                return 0.0d;
            case 2:
                d14 = dB * 4.0d;
                dSignum = Math.signum((((dC * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return dB * 2.0d;
            case 4:
                return (-dB) * 2.0d;
            case 5:
                double d15 = this.f89203g;
                return (-d15) * dB * Math.sin(d15 * dC);
            case 6:
                d14 = dB * 4.0d;
                dSignum = (((dC * 4.0d) + 2.0d) % 4.0d) - 2.0d;
                break;
            case 7:
                return this.f89201e.f(dC % 1.0d, 0);
            default:
                double d16 = this.f89203g;
                d14 = dB * d16;
                dSignum = Math.cos(d16 * dC);
                break;
        }
        return d14 * dSignum;
    }

    public double e(double d11, double d12) {
        double dC = c(d11) + d12;
        switch (this.f89202f) {
            case 1:
                return Math.signum(0.5d - (dC % 1.0d));
            case 2:
                return 1.0d - Math.abs((((dC * 4.0d) + 1.0d) % 4.0d) - 2.0d);
            case 3:
                return (((dC * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                return 1.0d - (((dC * 2.0d) + 1.0d) % 2.0d);
            case 5:
                return Math.cos(this.f89203g * (d12 + dC));
            case 6:
                double dAbs = 1.0d - Math.abs(((dC * 4.0d) % 4.0d) - 2.0d);
                return 1.0d - (dAbs * dAbs);
            case 7:
                return this.f89201e.c(dC % 1.0d, 0);
            default:
                return Math.sin(this.f89203g * dC);
        }
    }

    public void f() {
        double d11 = 0.0d;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f89197a;
            if (i11 >= fArr.length) {
                break;
            }
            d11 += (double) fArr[i11];
            i11++;
        }
        double d12 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr2 = this.f89197a;
            if (i12 >= fArr2.length) {
                break;
            }
            int i13 = i12 - 1;
            float f11 = (fArr2[i13] + fArr2[i12]) / 2.0f;
            double[] dArr = this.f89198b;
            d12 += (dArr[i12] - dArr[i13]) * ((double) f11);
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr3 = this.f89197a;
            if (i14 >= fArr3.length) {
                break;
            }
            fArr3[i14] = fArr3[i14] * ((float) (d11 / d12));
            i14++;
        }
        this.f89199c[0] = 0.0d;
        int i15 = 1;
        while (true) {
            float[] fArr4 = this.f89197a;
            if (i15 >= fArr4.length) {
                this.f89204h = true;
                return;
            }
            int i16 = i15 - 1;
            float f12 = (fArr4[i16] + fArr4[i15]) / 2.0f;
            double[] dArr2 = this.f89198b;
            double d13 = dArr2[i15] - dArr2[i16];
            double[] dArr3 = this.f89199c;
            dArr3[i15] = dArr3[i16] + (d13 * ((double) f12));
            i15++;
        }
    }

    public void g(int i11, String str) {
        this.f89202f = i11;
        this.f89200d = str;
        if (str != null) {
            this.f89201e = g.i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f89198b) + " period=" + Arrays.toString(this.f89197a);
    }
}
