package com.google.ads.interactivemedia.v3.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzpi {
    final /* synthetic */ zzpj zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzpi(zzpj zzpjVar, byte[] bArr, zzph zzphVar) {
        this.zza = zzpjVar;
        this.zzb = bArr;
    }

    public final zzpi zza(int i11) {
        this.zzd = i11;
        return this;
    }

    public final zzpi zzb(int i11) {
        this.zzc = i11;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzpj zzpjVar = this.zza;
            if (zzpjVar.zzb) {
                zzpjVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
