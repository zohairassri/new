package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzuf extends zzud implements zzuu {
    protected zzuf() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzud
    protected /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    protected abstract zzuu zzc();

    @Override // com.google.ads.interactivemedia.v3.internal.zzuu
    public final void zzo(Runnable runnable, Executor executor) {
        zzc().zzo(runnable, executor);
    }
}
