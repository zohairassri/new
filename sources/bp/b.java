package bp;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f14959a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[] f14960b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14961a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f14961a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14961a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14961a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14961a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14961a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14961a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14961a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14961a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d11, double d12, double d13) {
        f.d("tolerance", d13);
        if (Math.copySign(d11 - d12, 1.0d) <= d13 || d11 == d12) {
            return true;
        }
        return Double.isNaN(d11) && Double.isNaN(d12);
    }

    public static boolean b(double d11) {
        if (c.b(d11)) {
            return d11 == 0.0d || 52 - Long.numberOfTrailingZeros(c.a(d11)) <= Math.getExponent(d11);
        }
        return false;
    }

    public static boolean c(double d11) {
        if (d11 > 0.0d && c.b(d11)) {
            long jA = c.a(d11);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = bp.c.b(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            zo.o.e(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = bp.c.c(r5)
            if (r3 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = d(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2a:
            int[] r3 = bp.b.a.f14961a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L61;
                case 2: goto L68;
                case 3: goto L5a;
                case 4: goto L52;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L3b;
                case 8: goto L3b;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3b:
            double r5 = bp.c.d(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r1 = r2
            goto L68
        L48:
            if (r0 < 0) goto L4b
            r1 = r2
        L4b:
            boolean r5 = c(r5)
        L4f:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L68
        L52:
            if (r0 >= 0) goto L55
            r1 = r2
        L55:
            boolean r5 = c(r5)
            goto L4f
        L5a:
            boolean r5 = c(r5)
            r1 = r5 ^ 1
            goto L68
        L61:
            boolean r5 = c(r5)
            bp.f.f(r5)
        L68:
            if (r1 == 0) goto L6b
            int r0 = r0 + r2
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bp.b.d(double, java.math.RoundingMode):int");
    }

    static double e(double d11, RoundingMode roundingMode) {
        if (!c.b(d11)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f14961a[roundingMode.ordinal()]) {
            case 1:
                f.f(b(d11));
                return d11;
            case 2:
                return (d11 >= 0.0d || b(d11)) ? d11 : ((long) d11) - 1;
            case 3:
                return (d11 <= 0.0d || b(d11)) ? d11 : ((long) d11) + 1;
            case 4:
                return d11;
            case 5:
                if (b(d11)) {
                    return d11;
                }
                return ((long) d11) + ((long) (d11 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d11);
            case 7:
                double dRint = Math.rint(d11);
                return Math.abs(d11 - dRint) == 0.5d ? d11 + Math.copySign(0.5d, d11) : dRint;
            case 8:
                double dRint2 = Math.rint(d11);
                return Math.abs(d11 - dRint2) == 0.5d ? d11 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long f(double d11, RoundingMode roundingMode) {
        double dE = e(d11, roundingMode);
        f.a(((-9.223372036854776E18d) - dE < 1.0d) & (dE < 9.223372036854776E18d), d11, roundingMode);
        return (long) dE;
    }
}
