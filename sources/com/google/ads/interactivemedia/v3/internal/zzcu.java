package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcu {
    private final zzeg zza;
    private final String zzb;
    private final FriendlyObstructionPurpose zzc;
    private final String zzd;

    public zzcu(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.zza = new zzeg(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = friendlyObstructionPurpose;
        this.zzd = str;
    }

    public final FriendlyObstructionPurpose zza() {
        return this.zzc;
    }

    public final zzeg zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
