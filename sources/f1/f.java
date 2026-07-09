package f1;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f93297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f93298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f93299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f93300d;

    public f(float f11, float f12, float f13, float f14) {
        this.f93297a = f11;
        this.f93298b = f12;
        this.f93299c = f13;
        this.f93300d = f14;
    }

    public final float a() {
        return this.f93297a;
    }

    public final float b() {
        return this.f93298b;
    }

    public final float c() {
        return this.f93299c;
    }

    public final float d() {
        return this.f93300d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f93297a == fVar.f93297a && this.f93298b == fVar.f93298b && this.f93299c == fVar.f93299c && this.f93300d == fVar.f93300d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f93297a) * 31) + Float.hashCode(this.f93298b)) * 31) + Float.hashCode(this.f93299c)) * 31) + Float.hashCode(this.f93300d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f93297a + ", focusedAlpha=" + this.f93298b + ", hoveredAlpha=" + this.f93299c + ", pressedAlpha=" + this.f93300d + ')';
    }
}
