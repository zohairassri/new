package yq;

import yq.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f140859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f140860c;

    /* JADX INFO: renamed from: yq.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class C2006b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f140861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f140862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f140863c;

        C2006b() {
        }

        @Override // yq.f.a
        public f a() {
            String str = "";
            if (this.f140862b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f140861a, this.f140862b.longValue(), this.f140863c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // yq.f.a
        public f.a b(f.b bVar) {
            this.f140863c = bVar;
            return this;
        }

        @Override // yq.f.a
        public f.a c(String str) {
            this.f140861a = str;
            return this;
        }

        @Override // yq.f.a
        public f.a d(long j11) {
            this.f140862b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // yq.f
    public f.b b() {
        return this.f140860c;
    }

    @Override // yq.f
    public String c() {
        return this.f140858a;
    }

    @Override // yq.f
    public long d() {
        return this.f140859b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f140858a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f140859b == fVar.d() && ((bVar = this.f140860c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f140858a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j11 = this.f140859b;
        int i11 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        f.b bVar = this.f140860c;
        return i11 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f140858a + ", tokenExpirationTimestamp=" + this.f140859b + ", responseCode=" + this.f140860c + "}";
    }

    private b(String str, long j11, f.b bVar) {
        this.f140858a = str;
        this.f140859b = j11;
        this.f140860c = bVar;
    }
}
