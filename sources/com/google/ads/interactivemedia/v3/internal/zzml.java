package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzml {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzml(String str, Object obj, int i11) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i11;
    }

    public static zzml zza(String str, long j11) {
        return new zzml(str, Long.valueOf(j11), 2);
    }

    public static zzml zzb(String str, boolean z11) {
        return new zzml(str, Boolean.valueOf(z11), 1);
    }

    public final Object zzc() {
        zzmq zzmqVarZza = zzms.zza();
        if (zzmqVarZza != null) {
            return this.zzc + (-1) != 0 ? zzmqVarZza.zzb(this.zza, ((Long) this.zzb).longValue()) : zzmqVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzms.zzb() != null) {
            zzms.zzb().zza();
        }
        return this.zzb;
    }
}
