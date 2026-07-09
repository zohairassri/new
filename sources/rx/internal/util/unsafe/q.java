package rx.internal.util.unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class q extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final long f125290f = z.a(q.class, "producerIndex");
    private volatile long producerIndex;

    public q(int i11) {
        super(i11);
    }

    protected final long s() {
        return this.producerIndex;
    }

    protected final void u(long j11) {
        z.f125296a.putOrderedLong(this, f125290f, j11);
    }
}
