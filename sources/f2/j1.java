package f2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93399a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f93400b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f93401c = c(1);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j1.f93401c;
        }

        public final int b() {
            return j1.f93400b;
        }

        private a() {
        }
    }

    public static final boolean d(int i11, int i12) {
        return i11 == i12;
    }

    public static int e(int i11) {
        return Integer.hashCode(i11);
    }

    public static int c(int i11) {
        return i11;
    }
}
