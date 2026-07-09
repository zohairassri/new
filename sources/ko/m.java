package ko;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f111567a = -1.0f;

    @Override // ko.e
    public void a(p pVar, float f11, float f12, float f13) {
        pVar.o(0.0f, f13 * f12, 180.0f, 180.0f - f11);
        float f14 = f13 * 2.0f * f12;
        pVar.a(0.0f, 0.0f, f14, f14, 180.0f, f11);
    }
}
