package de;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f89675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f89676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f89677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f89678d;

    public h(long j11, long j12, long j13, long j14) {
        this.f89675a = j11;
        this.f89676b = j12;
        this.f89677c = j13;
        this.f89678d = j14;
    }

    public final long a() {
        return this.f89678d;
    }

    public final long b() {
        return this.f89677c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f89675a == hVar.f89675a && this.f89676b == hVar.f89676b && this.f89677c == hVar.f89677c && this.f89678d == hVar.f89678d;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f89675a) * 31) + Long.hashCode(this.f89676b)) * 31) + Long.hashCode(this.f89677c)) * 31) + Long.hashCode(this.f89678d);
    }

    public String toString() {
        return "TimeInfo(deviceTimeNs=" + this.f89675a + ", serverTimeNs=" + this.f89676b + ", serverTimeOffsetNs=" + this.f89677c + ", serverTimeOffsetMs=" + this.f89678d + ")";
    }
}
