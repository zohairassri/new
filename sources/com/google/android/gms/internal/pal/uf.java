package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class uf extends nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41861b;

    /* synthetic */ uf(String str, int i11, tf tfVar) {
        this.f41860a = str;
        this.f41861b = i11;
    }

    public final String toString() {
        String str = this.f41860a;
        int i11 = this.f41861b - 2;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
