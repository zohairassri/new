package com.google.ads.interactivemedia.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
enum zzak {
    AD_SPAM_CAPABILITIES("aselc"),
    ADS_IDENTITY_TOKEN("adsid"),
    ADVERTISING_ID("rdid"),
    API_FRAMEWORKS("sdk_apis"),
    APP_NAME("an"),
    DESCRIPTION_URL("video_url_to_fetch"),
    ID_TYPE("idtype"),
    LIMIT_AD_TRACKING("is_lat"),
    MOBILE_SPAM("ms"),
    OMID_PARTNER("omid_p"),
    OMID_VERSION("omid_v"),
    ORIENTATION("u_so"),
    PAGE_CORRELATOR("correlator"),
    PAL_VERSION("pal_v"),
    PER_VENDOR_ID("pvid"),
    PER_VENDOR_ID_SCOPE("pvid_s"),
    PLAYER_HEIGHT("vp_h"),
    PLAYER_TYPE("mpt"),
    PLAYER_VERSION("mpv"),
    PLAYER_WIDTH("vp_w"),
    PPID("ppid"),
    PLAY_ACTIVATION("vpa"),
    PLAY_MUTED("vpmute"),
    CONTINUOUS_PLAYBACK("vconp"),
    SDK_VERSION("sdkv"),
    SESSION_ID("sid"),
    SODAR_CORRELATOR("sodar_correlator"),
    SPAM_CORRELATOR("asscs_correlator"),
    WTA_SUPPORTED("wta");

    private final String zzE;

    zzak(String str) {
        this.zzE = str;
    }

    public final String zza() {
        return this.zzE;
    }
}
