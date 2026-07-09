package ko;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f111564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f111565b;

    public k(g gVar, float f11) {
        this.f111564a = gVar;
        this.f111565b = f11;
    }

    @Override // ko.g
    boolean b() {
        return this.f111564a.b();
    }

    @Override // ko.g
    public void c(float f11, float f12, float f13, p pVar) {
        this.f111564a.c(f11, f12 - this.f111565b, f13, pVar);
    }
}
