package kj;

import java.util.Arrays;
import kj.l;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f111039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f111040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f111041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f111042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f111043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f111044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f111045g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f111046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f111047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f111048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f111049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f111050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f111051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f111052g;

        b() {
        }

        @Override // kj.l.a
        public l a() {
            String str = "";
            if (this.f111046a == null) {
                str = " eventTimeMs";
            }
            if (this.f111048c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f111051f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f111046a.longValue(), this.f111047b, this.f111048c.longValue(), this.f111049d, this.f111050e, this.f111051f.longValue(), this.f111052g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // kj.l.a
        public l.a b(Integer num) {
            this.f111047b = num;
            return this;
        }

        @Override // kj.l.a
        public l.a c(long j11) {
            this.f111046a = Long.valueOf(j11);
            return this;
        }

        @Override // kj.l.a
        public l.a d(long j11) {
            this.f111048c = Long.valueOf(j11);
            return this;
        }

        @Override // kj.l.a
        public l.a e(o oVar) {
            this.f111052g = oVar;
            return this;
        }

        @Override // kj.l.a
        l.a f(byte[] bArr) {
            this.f111049d = bArr;
            return this;
        }

        @Override // kj.l.a
        l.a g(String str) {
            this.f111050e = str;
            return this;
        }

        @Override // kj.l.a
        public l.a h(long j11) {
            this.f111051f = Long.valueOf(j11);
            return this;
        }
    }

    @Override // kj.l
    public Integer b() {
        return this.f111040b;
    }

    @Override // kj.l
    public long c() {
        return this.f111039a;
    }

    @Override // kj.l
    public long d() {
        return this.f111041c;
    }

    @Override // kj.l
    public o e() {
        return this.f111045g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f111039a == lVar.c() && ((num = this.f111040b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f111041c == lVar.d()) {
                if (Arrays.equals(this.f111042d, lVar instanceof f ? ((f) lVar).f111042d : lVar.f()) && ((str = this.f111043e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f111044f == lVar.h() && ((oVar = this.f111045g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kj.l
    public byte[] f() {
        return this.f111042d;
    }

    @Override // kj.l
    public String g() {
        return this.f111043e;
    }

    @Override // kj.l
    public long h() {
        return this.f111044f;
    }

    public int hashCode() {
        long j11 = this.f111039a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f111040b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j12 = this.f111041c;
        int iHashCode2 = (((((i11 ^ iHashCode) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f111042d)) * 1000003;
        String str = this.f111043e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j13 = this.f111044f;
        int i12 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        o oVar = this.f111045g;
        return i12 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f111039a + ", eventCode=" + this.f111040b + ", eventUptimeMs=" + this.f111041c + ", sourceExtension=" + Arrays.toString(this.f111042d) + ", sourceExtensionJsonProto3=" + this.f111043e + ", timezoneOffsetSeconds=" + this.f111044f + ", networkConnectionInfo=" + this.f111045g + "}";
    }

    private f(long j11, Integer num, long j12, byte[] bArr, String str, long j13, o oVar) {
        this.f111039a = j11;
        this.f111040b = num;
        this.f111041c = j12;
        this.f111042d = bArr;
        this.f111043e = str;
        this.f111044f = j13;
        this.f111045g = oVar;
    }
}
