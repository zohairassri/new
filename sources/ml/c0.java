package ml;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c0 {
    public static int a(int i11, int i12) {
        for (int i13 = 1; i13 <= 2; i13++) {
            int i14 = (i11 + i13) % 3;
            if (b(i14, i12)) {
                return i14;
            }
        }
        return i11;
    }

    public static boolean b(int i11, int i12) {
        if (i11 != 0) {
            return i11 != 1 ? i11 == 2 && (i12 & 2) != 0 : (i12 & 1) != 0;
        }
        return true;
    }
}
