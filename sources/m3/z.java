package m3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f115763b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f115764c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f115765d = l(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f115766e = l(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f115767f = l(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f115768g = l(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f115769h = l(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f115770i = l(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f115771j = l(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f115772k = l(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f115773l = l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f115774a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return z.f115766e;
        }

        public final int b() {
            return z.f115773l;
        }

        public final int c() {
            return z.f115770i;
        }

        public final int d() {
            return z.f115767f;
        }

        public final int e() {
            return z.f115772k;
        }

        public final int f() {
            return z.f115771j;
        }

        public final int g() {
            return z.f115768g;
        }

        public final int h() {
            return z.f115765d;
        }

        public final int i() {
            return z.f115764c;
        }

        public final int j() {
            return z.f115769h;
        }

        private a() {
        }
    }

    private /* synthetic */ z(int i11) {
        this.f115774a = i11;
    }

    public static final /* synthetic */ z k(int i11) {
        return new z(i11);
    }

    public static boolean m(int i11, Object obj) {
        return (obj instanceof z) && i11 == ((z) obj).q();
    }

    public static final boolean n(int i11, int i12) {
        return i11 == i12;
    }

    public static int o(int i11) {
        return Integer.hashCode(i11);
    }

    public static String p(int i11) {
        return n(i11, f115764c) ? "Unspecified" : n(i11, f115765d) ? "Text" : n(i11, f115766e) ? "Ascii" : n(i11, f115767f) ? "Number" : n(i11, f115768g) ? "Phone" : n(i11, f115769h) ? "Uri" : n(i11, f115770i) ? "Email" : n(i11, f115771j) ? "Password" : n(i11, f115772k) ? "NumberPassword" : n(i11, f115773l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f115774a, obj);
    }

    public int hashCode() {
        return o(this.f115774a);
    }

    public final /* synthetic */ int q() {
        return this.f115774a;
    }

    public String toString() {
        return p(this.f115774a);
    }

    private static int l(int i11) {
        return i11;
    }
}
