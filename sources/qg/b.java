package qg;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public enum b {
    FREQUENT(100),
    AVERAGE(500),
    RARE(1000),
    NEVER(0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f122703a;

    b(long j11) {
        this.f122703a = j11;
    }

    public final long b() {
        return this.f122703a;
    }
}
