package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f133797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f133798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f133799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f133800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f133801e;

    public r(float f11, float f12, float f13, float f14) {
        super(null);
        this.f133797a = f11;
        this.f133798b = f12;
        this.f133799c = f13;
        this.f133800d = f14;
        this.f133801e = 4;
    }

    @Override // w.s
    public float a(int i11) {
        if (i11 == 0) {
            return this.f133797a;
        }
        if (i11 == 1) {
            return this.f133798b;
        }
        if (i11 == 2) {
            return this.f133799c;
        }
        if (i11 != 3) {
            return 0.0f;
        }
        return this.f133800d;
    }

    @Override // w.s
    public int b() {
        return this.f133801e;
    }

    @Override // w.s
    public void d() {
        this.f133797a = 0.0f;
        this.f133798b = 0.0f;
        this.f133799c = 0.0f;
        this.f133800d = 0.0f;
    }

    @Override // w.s
    public void e(int i11, float f11) {
        if (i11 == 0) {
            this.f133797a = f11;
            return;
        }
        if (i11 == 1) {
            this.f133798b = f11;
        } else if (i11 == 2) {
            this.f133799c = f11;
        } else {
            if (i11 != 3) {
                return;
            }
            this.f133800d = f11;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f133797a == this.f133797a && rVar.f133798b == this.f133798b && rVar.f133799c == this.f133799c && rVar.f133800d == this.f133800d;
    }

    public final float f() {
        return this.f133797a;
    }

    public final float g() {
        return this.f133798b;
    }

    public final float h() {
        return this.f133799c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f133797a) * 31) + Float.hashCode(this.f133798b)) * 31) + Float.hashCode(this.f133799c)) * 31) + Float.hashCode(this.f133800d);
    }

    public final float i() {
        return this.f133800d;
    }

    @Override // w.s
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public r c() {
        return new r(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f133797a + ", v2 = " + this.f133798b + ", v3 = " + this.f133799c + ", v4 = " + this.f133800d;
    }
}
