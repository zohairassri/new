package d0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f87833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f87834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f87836d;

    public r0(int i11, int i12, int i13, int i14) {
        this.f87833a = i11;
        this.f87834b = i12;
        this.f87835c = i13;
        this.f87836d = i14;
    }

    public final int a() {
        return this.f87836d;
    }

    public final int b() {
        return this.f87833a;
    }

    public final int c() {
        return this.f87835c;
    }

    public final int d() {
        return this.f87834b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f87833a == r0Var.f87833a && this.f87834b == r0Var.f87834b && this.f87835c == r0Var.f87835c && this.f87836d == r0Var.f87836d;
    }

    public int hashCode() {
        return (((((this.f87833a * 31) + this.f87834b) * 31) + this.f87835c) * 31) + this.f87836d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f87833a + ", top=" + this.f87834b + ", right=" + this.f87835c + ", bottom=" + this.f87836d + ')';
    }
}
