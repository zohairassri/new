package l7;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public interface j0 {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f113525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f113526b;

        public a(k0 k0Var) {
            this(k0Var, k0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f113525a.equals(aVar.f113525a) && this.f113526b.equals(aVar.f113526b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f113525a.hashCode() * 31) + this.f113526b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f113525a);
            if (this.f113525a.equals(this.f113526b)) {
                str = "";
            } else {
                str = ", " + this.f113526b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(k0 k0Var, k0 k0Var2) {
            this.f113525a = (k0) k6.a.e(k0Var);
            this.f113526b = (k0) k6.a.e(k0Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f113527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f113528b;

        public b(long j11) {
            this(j11, 0L);
        }

        @Override // l7.j0
        public a c(long j11) {
            return this.f113528b;
        }

        @Override // l7.j0
        public boolean e() {
            return false;
        }

        @Override // l7.j0
        public long f() {
            return this.f113527a;
        }

        public b(long j11, long j12) {
            this.f113527a = j11;
            this.f113528b = new a(j12 == 0 ? k0.f113529c : new k0(0L, j12));
        }
    }

    a c(long j11);

    boolean e();

    long f();
}
