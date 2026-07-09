package lp;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f114709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f114710c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f114711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f114712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f114713c;

        public d a() throws GeneralSecurityException {
            Integer num = this.f114711a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f114712b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f114713c != null) {
                return new d(num.intValue(), this.f114712b.intValue(), this.f114713c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i11 * 8)));
            }
            this.f114711a = Integer.valueOf(i11);
            return this;
        }

        public b c(int i11) throws GeneralSecurityException {
            if (i11 >= 10 && 16 >= i11) {
                this.f114712b = Integer.valueOf(i11);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i11);
        }

        public b d(c cVar) {
            this.f114713c = cVar;
            return this;
        }

        private b() {
            this.f114711a = null;
            this.f114712b = null;
            this.f114713c = c.f114717e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f114714b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f114715c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f114716d = new c("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f114717e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f114718a;

        private c(String str) {
            this.f114718a = str;
        }

        public String toString() {
            return this.f114718a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f114709b;
    }

    public int c() {
        return this.f114708a;
    }

    public int d() {
        c cVar = this.f114710c;
        if (cVar == c.f114717e) {
            return b();
        }
        if (cVar != c.f114714b && cVar != c.f114715c && cVar != c.f114716d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public c e() {
        return this.f114710c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f114710c != c.f114717e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f114708a), Integer.valueOf(this.f114709b), this.f114710c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f114710c + ", " + this.f114709b + "-byte tags, and " + this.f114708a + "-byte key)";
    }

    private d(int i11, int i12, c cVar) {
        this.f114708a = i11;
        this.f114709b = i12;
        this.f114710c = cVar;
    }
}
