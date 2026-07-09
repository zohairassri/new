package s2;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f125406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f125407b;

    public a(long j11, float f11) {
        this.f125406a = j11;
        this.f125407b = f11;
    }

    public final float a() {
        return this.f125407b;
    }

    public final long b() {
        return this.f125406a;
    }

    public final void c(float f11) {
        this.f125407b = f11;
    }

    public final void d(long j11) {
        this.f125406a = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f125406a == aVar.f125406a && Float.compare(this.f125407b, aVar.f125407b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f125406a) * 31) + Float.hashCode(this.f125407b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f125406a + ", dataPoint=" + this.f125407b + ')';
    }
}
