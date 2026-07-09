package ba0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f14105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f14106b;

    public a(Long l11, Long l12) {
        this.f14105a = l11;
        this.f14106b = l12;
    }

    public final Long a() {
        return this.f14106b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14105a, aVar.f14105a) && Intrinsics.areEqual(this.f14106b, aVar.f14106b);
    }

    public int hashCode() {
        Long l11 = this.f14105a;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f14106b;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    public String toString() {
        return "DiskUsage(appDiskUsage=" + this.f14105a + ", deviceDiskFree=" + this.f14106b + ')';
    }
}
