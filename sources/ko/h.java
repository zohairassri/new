package ko;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f111519a;

    public h(float f11) {
        this.f111519a = f11 - 0.001f;
    }

    @Override // ko.g
    boolean b() {
        return true;
    }

    @Override // ko.g
    public void c(float f11, float f12, float f13, p pVar) {
        float fSqrt = (float) ((((double) this.f111519a) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f111519a, 2.0d) - Math.pow(fSqrt, 2.0d));
        pVar.n(f12 - fSqrt, ((float) (-((((double) this.f111519a) * Math.sqrt(2.0d)) - ((double) this.f111519a)))) + fSqrt2);
        pVar.m(f12, (float) (-((((double) this.f111519a) * Math.sqrt(2.0d)) - ((double) this.f111519a))));
        pVar.m(f12 + fSqrt, ((float) (-((((double) this.f111519a) * Math.sqrt(2.0d)) - ((double) this.f111519a)))) + fSqrt2);
    }
}
