package dp;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f90140a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f90141b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f90142c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f90143d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f90144a;

        private a(String str) {
            this.f90144a = str;
        }

        public String toString() {
            return this.f90144a;
        }
    }

    private i0(a aVar) {
        this.f90140a = aVar;
    }

    public static i0 a(a aVar) {
        return new i0(aVar);
    }

    public a b() {
        return this.f90140a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f90140a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f90140a + ")";
    }
}
