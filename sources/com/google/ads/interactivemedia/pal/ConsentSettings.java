package com.google.ads.interactivemedia.pal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ConsentSettings {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class Builder {
        @NonNull
        public abstract Builder allowStorage(@NonNull Boolean bool);

        @NonNull
        public abstract ConsentSettings build();

        @NonNull
        public abstract Builder directedForChildOrUnknownAge(@NonNull Boolean bool);

        @NonNull
        public abstract Builder enableCookiesFor3pServerSideAdInsertion(Boolean bool);
    }

    @NonNull
    public static Builder builder() {
        zzb zzbVar = new zzb();
        zzbVar.enableCookiesFor3pServerSideAdInsertion(null);
        Boolean bool = Boolean.FALSE;
        zzbVar.allowStorage(bool);
        zzbVar.directedForChildOrUnknownAge(bool);
        return zzbVar;
    }

    @NonNull
    public abstract Builder toBuilder();

    abstract Boolean zza();

    abstract Boolean zzb();

    abstract Boolean zzc();
}
