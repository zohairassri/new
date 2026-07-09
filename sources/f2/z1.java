package f2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93469a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f93470b = e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f93471c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f93472d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f93473e = e(3);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return z1.f93470b;
        }

        public final int b() {
            return z1.f93473e;
        }

        public final int c() {
            return z1.f93472d;
        }

        public final int d() {
            return z1.f93471c;
        }

        private a() {
        }
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f93470b) ? "Clamp" : f(i11, f93471c) ? "Repeated" : f(i11, f93472d) ? "Mirror" : f(i11, f93473e) ? "Decal" : "Unknown";
    }

    public static int e(int i11) {
        return i11;
    }
}
