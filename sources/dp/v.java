package dp;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class v extends dp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f90191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f90192b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f90193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f90194b;

        public v a() throws GeneralSecurityException {
            Integer num = this.f90193a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f90194b != null) {
                return new v(num.intValue(), this.f90194b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f90193a = Integer.valueOf(i11);
            return this;
        }

        public b c(c cVar) {
            this.f90194b = cVar;
            return this;
        }

        private b() {
            this.f90193a = null;
            this.f90194b = c.f90197d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f90195b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f90196c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f90197d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f90198a;

        private c(String str) {
            this.f90198a = str;
        }

        public String toString() {
            return this.f90198a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f90191a;
    }

    public c c() {
        return this.f90192b;
    }

    public boolean d() {
        return this.f90192b != c.f90197d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f90191a), this.f90192b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f90192b + ", " + this.f90191a + "-byte key)";
    }

    private v(int i11, c cVar) {
        this.f90191a = i11;
        this.f90192b = cVar;
    }
}
