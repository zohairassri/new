package l0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f112888b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f112889c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f112890a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return z2.f112889c;
        }

        private a() {
        }
    }

    private /* synthetic */ z2(int i11) {
        this.f112890a = i11;
    }

    public static final /* synthetic */ z2 b(int i11) {
        return new z2(i11);
    }

    public static int d(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return c((z11 ? 1 : 0) | (z12 ? 2 : 0) | (z13 ? 4 : 0) | (z14 ? 8 : 0) | (z15 ? 16 : 0));
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof z2) && i11 == ((z2) obj).m();
    }

    public static final boolean f(int i11) {
        return (i11 & 16) == 16;
    }

    public static final boolean g(int i11) {
        return (i11 & 1) == 1;
    }

    public static final boolean h(int i11) {
        return (i11 & 4) == 4;
    }

    public static final boolean i(int i11) {
        return (i11 & 2) == 2;
    }

    public static final boolean j(int i11) {
        return (i11 & 8) == 8;
    }

    public static int k(int i11) {
        return Integer.hashCode(i11);
    }

    public static String l(int i11) {
        return "MenuItemsAvailability(value=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f112890a, obj);
    }

    public int hashCode() {
        return k(this.f112890a);
    }

    public final /* synthetic */ int m() {
        return this.f112890a;
    }

    public String toString() {
        return l(this.f112890a);
    }

    private static int c(int i11) {
        return i11;
    }
}
