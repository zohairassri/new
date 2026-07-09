package lj;

import java.util.Map;
import lj.i;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f114416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f114417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f114418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f114419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f114420f;

    /* JADX INFO: renamed from: lj.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class C1403b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f114421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f114422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f114423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f114424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f114425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f114426f;

        C1403b() {
        }

        @Override // lj.i.a
        public i d() {
            String str = "";
            if (this.f114421a == null) {
                str = " transportName";
            }
            if (this.f114423c == null) {
                str = str + " encodedPayload";
            }
            if (this.f114424d == null) {
                str = str + " eventMillis";
            }
            if (this.f114425e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f114426f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f114421a, this.f114422b, this.f114423c, this.f114424d.longValue(), this.f114425e.longValue(), this.f114426f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // lj.i.a
        protected Map e() {
            Map map = this.f114426f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // lj.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f114426f = map;
            return this;
        }

        @Override // lj.i.a
        public i.a g(Integer num) {
            this.f114422b = num;
            return this;
        }

        @Override // lj.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f114423c = hVar;
            return this;
        }

        @Override // lj.i.a
        public i.a i(long j11) {
            this.f114424d = Long.valueOf(j11);
            return this;
        }

        @Override // lj.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f114421a = str;
            return this;
        }

        @Override // lj.i.a
        public i.a k(long j11) {
            this.f114425e = Long.valueOf(j11);
            return this;
        }
    }

    @Override // lj.i
    protected Map c() {
        return this.f114420f;
    }

    @Override // lj.i
    public Integer d() {
        return this.f114416b;
    }

    @Override // lj.i
    public h e() {
        return this.f114417c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f114415a.equals(iVar.j()) && ((num = this.f114416b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f114417c.equals(iVar.e()) && this.f114418d == iVar.f() && this.f114419e == iVar.k() && this.f114420f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // lj.i
    public long f() {
        return this.f114418d;
    }

    public int hashCode() {
        int iHashCode = (this.f114415a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f114416b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f114417c.hashCode()) * 1000003;
        long j11 = this.f114418d;
        int i11 = (iHashCode2 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f114419e;
        return this.f114420f.hashCode() ^ ((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003);
    }

    @Override // lj.i
    public String j() {
        return this.f114415a;
    }

    @Override // lj.i
    public long k() {
        return this.f114419e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f114415a + ", code=" + this.f114416b + ", encodedPayload=" + this.f114417c + ", eventMillis=" + this.f114418d + ", uptimeMillis=" + this.f114419e + ", autoMetadata=" + this.f114420f + "}";
    }

    private b(String str, Integer num, h hVar, long j11, long j12, Map map) {
        this.f114415a = str;
        this.f114416b = num;
        this.f114417c = hVar;
        this.f114418d = j11;
        this.f114419e = j12;
        this.f114420f = map;
    }
}
