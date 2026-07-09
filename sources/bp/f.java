package bp;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class f {
    static void a(boolean z11, double d11, RoundingMode roundingMode) {
        if (z11) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d11 + " and rounding mode " + roundingMode);
    }

    static void b(boolean z11, String str, int i11, int i12) {
        if (z11) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i11 + ", " + i12 + ")");
    }

    static void c(boolean z11, String str, long j11, long j12) {
        if (z11) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j11 + ", " + j12 + ")");
    }

    static double d(String str, double d11) {
        if (d11 >= 0.0d) {
            return d11;
        }
        throw new IllegalArgumentException(str + " (" + d11 + ") must be >= 0");
    }

    static long e(String str, long j11) {
        if (j11 >= 0) {
            return j11;
        }
        throw new IllegalArgumentException(str + " (" + j11 + ") must be >= 0");
    }

    static void f(boolean z11) {
        if (!z11) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
