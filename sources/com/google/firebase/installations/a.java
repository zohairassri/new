package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46489c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f46491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f46492c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f46490a == null) {
                str = " token";
            }
            if (this.f46491b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f46492c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f46490a, this.f46491b.longValue(), this.f46492c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f46490a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j11) {
            this.f46492c = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j11) {
            this.f46491b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f46487a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f46489c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f46488b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f46487a.equals(fVar.b()) && this.f46488b == fVar.d() && this.f46489c == fVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f46487a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f46488b;
        long j12 = this.f46489c;
        return ((int) (j12 ^ (j12 >>> 32))) ^ ((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f46487a + ", tokenExpirationTimestamp=" + this.f46488b + ", tokenCreationTimestamp=" + this.f46489c + "}";
    }

    private a(String str, long j11, long j12) {
        this.f46487a = str;
        this.f46488b = j11;
        this.f46489c = j12;
    }
}
