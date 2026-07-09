package tr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f130414d;

    public y(String sessionId, String firstSessionId, int i11, long j11) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f130411a = sessionId;
        this.f130412b = firstSessionId;
        this.f130413c = i11;
        this.f130414d = j11;
    }

    public final String a() {
        return this.f130412b;
    }

    public final String b() {
        return this.f130411a;
    }

    public final int c() {
        return this.f130413c;
    }

    public final long d() {
        return this.f130414d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f130411a, yVar.f130411a) && Intrinsics.areEqual(this.f130412b, yVar.f130412b) && this.f130413c == yVar.f130413c && this.f130414d == yVar.f130414d;
    }

    public int hashCode() {
        return (((((this.f130411a.hashCode() * 31) + this.f130412b.hashCode()) * 31) + Integer.hashCode(this.f130413c)) * 31) + Long.hashCode(this.f130414d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f130411a + ", firstSessionId=" + this.f130412b + ", sessionIndex=" + this.f130413c + ", sessionStartTimestampUs=" + this.f130414d + ')';
    }
}
