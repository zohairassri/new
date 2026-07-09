package rx.internal.util.unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class r extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f125291h;

    public r(int i11) {
        super(i11);
    }

    protected final long x() {
        return this.f125291h;
    }

    protected final void y(long j11) {
        this.f125291h = j11;
    }
}
