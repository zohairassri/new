package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzqf implements Serializable {
    zzqf() {
    }

    public static zzqf zzf() {
        return zzpv.zza;
    }

    public static zzqf zzg(Object obj) {
        return obj == null ? zzpv.zza : new zzqi(obj);
    }

    public static zzqf zzh(Object obj) {
        obj.getClass();
        return new zzqi(obj);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract zzqf zza(zzpz zzpzVar);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract Object zzd();

    public abstract boolean zze();
}
