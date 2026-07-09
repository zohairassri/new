package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f133760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f133761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f133762d;

    public q(float f11, float f12, float f13) {
        super(null);
        this.f133759a = f11;
        this.f133760b = f12;
        this.f133761c = f13;
        this.f133762d = 3;
    }

    @Override // w.s
    public float a(int i11) {
        if (i11 == 0) {
            return this.f133759a;
        }
        if (i11 == 1) {
            return this.f133760b;
        }
        if (i11 != 2) {
            return 0.0f;
        }
        return this.f133761c;
    }

    @Override // w.s
    public int b() {
        return this.f133762d;
    }

    @Override // w.s
    public void d() {
        this.f133759a = 0.0f;
        this.f133760b = 0.0f;
        this.f133761c = 0.0f;
    }

    @Override // w.s
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f133759a = f11;
        } else if (i11 == 1) {
            this.f133760b = f11;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f133761c = f11;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f133759a == this.f133759a && qVar.f133760b == this.f133760b && qVar.f133761c == this.f133761c;
    }

    @Override // w.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public q c() {
        return new q(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f133759a) * 31) + Float.hashCode(this.f133760b)) * 31) + Float.hashCode(this.f133761c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f133759a + ", v2 = " + this.f133760b + ", v3 = " + this.f133761c;
    }
}
