package l6;

import h6.u;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113279c;

    public f(long j11, long j12, long j13) {
        this.f113277a = j11;
        this.f113278b = j12;
        this.f113279c = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f113277a == fVar.f113277a && this.f113278b == fVar.f113278b && this.f113279c == fVar.f113279c;
    }

    public int hashCode() {
        return ((((527 + com.google.common.primitives.h.c(this.f113277a)) * 31) + com.google.common.primitives.h.c(this.f113278b)) * 31) + com.google.common.primitives.h.c(this.f113279c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f113277a + ", modification time=" + this.f113278b + ", timescale=" + this.f113279c;
    }
}
