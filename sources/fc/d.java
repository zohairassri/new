package fc;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f94155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f94156b;

    public d(float f11, float f12) {
        this.f94155a = f11;
        this.f94156b = f12;
    }

    public boolean a(float f11, float f12) {
        return this.f94155a == f11 && this.f94156b == f12;
    }

    public float b() {
        return this.f94155a;
    }

    public float c() {
        return this.f94156b;
    }

    public void d(float f11, float f12) {
        this.f94155a = f11;
        this.f94156b = f12;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
