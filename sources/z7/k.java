package z7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141831d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f141829b = str;
        this.f141830c = str2;
        this.f141831d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f141830c, kVar.f141830c) && Objects.equals(this.f141829b, kVar.f141829b) && Objects.equals(this.f141831d, kVar.f141831d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f141829b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141830c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141831d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // z7.i
    public String toString() {
        return this.f141827a + ": domain=" + this.f141829b + ", description=" + this.f141830c;
    }
}
