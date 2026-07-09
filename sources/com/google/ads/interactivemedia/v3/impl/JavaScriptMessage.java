package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.internal.zzqe;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class JavaScriptMessage {
    private final MsgChannel zza;
    private final Object zzb;
    private final String zzc;
    private final MsgType zzd;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum MsgChannel {
        activityMonitor,
        adsLoader,
        adsManager,
        contentTimeUpdate,
        displayContainer,
        log,
        nativeUi,
        nativeXhr,
        omid,
        userInteraction,
        videoDisplay1,
        videoDisplay2,
        webViewLoaded
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum MsgType {
        activate,
        adBreakEnded,
        adBreakFetchError,
        adBreakReady,
        adBreakStarted,
        adBuffering,
        adCanPlay,
        adMetadata,
        adPeriodEnded,
        adPeriodStarted,
        adProgress,
        adsLoaded,
        allAdsCompleted,
        appBackgrounding,
        appForegrounding,
        appStateChanged,
        click,
        companionView,
        complete,
        contentComplete,
        contentPauseRequested,
        contentResumeRequested,
        contentTimeUpdate,
        csi,
        nativeInstrumentation,
        cuepointsChanged,
        destroy,
        discardAdBreak,
        displayCompanions,
        durationChange,
        end,
        error,
        firstquartile,
        focusUiElement,
        forwardCompatibleUnload,
        nativeRequest,
        nativeResponse,
        getViewability,
        hide,
        iconClicked,
        iconFallbackImageClosed,
        iconRendered,
        impression,
        init,
        initialized,
        load,
        loaded,
        loadStream,
        log,
        midpoint,
        mute,
        navigationRequested,
        navigationRequestedFailed,
        omidReady,
        omidUnavailable,
        pause,
        play,
        registerFriendlyObstructions,
        replaceAdTagParameters,
        requestAds,
        requestNextAdBreak,
        requestStream,
        resizeAndPositionVideo,
        restoreSizeAndPositionVideo,
        resume,
        showVideo,
        skip,
        skippableStateChanged,
        start,
        startTracking,
        stopTracking,
        streamInitialized,
        thirdquartile,
        timedMetadata,
        timeupdate,
        unload,
        unmute,
        updateUiState,
        videoClicked,
        videoIconClicked,
        viewability,
        volumeChange,
        waiting,
        loadStreamMetadata
    }

    public JavaScriptMessage(@NonNull MsgChannel msgChannel, @NonNull MsgType msgType, @NonNull String str, @NonNull Object obj) {
        this.zza = msgChannel;
        this.zzd = msgType;
        this.zzc = str;
        this.zzb = obj;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof JavaScriptMessage)) {
            return false;
        }
        JavaScriptMessage javaScriptMessage = (JavaScriptMessage) obj;
        return this.zza == javaScriptMessage.zza && zzqe.zza(this.zzb, javaScriptMessage.zzb) && zzqe.zza(this.zzc, javaScriptMessage.zzc) && this.zzd == javaScriptMessage.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    @NonNull
    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", this.zza, this.zzd, this.zzc, this.zzb);
    }

    @NonNull
    public final MsgChannel zza() {
        return this.zza;
    }

    @NonNull
    public final MsgType zzb() {
        return this.zzd;
    }

    @NonNull
    public final Object zzc() {
        return this.zzb;
    }

    @NonNull
    public final String zzd() {
        return this.zzc;
    }
}
