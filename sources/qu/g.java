package qu;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123054b;

    public g(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f123053a = url;
        this.f123054b = str;
    }

    public final String a() {
        return this.f123054b;
    }

    public final String b() {
        return this.f123053a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f123053a, gVar.f123053a) && Intrinsics.areEqual(this.f123054b, gVar.f123054b);
    }

    public int hashCode() {
        int iHashCode = this.f123053a.hashCode() * 31;
        String str = this.f123054b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GiftSharingRequest(url=" + this.f123053a + ", pageViewId=" + this.f123054b + ")";
    }

    public /* synthetic */ g(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
