package com.google.ads.interactivemedia.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzar implements Runnable {
    public final /* synthetic */ NonceManager zza;

    public /* synthetic */ zzar(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NonceManager nonceManager = this.zza;
        nonceManager.zzg.zza(7, nonceManager.zzk);
    }
}
