package bb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f14240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f14241b;

    public f(Long l11, Long l12) {
        this.f14240a = l11;
        this.f14241b = l12;
    }

    public final Long a() {
        return this.f14240a;
    }

    public final Long b() {
        return this.f14241b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f14240a, fVar.f14240a) && Intrinsics.areEqual(this.f14241b, fVar.f14241b);
    }

    public int hashCode() {
        Long l11 = this.f14240a;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f14241b;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    public String toString() {
        return "StartupEventInfo(duration=" + this.f14240a + ", threshold=" + this.f14241b + ')';
    }
}
