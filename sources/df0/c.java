package df0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    private static final int a(int i11, int i12, int i13) {
        return e(e(i11, i13) - e(i12, i13), i13);
    }

    private static final long b(long j11, long j12, long j13) {
        return f(f(j11, j13) - f(j12, j13), j13);
    }

    public static final int c(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                return i12 - a(i12, i11, i13);
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i11 > i12) {
                return i12 + a(i11, i12, -i13);
            }
        }
        return i12;
    }

    public static final long d(long j11, long j12, long j13) {
        if (j13 > 0) {
            return j11 >= j12 ? j12 : j12 - b(j12, j11, j13);
        }
        if (j13 < 0) {
            return j11 <= j12 ? j12 : j12 + b(j11, j12, -j13);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int e(int i11, int i12) {
        int i13 = i11 % i12;
        return i13 >= 0 ? i13 : i13 + i12;
    }

    private static final long f(long j11, long j12) {
        long j13 = j11 % j12;
        return j13 >= 0 ? j13 : j13 + j12;
    }
}
