package ck;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public interface z {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f17891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f17892b;

        public a(a0 a0Var) {
            this(a0Var, a0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f17891a.equals(aVar.f17891a) && this.f17892b.equals(aVar.f17892b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f17891a.hashCode() * 31) + this.f17892b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f17891a);
            if (this.f17891a.equals(this.f17892b)) {
                str = "";
            } else {
                str = ", " + this.f17892b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(a0 a0Var, a0 a0Var2) {
            this.f17891a = (a0) ml.a.e(a0Var);
            this.f17892b = (a0) ml.a.e(a0Var2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f17893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f17894b;

        public b(long j11) {
            this(j11, 0L);
        }

        @Override // ck.z
        public a c(long j11) {
            return this.f17894b;
        }

        @Override // ck.z
        public boolean e() {
            return false;
        }

        @Override // ck.z
        public long f() {
            return this.f17893a;
        }

        public b(long j11, long j12) {
            this.f17893a = j11;
            this.f17894b = new a(j12 == 0 ? a0.f17782c : new a0(0L, j12));
        }
    }

    a c(long j11);

    boolean e();

    long f();
}
