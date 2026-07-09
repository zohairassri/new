package lh;

import kotlin.jvm.internal.Intrinsics;
import nh.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.d f114340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f114341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f114342c;

    public c(a.d actionType, long j11, Long l11) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f114340a = actionType;
        this.f114341b = j11;
        this.f114342c = l11;
    }

    public final Long a() {
        return this.f114342c;
    }

    public final long b() {
        return this.f114341b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f114340a == cVar.f114340a && this.f114341b == cVar.f114341b && Intrinsics.areEqual(this.f114342c, cVar.f114342c);
    }

    public int hashCode() {
        int iHashCode = ((this.f114340a.hashCode() * 31) + Long.hashCode(this.f114341b)) * 31;
        Long l11 = this.f114342c;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public String toString() {
        return "PreviousViewLastInteractionContext(actionType=" + this.f114340a + ", eventCreatedAtNanos=" + this.f114341b + ", currentViewCreationTimestamp=" + this.f114342c + ")";
    }
}
