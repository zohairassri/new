package com.google.ads.interactivemedia.v3.api;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface StreamRequest extends BaseRequest {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum StreamFormat {
        DASH,
        HLS
    }

    Map<String, String> getAdTagParameters();

    String getAdTagUrl();

    @NonNull
    String getApiKey();

    String getAssetKey();

    @NonNull
    String getAuthToken();

    String getContentSourceId();

    String getContentSourceUrl();

    String getCustomAssetKey();

    boolean getEnableNonce();

    @NonNull
    StreamFormat getFormat();

    String getLiveStreamEventId();

    @NonNull
    String getManifestSuffix();

    String getNetworkCode();

    String getOAuthToken();

    String getProjectNumber();

    String getRegion();

    @NonNull
    String getStreamActivityMonitorId();

    @NonNull
    Boolean getUseQAStreamBaseUrl();

    String getVideoId();

    Map<String, Object> getVideoStitcherSessionOptions();

    String getVodConfigId();

    void setAdTagParameters(@NonNull Map<String, String> map);

    void setAuthToken(@NonNull String str);

    void setEnableNonce(boolean z11);

    void setFormat(@NonNull StreamFormat streamFormat);

    void setManifestSuffix(@NonNull String str);

    void setStreamActivityMonitorId(@NonNull String str);

    void setUseQAStreamBaseUrl(@NonNull Boolean bool);

    void setVideoStitcherSessionOptions(@NonNull Map<String, Object> map);
}
