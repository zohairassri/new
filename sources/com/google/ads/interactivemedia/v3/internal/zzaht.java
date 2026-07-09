package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaht {
    private final Object zza;
    private final int zzb;

    zzaht(Object obj) {
        this.zzb = System.identityHashCode(obj);
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaht)) {
            return false;
        }
        zzaht zzahtVar = (zzaht) obj;
        return this.zzb == zzahtVar.zzb && this.zza == zzahtVar.zza;
    }

    public final int hashCode() {
        return this.zzb;
    }
}
