package ve;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f132957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f132958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f132959c;

    public a(long j11, boolean z11, long j12) {
        this.f132957a = j11;
        this.f132958b = z11;
        this.f132959c = j12;
    }

    public final long a() {
        return this.f132959c;
    }

    public final boolean b() {
        return this.f132958b;
    }

    public final long c() {
        return this.f132957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f132957a == aVar.f132957a && this.f132958b == aVar.f132958b && this.f132959c == aVar.f132959c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f132957a) * 31) + Boolean.hashCode(this.f132958b)) * 31) + Long.hashCode(this.f132959c);
    }

    public String toString() {
        return "BatchClosedMetadata(lastTimeWasUsedInMs=" + this.f132957a + ", forcedNew=" + this.f132958b + ", eventsCount=" + this.f132959c + ")";
    }
}
