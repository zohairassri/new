package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum ov implements bz4 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final cz4 f32117f = new cz4() { // from class: com.google.android.gms.internal.ads.ov.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32119a;

    ov(int i11) {
        this.f32119a = i11;
    }

    public static ov a(int i11) {
        if (i11 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return TWO_G;
        }
        if (i11 == 2) {
            return THREE_G;
        }
        if (i11 != 4) {
            return null;
        }
        return LTE;
    }

    public static dz4 b() {
        return pv.f33268a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32119a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f32119a;
    }
}
