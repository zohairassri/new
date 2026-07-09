package ks;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f112065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f112066b;

    public f(long j11, Long l11) {
        this.f112065a = j11;
        this.f112066b = l11;
    }

    public final long a() {
        return this.f112065a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f112065a == fVar.f112065a && Intrinsics.areEqual(this.f112066b, fVar.f112066b);
    }

    public int hashCode() {
        long j11 = this.f112065a;
        int i11 = ((int) (j11 ^ (j11 >>> 32))) * 31;
        Long l11 = this.f112066b;
        return i11 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "KronosTime(posixTimeMs=" + this.f112065a + ", timeSinceLastNtpSyncMs=" + this.f112066b + ")";
    }
}
