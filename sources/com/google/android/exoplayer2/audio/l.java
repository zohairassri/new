package com.google.android.exoplayer2.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f20262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f20263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f20264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f20268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f20269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f20271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f20273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f20280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20281v;

    public l(int i11, int i12, float f11, float f12, int i13) {
        this.f20260a = i11;
        this.f20261b = i12;
        this.f20262c = f11;
        this.f20263d = f12;
        this.f20264e = i11 / i13;
        this.f20265f = i11 / 400;
        int i14 = i11 / 65;
        this.f20266g = i14;
        int i15 = i14 * 2;
        this.f20267h = i15;
        this.f20268i = new short[i15];
        this.f20269j = new short[i15 * i12];
        this.f20271l = new short[i15 * i12];
        this.f20273n = new short[i15 * i12];
    }

    private void a(float f11, int i11) {
        int i12;
        int i13;
        if (this.f20272m == i11) {
            return;
        }
        int i14 = this.f20260a;
        int i15 = (int) (i14 / f11);
        while (true) {
            if (i15 <= 16384 && i14 <= 16384) {
                break;
            }
            i15 /= 2;
            i14 /= 2;
        }
        o(i11);
        int i16 = 0;
        while (true) {
            int i17 = this.f20274o;
            if (i16 >= i17 - 1) {
                u(i17 - 1);
                return;
            }
            while (true) {
                i12 = this.f20275p;
                int i18 = (i12 + 1) * i15;
                i13 = this.f20276q;
                if (i18 <= i13 * i14) {
                    break;
                }
                this.f20271l = f(this.f20271l, this.f20272m, 1);
                int i19 = 0;
                while (true) {
                    int i21 = this.f20261b;
                    if (i19 < i21) {
                        this.f20271l[(this.f20272m * i21) + i19] = n(this.f20273n, (i21 * i16) + i19, i14, i15);
                        i19++;
                    }
                }
                this.f20276q++;
                this.f20272m++;
            }
            int i22 = i12 + 1;
            this.f20275p = i22;
            if (i22 == i14) {
                this.f20275p = 0;
                ml.a.f(i13 == i15);
                this.f20276q = 0;
            }
            i16++;
        }
    }

    private void b(float f11) {
        int iW;
        int i11 = this.f20270k;
        if (i11 < this.f20267h) {
            return;
        }
        int i12 = 0;
        do {
            if (this.f20277r > 0) {
                iW = c(i12);
            } else {
                int iG = g(this.f20269j, i12);
                iW = ((double) f11) > 1.0d ? iG + w(this.f20269j, i12, f11, iG) : m(this.f20269j, i12, f11, iG);
            }
            i12 += iW;
        } while (this.f20267h + i12 <= i11);
        v(i12);
    }

    private int c(int i11) {
        int iMin = Math.min(this.f20267h, this.f20277r);
        d(this.f20269j, i11, iMin);
        this.f20277r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i11, int i12) {
        short[] sArrF = f(this.f20271l, this.f20272m, i12);
        this.f20271l = sArrF;
        int i13 = this.f20261b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f20272m * i13, i13 * i12);
        this.f20272m += i12;
    }

    private void e(short[] sArr, int i11, int i12) {
        int i13 = this.f20267h / i12;
        int i14 = this.f20261b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f20268i[i17] = (short) (i18 / i15);
        }
    }

    private short[] f(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f20261b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    private int g(short[] sArr, int i11) {
        int iH;
        int i12 = this.f20260a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f20261b == 1 && i13 == 1) {
            iH = h(sArr, i11, this.f20265f, this.f20266g);
        } else {
            e(sArr, i11, i13);
            int iH2 = h(this.f20268i, 0, this.f20265f / i13, this.f20266g / i13);
            if (i13 != 1) {
                int i14 = iH2 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f20265f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f20266g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f20261b == 1) {
                    iH = h(sArr, i11, i16, i17);
                } else {
                    e(sArr, i11, 1);
                    iH = h(this.f20268i, 0, i16, i17);
                }
            } else {
                iH = iH2;
            }
        }
        int i21 = q(this.f20280u, this.f20281v) ? this.f20278s : iH;
        this.f20279t = this.f20280u;
        this.f20278s = iH;
        return i21;
    }

    private int h(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f20261b;
        int i15 = 255;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        while (i12 <= i13) {
            int iAbs = 0;
            for (int i19 = 0; i19 < i12; i19++) {
                iAbs += Math.abs(sArr[i14 + i19] - sArr[(i14 + i12) + i19]);
            }
            if (iAbs * i17 < i16 * i12) {
                i17 = i12;
                i16 = iAbs;
            }
            if (iAbs * i15 > i18 * i12) {
                i15 = i12;
                i18 = iAbs;
            }
            i12++;
        }
        this.f20280u = i16 / i17;
        this.f20281v = i18 / i15;
        return i17;
    }

    private int m(short[] sArr, int i11, float f11, int i12) {
        int i13;
        if (f11 < 0.5f) {
            i13 = (int) ((i12 * f11) / (1.0f - f11));
        } else {
            this.f20277r = (int) ((i12 * ((2.0f * f11) - 1.0f)) / (1.0f - f11));
            i13 = i12;
        }
        int i14 = i12 + i13;
        short[] sArrF = f(this.f20271l, this.f20272m, i14);
        this.f20271l = sArrF;
        int i15 = this.f20261b;
        System.arraycopy(sArr, i11 * i15, sArrF, this.f20272m * i15, i15 * i12);
        p(i13, this.f20261b, this.f20271l, this.f20272m + i12, sArr, i11 + i12, sArr, i11);
        this.f20272m += i14;
        return i13;
    }

    private short n(short[] sArr, int i11, int i12, int i13) {
        short s11 = sArr[i11];
        short s12 = sArr[i11 + this.f20261b];
        int i14 = this.f20276q * i12;
        int i15 = this.f20275p;
        int i16 = i15 * i13;
        int i17 = (i15 + 1) * i13;
        int i18 = i17 - i14;
        int i19 = i17 - i16;
        return (short) (((s11 * i18) + ((i19 - i18) * s12)) / i19);
    }

    private void o(int i11) {
        int i12 = this.f20272m - i11;
        short[] sArrF = f(this.f20273n, this.f20274o, i12);
        this.f20273n = sArrF;
        short[] sArr = this.f20271l;
        int i13 = this.f20261b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f20274o * i13, i13 * i12);
        this.f20272m = i11;
        this.f20274o += i12;
    }

    private static void p(int i11, int i12, short[] sArr, int i13, short[] sArr2, int i14, short[] sArr3, int i15) {
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = (i13 * i12) + i16;
            int i18 = (i15 * i12) + i16;
            int i19 = (i14 * i12) + i16;
            for (int i21 = 0; i21 < i11; i21++) {
                sArr[i17] = (short) (((sArr2[i19] * (i11 - i21)) + (sArr3[i18] * i21)) / i11);
                i17 += i12;
                i19 += i12;
                i18 += i12;
            }
        }
    }

    private boolean q(int i11, int i12) {
        return i11 != 0 && this.f20278s != 0 && i12 <= i11 * 3 && i11 * 2 > this.f20279t * 3;
    }

    private void r() {
        int i11 = this.f20272m;
        float f11 = this.f20262c;
        float f12 = this.f20263d;
        float f13 = f11 / f12;
        float f14 = this.f20264e * f12;
        double d11 = f13;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            b(f13);
        } else {
            d(this.f20269j, 0, this.f20270k);
            this.f20270k = 0;
        }
        if (f14 != 1.0f) {
            a(f14, i11);
        }
    }

    private void u(int i11) {
        if (i11 == 0) {
            return;
        }
        short[] sArr = this.f20273n;
        int i12 = this.f20261b;
        System.arraycopy(sArr, i11 * i12, sArr, 0, (this.f20274o - i11) * i12);
        this.f20274o -= i11;
    }

    private void v(int i11) {
        int i12 = this.f20270k - i11;
        short[] sArr = this.f20269j;
        int i13 = this.f20261b;
        System.arraycopy(sArr, i11 * i13, sArr, 0, i13 * i12);
        this.f20270k = i12;
    }

    private int w(short[] sArr, int i11, float f11, int i12) {
        int i13;
        if (f11 >= 2.0f) {
            i13 = (int) (i12 / (f11 - 1.0f));
        } else {
            this.f20277r = (int) ((i12 * (2.0f - f11)) / (f11 - 1.0f));
            i13 = i12;
        }
        short[] sArrF = f(this.f20271l, this.f20272m, i13);
        this.f20271l = sArrF;
        p(i13, this.f20261b, sArrF, this.f20272m, sArr, i11, sArr, i11 + i12);
        this.f20272m += i13;
        return i13;
    }

    public void i() {
        this.f20270k = 0;
        this.f20272m = 0;
        this.f20274o = 0;
        this.f20275p = 0;
        this.f20276q = 0;
        this.f20277r = 0;
        this.f20278s = 0;
        this.f20279t = 0;
        this.f20280u = 0;
        this.f20281v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f20261b, this.f20272m);
        shortBuffer.put(this.f20271l, 0, this.f20261b * iMin);
        int i11 = this.f20272m - iMin;
        this.f20272m = i11;
        short[] sArr = this.f20271l;
        int i12 = this.f20261b;
        System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
    }

    public int k() {
        return this.f20272m * this.f20261b * 2;
    }

    public int l() {
        return this.f20270k * this.f20261b * 2;
    }

    public void s() {
        int i11;
        int i12 = this.f20270k;
        float f11 = this.f20262c;
        float f12 = this.f20263d;
        int i13 = this.f20272m + ((int) ((((i12 / (f11 / f12)) + this.f20274o) / (this.f20264e * f12)) + 0.5f));
        this.f20269j = f(this.f20269j, i12, (this.f20267h * 2) + i12);
        int i14 = 0;
        while (true) {
            i11 = this.f20267h;
            int i15 = this.f20261b;
            if (i14 >= i11 * 2 * i15) {
                break;
            }
            this.f20269j[(i15 * i12) + i14] = 0;
            i14++;
        }
        this.f20270k += i11 * 2;
        r();
        if (this.f20272m > i13) {
            this.f20272m = i13;
        }
        this.f20270k = 0;
        this.f20277r = 0;
        this.f20274o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i11 = this.f20261b;
        int i12 = iRemaining / i11;
        short[] sArrF = f(this.f20269j, this.f20270k, i12);
        this.f20269j = sArrF;
        shortBuffer.get(sArrF, this.f20270k * this.f20261b, ((i11 * i12) * 2) / 2);
        this.f20270k += i12;
        r();
    }
}
