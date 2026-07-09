package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f133752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f133753c;

    public p(float f11, float f12) {
        super(null);
        this.f133751a = f11;
        this.f133752b = f12;
        this.f133753c = 2;
    }

    @Override // w.s
    public float a(int i11) {
        if (i11 == 0) {
            return this.f133751a;
        }
        if (i11 != 1) {
            return 0.0f;
        }
        return this.f133752b;
    }

    @Override // w.s
    public int b() {
        return this.f133753c;
    }

    @Override // w.s
    public void d() {
        this.f133751a = 0.0f;
        this.f133752b = 0.0f;
    }

    @Override // w.s
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f133751a = f11;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f133752b = f11;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f133751a == this.f133751a && pVar.f133752b == this.f133752b;
    }

    public final float f() {
        return this.f133751a;
    }

    public final float g() {
        return this.f133752b;
    }

    @Override // w.s
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p c() {
        return new p(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f133751a) * 31) + Float.hashCode(this.f133752b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f133751a + ", v2 = " + this.f133752b;
    }
}
