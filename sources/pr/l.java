package pr;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f121746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f121747b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f121748a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f121749b = com.google.firebase.remoteconfig.internal.m.f46990j;

        public l c() {
            return new l(this);
        }

        public b d(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
            }
            this.f121748a = j11;
            return this;
        }

        public b e(long j11) {
            if (j11 >= 0) {
                this.f121749b = j11;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j11 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f121746a;
    }

    public long b() {
        return this.f121747b;
    }

    private l(b bVar) {
        this.f121746a = bVar.f121748a;
        this.f121747b = bVar.f121749b;
    }
}
