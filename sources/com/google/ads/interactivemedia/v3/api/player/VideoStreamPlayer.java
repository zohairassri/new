package com.google.ads.interactivemedia.v3.api.player;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface VideoStreamPlayer extends ContentProgressProvider, VolumeProvider {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface VideoStreamPlayerCallback {
        void onContentComplete();

        void onPause();

        void onResume();

        void onUserTextReceived(@NonNull String str);

        void onVolumeChanged(int i11);
    }

    void addCallback(@NonNull VideoStreamPlayerCallback videoStreamPlayerCallback);

    void loadUrl(@NonNull String str, @NonNull List<HashMap<String, String>> list);

    void onAdBreakEnded();

    void onAdBreakStarted();

    void onAdPeriodEnded();

    void onAdPeriodStarted();

    void pause();

    void removeCallback(@NonNull VideoStreamPlayerCallback videoStreamPlayerCallback);

    void resume();

    void seek(long j11);
}
