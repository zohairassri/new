package yq;

import yq.d;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f140848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f140849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f140850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f140851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f140852e;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f140853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f140854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f140855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f140856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f140857e;

        b() {
        }

        @Override // yq.d.a
        public d a() {
            return new a(this.f140853a, this.f140854b, this.f140855c, this.f140856d, this.f140857e);
        }

        @Override // yq.d.a
        public d.a b(f fVar) {
            this.f140856d = fVar;
            return this;
        }

        @Override // yq.d.a
        public d.a c(String str) {
            this.f140854b = str;
            return this;
        }

        @Override // yq.d.a
        public d.a d(String str) {
            this.f140855c = str;
            return this;
        }

        @Override // yq.d.a
        public d.a e(d.b bVar) {
            this.f140857e = bVar;
            return this;
        }

        @Override // yq.d.a
        public d.a f(String str) {
            this.f140853a = str;
            return this;
        }
    }

    @Override // yq.d
    public f b() {
        return this.f140851d;
    }

    @Override // yq.d
    public String c() {
        return this.f140849b;
    }

    @Override // yq.d
    public String d() {
        return this.f140850c;
    }

    @Override // yq.d
    public d.b e() {
        return this.f140852e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f140848a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f140849b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f140850c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f140851d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f140852e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // yq.d
    public String f() {
        return this.f140848a;
    }

    public int hashCode() {
        String str = this.f140848a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f140849b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f140850c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f140851d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f140852e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f140848a + ", fid=" + this.f140849b + ", refreshToken=" + this.f140850c + ", authToken=" + this.f140851d + ", responseCode=" + this.f140852e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f140848a = str;
        this.f140849b = str2;
        this.f140850c = str3;
        this.f140851d = fVar;
        this.f140852e = bVar;
    }
}
