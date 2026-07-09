package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f125506b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f125507c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125508d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125509e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f125510f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f125511g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f125512h = h(IntCompanionObject.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125513a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l.f125509e;
        }

        public final int b() {
            return l.f125510f;
        }

        public final int c() {
            return l.f125511g;
        }

        public final int d() {
            return l.f125507c;
        }

        public final int e() {
            return l.f125508d;
        }

        public final int f() {
            return l.f125512h;
        }

        private a() {
        }
    }

    private /* synthetic */ l(int i11) {
        this.f125513a = i11;
    }

    public static final /* synthetic */ l g(int i11) {
        return new l(i11);
    }

    public static boolean i(int i11, Object obj) {
        return (obj instanceof l) && i11 == ((l) obj).m();
    }

    public static final boolean j(int i11, int i12) {
        return i11 == i12;
    }

    public static int k(int i11) {
        return Integer.hashCode(i11);
    }

    public static String l(int i11) {
        return j(i11, f125507c) ? "Ltr" : j(i11, f125508d) ? "Rtl" : j(i11, f125509e) ? "Content" : j(i11, f125510f) ? "ContentOrLtr" : j(i11, f125511g) ? "ContentOrRtl" : j(i11, f125512h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f125513a, obj);
    }

    public int hashCode() {
        return k(this.f125513a);
    }

    public final /* synthetic */ int m() {
        return this.f125513a;
    }

    public String toString() {
        return l(this.f125513a);
    }

    public static int h(int i11) {
        return i11;
    }
}
