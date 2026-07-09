package r2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f123520a;

    private /* synthetic */ j0(int i11) {
        this.f123520a = i11;
    }

    public static final /* synthetic */ j0 a(int i11) {
        return new j0(i11);
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof j0) && i11 == ((j0) obj).f();
    }

    public static int d(int i11) {
        return Integer.hashCode(i11);
    }

    public static String e(int i11) {
        return "PointerKeyboardModifiers(packedValue=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f123520a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f123520a;
    }

    public int hashCode() {
        return d(this.f123520a);
    }

    public String toString() {
        return e(this.f123520a);
    }

    public static int b(int i11) {
        return i11;
    }
}
