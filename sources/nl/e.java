package nl;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f119362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f119363d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f119365f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f119360a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f119361b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f119364e = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f119366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f119367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f119368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f119369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f119370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f119371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f119372g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f119373h;

        private static int c(long j11) {
            return (int) (j11 % 15);
        }

        public long a() {
            long j11 = this.f119370e;
            if (j11 == 0) {
                return 0L;
            }
            return this.f119371f / j11;
        }

        public long b() {
            return this.f119371f;
        }

        public boolean d() {
            long j11 = this.f119369d;
            if (j11 == 0) {
                return false;
            }
            return this.f119372g[c(j11 - 1)];
        }

        public boolean e() {
            return this.f119369d > 15 && this.f119373h == 0;
        }

        public void f(long j11) {
            long j12 = this.f119369d;
            if (j12 == 0) {
                this.f119366a = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.f119366a;
                this.f119367b = j13;
                this.f119371f = j13;
                this.f119370e = 1L;
            } else {
                long j14 = j11 - this.f119368c;
                int iC = c(j12);
                if (Math.abs(j14 - this.f119367b) <= 1000000) {
                    this.f119370e++;
                    this.f119371f += j14;
                    boolean[] zArr = this.f119372g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f119373h--;
                    }
                } else {
                    boolean[] zArr2 = this.f119372g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f119373h++;
                    }
                }
            }
            this.f119369d++;
            this.f119368c = j11;
        }

        public void g() {
            this.f119369d = 0L;
            this.f119370e = 0L;
            this.f119371f = 0L;
            this.f119373h = 0;
            Arrays.fill(this.f119372g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f119360a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f119360a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f119365f;
    }

    public long d() {
        if (e()) {
            return this.f119360a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f119360a.e();
    }

    public void f(long j11) {
        this.f119360a.f(j11);
        if (this.f119360a.e() && !this.f119363d) {
            this.f119362c = false;
        } else if (this.f119364e != -9223372036854775807L) {
            if (!this.f119362c || this.f119361b.d()) {
                this.f119361b.g();
                this.f119361b.f(this.f119364e);
            }
            this.f119362c = true;
            this.f119361b.f(j11);
        }
        if (this.f119362c && this.f119361b.e()) {
            a aVar = this.f119360a;
            this.f119360a = this.f119361b;
            this.f119361b = aVar;
            this.f119362c = false;
            this.f119363d = false;
        }
        this.f119364e = j11;
        this.f119365f = this.f119360a.e() ? 0 : this.f119365f + 1;
    }

    public void g() {
        this.f119360a.g();
        this.f119361b.g();
        this.f119362c = false;
        this.f119364e = -9223372036854775807L;
        this.f119365f = 0;
    }
}
