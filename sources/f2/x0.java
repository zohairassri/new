package f2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f93451b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f93452c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f93453d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f93454e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f93455f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f93456g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f93457a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return x0.f93453d;
        }

        public final int b() {
            return x0.f93452c;
        }

        public final int c() {
            return x0.f93455f;
        }

        public final int d() {
            return x0.f93456g;
        }

        public final int e() {
            return x0.f93454e;
        }

        private a() {
        }
    }

    private /* synthetic */ x0(int i11) {
        this.f93457a = i11;
    }

    public static final /* synthetic */ x0 f(int i11) {
        return new x0(i11);
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof x0) && i11 == ((x0) obj).l();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        return i(i11, f93452c) ? "Argb8888" : i(i11, f93453d) ? "Alpha8" : i(i11, f93454e) ? "Rgb565" : i(i11, f93455f) ? "F16" : i(i11, f93456g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f93457a, obj);
    }

    public int hashCode() {
        return j(this.f93457a);
    }

    public final /* synthetic */ int l() {
        return this.f93457a;
    }

    public String toString() {
        return k(this.f93457a);
    }

    public static int g(int i11) {
        return i11;
    }
}
