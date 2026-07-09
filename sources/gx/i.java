package gx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99085b;

    public i(String tcString, String noticeVersion) {
        Intrinsics.checkNotNullParameter(tcString, "tcString");
        Intrinsics.checkNotNullParameter(noticeVersion, "noticeVersion");
        this.f99084a = tcString;
        this.f99085b = noticeVersion;
    }

    public final String a() {
        return this.f99085b;
    }

    public final String b() {
        return this.f99084a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f99084a, iVar.f99084a) && Intrinsics.areEqual(this.f99085b, iVar.f99085b);
    }

    public int hashCode() {
        return (this.f99084a.hashCode() * 31) + this.f99085b.hashCode();
    }

    public String toString() {
        return "TcfPreferenceInputData(tcString=" + this.f99084a + ", noticeVersion=" + this.f99085b + ")";
    }
}
