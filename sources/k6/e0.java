package k6;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f107597c = new e0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f107598d = new e0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f107599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f107600b;

    public e0(int i11, int i12) {
        a.a((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.f107599a = i11;
        this.f107600b = i12;
    }

    public int a() {
        return this.f107600b;
    }

    public int b() {
        return this.f107599a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f107599a == e0Var.f107599a && this.f107600b == e0Var.f107600b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f107600b;
        int i12 = this.f107599a;
        return ((i12 >>> 16) | (i12 << 16)) ^ i11;
    }

    public String toString() {
        return this.f107599a + "x" + this.f107600b;
    }
}
