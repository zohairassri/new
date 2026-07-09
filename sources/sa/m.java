package sa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f126243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f126244b;

    public m(String workSpecId, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f126243a = workSpecId;
        this.f126244b = i11;
    }

    public final int a() {
        return this.f126244b;
    }

    public final String b() {
        return this.f126243a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f126243a, mVar.f126243a) && this.f126244b == mVar.f126244b;
    }

    public int hashCode() {
        return (this.f126243a.hashCode() * 31) + Integer.hashCode(this.f126244b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f126243a + ", generation=" + this.f126244b + ')';
    }
}
