package u6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f131105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f131106e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f131102a = str;
        this.f131103b = str2;
        this.f131104c = str3;
        this.f131105d = str4;
        this.f131106e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Objects.equals(this.f131102a, hVar.f131102a) && Objects.equals(this.f131103b, hVar.f131103b) && Objects.equals(this.f131104c, hVar.f131104c) && Objects.equals(this.f131105d, hVar.f131105d) && Objects.equals(this.f131106e, hVar.f131106e);
    }

    public int hashCode() {
        String str = this.f131102a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131103b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f131104c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f131105d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f131106e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
