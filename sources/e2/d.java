package e2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f90916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f90917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f90918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f90919d;

    public d(float f11, float f12, float f13, float f14) {
        this.f90916a = f11;
        this.f90917b = f12;
        this.f90918c = f13;
        this.f90919d = f14;
    }

    public final float a() {
        return this.f90919d;
    }

    public final float b() {
        return this.f90916a;
    }

    public final float c() {
        return this.f90918c;
    }

    public final float d() {
        return this.f90917b;
    }

    public final void e(float f11, float f12, float f13, float f14) {
        this.f90916a = Math.max(f11, this.f90916a);
        this.f90917b = Math.max(f12, this.f90917b);
        this.f90918c = Math.min(f13, this.f90918c);
        this.f90919d = Math.min(f14, this.f90919d);
    }

    public final boolean f() {
        return (this.f90916a >= this.f90918c) | (this.f90917b >= this.f90919d);
    }

    public final void g(float f11, float f12, float f13, float f14) {
        this.f90916a = f11;
        this.f90917b = f12;
        this.f90918c = f13;
        this.f90919d = f14;
    }

    public final void h(float f11) {
        this.f90919d = f11;
    }

    public final void i(float f11) {
        this.f90916a = f11;
    }

    public final void j(float f11) {
        this.f90918c = f11;
    }

    public final void k(float f11) {
        this.f90917b = f11;
    }

    public final void l(float f11, float f12) {
        this.f90916a += f11;
        this.f90917b += f12;
        this.f90918c += f11;
        this.f90919d += f12;
    }

    public final void m(long j11) {
        l(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f90916a, 1) + ", " + c.a(this.f90917b, 1) + ", " + c.a(this.f90918c, 1) + ", " + c.a(this.f90919d, 1) + ')';
    }
}
