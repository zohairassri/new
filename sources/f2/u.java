package f2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final long b(float f11, float f12, float f13, float f14, float[] fArr, int i11) {
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        float f17 = (f14 - f13) * 3.0f;
        int iF = f(f15, f16, f17, fArr, i11);
        float f18 = (f16 - f15) * 2.0f;
        int iG = iF + g((-f18) / (((f17 - f16) * 2.0f) - f18), fArr, i11 + iF);
        float fMin = Math.min(f11, f14);
        float fMax = Math.max(f11, f14);
        for (int i12 = 0; i12 < iG; i12++) {
            float fD = d(f11, f12, f13, f14, fArr[i12]);
            fMin = Math.min(fMin, fD);
            fMax = Math.max(fMax, fD);
        }
        return t.i.a(fMin, fMax);
    }

    public static final float c(float f11, float f12, float f13) {
        return ((((((f11 - f12) + 0.33333334f) * f13) + (f12 - (2.0f * f11))) * f13) + f11) * 3.0f * f13;
    }

    private static final float d(float f11, float f12, float f13, float f14, float f15) {
        float f16 = (f14 + ((f12 - f13) * 3.0f)) - f11;
        return (((((f16 * f15) + (((f13 - (2.0f * f12)) + f11) * 3.0f)) * f15) + ((f12 - f11) * 3.0f)) * f15) + f11;
    }

    public static final float e(float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        double d11 = f11;
        double d12 = ((d11 - (((double) f12) * 2.0d)) + ((double) f13)) * 3.0d;
        double d13 = ((double) (f12 - f11)) * 3.0d;
        double d14 = ((double) (-f11)) + (((double) (f12 - f13)) * 3.0d) + ((double) f14);
        if (Math.abs(d14 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d12 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d13 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f17 = (float) ((-d11) / d13);
                f15 = f17 >= 0.0f ? f17 : 0.0f;
                f16 = f15 <= 1.0f ? f15 : 1.0f;
                if (Math.abs(f16 - f17) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f16;
            }
            double dSqrt = Math.sqrt((d13 * d13) - ((4.0d * d12) * d11));
            double d15 = d12 * 2.0d;
            float f18 = (float) ((dSqrt - d13) / d15);
            float f19 = f18 < 0.0f ? 0.0f : f18;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (Math.abs(f19 - f18) > 1.05E-6f) {
                f19 = Float.NaN;
            }
            if (!Float.isNaN(f19)) {
                return f19;
            }
            float f21 = (float) (((-d13) - dSqrt) / d15);
            f15 = f21 >= 0.0f ? f21 : 0.0f;
            f16 = f15 <= 1.0f ? f15 : 1.0f;
            if (Math.abs(f16 - f21) > 1.05E-6f) {
                return Float.NaN;
            }
            return f16;
        }
        double d16 = d12 / d14;
        double d17 = d13 / d14;
        double d18 = d11 / d14;
        double d19 = ((d17 * 3.0d) - (d16 * d16)) / 9.0d;
        double d21 = (((((2.0d * d16) * d16) * d16) - ((9.0d * d16) * d17)) + (d18 * 27.0d)) / 54.0d;
        double d22 = d19 * d19 * d19;
        double d23 = (d21 * d21) + d22;
        double d24 = d16 / 3.0d;
        if (d23 >= 0.0d) {
            if (d23 != 0.0d) {
                double dSqrt2 = Math.sqrt(d23);
                float fA = (float) (((double) (b4.c.a((float) ((-d21) + dSqrt2)) - b4.c.a((float) (d21 + dSqrt2)))) - d24);
                f15 = fA >= 0.0f ? fA : 0.0f;
                f16 = f15 <= 1.0f ? f15 : 1.0f;
                if (Math.abs(f16 - fA) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f16;
            }
            float f22 = -b4.c.a((float) d21);
            float f23 = (float) d24;
            float f24 = (2.0f * f22) - f23;
            float f25 = f24 < 0.0f ? 0.0f : f24;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            if (Math.abs(f25 - f24) > 1.05E-6f) {
                f25 = Float.NaN;
            }
            if (!Float.isNaN(f25)) {
                return f25;
            }
            float f26 = (-f22) - f23;
            f15 = f26 >= 0.0f ? f26 : 0.0f;
            f16 = f15 <= 1.0f ? f15 : 1.0f;
            if (Math.abs(f16 - f26) > 1.05E-6f) {
                return Float.NaN;
            }
            return f16;
        }
        double dSqrt3 = Math.sqrt(-d22);
        double d25 = (-d21) / dSqrt3;
        if (d25 < -1.0d) {
            d25 = -1.0d;
        }
        if (d25 > 1.0d) {
            d25 = 1.0d;
        }
        double dAcos = Math.acos(d25);
        double dA = b4.c.a((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dA) - d24);
        float f27 = fCos < 0.0f ? 0.0f : fCos;
        if (f27 > 1.0f) {
            f27 = 1.0f;
        }
        if (Math.abs(f27 - fCos) > 1.05E-6f) {
            f27 = Float.NaN;
        }
        if (!Float.isNaN(f27)) {
            return f27;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dA) - d24);
        float f28 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f28 > 1.0f) {
            f28 = 1.0f;
        }
        if (Math.abs(f28 - fCos2) > 1.05E-6f) {
            f28 = Float.NaN;
        }
        if (!Float.isNaN(f28)) {
            return f28;
        }
        float fCos3 = (float) ((dA * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d24);
        f15 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f16 = f15 <= 1.0f ? f15 : 1.0f;
        if (Math.abs(f16 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f16;
    }

    private static final int f(float f11, float f12, float f13, float[] fArr, int i11) {
        double d11 = f11;
        double d12 = f12;
        double d13 = f13;
        double d14 = d12 * 2.0d;
        double d15 = (d11 - d14) + d13;
        if (d15 == 0.0d) {
            if (d12 == d13) {
                return 0;
            }
            return g((float) ((d14 - d13) / (d14 - (d13 * 2.0d))), fArr, i11);
        }
        double d16 = -Math.sqrt((d12 * d12) - (d13 * d11));
        double d17 = (-d11) + d12;
        int iG = g((float) ((-(d16 + d17)) / d15), fArr, i11);
        int iG2 = iG + g((float) ((d16 - d17) / d15), fArr, i11 + iG);
        if (iG2 <= 1) {
            return iG2;
        }
        float f14 = fArr[i11];
        int i12 = i11 + 1;
        float f15 = fArr[i12];
        if (f14 <= f15) {
            return f14 == f15 ? iG2 - 1 : iG2;
        }
        fArr[i11] = f15;
        fArr[i12] = f14;
        return iG2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(float f11, float[] fArr, int i11) {
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (Math.abs(f12 - f11) > 1.05E-6f) {
            f12 = Float.NaN;
        }
        fArr[i11] = f12;
        return !Float.isNaN(f12) ? 1 : 0;
    }
}
