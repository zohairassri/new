package com.google.ads.interactivemedia.v3.api;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.internal.zzex;
import com.google.ads.interactivemedia.v3.internal.zzqf;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public interface BaseRequest {
    @NonNull
    String getContentUrl();

    SecureSignals getSecureSignals();

    @NonNull
    Object getUserRequestContext();

    void setContentUrl(@NonNull String str);

    void setSecureSignals(SecureSignals secureSignals);

    void setUserRequestContext(@NonNull Object obj);

    zzex zza();

    zzqf zzb();

    void zzc(long j11);
}
