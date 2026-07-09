package z1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f141611b;

    private /* synthetic */ e(int i11) {
        this.f141611b = i11;
    }

    public static final /* synthetic */ e a(int i11) {
        return new e(i11);
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof e) && i11 == ((e) obj).f();
    }

    public static int d(int i11) {
        return Integer.hashCode(i11);
    }

    public static String e(int i11) {
        return "AndroidContentDataType(androidAutofillType=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f141611b, obj);
    }

    public final /* synthetic */ int f() {
        return this.f141611b;
    }

    public int hashCode() {
        return d(this.f141611b);
    }

    public String toString() {
        return e(this.f141611b);
    }

    public static int b(int i11) {
        return i11;
    }
}
