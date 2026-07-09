package dh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f89760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f89761b;

    public a(String resourceId, long j11) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        this.f89760a = resourceId;
        this.f89761b = j11;
    }

    public final long a() {
        return this.f89761b;
    }

    public final String b() {
        return this.f89760a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f89760a, aVar.f89760a) && this.f89761b == aVar.f89761b;
    }

    public int hashCode() {
        return (this.f89760a.hashCode() * 31) + Long.hashCode(this.f89761b);
    }

    public String toString() {
        return "InternalResourceContext(resourceId=" + this.f89760a + ", eventCreatedAtNanos=" + this.f89761b + ")";
    }
}
