package h3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f99764b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f99765c = d3.a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f99766a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return c3.f99765c;
        }

        private a() {
        }
    }

    private /* synthetic */ c3(long j11) {
        this.f99766a = j11;
    }

    public static final /* synthetic */ c3 b(long j11) {
        return new c3(j11);
    }

    public static final boolean d(long j11, long j12) {
        return (l(j11) <= l(j12)) & (k(j12) <= k(j11));
    }

    public static final boolean e(long j11, int i11) {
        return i11 < k(j11) && l(j11) <= i11;
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof c3) && j11 == ((c3) obj).r();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean h(long j11) {
        return n(j11) == i(j11);
    }

    public static final int i(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static final int j(long j11) {
        return k(j11) - l(j11);
    }

    public static final int k(long j11) {
        return Math.max(n(j11), i(j11));
    }

    public static final int l(long j11) {
        return Math.min(n(j11), i(j11));
    }

    public static final boolean m(long j11) {
        return n(j11) > i(j11);
    }

    public static final int n(long j11) {
        return (int) (j11 >> 32);
    }

    public static int o(long j11) {
        return Long.hashCode(j11);
    }

    public static final boolean p(long j11, long j12) {
        return (l(j11) < k(j12)) & (l(j12) < k(j11));
    }

    public static String q(long j11) {
        return "TextRange(" + n(j11) + ", " + i(j11) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f99766a, obj);
    }

    public int hashCode() {
        return o(this.f99766a);
    }

    public final /* synthetic */ long r() {
        return this.f99766a;
    }

    public String toString() {
        return q(this.f99766a);
    }

    public static long c(long j11) {
        return j11;
    }
}
