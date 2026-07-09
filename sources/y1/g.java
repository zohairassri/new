package y1;

import y1.e;
import z3.t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f139775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f139776c;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f139777a;

        public a(float f11) {
            this.f139777a = f11;
        }

        @Override // y1.e.b
        public int a(int i11, int i12, t tVar) {
            float f11;
            float f12 = (i12 - i11) / 2.0f;
            if (tVar == t.f141755a) {
                f11 = this.f139777a;
            } else {
                f11 = this.f139777a * (-1);
            }
            return Math.round(f12 * (1 + f11));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f139777a, ((a) obj).f139777a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f139777a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f139777a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class b implements e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f139778a;

        public b(float f11) {
            this.f139778a = f11;
        }

        @Override // y1.e.c
        public int a(int i11, int i12) {
            return Math.round(((i12 - i11) / 2.0f) * (1 + this.f139778a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f139778a, ((b) obj).f139778a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f139778a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f139778a + ')';
        }
    }

    public g(float f11, float f12) {
        this.f139775b = f11;
        this.f139776c = f12;
    }

    @Override // y1.e
    public long a(long j11, long j12, t tVar) {
        float f11 = (((int) (j12 >> 32)) - ((int) (j11 >> 32))) / 2.0f;
        float f12 = (((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f;
        float f13 = 1;
        return z3.n.f((((long) Math.round(f12 * (f13 + this.f139776c))) & 4294967295L) | (((long) Math.round(f11 * ((tVar == t.f141755a ? this.f139775b : (-1) * this.f139775b) + f13))) << 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f139775b, gVar.f139775b) == 0 && Float.compare(this.f139776c, gVar.f139776c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f139775b) * 31) + Float.hashCode(this.f139776c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f139775b + ", verticalBias=" + this.f139776c + ')';
    }
}
