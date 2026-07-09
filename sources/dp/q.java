package dp;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class q extends dp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f90165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f90166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f90167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f90168d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f90169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f90170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f90171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f90172d;

        public q a() throws GeneralSecurityException {
            Integer num = this.f90169a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f90172d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f90170b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f90171c != null) {
                return new q(num.intValue(), this.f90170b.intValue(), this.f90171c.intValue(), this.f90172d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i11) throws GeneralSecurityException {
            if (i11 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i11)));
            }
            this.f90170b = Integer.valueOf(i11);
            return this;
        }

        public b c(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f90169a = Integer.valueOf(i11);
            return this;
        }

        public b d(int i11) throws GeneralSecurityException {
            if (i11 != 12 && i11 != 13 && i11 != 14 && i11 != 15 && i11 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i11)));
            }
            this.f90171c = Integer.valueOf(i11);
            return this;
        }

        public b e(c cVar) {
            this.f90172d = cVar;
            return this;
        }

        private b() {
            this.f90169a = null;
            this.f90170b = null;
            this.f90171c = null;
            this.f90172d = c.f90175d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f90173b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f90174c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f90175d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f90176a;

        private c(String str) {
            this.f90176a = str;
        }

        public String toString() {
            return this.f90176a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f90166b;
    }

    public int c() {
        return this.f90165a;
    }

    public int d() {
        return this.f90167c;
    }

    public c e() {
        return this.f90168d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f90168d != c.f90175d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f90165a), Integer.valueOf(this.f90166b), Integer.valueOf(this.f90167c), this.f90168d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f90168d + ", " + this.f90166b + "-byte IV, " + this.f90167c + "-byte tag, and " + this.f90165a + "-byte key)";
    }

    private q(int i11, int i12, int i13, c cVar) {
        this.f90165a = i11;
        this.f90166b = i12;
        this.f90167c = i13;
        this.f90168d = cVar;
    }
}
