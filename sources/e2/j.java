package e2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f90931i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final j f90932j = k.c(0.0f, 0.0f, 0.0f, 0.0f, e2.a.f90914a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f90933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f90934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f90935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f90936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f90937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f90938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f90939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f90940h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ j(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, j11, j12, j13, j14);
    }

    public final float a() {
        return this.f90936d;
    }

    public final long b() {
        return this.f90940h;
    }

    public final long c() {
        return this.f90939g;
    }

    public final float d() {
        return this.f90936d - this.f90934b;
    }

    public final float e() {
        return this.f90933a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f90933a, jVar.f90933a) == 0 && Float.compare(this.f90934b, jVar.f90934b) == 0 && Float.compare(this.f90935c, jVar.f90935c) == 0 && Float.compare(this.f90936d, jVar.f90936d) == 0 && e2.a.c(this.f90937e, jVar.f90937e) && e2.a.c(this.f90938f, jVar.f90938f) && e2.a.c(this.f90939g, jVar.f90939g) && e2.a.c(this.f90940h, jVar.f90940h);
    }

    public final float f() {
        return this.f90935c;
    }

    public final float g() {
        return this.f90934b;
    }

    public final long h() {
        return this.f90937e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f90933a) * 31) + Float.hashCode(this.f90934b)) * 31) + Float.hashCode(this.f90935c)) * 31) + Float.hashCode(this.f90936d)) * 31) + e2.a.d(this.f90937e)) * 31) + e2.a.d(this.f90938f)) * 31) + e2.a.d(this.f90939g)) * 31) + e2.a.d(this.f90940h);
    }

    public final long i() {
        return this.f90938f;
    }

    public final float j() {
        return this.f90935c - this.f90933a;
    }

    public String toString() {
        long j11 = this.f90937e;
        long j12 = this.f90938f;
        long j13 = this.f90939g;
        long j14 = this.f90940h;
        String str = c.a(this.f90933a, 1) + ", " + c.a(this.f90934b, 1) + ", " + c.a(this.f90935c, 1) + ", " + c.a(this.f90936d, 1);
        if (!e2.a.c(j11, j12) || !e2.a.c(j12, j13) || !e2.a.c(j13, j14)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) e2.a.e(j11)) + ", topRight=" + ((Object) e2.a.e(j12)) + ", bottomRight=" + ((Object) e2.a.e(j13)) + ", bottomLeft=" + ((Object) e2.a.e(j14)) + ')';
        }
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(Float.intBitsToFloat(i11), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(Float.intBitsToFloat(i11), 1) + ", y=" + c.a(Float.intBitsToFloat(i12), 1) + ')';
    }

    private j(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14) {
        this.f90933a = f11;
        this.f90934b = f12;
        this.f90935c = f13;
        this.f90936d = f14;
        this.f90937e = j11;
        this.f90938f = j12;
        this.f90939g = j13;
        this.f90940h = j14;
    }
}
