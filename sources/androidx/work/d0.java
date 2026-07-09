package androidx.work;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f13377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0207b f13378b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f13379a;

            public a(Throwable th2) {
                this.f13379a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f13379a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.work.d0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class C0207b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0207b() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f13377a = new b.c();
        f13378b = new b.C0207b();
    }
}
