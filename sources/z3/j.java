package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141734b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f141735c = b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f141736d = b(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f141737a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ j(long j11) {
        this.f141737a = j11;
    }

    public static final /* synthetic */ j a(long j11) {
        return new j(j11);
    }

    public static boolean c(long j11, Object obj) {
        return (obj instanceof j) && j11 == ((j) obj).i();
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static final float e(long j11) {
        return h.h(Float.intBitsToFloat((int) (j11 >> 32)));
    }

    public static final float f(long j11) {
        return h.h(Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public static int g(long j11) {
        return Long.hashCode(j11);
    }

    public static String h(long j11) {
        if (j11 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) h.n(e(j11))) + ", " + ((Object) h.n(f(j11))) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f141737a, obj);
    }

    public int hashCode() {
        return g(this.f141737a);
    }

    public final /* synthetic */ long i() {
        return this.f141737a;
    }

    public String toString() {
        return h(this.f141737a);
    }

    public static long b(long j11) {
        return j11;
    }
}
