package ky;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f112164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f112165b;

    public i(boolean z11, boolean z12) {
        this.f112164a = z11;
        this.f112165b = z12;
    }

    public final boolean a() {
        return this.f112164a;
    }

    public final boolean b() {
        return this.f112165b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f112164a == iVar.f112164a && this.f112165b == iVar.f112165b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f112164a) * 31) + Boolean.hashCode(this.f112165b);
    }

    public String toString() {
        return "YourPrivacyState(ccpaOptOutState=" + this.f112164a + ", showPreferenceWillBeForgotten=" + this.f112165b + ")";
    }

    public /* synthetic */ i(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
