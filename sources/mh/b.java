package mh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f116280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f116281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f116282c;

    public b(String resourceId, long j11, Long l11) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        this.f116280a = resourceId;
        this.f116281b = j11;
        this.f116282c = l11;
    }

    public final long a() {
        return this.f116281b;
    }

    public final Long b() {
        return this.f116282c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f116280a, bVar.f116280a) && this.f116281b == bVar.f116281b && Intrinsics.areEqual(this.f116282c, bVar.f116282c);
    }

    public int hashCode() {
        int iHashCode = ((this.f116280a.hashCode() * 31) + Long.hashCode(this.f116281b)) * 31;
        Long l11 = this.f116282c;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public String toString() {
        return "NetworkSettledResourceContext(resourceId=" + this.f116280a + ", eventCreatedAtNanos=" + this.f116281b + ", viewCreatedTimestamp=" + this.f116282c + ")";
    }
}
