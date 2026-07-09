package z3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final long a(int i11, int i12) {
        return r.c((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    public static final long b(long j11) {
        return n.f((((j11 << 32) >> 33) & 4294967295L) | ((j11 >> 33) << 32));
    }

    public static final long c(long j11) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j11 >> 32)));
        return r.c((((long) Math.round(Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }

    public static final long d(long j11) {
        return e2.l.d((((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32));
    }
}
