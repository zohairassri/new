package ko;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f111518a = -1.0f;

    @Override // ko.e
    public void a(p pVar, float f11, float f12, float f13) {
        pVar.o(0.0f, f13 * f12, 180.0f, 180.0f - f11);
        double d11 = f13;
        double d12 = f12;
        pVar.m((float) (Math.sin(Math.toRadians(f11)) * d11 * d12), (float) (Math.sin(Math.toRadians(90.0f - f11)) * d11 * d12));
    }
}
