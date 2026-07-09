package m3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f115756b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f115757c = g(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f115758d = g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f115759e = g(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f115760f = g(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f115761g = g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f115762a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return y.f115759e;
        }

        public final int b() {
            return y.f115758d;
        }

        public final int c() {
            return y.f115761g;
        }

        public final int d() {
            return y.f115757c;
        }

        public final int e() {
            return y.f115760f;
        }

        private a() {
        }
    }

    private /* synthetic */ y(int i11) {
        this.f115762a = i11;
    }

    public static final /* synthetic */ y f(int i11) {
        return new y(i11);
    }

    public static boolean h(int i11, Object obj) {
        return (obj instanceof y) && i11 == ((y) obj).l();
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        return i(i11, f115757c) ? "Unspecified" : i(i11, f115758d) ? "None" : i(i11, f115759e) ? "Characters" : i(i11, f115760f) ? "Words" : i(i11, f115761g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f115762a, obj);
    }

    public int hashCode() {
        return j(this.f115762a);
    }

    public final /* synthetic */ int l() {
        return this.f115762a;
    }

    public String toString() {
        return k(this.f115762a);
    }

    private static int g(int i11) {
        return i11;
    }
}
