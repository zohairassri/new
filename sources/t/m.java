package t;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f127579a;

    private /* synthetic */ m(long j11) {
        this.f127579a = j11;
    }

    public static final /* synthetic */ m a(long j11) {
        return new m(j11);
    }

    public static long b(int i11, int i12) {
        return c((((long) i12) & 4294967295L) | (((long) i11) << 32));
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof m) && j11 == ((m) obj).i();
    }

    public static final int e(long j11) {
        return (int) (j11 >> 32);
    }

    public static final int f(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static int g(long j11) {
        return Long.hashCode(j11);
    }

    public static String h(long j11) {
        return '(' + e(j11) + ", " + f(j11) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f127579a, obj);
    }

    public int hashCode() {
        return g(this.f127579a);
    }

    public final /* synthetic */ long i() {
        return this.f127579a;
    }

    public String toString() {
        return h(this.f127579a);
    }

    public static long c(long j11) {
        return j11;
    }
}
