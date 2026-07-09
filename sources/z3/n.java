package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141742b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f141743c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f141744d = f(9223372034707292159L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f141745a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f141744d;
        }

        public final long b() {
            return n.f141743c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(long j11) {
        this.f141745a = j11;
    }

    public static final /* synthetic */ n c(long j11) {
        return new n(j11);
    }

    public static final int d(long j11) {
        return k(j11);
    }

    public static final int e(long j11) {
        return l(j11);
    }

    public static final long g(long j11, int i11, int i12) {
        return f((((long) i11) << 32) | (((long) i12) & 4294967295L));
    }

    public static /* synthetic */ long h(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = (int) (j11 >> 32);
        }
        if ((i13 & 2) != 0) {
            i12 = (int) (4294967295L & j11);
        }
        return g(j11, i11, i12);
    }

    public static boolean i(long j11, Object obj) {
        return (obj instanceof n) && j11 == ((n) obj).r();
    }

    public static final boolean j(long j11, long j12) {
        return j11 == j12;
    }

    public static final int k(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int l(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static int m(long j11) {
        return Long.hashCode(j11);
    }

    public static final long n(long j11, long j12) {
        return f((((long) (((int) (j11 >> 32)) - ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L)))) & 4294967295L));
    }

    public static final long o(long j11, long j12) {
        return f((((long) (((int) (j11 >> 32)) + ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L)))) & 4294967295L));
    }

    public static String p(long j11) {
        return '(' + k(j11) + ", " + l(j11) + ')';
    }

    public static final long q(long j11) {
        int i11 = -((int) (j11 >> 32));
        return f((((long) (-((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) i11) << 32));
    }

    public boolean equals(Object obj) {
        return i(this.f141745a, obj);
    }

    public int hashCode() {
        return m(this.f141745a);
    }

    public final /* synthetic */ long r() {
        return this.f141745a;
    }

    public String toString() {
        return p(this.f141745a);
    }

    public static long f(long j11) {
        return j11;
    }
}
