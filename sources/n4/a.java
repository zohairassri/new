package n4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f117304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f117305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f117306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f117307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f117308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f117309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f117310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f117311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f117312i;

    a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f117304a = f11;
        this.f117305b = f12;
        this.f117306c = f13;
        this.f117307d = f14;
        this.f117308e = f15;
        this.f117309f = f16;
        this.f117310g = f17;
        this.f117311h = f18;
        this.f117312i = f19;
    }

    private static a b(float f11, float f12, float f13) {
        float f14 = 100.0f;
        float f15 = 1000.0f;
        float f16 = 0.0f;
        a aVar = null;
        float f17 = 1000.0f;
        while (Math.abs(f16 - f14) > 0.01f) {
            float f18 = ((f14 - f16) / 2.0f) + f16;
            int iP = e(f18, f12, f11).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f13 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f11));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f15 = fAbs;
                    f17 = fA;
                }
            }
            if (f15 == 0.0f && f17 == 0.0f) {
                return aVar;
            }
            if (fB < f13) {
                f16 = f18;
            } else {
                f14 = f18;
            }
        }
        return aVar;
    }

    static a c(int i11) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i11, o.f117346k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i11, o oVar, float[] fArr, float[] fArr2) {
        b.f(i11, fArr2);
        float[][] fArr3 = b.f117313a;
        float f11 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f12 = fArr4[0] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr4[1] * f13);
        float f15 = fArr2[2];
        float f16 = f14 + (fArr4[2] * f15);
        float[] fArr5 = fArr3[1];
        float f17 = (fArr5[0] * f11) + (fArr5[1] * f13) + (fArr5[2] * f15);
        float[] fArr6 = fArr3[2];
        float f18 = (f11 * fArr6[0]) + (f13 * fArr6[1]) + (f15 * fArr6[2]);
        float f19 = oVar.i()[0] * f16;
        float f21 = oVar.i()[1] * f17;
        float f22 = oVar.i()[2] * f18;
        float fPow = (float) Math.pow(((double) (oVar.c() * Math.abs(f19))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (oVar.c() * Math.abs(f21))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (oVar.c() * Math.abs(f22))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f21) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f22) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d11 = fSignum3;
        float f23 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d11)) / 11.0f;
        float f24 = ((float) (((double) (fSignum + fSignum2)) - (d11 * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float f26 = (((fSignum * 20.0f) + f25) + (21.0f * fSignum3)) / 20.0f;
        float f27 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f28 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f27 * oVar.f()) / oVar.a(), oVar.b() * oVar.j())) * 100.0f;
        float fB = (4.0f / oVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (oVar.a() + 4.0f) * oVar.d();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.g()) * oVar.h()) * ((float) Math.sqrt((f23 * f23) + (f24 * f24)))) / (f26 + 0.305f), 0.9d));
        float fD = oVar.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d12 = f28;
        float fCos = ((float) Math.cos(d12)) * fLog;
        float fSin = fLog * ((float) Math.sin(d12));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f29;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static a e(float f11, float f12, float f13) {
        return f(f11, f12, f13, o.f117346k);
    }

    private static a f(float f11, float f12, float f13, o oVar) {
        float fB = (4.0f / oVar.b()) * ((float) Math.sqrt(((double) f11) / 100.0d)) * (oVar.a() + 4.0f) * oVar.d();
        float fD = oVar.d() * f12;
        float fSqrt = ((float) Math.sqrt(((f12 / ((float) Math.sqrt(r4))) * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f14 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f13) / 180.0f;
        return new a(f13, f12, f11, fB, fD, fSqrt, f14, ((float) Math.cos(d11)) * fLog, fLog * ((float) Math.sin(d11)));
    }

    public static int m(float f11, float f12, float f13) {
        return n(f11, f12, f13, o.f117346k);
    }

    static int n(float f11, float f12, float f13, o oVar) {
        if (f12 < 1.0d || Math.round(f13) <= 0.0d || Math.round(f13) >= 100.0d) {
            return b.a(f13);
        }
        float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
        a aVar = null;
        boolean z11 = true;
        float f14 = 0.0f;
        float f15 = f12;
        while (Math.abs(f14 - f12) >= 0.4f) {
            a aVarB = b(fMin, f15, f13);
            if (!z11) {
                if (aVarB == null) {
                    f12 = f15;
                } else {
                    f14 = f15;
                    aVar = aVarB;
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
            } else {
                if (aVarB != null) {
                    return aVarB.o(oVar);
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
                z11 = false;
            }
        }
        return aVar == null ? b.a(f13) : aVar.o(oVar);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f117311h;
    }

    float h() {
        return this.f117312i;
    }

    float i() {
        return this.f117305b;
    }

    float j() {
        return this.f117304a;
    }

    float k() {
        return this.f117306c;
    }

    float l() {
        return this.f117310g;
    }

    int o(o oVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = oVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) oVar.b())) / ((double) oVar.j())));
        float fG = fCos * 3846.1538f * oVar.g() * oVar.h();
        float f11 = fA / oVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f12 = (((0.305f + f11) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f13 = fCos2 * f12;
        float f14 = f12 * fSin;
        float f15 = f11 * 460.0f;
        float f16 = (((451.0f * f13) + f15) + (288.0f * f14)) / 1403.0f;
        float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
        float fSignum = Math.signum(f16) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f17) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f) * (100.0f / oVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f18 = fSignum / oVar.i()[0];
        float f19 = fSignum2 / oVar.i()[1];
        float f21 = fSignum3 / oVar.i()[2];
        float[][] fArr = b.f117314b;
        float[] fArr2 = fArr[0];
        float f22 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f21);
        float[] fArr3 = fArr[1];
        float f23 = (fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f21);
        float[] fArr4 = fArr[2];
        return o4.e.b(f22, f23, (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f21 * fArr4[2]));
    }

    int p() {
        return o(o.f117346k);
    }
}
