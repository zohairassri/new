package z3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f141764b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f141765c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f141766d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f141767e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f141768a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return x.f141767e;
        }

        public final long b() {
            return x.f141766d;
        }

        public final long c() {
            return x.f141765c;
        }

        private a() {
        }
    }

    private /* synthetic */ x(long j11) {
        this.f141768a = j11;
    }

    public static final /* synthetic */ x d(long j11) {
        return new x(j11);
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof x) && j11 == ((x) obj).j();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    public static int h(long j11) {
        return Long.hashCode(j11);
    }

    public static String i(long j11) {
        return g(j11, f141765c) ? "Unspecified" : g(j11, f141766d) ? "Sp" : g(j11, f141767e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f141768a, obj);
    }

    public int hashCode() {
        return h(this.f141768a);
    }

    public final /* synthetic */ long j() {
        return this.f141768a;
    }

    public String toString() {
        return i(this.f141768a);
    }

    public static long e(long j11) {
        return j11;
    }
}
