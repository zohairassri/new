package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141752b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f141753c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f141754a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return r.f141753c;
        }

        private a() {
        }
    }

    private /* synthetic */ r(long j11) {
        this.f141754a = j11;
    }

    public static final /* synthetic */ r b(long j11) {
        return new r(j11);
    }

    public static boolean d(long j11, Object obj) {
        return (obj instanceof r) && j11 == ((r) obj).j();
    }

    public static final boolean e(long j11, long j12) {
        return j11 == j12;
    }

    public static final int f(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static final int g(long j11) {
        return (int) (j11 >> 32);
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        return ((int) (j11 >> 32)) + " x " + ((int) (j11 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return d(this.f141754a, obj);
    }

    public int hashCode() {
        return h(this.f141754a);
    }

    public final /* synthetic */ long j() {
        return this.f141754a;
    }

    public String toString() {
        return i(this.f141754a);
    }

    public static long c(long j11) {
        return j11;
    }
}
