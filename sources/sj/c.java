package sj;

import java.util.Set;
import sj.f;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f126997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f126998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f126999c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f127000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f127001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f127002c;

        b() {
        }

        @Override // sj.f.b.a
        public f.b a() {
            String str = "";
            if (this.f127000a == null) {
                str = " delta";
            }
            if (this.f127001b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f127002c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f127000a.longValue(), this.f127001b.longValue(), this.f127002c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // sj.f.b.a
        public f.b.a b(long j11) {
            this.f127000a = Long.valueOf(j11);
            return this;
        }

        @Override // sj.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f127002c = set;
            return this;
        }

        @Override // sj.f.b.a
        public f.b.a d(long j11) {
            this.f127001b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // sj.f.b
    long b() {
        return this.f126997a;
    }

    @Override // sj.f.b
    Set c() {
        return this.f126999c;
    }

    @Override // sj.f.b
    long d() {
        return this.f126998b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f126997a == bVar.b() && this.f126998b == bVar.d() && this.f126999c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f126997a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f126998b;
        return this.f126999c.hashCode() ^ ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f126997a + ", maxAllowedDelay=" + this.f126998b + ", flags=" + this.f126999c + "}";
    }

    private c(long j11, long j12, Set set) {
        this.f126997a = j11;
        this.f126998b = j12;
        this.f126999c = set;
    }
}
