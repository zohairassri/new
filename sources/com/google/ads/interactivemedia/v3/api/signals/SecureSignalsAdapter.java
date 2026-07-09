package com.google.ads.interactivemedia.v3.api.signals;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.api.VersionInfo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface SecureSignalsAdapter {
    void collectSignals(@NonNull Context context, @NonNull SecureSignalsCollectSignalsCallback secureSignalsCollectSignalsCallback);

    @NonNull
    VersionInfo getSDKVersion();

    @NonNull
    VersionInfo getVersion();

    void initialize(@NonNull Context context, @NonNull SecureSignalsInitializeCallback secureSignalsInitializeCallback);
}
