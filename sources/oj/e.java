package oj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f120413c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f120414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f120415b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f120416a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f120417b = 0;

        a() {
        }

        public e a() {
            return new e(this.f120416a, this.f120417b);
        }

        public a b(long j11) {
            this.f120416a = j11;
            return this;
        }

        public a c(long j11) {
            this.f120417b = j11;
            return this;
        }
    }

    e(long j11, long j12) {
        this.f120414a = j11;
        this.f120415b = j12;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f120414a;
    }

    public long b() {
        return this.f120415b;
    }
}
