package z7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f141803b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f141803b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f141827a.equals(bVar.f141827a) && Arrays.equals(this.f141803b, bVar.f141803b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f141827a.hashCode()) * 31) + Arrays.hashCode(this.f141803b);
    }
}
