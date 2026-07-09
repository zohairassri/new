package com.google.ads.interactivemedia.pal;

import android.os.Handler;
import com.google.android.gms.internal.pal.m4;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzav {
    private final Handler zza;
    private final m4 zzb;
    private Runnable zzc;

    public zzav(Handler handler, m4 m4Var) {
        this.zza = handler;
        this.zzb = m4Var;
    }

    protected final void finalize() throws Throwable {
        zzd();
        super.finalize();
    }

    public final void zzc(Runnable runnable) {
        if (this.zzc != null) {
            return;
        }
        zzau zzauVar = new zzau(this, runnable);
        this.zzc = zzauVar;
        this.zza.postDelayed(zzauVar, this.zzb.zzd());
    }

    public final void zzd() {
        Runnable runnable = this.zzc;
        if (runnable == null) {
            return;
        }
        this.zza.removeCallbacks(runnable);
        this.zzc = null;
    }
}
