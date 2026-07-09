package vg0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f133111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f133112b;

    i() {
    }

    static void a(i iVar, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr = iVar.f133112b;
            byte[] bArr = iVar.f133111a;
            int i13 = i12 * 4;
            iArr[i12] = ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
        }
    }

    static void b(i iVar, byte[] bArr, int[] iArr) {
        iVar.f133111a = bArr;
        iVar.f133112b = iArr;
    }
}
