package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class rg4 extends n84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fo4 f34194b;

    /* synthetic */ rg4(String str, fo4 fo4Var, byte[] bArr) {
        this.f34193a = str;
        this.f34194b = fo4Var;
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f34194b != fo4.RAW;
    }

    public final String toString() {
        String str = this.f34193a;
        int iOrdinal = this.f34194b.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
