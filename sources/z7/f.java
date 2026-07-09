package z7;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f141820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f141821e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f141818b = str;
        this.f141819c = str2;
        this.f141820d = str3;
        this.f141821e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f141818b, fVar.f141818b) && Objects.equals(this.f141819c, fVar.f141819c) && Objects.equals(this.f141820d, fVar.f141820d) && Arrays.equals(this.f141821e, fVar.f141821e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f141818b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f141819c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f141820d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f141821e);
    }

    @Override // z7.i
    public String toString() {
        return this.f141827a + ": mimeType=" + this.f141818b + ", filename=" + this.f141819c + ", description=" + this.f141820d;
    }
}
