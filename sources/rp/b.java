package rp;

import cp.y;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f125068a;

    private b(a aVar) {
        this.f125068a = aVar;
    }

    public static b a(byte[] bArr, y yVar) {
        if (yVar != null) {
            return new b(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.f125068a.c();
    }
}
