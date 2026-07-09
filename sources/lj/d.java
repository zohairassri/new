package lj;

import java.util.Arrays;
import lj.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f114437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f114438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jj.d f114439c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f114440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f114441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private jj.d f114442c;

        b() {
        }

        @Override // lj.p.a
        public p a() {
            String str = "";
            if (this.f114440a == null) {
                str = " backendName";
            }
            if (this.f114442c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f114440a, this.f114441b, this.f114442c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // lj.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f114440a = str;
            return this;
        }

        @Override // lj.p.a
        public p.a c(byte[] bArr) {
            this.f114441b = bArr;
            return this;
        }

        @Override // lj.p.a
        public p.a d(jj.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f114442c = dVar;
            return this;
        }
    }

    @Override // lj.p
    public String b() {
        return this.f114437a;
    }

    @Override // lj.p
    public byte[] c() {
        return this.f114438b;
    }

    @Override // lj.p
    public jj.d d() {
        return this.f114439c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f114437a.equals(pVar.b())) {
                if (Arrays.equals(this.f114438b, pVar instanceof d ? ((d) pVar).f114438b : pVar.c()) && this.f114439c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f114439c.hashCode() ^ ((((this.f114437a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f114438b)) * 1000003);
    }

    private d(String str, byte[] bArr, jj.d dVar) {
        this.f114437a = str;
        this.f114438b = bArr;
        this.f114439c = dVar;
    }
}
