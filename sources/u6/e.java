package u6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131091c;

    public e(String str, String str2, String str3) {
        this.f131089a = str;
        this.f131090b = str2;
        this.f131091c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f131089a, eVar.f131089a) && Objects.equals(this.f131090b, eVar.f131090b) && Objects.equals(this.f131091c, eVar.f131091c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f131089a.hashCode() * 31;
        String str = this.f131090b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131091c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
