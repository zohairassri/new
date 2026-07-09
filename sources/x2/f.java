package x2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
abstract class f {
    public static final int b(int[] iArr, int i11) {
        return iArr[i11 + c(iArr)];
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i11, int i12) {
        iArr[i11 + c(iArr)] = i12;
    }

    public static int[] a(int[] iArr) {
        return iArr;
    }
}
