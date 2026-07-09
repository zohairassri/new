package rx.internal.util.unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class l extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final long f125289g = z.a(l.class, "consumerIndex");
    private volatile long consumerIndex;

    public l(int i11) {
        super(i11);
    }

    protected final boolean v(long j11, long j12) {
        return z.f125296a.compareAndSwapLong(this, f125289g, j11, j12);
    }

    protected final long w() {
        return this.consumerIndex;
    }
}
