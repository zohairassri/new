package mc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p {
    public static String a(long j11, long j12) {
        if (j11 == 0 && j12 == 0) {
            return b();
        }
        char[] cArrA = jc0.i.a(32);
        jc0.f.g(j11, cArrA, 0);
        jc0.f.g(j12, cArrA, 16);
        return new String(cArrA, 0, 32);
    }

    public static String b() {
        return "00000000000000000000000000000000";
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence != null && charSequence.length() == 32 && !"00000000000000000000000000000000".contentEquals(charSequence) && jc0.f.f(charSequence);
    }
}
