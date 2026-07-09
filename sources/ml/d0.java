package ml;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f116755c = new d0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f116756d = new d0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f116758b;

    public d0(int i11, int i12) {
        a.a((i11 == -1 || i11 >= 0) && (i12 == -1 || i12 >= 0));
        this.f116757a = i11;
        this.f116758b = i12;
    }

    public int a() {
        return this.f116758b;
    }

    public int b() {
        return this.f116757a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f116757a == d0Var.f116757a && this.f116758b == d0Var.f116758b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f116758b;
        int i12 = this.f116757a;
        return ((i12 >>> 16) | (i12 << 16)) ^ i11;
    }

    public String toString() {
        return this.f116757a + "x" + this.f116758b;
    }
}
