package ec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f92440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f92441b;

    public void a(float f11) {
        float f12 = this.f92440a + f11;
        this.f92440a = f12;
        int i11 = this.f92441b + 1;
        this.f92441b = i11;
        if (i11 == Integer.MAX_VALUE) {
            this.f92440a = f12 / 2.0f;
            this.f92441b = i11 / 2;
        }
    }
}
