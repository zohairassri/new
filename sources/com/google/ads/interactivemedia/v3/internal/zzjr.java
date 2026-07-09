package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzjr implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzjs zza;

    zzjr(zzjs zzjsVar) {
        this.zza = zzjsVar;
    }

    public final void onOpActiveChanged(String str, int i11, String str2, boolean z11) {
        if (z11) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzjs zzjsVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzjsVar.zzc > 0) {
            zzjs zzjsVar2 = this.zza;
            if (jCurrentTimeMillis >= zzjsVar2.zzc) {
                zzjsVar2.zzd = jCurrentTimeMillis - zzjsVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
