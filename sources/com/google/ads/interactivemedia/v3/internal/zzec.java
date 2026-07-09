package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzec {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzeb zzd = null;

    public zzec() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzeb zzebVar = (zzeb) this.zzc.poll();
        this.zzd = zzebVar;
        if (zzebVar != null) {
            zzebVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzeb zzebVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzeb zzebVar) {
        zzebVar.zzb(this);
        this.zzc.add(zzebVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}
