package com.google.ads.interactivemedia.omid.library.adsession;

import com.google.ads.interactivemedia.v3.internal.zzdp;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzj {
    private final String zza = "Google1";
    private final String zzb = "3.35.1";

    private zzj(String str, String str2) {
    }

    public static zzj zza(String str, String str2) {
        zzdp.zza("Google1", "Name is null or empty");
        zzdp.zza("3.35.1", "Version is null or empty");
        return new zzj("Google1", "3.35.1");
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
