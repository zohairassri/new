package qu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f123037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f123038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f123039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f123040e;

    public c(String str, String str2, String str3, String str4, Integer num) {
        this.f123036a = str;
        this.f123037b = str2;
        this.f123038c = str3;
        this.f123039d = str4;
        this.f123040e = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f123036a, cVar.f123036a) && Intrinsics.areEqual(this.f123037b, cVar.f123037b) && Intrinsics.areEqual(this.f123038c, cVar.f123038c) && Intrinsics.areEqual(this.f123039d, cVar.f123039d) && Intrinsics.areEqual(this.f123040e, cVar.f123040e);
    }

    public int hashCode() {
        String str = this.f123036a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123037b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123038c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f123039d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f123040e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GiftContent(uri=" + this.f123036a + ", url=" + this.f123037b + ", creationDate=" + this.f123038c + ", expirationDate=" + this.f123039d + ", regiID=" + this.f123040e + ")";
    }
}
