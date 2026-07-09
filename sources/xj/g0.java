package xj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f137754b = new g0(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137755a;

    public g0(boolean z11) {
        this.f137755a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g0.class == obj.getClass() && this.f137755a == ((g0) obj).f137755a;
    }

    public int hashCode() {
        return !this.f137755a ? 1 : 0;
    }
}
