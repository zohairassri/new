package xq;

import xq.c;
import xq.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f137960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f137961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f137962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f137963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f137964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f137965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f137966h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f137967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f137968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f137969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f137970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f137971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f137972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f137973g;

        @Override // xq.d.a
        public d a() {
            String str = "";
            if (this.f137968b == null) {
                str = " registrationStatus";
            }
            if (this.f137971e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f137972f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f137967a, this.f137968b, this.f137969c, this.f137970d, this.f137971e.longValue(), this.f137972f.longValue(), this.f137973g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xq.d.a
        public d.a b(String str) {
            this.f137969c = str;
            return this;
        }

        @Override // xq.d.a
        public d.a c(long j11) {
            this.f137971e = Long.valueOf(j11);
            return this;
        }

        @Override // xq.d.a
        public d.a d(String str) {
            this.f137967a = str;
            return this;
        }

        @Override // xq.d.a
        public d.a e(String str) {
            this.f137973g = str;
            return this;
        }

        @Override // xq.d.a
        public d.a f(String str) {
            this.f137970d = str;
            return this;
        }

        @Override // xq.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f137968b = aVar;
            return this;
        }

        @Override // xq.d.a
        public d.a h(long j11) {
            this.f137972f = Long.valueOf(j11);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f137967a = dVar.d();
            this.f137968b = dVar.g();
            this.f137969c = dVar.b();
            this.f137970d = dVar.f();
            this.f137971e = Long.valueOf(dVar.c());
            this.f137972f = Long.valueOf(dVar.h());
            this.f137973g = dVar.e();
        }
    }

    @Override // xq.d
    public String b() {
        return this.f137962d;
    }

    @Override // xq.d
    public long c() {
        return this.f137964f;
    }

    @Override // xq.d
    public String d() {
        return this.f137960b;
    }

    @Override // xq.d
    public String e() {
        return this.f137966h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f137960b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f137961c.equals(dVar.g()) && ((str = this.f137962d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f137963e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f137964f == dVar.c() && this.f137965g == dVar.h() && ((str3 = this.f137966h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xq.d
    public String f() {
        return this.f137963e;
    }

    @Override // xq.d
    public c.a g() {
        return this.f137961c;
    }

    @Override // xq.d
    public long h() {
        return this.f137965g;
    }

    public int hashCode() {
        String str = this.f137960b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f137961c.hashCode()) * 1000003;
        String str2 = this.f137962d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f137963e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j11 = this.f137964f;
        int i11 = (iHashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f137965g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str4 = this.f137966h;
        return i12 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // xq.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f137960b + ", registrationStatus=" + this.f137961c + ", authToken=" + this.f137962d + ", refreshToken=" + this.f137963e + ", expiresInSecs=" + this.f137964f + ", tokenCreationEpochInSecs=" + this.f137965g + ", fisError=" + this.f137966h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j11, long j12, String str4) {
        this.f137960b = str;
        this.f137961c = aVar;
        this.f137962d = str2;
        this.f137963e = str3;
        this.f137964f = j11;
        this.f137965g = j12;
        this.f137966h = str4;
    }
}
