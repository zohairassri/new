package zj;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f142428b;

    public q(int i11, float f11) {
        this.f142427a = i11;
        this.f142428b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f142427a == qVar.f142427a && Float.compare(qVar.f142428b, this.f142428b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f142427a) * 31) + Float.floatToIntBits(this.f142428b);
    }
}
