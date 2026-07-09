package androidx.media3.common.audio;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f8866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f8867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f8868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f8872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f8873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f8875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f8877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8885v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f8886w;

    public c(int i11, int i12, float f11, float f12, int i13) {
        this.f8864a = i11;
        this.f8865b = i12;
        this.f8866c = f11;
        this.f8867d = f12;
        this.f8868e = i11 / i13;
        this.f8869f = i11 / 400;
        int i14 = i11 / 65;
        this.f8870g = i14;
        int i15 = i14 * 2;
        this.f8871h = i15;
        this.f8872i = new short[i15];
        this.f8873j = new short[i15 * i12];
        this.f8875l = new short[i15 * i12];
        this.f8877n = new short[i15 * i12];
    }

    private void a(float f11, int i11) {
        int i12;
        int i13;
        if (this.f8876m == i11) {
            return;
        }
        int i14 = this.f8864a;
        long j11 = (long) (i14 / f11);
        long j12 = i14;
        while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
            j11 /= 2;
            j12 /= 2;
        }
        o(i11);
        int i15 = 0;
        while (true) {
            int i16 = this.f8878o;
            if (i15 >= i16 - 1) {
                this.u(i16 - 1);
                return;
            }
            while (true) {
                i12 = this.f8879p;
                long j13 = ((long) (i12 + 1)) * j11;
                i13 = this.f8880q;
                if (j13 <= ((long) i13) * j12) {
                    break;
                }
                this.f8875l = this.f(this.f8875l, this.f8876m, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f8865b;
                    if (i17 < i18) {
                        c cVar = this;
                        this.f8875l[(this.f8876m * i18) + i17] = cVar.n(this.f8877n, (i18 * i15) + i17, j12, j11);
                        i17++;
                        this = cVar;
                    }
                }
                c cVar2 = this;
                cVar2.f8880q++;
                cVar2.f8876m++;
                this = cVar2;
            }
            c cVar3 = this;
            int i19 = i12 + 1;
            cVar3.f8879p = i19;
            if (i19 == j12) {
                cVar3.f8879p = 0;
                k6.a.g(((long) i13) == j11);
                cVar3.f8880q = 0;
            }
            i15++;
            this = cVar3;
        }
    }

    private void b(double d11) {
        c cVar;
        double d12;
        int i11 = this.f8874k;
        if (i11 < this.f8871h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f8881r > 0) {
                iM += this.c(iM);
                cVar = this;
                d12 = d11;
            } else {
                int iG = this.g(this.f8873j, iM);
                if (d11 > 1.0d) {
                    cVar = this;
                    d12 = d11;
                    iM += iG + cVar.w(this.f8873j, iM, d12, iG);
                } else {
                    cVar = this;
                    d12 = d11;
                    iM += cVar.m(cVar.f8873j, iM, d12, iG);
                }
            }
            if (cVar.f8871h + iM > i11) {
                cVar.v(iM);
                return;
            } else {
                this = cVar;
                d11 = d12;
            }
        }
    }

    private int c(int i11) {
        int iMin = Math.min(this.f8871h, this.f8881r);
        d(this.f8873j, i11, iMin);
        this.f8881r -= iMin;
        return iMin;
    }

    private void d(short[] sArr, int i11, int i12) {
        short[] sArrF = f(this.f8875l, this.f8876m, i12);
        this.f8875l = sArrF;
        int i13 = this.f8865b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f8876m * i13, i13 * i12);
        this.f8876m += i12;
    }

    private void e(short[] sArr, int i11, int i12) {
        int i13 = this.f8871h / i12;
        int i14 = this.f8865b;
        int i15 = i12 * i14;
        int i16 = i11 * i14;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 += sArr[(i17 * i15) + i16 + i19];
            }
            this.f8872i[i17] = (short) (i18 / i15);
        }
    }

    private short[] f(short[] sArr, int i11, int i12) {
        int length = sArr.length;
        int i13 = this.f8865b;
        int i14 = length / i13;
        return i11 + i12 <= i14 ? sArr : Arrays.copyOf(sArr, (((i14 * 3) / 2) + i12) * i13);
    }

    private int g(short[] sArr, int i11) {
        int iH;
        int i12 = this.f8864a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f8865b == 1 && i13 == 1) {
            iH = h(sArr, i11, this.f8869f, this.f8870g);
        } else {
            e(sArr, i11, i13);
            int iH2 = h(this.f8872i, 0, this.f8869f / i13, this.f8870g / i13);
            if (i13 != 1) {
                int i14 = iH2 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f8869f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f8870g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f8865b == 1) {
                    iH = h(sArr, i11, i16, i17);
                } else {
                    e(sArr, i11, 1);
                    iH = h(this.f8872i, 0, i16, i17);
                }
            } else {
                iH = iH2;
            }
        }
        int i21 = q(this.f8884u, this.f8885v) ? this.f8882s : iH;
        this.f8883t = this.f8884u;
        this.f8882s = iH;
        return i21;
    }

    private int h(short[] sArr, int i11, int i12, int i13) {
        int i14 = i11 * this.f8865b;
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
        this.f8884u = i16 / i17;
        this.f8885v = i18 / i15;
        return i17;
    }

    private int m(short[] sArr, int i11, double d11, int i12) {
        int i13;
        if (d11 < 0.5d) {
            double d12 = ((((double) i12) * d11) / (1.0d - d11)) + this.f8886w;
            int iRound = (int) Math.round(d12);
            this.f8886w = d12 - ((double) iRound);
            i13 = iRound;
        } else {
            double d13 = ((((double) i12) * ((2.0d * d11) - 1.0d)) / (1.0d - d11)) + this.f8886w;
            int iRound2 = (int) Math.round(d13);
            this.f8881r = iRound2;
            this.f8886w = d13 - ((double) iRound2);
            i13 = i12;
        }
        int i14 = i12 + i13;
        short[] sArrF = f(this.f8875l, this.f8876m, i14);
        this.f8875l = sArrF;
        int i15 = this.f8865b;
        System.arraycopy(sArr, i11 * i15, sArrF, this.f8876m * i15, i15 * i12);
        p(i13, this.f8865b, this.f8875l, this.f8876m + i12, sArr, i11 + i12, sArr, i11);
        this.f8876m += i14;
        return i13;
    }

    private short n(short[] sArr, int i11, long j11, long j12) {
        short s11 = sArr[i11];
        short s12 = sArr[i11 + this.f8865b];
        long j13 = ((long) this.f8880q) * j11;
        int i12 = this.f8879p;
        long j14 = ((long) (i12 + 1)) * j12;
        long j15 = j14 - j13;
        long j16 = j14 - (((long) i12) * j12);
        return (short) (((((long) s11) * j15) + ((j16 - j15) * ((long) s12))) / j16);
    }

    private void o(int i11) {
        int i12 = this.f8876m - i11;
        short[] sArrF = f(this.f8877n, this.f8878o, i12);
        this.f8877n = sArrF;
        short[] sArr = this.f8875l;
        int i13 = this.f8865b;
        System.arraycopy(sArr, i11 * i13, sArrF, this.f8878o * i13, i13 * i12);
        this.f8876m = i11;
        this.f8878o += i12;
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
        return i11 != 0 && this.f8882s != 0 && i12 <= i11 * 3 && i11 * 2 > this.f8883t * 3;
    }

    private void r() {
        int i11 = this.f8876m;
        float f11 = this.f8866c;
        float f12 = this.f8867d;
        double d11 = f11 / f12;
        float f13 = this.f8868e * f12;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            b(d11);
        } else {
            d(this.f8873j, 0, this.f8874k);
            this.f8874k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i11);
        }
    }

    private void u(int i11) {
        if (i11 == 0) {
            return;
        }
        short[] sArr = this.f8877n;
        int i12 = this.f8865b;
        System.arraycopy(sArr, i11 * i12, sArr, 0, (this.f8878o - i11) * i12);
        this.f8878o -= i11;
    }

    private void v(int i11) {
        int i12 = this.f8874k - i11;
        short[] sArr = this.f8873j;
        int i13 = this.f8865b;
        System.arraycopy(sArr, i11 * i13, sArr, 0, i13 * i12);
        this.f8874k = i12;
    }

    private int w(short[] sArr, int i11, double d11, int i12) {
        int i13;
        if (d11 >= 2.0d) {
            double d12 = (((double) i12) / (d11 - 1.0d)) + this.f8886w;
            int iRound = (int) Math.round(d12);
            this.f8886w = d12 - ((double) iRound);
            i13 = iRound;
        } else {
            double d13 = ((((double) i12) * (2.0d - d11)) / (d11 - 1.0d)) + this.f8886w;
            int iRound2 = (int) Math.round(d13);
            this.f8881r = iRound2;
            this.f8886w = d13 - ((double) iRound2);
            i13 = i12;
        }
        short[] sArrF = f(this.f8875l, this.f8876m, i13);
        this.f8875l = sArrF;
        p(i13, this.f8865b, sArrF, this.f8876m, sArr, i11, sArr, i11 + i12);
        this.f8876m += i13;
        return i13;
    }

    public void i() {
        this.f8874k = 0;
        this.f8876m = 0;
        this.f8878o = 0;
        this.f8879p = 0;
        this.f8880q = 0;
        this.f8881r = 0;
        this.f8882s = 0;
        this.f8883t = 0;
        this.f8884u = 0;
        this.f8885v = 0;
        this.f8886w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        k6.a.g(this.f8876m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f8865b, this.f8876m);
        shortBuffer.put(this.f8875l, 0, this.f8865b * iMin);
        int i11 = this.f8876m - iMin;
        this.f8876m = i11;
        short[] sArr = this.f8875l;
        int i12 = this.f8865b;
        System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
    }

    public int k() {
        k6.a.g(this.f8876m >= 0);
        return this.f8876m * this.f8865b * 2;
    }

    public int l() {
        return this.f8874k * this.f8865b * 2;
    }

    public void s() {
        int i11;
        int i12 = this.f8874k;
        float f11 = this.f8866c;
        float f12 = this.f8867d;
        double d11 = f11 / f12;
        double d12 = this.f8868e * f12;
        int i13 = this.f8881r;
        int i14 = this.f8876m + ((int) ((((((((double) (i12 - i13)) / d11) + ((double) i13)) + this.f8886w) + ((double) this.f8878o)) / d12) + 0.5d));
        this.f8886w = 0.0d;
        this.f8873j = f(this.f8873j, i12, (this.f8871h * 2) + i12);
        int i15 = 0;
        while (true) {
            i11 = this.f8871h;
            int i16 = this.f8865b;
            if (i15 >= i11 * 2 * i16) {
                break;
            }
            this.f8873j[(i16 * i12) + i15] = 0;
            i15++;
        }
        this.f8874k += i11 * 2;
        r();
        if (this.f8876m > i14) {
            this.f8876m = Math.max(i14, 0);
        }
        this.f8874k = 0;
        this.f8881r = 0;
        this.f8878o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i11 = this.f8865b;
        int i12 = iRemaining / i11;
        short[] sArrF = f(this.f8873j, this.f8874k, i12);
        this.f8873j = sArrF;
        shortBuffer.get(sArrF, this.f8874k * this.f8865b, ((i11 * i12) * 2) / 2);
        this.f8874k += i12;
        r();
    }
}
