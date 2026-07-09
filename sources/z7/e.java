package z7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141817d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f141815b = str;
        this.f141816c = str2;
        this.f141817d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f141816c, eVar.f141816c) && Objects.equals(this.f141815b, eVar.f141815b) && Objects.equals(this.f141817d, eVar.f141817d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f141815b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141816c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141817d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // z7.i
    public String toString() {
        return this.f141827a + ": language=" + this.f141815b + ", description=" + this.f141816c + ", text=" + this.f141817d;
    }
}
