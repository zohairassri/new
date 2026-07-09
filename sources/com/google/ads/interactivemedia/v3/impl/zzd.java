package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzd implements AdErrorEvent {
    private final AdError zza;
    private final Object zzb;

    zzd(AdError adError) {
        this.zza = adError;
        this.zzb = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final AdError getError() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final Object getUserRequestContext() {
        return this.zzb;
    }

    public final String toString() {
        return String.format("AdErrorEvent: [error=%s]", this.zza);
    }

    zzd(AdError adError, Object obj) {
        this.zza = adError;
        this.zzb = obj;
    }
}
