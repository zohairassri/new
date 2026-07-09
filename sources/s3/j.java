package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f125492b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f125493c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125494d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125495e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f125496f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f125497g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f125498h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f125499i = i(IntCompanionObject.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f125500a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f125495e;
        }

        public final int b() {
            return j.f125498h;
        }

        public final int c() {
            return j.f125496f;
        }

        public final int d() {
            return j.f125493c;
        }

        public final int e() {
            return j.f125494d;
        }

        public final int f() {
            return j.f125497g;
        }

        public final int g() {
            return j.f125499i;
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i11) {
        this.f125500a = i11;
    }

    public static final /* synthetic */ j h(int i11) {
        return new j(i11);
    }

    public static boolean j(int i11, Object obj) {
        return (obj instanceof j) && i11 == ((j) obj).n();
    }

    public static final boolean k(int i11, int i12) {
        return i11 == i12;
    }

    public static int l(int i11) {
        return Integer.hashCode(i11);
    }

    public static String m(int i11) {
        return k(i11, f125493c) ? "Left" : k(i11, f125494d) ? "Right" : k(i11, f125495e) ? "Center" : k(i11, f125496f) ? "Justify" : k(i11, f125497g) ? "Start" : k(i11, f125498h) ? "End" : k(i11, f125499i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f125500a, obj);
    }

    public int hashCode() {
        return l(this.f125500a);
    }

    public final /* synthetic */ int n() {
        return this.f125500a;
    }

    public String toString() {
        return m(this.f125500a);
    }

    public static int i(int i11) {
        return i11;
    }
}
