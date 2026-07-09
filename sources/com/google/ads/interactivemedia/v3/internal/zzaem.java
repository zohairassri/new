package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class zzaem {
    protected volatile zzafb zza;
    private volatile zzacw zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaem)) {
            return false;
        }
        zzaem zzaemVar = (zzaem) obj;
        zzafb zzafbVar = this.zza;
        zzafb zzafbVar2 = zzaemVar.zza;
        if (zzafbVar == null && zzafbVar2 == null) {
            return zzb().equals(zzaemVar.zzb());
        }
        if (zzafbVar != null && zzafbVar2 != null) {
            return zzafbVar.equals(zzafbVar2);
        }
        if (zzafbVar != null) {
            zzaemVar.zzd(zzafbVar.zzaS());
            return zzafbVar.equals(zzaemVar.zza);
        }
        zzd(zzafbVar2.zzaS());
        return this.zza.equals(zzafbVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzacv) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzax();
        }
        return 0;
    }

    public final zzacw zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzacw.zzb;
                } else {
                    this.zzb = this.zza.zzau();
                }
                return this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzafb zzc(zzafb zzafbVar) {
        zzafb zzafbVar2 = this.zza;
        this.zzb = null;
        this.zza = zzafbVar;
        return zzafbVar2;
    }

    protected final void zzd(zzafb zzafbVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzafbVar;
                this.zzb = zzacw.zzb;
            } catch (zzaeg unused) {
                this.zza = zzafbVar;
                this.zzb = zzacw.zzb;
            }
        }
    }
}
