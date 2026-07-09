package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4365a;

    public b(int i11) {
        this.f4365a = i11;
    }

    public final int a() {
        return this.f4365a;
    }

    public final boolean b() {
        return this.f4365a != Integer.MIN_VALUE;
    }

    public final void c(int i11) {
        this.f4365a = i11;
    }

    public final int d(c4 c4Var) {
        return c4Var.l(this);
    }

    public final int e(f4 f4Var) {
        return f4Var.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f4365a + " }";
    }
}
