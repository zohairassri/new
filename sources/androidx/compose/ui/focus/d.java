package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5050b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f5051c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5052d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f5053e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f5054f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f5055g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f5056h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f5057i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f5058j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5059a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f5056h;
        }

        public final int b() {
            return d.f5057i;
        }

        public final int c() {
            return d.f5058j;
        }

        public final int d() {
            return d.f5053e;
        }

        public final int e() {
            return d.f5051c;
        }

        public final int f() {
            return d.f5052d;
        }

        public final int g() {
            return d.f5054f;
        }

        public final int h() {
            return d.f5055g;
        }

        private a() {
        }
    }

    private /* synthetic */ d(int i11) {
        this.f5059a = i11;
    }

    public static final /* synthetic */ d i(int i11) {
        return new d(i11);
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof d) && i11 == ((d) obj).o();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return Integer.hashCode(i11);
    }

    public static String n(int i11) {
        return l(i11, f5051c) ? "Next" : l(i11, f5052d) ? "Previous" : l(i11, f5053e) ? "Left" : l(i11, f5054f) ? "Right" : l(i11, f5055g) ? "Up" : l(i11, f5056h) ? "Down" : l(i11, f5057i) ? "Enter" : l(i11, f5058j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f5059a, obj);
    }

    public int hashCode() {
        return m(this.f5059a);
    }

    public final /* synthetic */ int o() {
        return this.f5059a;
    }

    public String toString() {
        return n(this.f5059a);
    }

    public static int j(int i11) {
        return i11;
    }
}
