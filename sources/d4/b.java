package d4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f89146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double[] f89147b;

        a(double d11, double[] dArr) {
            this.f89146a = d11;
            this.f89147b = dArr;
        }

        @Override // d4.b
        public double c(double d11, int i11) {
            return this.f89147b[i11];
        }

        @Override // d4.b
        public void d(double d11, double[] dArr) {
            double[] dArr2 = this.f89147b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // d4.b
        public void e(double d11, float[] fArr) {
            int i11 = 0;
            while (true) {
                double[] dArr = this.f89147b;
                if (i11 >= dArr.length) {
                    return;
                }
                fArr[i11] = (float) dArr[i11];
                i11++;
            }
        }

        @Override // d4.b
        public double f(double d11, int i11) {
            return 0.0d;
        }

        @Override // d4.b
        public void g(double d11, double[] dArr) {
            for (int i11 = 0; i11 < this.f89147b.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        @Override // d4.b
        public double[] h() {
            return new double[]{this.f89146a};
        }
    }

    public static b a(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        return i11 != 0 ? i11 != 2 ? new f(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new g(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new d4.a(iArr, dArr, dArr2);
    }

    public abstract double c(double d11, int i11);

    public abstract void d(double d11, double[] dArr);

    public abstract void e(double d11, float[] fArr);

    public abstract double f(double d11, int i11);

    public abstract void g(double d11, double[] dArr);

    public abstract double[] h();
}
