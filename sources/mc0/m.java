package mc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class m {
    public static String a(long j11) {
        if (j11 == 0) {
            return b();
        }
        char[] cArrA = jc0.i.a(16);
        jc0.f.g(j11, cArrA, 0);
        return new String(cArrA, 0, 16);
    }

    public static String b() {
        return "0000000000000000";
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 16 && !"0000000000000000".contentEquals(charSequence) && jc0.f.f(charSequence);
    }
}
