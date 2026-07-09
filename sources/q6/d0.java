package q6;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f122460c = new d0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122462b;

    public d0(int i11, boolean z11) {
        this.f122461a = i11;
        this.f122462b = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f122461a == d0Var.f122461a && this.f122462b == d0Var.f122462b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f122461a << 1) + (this.f122462b ? 1 : 0);
    }
}
