package n2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1461a f117248b = new C1461a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f117249c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f117250d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f117251a;

    /* JADX INFO: renamed from: n2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C1461a {
        public /* synthetic */ C1461a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f117250d;
        }

        public final int b() {
            return a.f117249c;
        }

        private C1461a() {
        }
    }

    private /* synthetic */ a(int i11) {
        this.f117251a = i11;
    }

    public static final /* synthetic */ a c(int i11) {
        return new a(i11);
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof a) && i11 == ((a) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f117249c) ? "Touch" : f(i11, f117250d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f117251a, obj);
    }

    public int hashCode() {
        return g(this.f117251a);
    }

    public final /* synthetic */ int i() {
        return this.f117251a;
    }

    public String toString() {
        return h(this.f117251a);
    }

    public static int d(int i11) {
        return i11;
    }
}
