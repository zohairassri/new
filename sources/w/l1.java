package w;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {
    public static final long a(double d11, double d12, double d13, double d14, double d15) {
        double dSqrt = 2.0d * d12 * Math.sqrt(d11);
        double d16 = (dSqrt * dSqrt) - (4.0d * d11);
        double dSqrt2 = d16 < 0.0d ? 0.0d : Math.sqrt(d16);
        double d17 = -dSqrt;
        return d((d17 + dSqrt2) * 0.5d, (d16 < 0.0d ? Math.sqrt(Math.abs(d16)) : 0.0d) * 0.5d, (d17 - dSqrt2) * 0.5d, d12, d13, d14, d15);
    }

    public static final long b(float f11, float f12, float f13, float f14, float f15) {
        if (f12 == 0.0f) {
            return 9223372036854L;
        }
        return a(f11, f12, f13, f14, f15);
    }

    private static final double c(double d11, double d12, double d13, double d14) {
        double d15 = d14;
        double d16 = d11 * d12;
        double d17 = d13 - d16;
        double dLog = Math.log(Math.abs(d15 / d12)) / d11;
        double dLog2 = Math.log(Math.abs(d15 / d17));
        int i11 = 0;
        double dLog3 = dLog2;
        for (int i12 = 0; i12 < 6; i12++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d11));
        }
        double d18 = dLog3 / d11;
        if (!((Double.doubleToRawLongBits(dLog) & LongCompanionObject.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d18;
        } else if ((Double.doubleToRawLongBits(d18) & LongCompanionObject.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d18);
        }
        double d19 = (-(d16 + d17)) / (d11 * d17);
        double d21 = d11 * d19;
        double dExp = (Math.exp(d21) * d12) + (d17 * d19 * Math.exp(d21));
        if (Double.isNaN(d19) || d19 <= 0.0d) {
            d15 = -d15;
        } else if (d19 <= 0.0d || (-dExp) >= d15) {
            dLog = (-(2.0d / d11)) - (d12 / d17);
        } else {
            if (d17 < 0.0d && d12 > 0.0d) {
                dLog = 0.0d;
            }
            d15 = -d15;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d22 = d11 * dLog;
            double d23 = d15;
            double dExp2 = dLog - ((((d12 + (d17 * dLog)) * Math.exp(d22)) + d15) / ((((((double) 1) + d22) * d17) + d16) * Math.exp(d22)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d15 = d23;
        }
        return dLog;
    }

    private static final long d(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double d18 = d15;
        if (d16 == 0.0d && d18 == 0.0d) {
            return 0L;
        }
        if (d16 < 0.0d) {
            d18 = -d18;
        }
        double d19 = d18;
        double dAbs = Math.abs(d16);
        return (long) ((d14 > 1.0d ? e(d11, d13, dAbs, d19, d17) : d14 < 1.0d ? g(d11, d12, dAbs, d19, d17) : c(d11, dAbs, d19, d17)) * 1000.0d);
    }

    private static final double e(double d11, double d12, double d13, double d14, double d15) {
        double d16 = d15;
        double d17 = d11 - d12;
        double d18 = ((d11 * d13) - d14) / d17;
        double d19 = d13 - d18;
        double dLog = Math.log(Math.abs(d16 / d19)) / d11;
        double dLog2 = Math.log(Math.abs(d16 / d18)) / d12;
        if ((Double.doubleToRawLongBits(dLog) & LongCompanionObject.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & LongCompanionObject.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d21 = d19 * d11;
        double dLog3 = Math.log(d21 / ((-d18) * d12)) / (d12 - d11);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d16 = -d16;
        } else if (dLog3 <= 0.0d || (-f(d19, d11, dLog3, d18, d12)) >= d16) {
            dLog = Math.log((-((d18 * d12) * d12)) / (d21 * d11)) / d17;
        } else {
            if (d18 > 0.0d && d19 < 0.0d) {
                dLog = 0.0d;
            }
            d16 = -d16;
        }
        double d22 = d18 * d12;
        if (Math.abs((Math.exp(d11 * dLog) * d21) + (Math.exp(d12 * dLog) * d22)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d23 = d11 * dLog;
            double d24 = d12 * dLog;
            double dExp = dLog - ((((Math.exp(d23) * d19) + (Math.exp(d24) * d18)) + d16) / ((Math.exp(d23) * d21) + (Math.exp(d24) * d22)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double f(double d11, double d12, double d13, double d14, double d15) {
        return (d11 * Math.exp(d12 * d13)) + (d14 * Math.exp(d15 * d13));
    }

    private static final double g(double d11, double d12, double d13, double d14, double d15) {
        double d16 = (d14 - (d11 * d13)) / d12;
        return Math.log(d15 / Math.sqrt((d13 * d13) + (d16 * d16))) / d11;
    }
}
