package oj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f120418c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f120420b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f120421a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f120422b = 0;

        a() {
        }

        public f a() {
            return new f(this.f120421a, this.f120422b);
        }

        public a b(long j11) {
            this.f120422b = j11;
            return this;
        }

        public a c(long j11) {
            this.f120421a = j11;
            return this;
        }
    }

    f(long j11, long j12) {
        this.f120419a = j11;
        this.f120420b = j12;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f120420b;
    }

    public long b() {
        return this.f120419a;
    }
}
