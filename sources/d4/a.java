package d4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double[] f89124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C0941a[] f89125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f89126c = true;

    /* JADX INFO: renamed from: d4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C0941a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static double[] f89127s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double[] f89128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f89129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f89130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        double f89131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        double f89132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        double f89133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        double f89134g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        double f89135h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        double f89136i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        double f89137j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        double f89138k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        double f89139l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        double f89140m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f89141n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        double f89142o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        double f89143p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f89144q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f89145r;

        C0941a(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            this.f89145r = false;
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            if (i11 == 1) {
                this.f89144q = true;
            } else if (i11 == 4) {
                this.f89144q = d18 > 0.0d;
            } else if (i11 != 5) {
                this.f89144q = false;
            } else {
                this.f89144q = d18 < 0.0d;
            }
            this.f89130c = d11;
            this.f89131d = d12;
            this.f89136i = 1.0d / (d12 - d11);
            if (3 == i11) {
                this.f89145r = true;
            }
            if (!this.f89145r && Math.abs(d17) >= 0.001d && Math.abs(d18) >= 0.001d) {
                this.f89128a = new double[101];
                boolean z11 = this.f89144q;
                this.f89137j = d17 * ((double) (z11 ? -1 : 1));
                this.f89138k = d18 * ((double) (z11 ? 1 : -1));
                this.f89139l = z11 ? d15 : d13;
                this.f89140m = z11 ? d14 : d16;
                a(d13, d14, d15, d16);
                this.f89141n = this.f89129b * this.f89136i;
                return;
            }
            this.f89145r = true;
            this.f89132e = d13;
            this.f89133f = d15;
            this.f89134g = d14;
            this.f89135h = d16;
            double dHypot = Math.hypot(d18, d17);
            this.f89129b = dHypot;
            this.f89141n = dHypot * this.f89136i;
            double d19 = this.f89131d;
            double d21 = this.f89130c;
            this.f89139l = d17 / (d19 - d21);
            this.f89140m = d18 / (d19 - d21);
        }

        private void a(double d11, double d12, double d13, double d14) {
            double d15 = d13 - d11;
            double d16 = d12 - d14;
            int i11 = 0;
            double dHypot = 0.0d;
            double d17 = 0.0d;
            double d18 = 0.0d;
            while (true) {
                if (i11 >= f89127s.length) {
                    break;
                }
                int i12 = i11;
                double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) (r15.length - 1)));
                double dSin = Math.sin(radians) * d15;
                double dCos = Math.cos(radians) * d16;
                if (i12 > 0) {
                    dHypot += Math.hypot(dSin - d17, dCos - d18);
                    f89127s[i12] = dHypot;
                }
                i11 = i12 + 1;
                d17 = dSin;
                d18 = dCos;
            }
            this.f89129b = dHypot;
            int i13 = 0;
            while (true) {
                double[] dArr = f89127s;
                if (i13 >= dArr.length) {
                    break;
                }
                dArr[i13] = dArr[i13] / dHypot;
                i13++;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= this.f89128a.length) {
                    return;
                }
                double length = ((double) i14) / ((double) (r1.length - 1));
                int iBinarySearch = Arrays.binarySearch(f89127s, length);
                if (iBinarySearch >= 0) {
                    this.f89128a[i14] = ((double) iBinarySearch) / ((double) (f89127s.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f89128a[i14] = 0.0d;
                } else {
                    int i15 = -iBinarySearch;
                    int i16 = i15 - 2;
                    double[] dArr2 = f89127s;
                    double d19 = dArr2[i16];
                    this.f89128a[i14] = (((double) i16) + ((length - d19) / (dArr2[i15 - 1] - d19))) / ((double) (dArr2.length - 1));
                }
                i14++;
            }
        }

        double b() {
            double d11 = this.f89137j * this.f89143p;
            double dHypot = this.f89141n / Math.hypot(d11, (-this.f89138k) * this.f89142o);
            return this.f89144q ? (-d11) * dHypot : d11 * dHypot;
        }

        double c() {
            double d11 = this.f89137j * this.f89143p;
            double d12 = (-this.f89138k) * this.f89142o;
            double dHypot = this.f89141n / Math.hypot(d11, d12);
            return this.f89144q ? (-d12) * dHypot : d12 * dHypot;
        }

        public double d(double d11) {
            return this.f89139l;
        }

        public double e(double d11) {
            return this.f89140m;
        }

        public double f(double d11) {
            double d12 = (d11 - this.f89130c) * this.f89136i;
            double d13 = this.f89132e;
            return d13 + (d12 * (this.f89133f - d13));
        }

        public double g(double d11) {
            double d12 = (d11 - this.f89130c) * this.f89136i;
            double d13 = this.f89134g;
            return d13 + (d12 * (this.f89135h - d13));
        }

        double h() {
            return this.f89139l + (this.f89137j * this.f89142o);
        }

        double i() {
            return this.f89140m + (this.f89138k * this.f89143p);
        }

        double j(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f89128a;
            double length = d11 * ((double) (dArr.length - 1));
            int i11 = (int) length;
            double d12 = length - ((double) i11);
            double d13 = dArr[i11];
            return d13 + (d12 * (dArr[i11 + 1] - d13));
        }

        void k(double d11) {
            double dJ = j((this.f89144q ? this.f89131d - d11 : d11 - this.f89130c) * this.f89136i) * 1.5707963267948966d;
            this.f89142o = Math.sin(dJ);
            this.f89143p = Math.cos(dJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int[] r23, double[] r24, double[][] r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r0.<init>()
            r2 = 1
            r0.f89126c = r2
            r0.f89124a = r1
            int r3 = r1.length
            int r3 = r3 - r2
            d4.a$a[] r3 = new d4.a.C0941a[r3]
            r0.f89125b = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            d4.a$a[] r7 = r0.f89125b
            int r8 = r7.length
            if (r4 >= r8) goto L58
            r8 = r23[r4]
            r9 = 3
            if (r8 == 0) goto L38
            if (r8 == r2) goto L36
            r10 = 2
            if (r8 == r10) goto L34
            if (r8 == r9) goto L2f
            r9 = 4
            if (r8 == r9) goto L38
            r9 = 5
            if (r8 == r9) goto L38
            r9 = r6
            goto L38
        L2f:
            if (r5 != r2) goto L36
            goto L34
        L32:
            r9 = r5
            goto L38
        L34:
            r5 = r10
            goto L32
        L36:
            r5 = r2
            goto L32
        L38:
            d4.a$a r8 = new d4.a$a
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r25[r4]
            r16 = r14
            r14 = r16[r3]
            r16 = r16[r2]
            r18 = r25[r6]
            r20 = r18
            r18 = r20[r3]
            r20 = r20[r2]
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L16
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.a.<init>(int[], double[], double[][]):void");
    }

    @Override // d4.b
    public double c(double d11, int i11) {
        double dG;
        double dE;
        double dI;
        double dC;
        double dG2;
        double dE2;
        int i12 = 0;
        if (this.f89126c) {
            C0941a[] c0941aArr = this.f89125b;
            C0941a c0941a = c0941aArr[0];
            double d12 = c0941a.f89130c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (c0941a.f89145r) {
                    if (i11 == 0) {
                        dG2 = c0941a.f(d12);
                        dE2 = this.f89125b[0].d(d12);
                    } else {
                        dG2 = c0941a.g(d12);
                        dE2 = this.f89125b[0].e(d12);
                    }
                    return dG2 + (d13 * dE2);
                }
                c0941a.k(d12);
                if (i11 == 0) {
                    dI = this.f89125b[0].h();
                    dC = this.f89125b[0].b();
                } else {
                    dI = this.f89125b[0].i();
                    dC = this.f89125b[0].c();
                }
                return dI + (d13 * dC);
            }
            if (d11 > c0941aArr[c0941aArr.length - 1].f89131d) {
                double d14 = c0941aArr[c0941aArr.length - 1].f89131d;
                double d15 = d11 - d14;
                int length = c0941aArr.length - 1;
                if (i11 == 0) {
                    dG = c0941aArr[length].f(d14);
                    dE = this.f89125b[length].d(d14);
                } else {
                    dG = c0941aArr[length].g(d14);
                    dE = this.f89125b[length].e(d14);
                }
                return dG + (d15 * dE);
            }
        } else {
            C0941a[] c0941aArr2 = this.f89125b;
            double d16 = c0941aArr2[0].f89130c;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > c0941aArr2[c0941aArr2.length - 1].f89131d) {
                d11 = c0941aArr2[c0941aArr2.length - 1].f89131d;
            }
        }
        while (true) {
            C0941a[] c0941aArr3 = this.f89125b;
            if (i12 >= c0941aArr3.length) {
                return Double.NaN;
            }
            C0941a c0941a2 = c0941aArr3[i12];
            if (d11 <= c0941a2.f89131d) {
                if (c0941a2.f89145r) {
                    return i11 == 0 ? c0941a2.f(d11) : c0941a2.g(d11);
                }
                c0941a2.k(d11);
                return i11 == 0 ? this.f89125b[i12].h() : this.f89125b[i12].i();
            }
            i12++;
        }
    }

    @Override // d4.b
    public void d(double d11, double[] dArr) {
        if (this.f89126c) {
            C0941a[] c0941aArr = this.f89125b;
            C0941a c0941a = c0941aArr[0];
            double d12 = c0941a.f89130c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (c0941a.f89145r) {
                    dArr[0] = c0941a.f(d12) + (this.f89125b[0].d(d12) * d13);
                    dArr[1] = this.f89125b[0].g(d12) + (d13 * this.f89125b[0].e(d12));
                    return;
                } else {
                    c0941a.k(d12);
                    dArr[0] = this.f89125b[0].h() + (this.f89125b[0].b() * d13);
                    dArr[1] = this.f89125b[0].i() + (d13 * this.f89125b[0].c());
                    return;
                }
            }
            if (d11 > c0941aArr[c0941aArr.length - 1].f89131d) {
                double d14 = c0941aArr[c0941aArr.length - 1].f89131d;
                double d15 = d11 - d14;
                int length = c0941aArr.length - 1;
                C0941a c0941a2 = c0941aArr[length];
                if (c0941a2.f89145r) {
                    dArr[0] = c0941a2.f(d14) + (this.f89125b[length].d(d14) * d15);
                    dArr[1] = this.f89125b[length].g(d14) + (d15 * this.f89125b[length].e(d14));
                    return;
                } else {
                    c0941a2.k(d11);
                    dArr[0] = this.f89125b[length].h() + (this.f89125b[length].b() * d15);
                    dArr[1] = this.f89125b[length].i() + (d15 * this.f89125b[length].c());
                    return;
                }
            }
        } else {
            C0941a[] c0941aArr2 = this.f89125b;
            double d16 = c0941aArr2[0].f89130c;
            if (d11 < d16) {
                d11 = d16;
            }
            if (d11 > c0941aArr2[c0941aArr2.length - 1].f89131d) {
                d11 = c0941aArr2[c0941aArr2.length - 1].f89131d;
            }
        }
        int i11 = 0;
        while (true) {
            C0941a[] c0941aArr3 = this.f89125b;
            if (i11 >= c0941aArr3.length) {
                return;
            }
            C0941a c0941a3 = c0941aArr3[i11];
            if (d11 <= c0941a3.f89131d) {
                if (c0941a3.f89145r) {
                    dArr[0] = c0941a3.f(d11);
                    dArr[1] = this.f89125b[i11].g(d11);
                    return;
                } else {
                    c0941a3.k(d11);
                    dArr[0] = this.f89125b[i11].h();
                    dArr[1] = this.f89125b[i11].i();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // d4.b
    public void e(double d11, float[] fArr) {
        if (this.f89126c) {
            C0941a[] c0941aArr = this.f89125b;
            C0941a c0941a = c0941aArr[0];
            double d12 = c0941a.f89130c;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (c0941a.f89145r) {
                    fArr[0] = (float) (c0941a.f(d12) + (this.f89125b[0].d(d12) * d13));
                    fArr[1] = (float) (this.f89125b[0].g(d12) + (d13 * this.f89125b[0].e(d12)));
                    return;
                } else {
                    c0941a.k(d12);
                    fArr[0] = (float) (this.f89125b[0].h() + (this.f89125b[0].b() * d13));
                    fArr[1] = (float) (this.f89125b[0].i() + (d13 * this.f89125b[0].c()));
                    return;
                }
            }
            if (d11 > c0941aArr[c0941aArr.length - 1].f89131d) {
                double d14 = c0941aArr[c0941aArr.length - 1].f89131d;
                double d15 = d11 - d14;
                int length = c0941aArr.length - 1;
                C0941a c0941a2 = c0941aArr[length];
                if (c0941a2.f89145r) {
                    fArr[0] = (float) (c0941a2.f(d14) + (this.f89125b[length].d(d14) * d15));
                    fArr[1] = (float) (this.f89125b[length].g(d14) + (d15 * this.f89125b[length].e(d14)));
                    return;
                } else {
                    c0941a2.k(d11);
                    fArr[0] = (float) this.f89125b[length].h();
                    fArr[1] = (float) this.f89125b[length].i();
                    return;
                }
            }
        } else {
            C0941a[] c0941aArr2 = this.f89125b;
            double d16 = c0941aArr2[0].f89130c;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > c0941aArr2[c0941aArr2.length - 1].f89131d) {
                d11 = c0941aArr2[c0941aArr2.length - 1].f89131d;
            }
        }
        int i11 = 0;
        while (true) {
            C0941a[] c0941aArr3 = this.f89125b;
            if (i11 >= c0941aArr3.length) {
                return;
            }
            C0941a c0941a3 = c0941aArr3[i11];
            if (d11 <= c0941a3.f89131d) {
                if (c0941a3.f89145r) {
                    fArr[0] = (float) c0941a3.f(d11);
                    fArr[1] = (float) this.f89125b[i11].g(d11);
                    return;
                } else {
                    c0941a3.k(d11);
                    fArr[0] = (float) this.f89125b[i11].h();
                    fArr[1] = (float) this.f89125b[i11].i();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // d4.b
    public double f(double d11, int i11) {
        C0941a[] c0941aArr = this.f89125b;
        int i12 = 0;
        double d12 = c0941aArr[0].f89130c;
        if (d11 < d12) {
            d11 = d12;
        }
        if (d11 > c0941aArr[c0941aArr.length - 1].f89131d) {
            d11 = c0941aArr[c0941aArr.length - 1].f89131d;
        }
        while (true) {
            C0941a[] c0941aArr2 = this.f89125b;
            if (i12 >= c0941aArr2.length) {
                return Double.NaN;
            }
            C0941a c0941a = c0941aArr2[i12];
            if (d11 <= c0941a.f89131d) {
                if (c0941a.f89145r) {
                    return i11 == 0 ? c0941a.d(d11) : c0941a.e(d11);
                }
                c0941a.k(d11);
                return i11 == 0 ? this.f89125b[i12].b() : this.f89125b[i12].c();
            }
            i12++;
        }
    }

    @Override // d4.b
    public void g(double d11, double[] dArr) {
        C0941a[] c0941aArr = this.f89125b;
        double d12 = c0941aArr[0].f89130c;
        if (d11 < d12) {
            d11 = d12;
        } else if (d11 > c0941aArr[c0941aArr.length - 1].f89131d) {
            d11 = c0941aArr[c0941aArr.length - 1].f89131d;
        }
        int i11 = 0;
        while (true) {
            C0941a[] c0941aArr2 = this.f89125b;
            if (i11 >= c0941aArr2.length) {
                return;
            }
            C0941a c0941a = c0941aArr2[i11];
            if (d11 <= c0941a.f89131d) {
                if (c0941a.f89145r) {
                    dArr[0] = c0941a.d(d11);
                    dArr[1] = this.f89125b[i11].e(d11);
                    return;
                } else {
                    c0941a.k(d11);
                    dArr[0] = this.f89125b[i11].b();
                    dArr[1] = this.f89125b[i11].c();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // d4.b
    public double[] h() {
        return this.f89124a;
    }
}
