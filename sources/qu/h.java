package qu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f123057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f123058d;

    public h(String str, String str2, c cVar, Integer num) {
        this.f123055a = str;
        this.f123056b = str2;
        this.f123057c = cVar;
        this.f123058d = num;
    }

    public final Integer a() {
        return this.f123058d;
    }

    public final String b() {
        return this.f123055a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f123055a, hVar.f123055a) && Intrinsics.areEqual(this.f123056b, hVar.f123056b) && Intrinsics.areEqual(this.f123057c, hVar.f123057c) && Intrinsics.areEqual(this.f123058d, hVar.f123058d);
    }

    public int hashCode() {
        String str = this.f123055a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123056b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f123057c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f123058d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GiftSharingResponse(url=" + this.f123055a + ", code=" + this.f123056b + ", contents=" + this.f123057c + ", remaining=" + this.f123058d + ")";
    }
}
