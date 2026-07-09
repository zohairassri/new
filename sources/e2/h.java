package e2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f90925e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f90926f = new h(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f90927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f90928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f90929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f90930d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f90926f;
        }

        private a() {
        }
    }

    public h(float f11, float f12, float f13, float f14) {
        this.f90927a = f11;
        this.f90928b = f12;
        this.f90929c = f13;
        this.f90930d = f14;
    }

    public static /* synthetic */ h d(h hVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = hVar.f90927a;
        }
        if ((i11 & 2) != 0) {
            f12 = hVar.f90928b;
        }
        if ((i11 & 4) != 0) {
            f13 = hVar.f90929c;
        }
        if ((i11 & 8) != 0) {
            f14 = hVar.f90930d;
        }
        return hVar.c(f11, f12, f13, f14);
    }

    public final boolean b(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (fIntBitsToFloat >= this.f90927a) & (fIntBitsToFloat < this.f90929c) & (fIntBitsToFloat2 >= this.f90928b) & (fIntBitsToFloat2 < this.f90930d);
    }

    public final h c(float f11, float f12, float f13, float f14) {
        return new h(f11, f12, f13, f14);
    }

    public final float e() {
        return this.f90930d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f90927a, hVar.f90927a) == 0 && Float.compare(this.f90928b, hVar.f90928b) == 0 && Float.compare(this.f90929c, hVar.f90929c) == 0 && Float.compare(this.f90930d, hVar.f90930d) == 0;
    }

    public final long f() {
        float f11 = this.f90927a;
        float f12 = this.f90930d;
        return f.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public final long g() {
        float f11 = this.f90929c;
        float f12 = this.f90930d;
        return f.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public final long h() {
        float fK = this.f90927a + ((k() - j()) / 2.0f);
        return f.e((((long) Float.floatToRawIntBits(this.f90928b + ((e() - m()) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fK) << 32));
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f90927a) * 31) + Float.hashCode(this.f90928b)) * 31) + Float.hashCode(this.f90929c)) * 31) + Float.hashCode(this.f90930d);
    }

    public final float i() {
        return e() - m();
    }

    public final float j() {
        return this.f90927a;
    }

    public final float k() {
        return this.f90929c;
    }

    public final long l() {
        float fK = k() - j();
        return l.d((((long) Float.floatToRawIntBits(e() - m())) & 4294967295L) | (Float.floatToRawIntBits(fK) << 32));
    }

    public final float m() {
        return this.f90928b;
    }

    public final long n() {
        float f11 = this.f90927a;
        float f12 = this.f90928b;
        return f.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public final long o() {
        float f11 = this.f90929c;
        float f12 = this.f90928b;
        return f.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public final float p() {
        return k() - j();
    }

    public final h q(float f11, float f12, float f13, float f14) {
        return new h(Math.max(this.f90927a, f11), Math.max(this.f90928b, f12), Math.min(this.f90929c, f13), Math.min(this.f90930d, f14));
    }

    public final h r(h hVar) {
        return new h(Math.max(this.f90927a, hVar.f90927a), Math.max(this.f90928b, hVar.f90928b), Math.min(this.f90929c, hVar.f90929c), Math.min(this.f90930d, hVar.f90930d));
    }

    public final boolean s() {
        return (this.f90927a >= this.f90929c) | (this.f90928b >= this.f90930d);
    }

    public final boolean t(h hVar) {
        return (this.f90927a < hVar.f90929c) & (hVar.f90927a < this.f90929c) & (this.f90928b < hVar.f90930d) & (hVar.f90928b < this.f90930d);
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f90927a, 1) + ", " + c.a(this.f90928b, 1) + ", " + c.a(this.f90929c, 1) + ", " + c.a(this.f90930d, 1) + ')';
    }

    public final h u(float f11, float f12) {
        return new h(this.f90927a + f11, this.f90928b + f12, this.f90929c + f11, this.f90930d + f12);
    }

    public final h v(long j11) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return new h(this.f90927a + Float.intBitsToFloat(i11), this.f90928b + Float.intBitsToFloat(i12), this.f90929c + Float.intBitsToFloat(i11), this.f90930d + Float.intBitsToFloat(i12));
    }
}
