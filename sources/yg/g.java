package yg;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f140503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f140504b;

    public g(long j11, long j12) {
        this.f140503a = j11;
        this.f140504b = j12;
    }

    public final long a() {
        return this.f140504b;
    }

    public final long b() {
        return this.f140503a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f140503a == gVar.f140503a && this.f140504b == gVar.f140504b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f140503a) * 31) + Long.hashCode(this.f140504b);
    }

    public String toString() {
        return "Timing(startTime=" + this.f140503a + ", duration=" + this.f140504b + ")";
    }
}
