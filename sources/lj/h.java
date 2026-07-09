package lj;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj.b f114457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f114458b;

    public h(jj.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f114457a = bVar;
        this.f114458b = bArr;
    }

    public byte[] a() {
        return this.f114458b;
    }

    public jj.b b() {
        return this.f114457a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f114457a.equals(hVar.f114457a)) {
            return Arrays.equals(this.f114458b, hVar.f114458b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f114458b) ^ ((this.f114457a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f114457a + ", bytes=[...]}";
    }
}
