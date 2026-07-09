package qc;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class c {
    public static final int a(double d11) {
        int i11 = (int) d11;
        if (i11 == d11) {
            return i11;
        }
        throw new IllegalStateException((d11 + " cannot be converted to Int").toString());
    }

    public static final long b(double d11) {
        long j11 = (long) d11;
        if (j11 == d11) {
            return j11;
        }
        throw new IllegalStateException((d11 + " cannot be converted to Long").toString());
    }

    public static final double c(long j11) {
        double d11 = j11;
        if (((long) d11) == j11) {
            return d11;
        }
        throw new IllegalStateException((j11 + " cannot be converted to Double").toString());
    }

    public static final int d(long j11) {
        int i11 = (int) j11;
        if (i11 == j11) {
            return i11;
        }
        throw new IllegalStateException((j11 + " cannot be converted to Int").toString());
    }
}
