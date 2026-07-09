package z7;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f141838c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f141837b = str;
        this.f141838c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f141837b, mVar.f141837b) && Arrays.equals(this.f141838c, mVar.f141838c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f141837b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f141838c);
    }

    @Override // z7.i
    public String toString() {
        return this.f141827a + ": owner=" + this.f141837b;
    }
}
