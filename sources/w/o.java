package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f133742b;

    public o(float f11) {
        super(null);
        this.f133741a = f11;
        this.f133742b = 1;
    }

    @Override // w.s
    public float a(int i11) {
        if (i11 == 0) {
            return this.f133741a;
        }
        return 0.0f;
    }

    @Override // w.s
    public int b() {
        return this.f133742b;
    }

    @Override // w.s
    public void d() {
        this.f133741a = 0.0f;
    }

    @Override // w.s
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f133741a = f11;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && ((o) obj).f133741a == this.f133741a;
    }

    public final float f() {
        return this.f133741a;
    }

    @Override // w.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f133741a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f133741a;
    }
}
