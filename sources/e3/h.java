package e3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f91133b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f91134c = k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f91135d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f91136e = k(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f91137f = k(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f91138g = k(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f91139h = k(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f91140i = k(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f91141j = k(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f91142k = k(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f91143a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return h.f91134c;
        }

        public final int b() {
            return h.f91142k;
        }

        public final int c() {
            return h.f91135d;
        }

        public final int d() {
            return h.f91140i;
        }

        public final int e() {
            return h.f91139h;
        }

        public final int f() {
            return h.f91137f;
        }

        public final int g() {
            return h.f91136e;
        }

        public final int h() {
            return h.f91138g;
        }

        public final int i() {
            return h.f91141j;
        }

        private a() {
        }
    }

    private /* synthetic */ h(int i11) {
        this.f91143a = i11;
    }

    public static final /* synthetic */ h j(int i11) {
        return new h(i11);
    }

    public static boolean l(int i11, Object obj) {
        return (obj instanceof h) && i11 == ((h) obj).p();
    }

    public static final boolean m(int i11, int i12) {
        return i11 == i12;
    }

    public static int n(int i11) {
        return Integer.hashCode(i11);
    }

    public static String o(int i11) {
        return m(i11, f91134c) ? "Button" : m(i11, f91135d) ? "Checkbox" : m(i11, f91136e) ? "Switch" : m(i11, f91137f) ? "RadioButton" : m(i11, f91138g) ? "Tab" : m(i11, f91139h) ? "Image" : m(i11, f91140i) ? "DropdownList" : m(i11, f91141j) ? "Picker" : m(i11, f91142k) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return l(this.f91143a, obj);
    }

    public int hashCode() {
        return n(this.f91143a);
    }

    public final /* synthetic */ int p() {
        return this.f91143a;
    }

    public String toString() {
        return o(this.f91143a);
    }

    private static int k(int i11) {
        return i11;
    }
}
