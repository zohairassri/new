package ei0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static int a(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 > i12 ? 1 : 0;
    }

    public static int b(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 > j12 ? 1 : 0;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static long d(long j11, long j12) {
        return j11 >= 0 ? j11 / j12 : ((j11 + 1) / j12) - 1;
    }

    public static int e(long j11, int i11) {
        long j12 = i11;
        return (int) (((j11 % j12) + j12) % j12);
    }

    public static long f(long j11, long j12) {
        return ((j11 % j12) + j12) % j12;
    }

    public static Object g(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public static long h(long j11, long j12) {
        long j13 = j11 + j12;
        if ((j11 ^ j13) >= 0 || (j11 ^ j12) < 0) {
            return j13;
        }
        throw new ArithmeticException("Addition overflows a long: " + j11 + " + " + j12);
    }

    public static long i(long j11, int i11) {
        if (i11 == -1) {
            if (j11 != Long.MIN_VALUE) {
                return -j11;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i11);
        }
        if (i11 == 0) {
            return 0L;
        }
        if (i11 == 1) {
            return j11;
        }
        long j12 = i11;
        long j13 = j11 * j12;
        if (j13 / j12 == j11) {
            return j13;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i11);
    }

    public static long j(long j11, long j12) {
        if (j12 == 1) {
            return j11;
        }
        if (j11 == 1) {
            return j12;
        }
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        long j13 = j11 * j12;
        if (j13 / j12 == j11 && ((j11 != Long.MIN_VALUE || j12 != -1) && (j12 != Long.MIN_VALUE || j11 != -1))) {
            return j13;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + j12);
    }

    public static int k(int i11, int i12) {
        int i13 = i11 - i12;
        if ((i11 ^ i13) >= 0 || (i11 ^ i12) >= 0) {
            return i13;
        }
        throw new ArithmeticException("Subtraction overflows an int: " + i11 + " - " + i12);
    }

    public static long l(long j11, long j12) {
        long j13 = j11 - j12;
        if ((j11 ^ j13) >= 0 || (j11 ^ j12) >= 0) {
            return j13;
        }
        throw new ArithmeticException("Subtraction overflows a long: " + j11 + " - " + j12);
    }

    public static int m(long j11) {
        if (j11 <= 2147483647L && j11 >= -2147483648L) {
            return (int) j11;
        }
        throw new ArithmeticException("Calculation overflows an int: " + j11);
    }
}
