package vg0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f133108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f133109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f133110c;

    h() {
    }

    static void a(h hVar, a aVar) {
        int length = hVar.f133110c.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            hVar.f133110c[i12] = i11;
            e.n(hVar.f133108a, hVar.f133109b, i11, aVar);
            i11 += 1080;
        }
    }

    static void b(h hVar, int i11, int i12) {
        hVar.f133108a = i11;
        hVar.f133109b = new int[i12 * 1080];
        hVar.f133110c = new int[i12];
    }
}
