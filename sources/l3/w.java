package l3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f113193a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f113194b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f113195c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f113196d = d(2);

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w.f113196d;
        }

        public final int b() {
            return w.f113194b;
        }

        public final int c() {
            return w.f113195c;
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
        if (e(i11, f113194b)) {
            return "Blocking";
        }
        if (e(i11, f113195c)) {
            return "Optional";
        }
        if (e(i11, f113196d)) {
            return "Async";
        }
        return "Invalid(value=" + i11 + ')';
    }

    private static int d(int i11) {
        return i11;
    }
}
