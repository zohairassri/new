package d4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class i extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f89205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f89206e;

    i(String str) {
        this.f89150a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f89205d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i11 = iIndexOf2 + 1;
        this.f89206e = Double.parseDouble(str.substring(i11, str.indexOf(44, i11)).trim());
    }

    private double d(double d11) {
        double d12 = this.f89206e;
        if (d11 < d12) {
            double d13 = this.f89205d;
            return ((d13 * d12) * d12) / ((((d12 - d11) * d13) + d11) * ((d13 * (d12 - d11)) + d11));
        }
        double d14 = this.f89205d;
        return (((d12 - 1.0d) * d14) * (d12 - 1.0d)) / (((((-d14) * (d12 - d11)) - d11) + 1.0d) * ((((-d14) * (d12 - d11)) - d11) + 1.0d));
    }

    private double e(double d11) {
        double d12 = this.f89206e;
        return d11 < d12 ? (d12 * d11) / (d11 + (this.f89205d * (d12 - d11))) : ((1.0d - d12) * (d11 - 1.0d)) / ((1.0d - d11) - (this.f89205d * (d12 - d11)));
    }

    @Override // d4.c
    public double a(double d11) {
        return e(d11);
    }

    @Override // d4.c
    public double b(double d11) {
        return d(d11);
    }
}
