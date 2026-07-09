package e2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f90920b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f90921c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f90922d = e(9187343241974906880L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f90923e = e(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f90924a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return f.f90922d;
        }

        public final long b() {
            return f.f90923e;
        }

        public final long c() {
            return f.f90921c;
        }

        private a() {
        }
    }

    private /* synthetic */ f(long j11) {
        this.f90924a = j11;
    }

    public static final /* synthetic */ f d(long j11) {
        return new f(j11);
    }

    public static final long f(long j11, float f11, float f12) {
        return e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L));
    }

    public static /* synthetic */ long g(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return f(j11, f11, f12);
    }

    public static final long h(long j11, float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f11;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f11;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static boolean i(long j11, Object obj) {
        return (obj instanceof f) && j11 == ((f) obj).t();
    }

    public static final boolean j(long j11, long j12) {
        return j11 == j12;
    }

    public static final float k(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final float l(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    public static final float m(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float n(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static int o(long j11) {
        return Long.hashCode(j11);
    }

    public static final long p(long j11, long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long q(long j11, long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static final long r(long j11, float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    public static String s(long j11) {
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(Float.intBitsToFloat((int) (j11 >> 32)), 1) + ", " + c.a(Float.intBitsToFloat((int) (j11 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f90924a, obj);
    }

    public int hashCode() {
        return o(this.f90924a);
    }

    public final /* synthetic */ long t() {
        return this.f90924a;
    }

    public String toString() {
        return s(this.f90924a);
    }

    public static long e(long j11) {
        return j11;
    }
}
