package e3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f91106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final we0.i f91107b;

    public a(String str, we0.i iVar) {
        this.f91106a = str;
        this.f91107b = iVar;
    }

    public final we0.i a() {
        return this.f91107b;
    }

    public final String b() {
        return this.f91106a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f91106a, aVar.f91106a) && Intrinsics.areEqual(this.f91107b, aVar.f91107b);
    }

    public int hashCode() {
        String str = this.f91106a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        we0.i iVar = this.f91107b;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f91106a + ", action=" + this.f91107b + ')';
    }
}
