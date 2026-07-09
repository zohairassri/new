package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10041c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f10042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10044c;

        public n1 d() {
            return new n1(this);
        }

        public b e(long j11) {
            k6.a.a(j11 >= 0 || j11 == -9223372036854775807L);
            this.f10044c = j11;
            return this;
        }

        public b f(long j11) {
            this.f10042a = j11;
            return this;
        }

        public b g(float f11) {
            k6.a.a(f11 > 0.0f || f11 == -3.4028235E38f);
            this.f10043b = f11;
            return this;
        }

        public b() {
            this.f10042a = -9223372036854775807L;
            this.f10043b = -3.4028235E38f;
            this.f10044c = -9223372036854775807L;
        }

        private b(n1 n1Var) {
            this.f10042a = n1Var.f10039a;
            this.f10043b = n1Var.f10040b;
            this.f10044c = n1Var.f10041c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f10039a == n1Var.f10039a && this.f10040b == n1Var.f10040b && this.f10041c == n1Var.f10041c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f10039a), Float.valueOf(this.f10040b), Long.valueOf(this.f10041c));
    }

    private n1(b bVar) {
        this.f10039a = bVar.f10042a;
        this.f10040b = bVar.f10043b;
        this.f10041c = bVar.f10044c;
    }
}
