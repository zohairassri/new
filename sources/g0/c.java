package g0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f95311a;

    private /* synthetic */ c(long j11) {
        this.f95311a = j11;
    }

    public static final /* synthetic */ c a(long j11) {
        return new c(j11);
    }

    public static boolean c(long j11, Object obj) {
        return (obj instanceof c) && j11 == ((c) obj).g();
    }

    public static final int d(long j11) {
        return (int) j11;
    }

    public static int e(long j11) {
        return Long.hashCode(j11);
    }

    public static String f(long j11) {
        return "GridItemSpan(packedValue=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f95311a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f95311a;
    }

    public int hashCode() {
        return e(this.f95311a);
    }

    public String toString() {
        return f(this.f95311a);
    }

    public static long b(long j11) {
        return j11;
    }
}
