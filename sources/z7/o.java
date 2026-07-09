package z7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141843c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f141842b = str2;
        this.f141843c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f141827a.equals(oVar.f141827a) && Objects.equals(this.f141842b, oVar.f141842b) && Objects.equals(this.f141843c, oVar.f141843c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f141827a.hashCode()) * 31;
        String str = this.f141842b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141843c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // z7.i
    public String toString() {
        return this.f141827a + ": url=" + this.f141843c;
    }
}
