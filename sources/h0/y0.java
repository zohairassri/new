package h0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f99518b;

    public y0(int i11) {
        this.f99518b = i11;
    }

    @Override // h0.x0
    public int a(int i11, int i12, float f11, int i13, int i14) {
        long j11 = i11;
        return kotlin.ranges.g.n(i12, (int) kotlin.ranges.g.f(j11 - ((long) this.f99518b), 0L), (int) kotlin.ranges.g.k(j11 + ((long) this.f99518b), 2147483647L));
    }

    public boolean equals(Object obj) {
        return (obj instanceof y0) && this.f99518b == ((y0) obj).f99518b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f99518b);
    }
}
