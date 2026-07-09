package g2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f97923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f97924b;

    public i0(float f11, float f12) {
        this.f97923a = f11;
        this.f97924b = f12;
    }

    public final float a() {
        return this.f97923a;
    }

    public final float b() {
        return this.f97924b;
    }

    public final float[] c() {
        float f11 = this.f97923a;
        float f12 = this.f97924b;
        return new float[]{f11 / f12, 1.0f, ((1.0f - f11) - f12) / f12};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Float.compare(this.f97923a, i0Var.f97923a) == 0 && Float.compare(this.f97924b, i0Var.f97924b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f97923a) * 31) + Float.hashCode(this.f97924b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f97923a + ", y=" + this.f97924b + ')';
    }
}
