package rp;

import java.util.Arrays;
import qp.k;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f125067a;

    private a(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f125067a = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i11, int i12) {
        if (bArr != null) {
            return new a(bArr, i11, i12);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.f125067a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f125067a, this.f125067a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f125067a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f125067a) + ")";
    }
}
