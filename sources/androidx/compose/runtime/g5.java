package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4517b;

    public g5(Object obj, int i11) {
        this.f4516a = obj;
        this.f4517b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return Intrinsics.areEqual(this.f4516a, g5Var.f4516a) && this.f4517b == g5Var.f4517b;
    }

    public int hashCode() {
        return (this.f4516a.hashCode() * 31) + Integer.hashCode(this.f4517b);
    }

    public String toString() {
        return "SourceInformationSlotTableGroupIdentity(parentIdentity=" + this.f4516a + ", index=" + this.f4517b + ')';
    }
}
