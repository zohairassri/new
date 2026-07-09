package s3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f125537a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f125538b = f(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f125539c = f(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f125540d = f(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f125541e = f(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f125542f = f(5);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return v.f125538b;
        }

        public final int b() {
            return v.f125539c;
        }

        public final int c() {
            return v.f125542f;
        }

        public final int d() {
            return v.f125541e;
        }

        public final int e() {
            return v.f125540d;
        }

        private a() {
        }
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return g(i11, f125538b) ? "Clip" : g(i11, f125539c) ? "Ellipsis" : g(i11, f125542f) ? "MiddleEllipsis" : g(i11, f125540d) ? "Visible" : g(i11, f125541e) ? "StartEllipsis" : "Invalid";
    }

    public static int f(int i11) {
        return i11;
    }
}
