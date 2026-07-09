package w9;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static void a(String str, int i11) {
        c.a(f(str), i11);
    }

    public static void b(String str) {
        b.a(f(str));
    }

    public static void c(String str, int i11) {
        c.b(f(str), i11);
    }

    public static void d() {
        b.b();
    }

    public static boolean e() {
        return c.c();
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
