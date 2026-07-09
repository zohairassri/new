package sr;

import sr.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f127292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f127293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f127294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f127295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f127296f;

    /* JADX INFO: renamed from: sr.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class C1739b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f127297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f127298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f127299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f127300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f127301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f127302f;

        C1739b() {
        }

        @Override // sr.d.a
        public d a() {
            if (this.f127302f == 1 && this.f127297a != null && this.f127298b != null && this.f127299c != null && this.f127300d != null) {
                return new b(this.f127297a, this.f127298b, this.f127299c, this.f127300d, this.f127301e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f127297a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f127298b == null) {
                sb2.append(" variantId");
            }
            if (this.f127299c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f127300d == null) {
                sb2.append(" parameterValue");
            }
            if ((this.f127302f & 1) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // sr.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f127299c = str;
            return this;
        }

        @Override // sr.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f127300d = str;
            return this;
        }

        @Override // sr.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f127297a = str;
            return this;
        }

        @Override // sr.d.a
        public d.a e(long j11) {
            this.f127301e = j11;
            this.f127302f = (byte) (this.f127302f | 1);
            return this;
        }

        @Override // sr.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f127298b = str;
            return this;
        }
    }

    @Override // sr.d
    public String b() {
        return this.f127294d;
    }

    @Override // sr.d
    public String c() {
        return this.f127295e;
    }

    @Override // sr.d
    public String d() {
        return this.f127292b;
    }

    @Override // sr.d
    public long e() {
        return this.f127296f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f127292b.equals(dVar.d()) && this.f127293c.equals(dVar.f()) && this.f127294d.equals(dVar.b()) && this.f127295e.equals(dVar.c()) && this.f127296f == dVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // sr.d
    public String f() {
        return this.f127293c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f127292b.hashCode() ^ 1000003) * 1000003) ^ this.f127293c.hashCode()) * 1000003) ^ this.f127294d.hashCode()) * 1000003) ^ this.f127295e.hashCode()) * 1000003;
        long j11 = this.f127296f;
        return ((int) (j11 ^ (j11 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f127292b + ", variantId=" + this.f127293c + ", parameterKey=" + this.f127294d + ", parameterValue=" + this.f127295e + ", templateVersion=" + this.f127296f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j11) {
        this.f127292b = str;
        this.f127293c = str2;
        this.f127294d = str3;
        this.f127295e = str4;
        this.f127296f = j11;
    }
}
