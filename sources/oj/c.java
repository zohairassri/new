package oj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f120394c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f120396b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f120397a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f120398b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f120397a, this.f120398b);
        }

        public a b(long j11) {
            this.f120397a = j11;
            return this;
        }

        public a c(b bVar) {
            this.f120398b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum b implements rq.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f120407a;

        b(int i11) {
            this.f120407a = i11;
        }

        @Override // rq.c
        public int getNumber() {
            return this.f120407a;
        }
    }

    c(long j11, b bVar) {
        this.f120395a = j11;
        this.f120396b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f120395a;
    }

    public b b() {
        return this.f120396b;
    }
}
