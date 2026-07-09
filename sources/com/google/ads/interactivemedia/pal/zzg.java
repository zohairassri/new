package com.google.ads.interactivemedia.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzg extends zzq {
    private final String zza;
    private final String zzb;
    private final String zzc;

    /* synthetic */ zzg(String str, String str2, String str3, zzf zzfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzq) {
            zzq zzqVar = (zzq) obj;
            if (this.zza.equals(zzqVar.zzb()) && this.zzb.equals(zzqVar.zzc()) && this.zzc.equals(zzqVar.zza())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode() ^ ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Gen204LoggerData{palVersion=" + this.zza + ", sdkVersion=" + this.zzb + ", correlator=" + this.zzc + "}";
    }

    @Override // com.google.ads.interactivemedia.pal.zzq
    final String zza() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.zzq
    final String zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.pal.zzq
    final String zzc() {
        return this.zzb;
    }
}
