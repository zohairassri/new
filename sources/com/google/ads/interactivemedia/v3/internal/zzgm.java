package com.google.ads.interactivemedia.v3.internal;

import com.chartbeat.androidsdk.QueryKeys;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgm extends zzgk {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzgm() {
        this.zza = QueryKeys.ENGAGED_SECONDS;
        this.zzb = -1L;
        this.zzc = QueryKeys.ENGAGED_SECONDS;
        this.zzd = QueryKeys.ENGAGED_SECONDS;
        this.zze = QueryKeys.ENGAGED_SECONDS;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgk
    protected final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzgm(String str) {
        String str2 = QueryKeys.ENGAGED_SECONDS;
        this.zza = QueryKeys.ENGAGED_SECONDS;
        this.zzb = -1L;
        this.zzc = QueryKeys.ENGAGED_SECONDS;
        this.zzd = QueryKeys.ENGAGED_SECONDS;
        this.zze = QueryKeys.ENGAGED_SECONDS;
        HashMap mapZza = zzgk.zza(str);
        if (mapZza != null) {
            this.zza = mapZza.get(0) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapZza.get(0);
            this.zzb = mapZza.get(1) != null ? ((Long) mapZza.get(1)).longValue() : -1L;
            this.zzc = mapZza.get(2) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapZza.get(2);
            this.zzd = mapZza.get(3) == null ? QueryKeys.ENGAGED_SECONDS : (String) mapZza.get(3);
            this.zze = mapZza.get(4) != null ? (String) mapZza.get(4) : str2;
        }
    }
}
