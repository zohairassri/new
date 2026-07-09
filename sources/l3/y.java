package l3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f113204b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f113205c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f113206d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f113207a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return y.f113206d;
        }

        public final int b() {
            return y.f113205c;
        }

        private a() {
        }
    }

    private /* synthetic */ y(int i11) {
        this.f113207a = i11;
    }

    public static final /* synthetic */ y c(int i11) {
        return new y(i11);
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof y) && i11 == ((y) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f113205c) ? "Normal" : f(i11, f113206d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f113207a, obj);
    }

    public int hashCode() {
        return g(this.f113207a);
    }

    public final /* synthetic */ int i() {
        return this.f113207a;
    }

    public String toString() {
        return h(this.f113207a);
    }

    public static int d(int i11) {
        return i11;
    }
}
