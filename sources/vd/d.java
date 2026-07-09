package vd;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f132911a;

        a(boolean z11) {
            this.f132911a = z11;
        }

        boolean b() {
            return this.f132911a;
        }
    }

    boolean b();

    void c(c cVar);

    boolean d(c cVar);

    boolean f(c cVar);

    d getRoot();

    void h(c cVar);

    boolean i(c cVar);
}
