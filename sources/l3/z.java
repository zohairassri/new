package l3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f113210b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f113211c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f113212d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f113213e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f113214f = f(Settings.DEFAULT_INITIAL_WINDOW_SIZE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f113215a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return z.f113214f;
        }

        public final int b() {
            return z.f113211c;
        }

        public final int c() {
            return z.f113213e;
        }

        public final int d() {
            return z.f113212d;
        }

        private a() {
        }
    }

    private /* synthetic */ z(int i11) {
        this.f113215a = i11;
    }

    public static final /* synthetic */ z e(int i11) {
        return new z(i11);
    }

    public static boolean g(int i11, Object obj) {
        return (obj instanceof z) && i11 == ((z) obj).m();
    }

    public static final boolean h(int i11, int i12) {
        return i11 == i12;
    }

    public static int i(int i11) {
        return Integer.hashCode(i11);
    }

    public static final boolean j(int i11) {
        return (i11 & 2) != 0;
    }

    public static final boolean k(int i11) {
        return (i11 & 1) != 0;
    }

    public static String l(int i11) {
        return h(i11, f113211c) ? "None" : h(i11, f113212d) ? "Weight" : h(i11, f113213e) ? "Style" : h(i11, f113214f) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f113215a, obj);
    }

    public int hashCode() {
        return i(this.f113215a);
    }

    public final /* synthetic */ int m() {
        return this.f113215a;
    }

    public String toString() {
        return l(this.f113215a);
    }

    public static int f(int i11) {
        return i11;
    }
}
