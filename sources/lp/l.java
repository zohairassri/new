package lp;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f114738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f114739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f114740d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f114741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f114742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f114743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f114744d;

        private static void f(int i11, c cVar) throws GeneralSecurityException {
            if (i11 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i11)));
            }
            if (cVar == c.f114745b) {
                if (i11 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i11)));
                }
                return;
            }
            if (cVar == c.f114746c) {
                if (i11 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i11)));
                }
                return;
            }
            if (cVar == c.f114747d) {
                if (i11 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i11)));
                }
            } else if (cVar == c.f114748e) {
                if (i11 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i11)));
                }
            } else {
                if (cVar != c.f114749f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i11 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i11)));
                }
            }
        }

        public l a() throws GeneralSecurityException {
            Integer num = this.f114741a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f114742b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f114743c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f114744d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f114741a));
            }
            f(this.f114742b.intValue(), this.f114743c);
            return new l(this.f114741a.intValue(), this.f114742b.intValue(), this.f114744d, this.f114743c);
        }

        public b b(c cVar) {
            this.f114743c = cVar;
            return this;
        }

        public b c(int i11) {
            this.f114741a = Integer.valueOf(i11);
            return this;
        }

        public b d(int i11) {
            this.f114742b = Integer.valueOf(i11);
            return this;
        }

        public b e(d dVar) {
            this.f114744d = dVar;
            return this;
        }

        private b() {
            this.f114741a = null;
            this.f114742b = null;
            this.f114743c = null;
            this.f114744d = d.f114754e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f114745b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f114746c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f114747d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f114748e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f114749f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f114750a;

        private c(String str) {
            this.f114750a = str;
        }

        public String toString() {
            return this.f114750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f114751b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f114752c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f114753d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f114754e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f114755a;

        private d(String str) {
            this.f114755a = str;
        }

        public String toString() {
            return this.f114755a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f114738b;
    }

    public c c() {
        return this.f114740d;
    }

    public int d() {
        return this.f114737a;
    }

    public int e() {
        d dVar = this.f114739c;
        if (dVar == d.f114754e) {
            return b();
        }
        if (dVar != d.f114751b && dVar != d.f114752c && dVar != d.f114753d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iB = b();
        return iB + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f114739c;
    }

    public boolean g() {
        return this.f114739c != d.f114754e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f114737a), Integer.valueOf(this.f114738b), this.f114739c, this.f114740d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f114739c + ", hashType: " + this.f114740d + ", " + this.f114738b + "-byte tags, and " + this.f114737a + "-byte key)";
    }

    private l(int i11, int i12, d dVar, c cVar) {
        this.f114737a = i11;
        this.f114738b = i12;
        this.f114739c = dVar;
        this.f114740d = cVar;
    }
}
