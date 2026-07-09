package com.google.android.gms.internal.ads;

import io.agora.base.internal.video.FactorBitrateAdjuster;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum ky implements bz4 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(FactorBitrateAdjuster.FACTOR_BASE);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final cz4 f29907e = new cz4() { // from class: com.google.android.gms.internal.ads.ky.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29909a;

    ky(int i11) {
        this.f29909a = i11;
    }

    public static ky a(int i11) {
        if (i11 == 0) {
            return ENUM_FALSE;
        }
        if (i11 == 1) {
            return ENUM_TRUE;
        }
        if (i11 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static dz4 b() {
        return ly.f30484a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f29909a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f29909a;
    }
}
