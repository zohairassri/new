package bp;

import zo.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class c {
    static long a(double d11) {
        o.e(b(d11), "not a normal value");
        int exponent = Math.getExponent(d11);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d11) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d11) {
        return Math.getExponent(d11) <= 1023;
    }

    static boolean c(double d11) {
        return Math.getExponent(d11) >= -1022;
    }

    static double d(double d11) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d11) & 4503599627370495L) | 4607182418800017408L);
    }
}
