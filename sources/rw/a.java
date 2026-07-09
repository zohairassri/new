package rw;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f125162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f125163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f125164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f125165d;

    public a(String nytAppTypeHeaderVal, String nytBuildTypeHeaderVal, String userAgentAppName, String str) {
        Intrinsics.checkNotNullParameter(nytAppTypeHeaderVal, "nytAppTypeHeaderVal");
        Intrinsics.checkNotNullParameter(nytBuildTypeHeaderVal, "nytBuildTypeHeaderVal");
        Intrinsics.checkNotNullParameter(userAgentAppName, "userAgentAppName");
        this.f125162a = nytAppTypeHeaderVal;
        this.f125163b = nytBuildTypeHeaderVal;
        this.f125164c = userAgentAppName;
        this.f125165d = str;
    }

    public final String a() {
        return this.f125165d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f125162a, aVar.f125162a) && Intrinsics.areEqual(this.f125163b, aVar.f125163b) && Intrinsics.areEqual(this.f125164c, aVar.f125164c) && Intrinsics.areEqual(this.f125165d, aVar.f125165d);
    }

    public int hashCode() {
        int iHashCode = ((((this.f125162a.hashCode() * 31) + this.f125163b.hashCode()) * 31) + this.f125164c.hashCode()) * 31;
        String str = this.f125165d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "NetworkConfig(nytAppTypeHeaderVal=" + this.f125162a + ", nytBuildTypeHeaderVal=" + this.f125163b + ", userAgentAppName=" + this.f125164c + ", clientId=" + this.f125165d + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "release" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? null : str4);
    }
}
