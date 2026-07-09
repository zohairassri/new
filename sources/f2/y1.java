package f2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93464a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f93465b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f93466c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f93467d = d(2);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return y1.f93467d;
        }

        public final int b() {
            return y1.f93465b;
        }

        public final int c() {
            return y1.f93466c;
        }

        private a() {
        }
    }

    public static final boolean e(int i11, int i12) {
        return i11 == i12;
    }

    public static int f(int i11) {
        return Integer.hashCode(i11);
    }

    public static String g(int i11) {
        return e(i11, f93465b) ? "Miter" : e(i11, f93466c) ? "Round" : e(i11, f93467d) ? "Bevel" : "Unknown";
    }

    public static int d(int i11) {
        return i11;
    }
}
