package dp;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends dp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f90128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f90129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f90130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f90131d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f90132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f90133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f90134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f90135d;

        public i a() throws GeneralSecurityException {
            Integer num = this.f90132a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f90133b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f90135d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f90134c != null) {
                return new i(num.intValue(), this.f90133b.intValue(), this.f90134c.intValue(), this.f90135d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i11) throws GeneralSecurityException {
            if (i11 != 12 && i11 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i11)));
            }
            this.f90133b = Integer.valueOf(i11);
            return this;
        }

        public b c(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f90132a = Integer.valueOf(i11);
            return this;
        }

        public b d(int i11) throws GeneralSecurityException {
            if (i11 < 0 || i11 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i11)));
            }
            this.f90134c = Integer.valueOf(i11);
            return this;
        }

        public b e(c cVar) {
            this.f90135d = cVar;
            return this;
        }

        private b() {
            this.f90132a = null;
            this.f90133b = null;
            this.f90134c = null;
            this.f90135d = c.f90138d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f90136b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f90137c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f90138d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f90139a;

        private c(String str) {
            this.f90139a = str;
        }

        public String toString() {
            return this.f90139a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f90129b;
    }

    public int c() {
        return this.f90128a;
    }

    public int d() {
        return this.f90130c;
    }

    public c e() {
        return this.f90131d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.c() == c() && iVar.b() == b() && iVar.d() == d() && iVar.e() == e();
    }

    public boolean f() {
        return this.f90131d != c.f90138d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f90128a), Integer.valueOf(this.f90129b), Integer.valueOf(this.f90130c), this.f90131d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f90131d + ", " + this.f90129b + "-byte IV, " + this.f90130c + "-byte tag, and " + this.f90128a + "-byte key)";
    }

    private i(int i11, int i12, int i13, c cVar) {
        this.f90128a = i11;
        this.f90129b = i12;
        this.f90130c = i13;
        this.f90131d = cVar;
    }
}
