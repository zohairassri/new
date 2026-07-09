package e2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f90941b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f90942c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f90943d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f90944a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return l.f90943d;
        }

        public final long b() {
            return l.f90942c;
        }

        private a() {
        }
    }

    private /* synthetic */ l(long j11) {
        this.f90944a = j11;
    }

    public static final /* synthetic */ l c(long j11) {
        return new l(j11);
    }

    public static boolean e(long j11, Object obj) {
        return (obj instanceof l) && j11 == ((l) obj).n();
    }

    public static final boolean f(long j11, long j12) {
        return j11 == j12;
    }

    public static final float g(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public static final float h(long j11) {
        return Math.max(Float.intBitsToFloat((int) ((j11 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j11 & 2147483647L)));
    }

    public static final float i(long j11) {
        return Math.min(Float.intBitsToFloat((int) ((j11 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j11 & 2147483647L)));
    }

    public static final float j(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static int k(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean l(long j11) {
        return (j11 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j11 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j11 & 4294967295L)) <= 0.0f);
    }

    public static String m(long j11) {
        if (j11 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(Float.intBitsToFloat((int) (j11 >> 32)), 1) + ", " + c.a(Float.intBitsToFloat((int) (j11 & 4294967295L)), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f90944a, obj);
    }

    public int hashCode() {
        return k(this.f90944a);
    }

    public final /* synthetic */ long n() {
        return this.f90944a;
    }

    public String toString() {
        return m(this.f90944a);
    }

    public static long d(long j11) {
        return j11;
    }
}
