package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public enum tx implements bz4 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final cz4 f35784r = new cz4() { // from class: com.google.android.gms.internal.ads.tx.a
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35786a;

    tx(int i11) {
        this.f35786a = i11;
    }

    public static tx a(int i11) {
        switch (i11) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static dz4 b() {
        return ux.f36495a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f35786a);
    }

    @Override // com.google.android.gms.internal.ads.bz4
    public final int zza() {
        return this.f35786a;
    }
}
