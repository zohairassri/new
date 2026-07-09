package rx.internal.util.unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class i extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f125288i = z.a(i.class, "producerIndex");
    private volatile long producerIndex;

    public i(int i11) {
        super(i11);
    }

    protected final boolean w(long j11, long j12) {
        return z.f125296a.compareAndSwapLong(this, f125288i, j11, j12);
    }

    protected final long x() {
        return this.producerIndex;
    }
}
