package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zznz extends zznv {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    /* synthetic */ zznz(String str, boolean z11, boolean z12, boolean z13, long j11, boolean z14, long j12, zzny zznyVar) {
        this.zza = str;
        this.zzb = z11;
        this.zzc = z12;
        this.zzd = j11;
        this.zze = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznv) {
            zznv zznvVar = (zznv) obj;
            if (this.zza.equals(zznvVar.zzd()) && this.zzb == zznvVar.zzh() && this.zzc == zznvVar.zzg()) {
                zznvVar.zzf();
                if (this.zzd == zznvVar.zzb()) {
                    zznvVar.zze();
                    if (this.zze == zznvVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.zze) ^ ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.zzd + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.zze + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final boolean zze() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznv
    public final boolean zzh() {
        return this.zzb;
    }
}
