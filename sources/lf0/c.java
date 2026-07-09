package lf0;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public class c extends b {
    public static int a(int i11) {
        return Integer.signum(i11);
    }

    public static int b(long j11) {
        return Long.signum(j11);
    }

    public static int c(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d11 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        return d11 < -2.147483648E9d ? IntCompanionObject.MIN_VALUE : (int) Math.round(d11);
    }

    public static int d(float f11) {
        if (Float.isNaN(f11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f11);
    }

    public static long e(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d11);
    }

    public static long f(float f11) {
        return e(f11);
    }
}
