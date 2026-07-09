package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class de3 implements ce3 {
    /* synthetic */ de3(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final ExecutorService a(ThreadFactory threadFactory, int i11) {
        return b(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final ExecutorService b(int i11, ThreadFactory threadFactory, int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i11, i11, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.ce3
    public final ExecutorService zzb(int i11) {
        return b(1, Executors.defaultThreadFactory(), 2);
    }
}
