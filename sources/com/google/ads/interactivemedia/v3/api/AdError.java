package com.google.ads.interactivemedia.v3.api;

import androidx.annotation.NonNull;
import com.comscore.streaming.ContentDeliveryMode;
import com.comscore.streaming.ContentDeliverySubscriptionType;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class AdError extends Exception {
    private final AdErrorCode zza;
    private final AdErrorType zzb;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum AdErrorCode {
        INTERNAL_ERROR(-1),
        VAST_MALFORMED_RESPONSE(100),
        UNKNOWN_AD_RESPONSE(1010),
        VAST_TRAFFICKING_ERROR(200),
        VAST_LOAD_TIMEOUT(301),
        VAST_TOO_MANY_REDIRECTS(302),
        VAST_NO_ADS_AFTER_WRAPPER(303),
        VIDEO_PLAY_ERROR(400),
        VAST_MEDIA_LOAD_TIMEOUT(402),
        VAST_LINEAR_ASSET_MISMATCH(403),
        OVERLAY_AD_PLAYING_FAILED(500),
        OVERLAY_AD_LOADING_FAILED(ContentDeliveryMode.ON_DEMAND),
        VAST_NONLINEAR_ASSET_MISMATCH(ContentDeliveryMode.DVR),
        COMPANION_AD_LOADING_FAILED(ContentDeliverySubscriptionType.SUBSCRIPTION),
        UNKNOWN_ERROR(900),
        VAST_EMPTY_RESPONSE(1009),
        FAILED_TO_REQUEST_ADS(1005),
        VAST_ASSET_NOT_FOUND(1007),
        ADS_REQUEST_NETWORK_ERROR(1012),
        INVALID_ARGUMENTS(1101),
        PLAYLIST_NO_CONTENT_TRACKING(1205),
        UNEXPECTED_ADS_LOADED_EVENT(1206),
        ADS_PLAYER_NOT_PROVIDED(1207);

        private final int zzb;

        AdErrorCode(int i11) {
            this.zzb = i11;
        }

        @NonNull
        public static AdErrorCode getErrorCodeByNumber(int i11) {
            for (AdErrorCode adErrorCode : values()) {
                if (adErrorCode.getErrorNumber() == i11) {
                    return adErrorCode;
                }
            }
            return i11 == 1204 ? INTERNAL_ERROR : UNKNOWN_ERROR;
        }

        public int getErrorNumber() {
            return this.zzb;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return "AdErrorCode [name: " + name() + ", number: " + this.zzb + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum AdErrorType {
        LOAD,
        PLAY
    }

    public AdError(@NonNull AdErrorType adErrorType, int i11, @NonNull String str) {
        this(adErrorType, AdErrorCode.getErrorCodeByNumber(i11), str);
    }

    @NonNull
    public AdErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeNumber() {
        return this.zza.getErrorNumber();
    }

    @NonNull
    public AdErrorType getErrorType() {
        return this.zzb;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    @NonNull
    public String toString() {
        AdErrorCode adErrorCode = this.zza;
        return "AdError [errorType: " + String.valueOf(this.zzb) + ", errorCode: " + String.valueOf(adErrorCode) + ", message: " + getMessage() + "]";
    }

    public AdError(@NonNull AdErrorType adErrorType, @NonNull AdErrorCode adErrorCode, @NonNull String str) {
        super(str);
        this.zzb = adErrorType;
        this.zza = adErrorCode;
    }
}
