package sa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f126235c;

    public i(String workSpecId, int i11, int i12) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f126233a = workSpecId;
        this.f126234b = i11;
        this.f126235c = i12;
    }

    public final int a() {
        return this.f126234b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f126233a, iVar.f126233a) && this.f126234b == iVar.f126234b && this.f126235c == iVar.f126235c;
    }

    public int hashCode() {
        return (((this.f126233a.hashCode() * 31) + Integer.hashCode(this.f126234b)) * 31) + Integer.hashCode(this.f126235c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f126233a + ", generation=" + this.f126234b + ", systemId=" + this.f126235c + ')';
    }
}
