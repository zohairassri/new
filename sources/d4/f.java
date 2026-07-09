package d4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f89187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[][] f89188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f89189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f89190d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double[] f89191e;

    public f(double[] dArr, double[][] dArr2) {
        this.f89189c = Double.NaN;
        int length = dArr2[0].length;
        this.f89191e = new double[length];
        this.f89187a = dArr;
        this.f89188b = dArr2;
        if (length <= 2) {
            return;
        }
        int i11 = 0;
        double d11 = 0.0d;
        while (true) {
            double d12 = d11;
            if (i11 >= dArr.length) {
                this.f89189c = 0.0d;
                return;
            }
            double d13 = dArr2[i11][0];
            if (i11 > 0) {
                Math.hypot(d13 - d11, d13 - d12);
            }
            i11++;
            d11 = d13;
        }
    }

    @Override // d4.b
    public double c(double d11, int i11) {
        double[] dArr = this.f89187a;
        int length = dArr.length;
        int i12 = 0;
        if (this.f89190d) {
            double d12 = dArr[0];
            if (d11 <= d12) {
                return this.f89188b[0][i11] + ((d11 - d12) * f(d12, i11));
            }
            int i13 = length - 1;
            double d13 = dArr[i13];
            if (d11 >= d13) {
                return this.f89188b[i13][i11] + ((d11 - d13) * f(d13, i11));
            }
        } else {
            if (d11 <= dArr[0]) {
                return this.f89188b[0][i11];
            }
            int i14 = length - 1;
            if (d11 >= dArr[i14]) {
                return this.f89188b[i14][i11];
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f89187a;
            double d14 = dArr2[i12];
            if (d11 == d14) {
                return this.f89188b[i12][i11];
            }
            int i15 = i12 + 1;
            double d15 = dArr2[i15];
            if (d11 < d15) {
                double d16 = (d11 - d14) / (d15 - d14);
                double[][] dArr3 = this.f89188b;
                return (dArr3[i12][i11] * (1.0d - d16)) + (dArr3[i15][i11] * d16);
            }
            i12 = i15;
        }
        return 0.0d;
    }

    @Override // d4.b
    public void d(double d11, double[] dArr) {
        double[] dArr2 = this.f89187a;
        int length = dArr2.length;
        int i11 = 0;
        int length2 = this.f89188b[0].length;
        if (this.f89190d) {
            double d12 = dArr2[0];
            if (d11 <= d12) {
                g(d12, this.f89191e);
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f89188b[0][i12] + ((d11 - this.f89187a[0]) * this.f89191e[i12]);
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr2[i13];
            if (d11 >= d13) {
                g(d13, this.f89191e);
                while (i11 < length2) {
                    dArr[i11] = this.f89188b[i13][i11] + ((d11 - this.f89187a[i13]) * this.f89191e[i11]);
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr2[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f89188b[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr2[i15]) {
                while (i11 < length2) {
                    dArr[i11] = this.f89188b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f89187a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = this.f89188b[i16][i17];
                }
            }
            double[] dArr3 = this.f89187a;
            int i18 = i16 + 1;
            double d14 = dArr3[i18];
            if (d11 < d14) {
                double d15 = dArr3[i16];
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    double[][] dArr4 = this.f89188b;
                    dArr[i11] = (dArr4[i16][i11] * (1.0d - d16)) + (dArr4[i18][i11] * d16);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // d4.b
    public void e(double d11, float[] fArr) {
        double[] dArr = this.f89187a;
        int length = dArr.length;
        int i11 = 0;
        int length2 = this.f89188b[0].length;
        if (this.f89190d) {
            double d12 = dArr[0];
            if (d11 <= d12) {
                g(d12, this.f89191e);
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) (this.f89188b[0][i12] + ((d11 - this.f89187a[0]) * this.f89191e[i12]));
                }
                return;
            }
            int i13 = length - 1;
            double d13 = dArr[i13];
            if (d11 >= d13) {
                g(d13, this.f89191e);
                while (i11 < length2) {
                    fArr[i11] = (float) (this.f89188b[i13][i11] + ((d11 - this.f89187a[i13]) * this.f89191e[i11]));
                    i11++;
                }
                return;
            }
        } else {
            if (d11 <= dArr[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f89188b[0][i14];
                }
                return;
            }
            int i15 = length - 1;
            if (d11 >= dArr[i15]) {
                while (i11 < length2) {
                    fArr[i11] = (float) this.f89188b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f89187a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) this.f89188b[i16][i17];
                }
            }
            double[] dArr2 = this.f89187a;
            int i18 = i16 + 1;
            double d14 = dArr2[i18];
            if (d11 < d14) {
                double d15 = dArr2[i16];
                double d16 = (d11 - d15) / (d14 - d15);
                while (i11 < length2) {
                    double[][] dArr3 = this.f89188b;
                    fArr[i11] = (float) ((dArr3[i16][i11] * (1.0d - d16)) + (dArr3[i18][i11] * d16));
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public double f(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f89187a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f89187a
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r7 = r7.f89188b
            r8 = r7[r2]
            r8 = r8[r10]
            r7 = r7[r3]
            r0 = r7[r10]
            double r0 = r0 - r8
            double r0 = r0 / r4
            return r0
        L33:
            r2 = r3
            goto L15
        L35:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.f.f(double, int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(double r11, double[] r13) {
        /*
            r10 = this;
            double[] r0 = r10.f89187a
            int r1 = r0.length
            double[][] r2 = r10.f89188b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r11 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r10.f89187a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r11 = r4[r0]
            double r6 = r6 - r11
        L2c:
            if (r3 >= r2) goto L41
            double[][] r11 = r10.f89188b
            r12 = r11[r0]
            r8 = r12[r3]
            r11 = r11[r5]
            r11 = r11[r3]
            double r11 = r11 - r8
            double r11 = r11 / r6
            r13[r3] = r11
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.f.g(double, double[]):void");
    }

    @Override // d4.b
    public double[] h() {
        return this.f89187a;
    }
}
