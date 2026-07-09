package j7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f105040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f105041d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f105043f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f105038a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f105039b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f105042e = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f105044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f105045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f105046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f105047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f105048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f105049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean[] f105050g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f105051h;

        private static int c(long j11) {
            return (int) (j11 % 15);
        }

        public long a() {
            long j11 = this.f105048e;
            if (j11 == 0) {
                return 0L;
            }
            return this.f105049f / j11;
        }

        public long b() {
            return this.f105049f;
        }

        public boolean d() {
            long j11 = this.f105047d;
            if (j11 == 0) {
                return false;
            }
            return this.f105050g[c(j11 - 1)];
        }

        public boolean e() {
            return this.f105047d > 15 && this.f105051h == 0;
        }

        public void f(long j11) {
            long j12 = this.f105047d;
            if (j12 == 0) {
                this.f105044a = j11;
            } else if (j12 == 1) {
                long j13 = j11 - this.f105044a;
                this.f105045b = j13;
                this.f105049f = j13;
                this.f105048e = 1L;
            } else {
                long j14 = j11 - this.f105046c;
                int iC = c(j12);
                if (Math.abs(j14 - this.f105045b) <= 1000000) {
                    this.f105048e++;
                    this.f105049f += j14;
                    boolean[] zArr = this.f105050g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f105051h--;
                    }
                } else {
                    boolean[] zArr2 = this.f105050g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f105051h++;
                    }
                }
            }
            this.f105047d++;
            this.f105046c = j11;
        }

        public void g() {
            this.f105047d = 0L;
            this.f105048e = 0L;
            this.f105049f = 0L;
            this.f105051h = 0;
            Arrays.fill(this.f105050g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f105038a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f105038a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f105043f;
    }

    public long d() {
        if (e()) {
            return this.f105038a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f105038a.e();
    }

    public void f(long j11) {
        this.f105038a.f(j11);
        if (this.f105038a.e() && !this.f105041d) {
            this.f105040c = false;
        } else if (this.f105042e != -9223372036854775807L) {
            if (!this.f105040c || this.f105039b.d()) {
                this.f105039b.g();
                this.f105039b.f(this.f105042e);
            }
            this.f105040c = true;
            this.f105039b.f(j11);
        }
        if (this.f105040c && this.f105039b.e()) {
            a aVar = this.f105038a;
            this.f105038a = this.f105039b;
            this.f105039b = aVar;
            this.f105040c = false;
            this.f105041d = false;
        }
        this.f105042e = j11;
        this.f105043f = this.f105038a.e() ? 0 : this.f105043f + 1;
    }

    public void g() {
        this.f105038a.g();
        this.f105039b.g();
        this.f105040c = false;
        this.f105042e = -9223372036854775807L;
        this.f105043f = 0;
    }
}
