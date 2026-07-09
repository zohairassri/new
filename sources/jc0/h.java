package jc0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h {
    private static boolean a(char c11) {
        return c11 >= ' ' && c11 <= '~';
    }

    public static boolean b(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!a(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }
}
