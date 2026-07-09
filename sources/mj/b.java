package mj;

import mj.g;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f116357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f116358b;

    b(g.a aVar, long j11) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f116357a = aVar;
        this.f116358b = j11;
    }

    @Override // mj.g
    public long b() {
        return this.f116358b;
    }

    @Override // mj.g
    public g.a c() {
        return this.f116357a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f116357a.equals(gVar.c()) && this.f116358b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f116357a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f116358b;
        return ((int) (j11 ^ (j11 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f116357a + ", nextRequestWaitMillis=" + this.f116358b + "}";
    }
}
