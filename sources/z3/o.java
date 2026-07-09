package z3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final long a(int i11, int i12) {
        return n.f((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    public static final long b(long j11, long j12) {
        return e2.f.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) - n.k(j12))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) - n.l(j12))) & 4294967295L));
    }

    public static final long c(long j11, long j12) {
        return e2.f.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) + n.k(j12))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) + n.l(j12))) & 4294967295L));
    }

    public static final long d(long j11) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j11 >> 32)));
        return n.f((((long) Math.round(Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32));
    }
}
