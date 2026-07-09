package x2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final int a(long j11, long j12) {
        boolean zE = e(j11);
        if (zE != e(j12)) {
            return zE ? -1 : 1;
        }
        return (Math.min(c(j11), c(j12)) >= 0.0f && d(j11) != d(j12)) ? d(j11) ? -1 : 1 : (int) Math.signum(c(j11) - c(j12));
    }

    public static final float c(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final boolean d(long j11) {
        return (j11 & 2) != 0;
    }

    public static final boolean e(long j11) {
        return (j11 & 1) != 0;
    }

    public static long b(long j11) {
        return j11;
    }
}
