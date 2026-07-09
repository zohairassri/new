package m3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f115702b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f115703c = k(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f115704d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f115705e = k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f115706f = k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f115707g = k(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f115708h = k(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f115709i = k(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f115710j = k(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f115711k = k(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f115712a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s.f115704d;
        }

        public final int b() {
            return s.f115711k;
        }

        public final int c() {
            return s.f115706f;
        }

        public final int d() {
            return s.f115710j;
        }

        public final int e() {
            return s.f115705e;
        }

        public final int f() {
            return s.f115709i;
        }

        public final int g() {
            return s.f115707g;
        }

        public final int h() {
            return s.f115708h;
        }

        public final int i() {
            return s.f115703c;
        }

        private a() {
        }
    }

    private /* synthetic */ s(int i11) {
        this.f115712a = i11;
    }

    public static final /* synthetic */ s j(int i11) {
        return new s(i11);
    }

    public static boolean l(int i11, Object obj) {
        return (obj instanceof s) && i11 == ((s) obj).p();
    }

    public static final boolean m(int i11, int i12) {
        return i11 == i12;
    }

    public static int n(int i11) {
        return Integer.hashCode(i11);
    }

    public static String o(int i11) {
        return m(i11, f115703c) ? "Unspecified" : m(i11, f115705e) ? "None" : m(i11, f115704d) ? "Default" : m(i11, f115706f) ? "Go" : m(i11, f115707g) ? "Search" : m(i11, f115708h) ? "Send" : m(i11, f115709i) ? "Previous" : m(i11, f115710j) ? "Next" : m(i11, f115711k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f115712a, obj);
    }

    public int hashCode() {
        return n(this.f115712a);
    }

    public final /* synthetic */ int p() {
        return this.f115712a;
    }

    public String toString() {
        return o(this.f115712a);
    }

    private static int k(int i11) {
        return i11;
    }
}
