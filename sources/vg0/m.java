package vg0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f133151a = new byte[1024];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f133152b = new int[1024];

    static void a(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iMin = Math.min(i13 + 1024, i12) - i13;
            System.arraycopy(f133151a, 0, bArr, i11 + i13, iMin);
            i13 += iMin;
        }
    }

    static void b(int[] iArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iMin = Math.min(i13 + 1024, i12) - i13;
            System.arraycopy(f133152b, 0, iArr, i11 + i13, iMin);
            i13 += iMin;
        }
    }
}
