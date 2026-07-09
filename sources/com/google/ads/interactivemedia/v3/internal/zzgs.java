package com.google.ads.interactivemedia.v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzgs implements Runnable {
    private zzgs() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzgt.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzgt.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzgt.zzb;
        } catch (Throwable th2) {
            zzgt.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }

    /* synthetic */ zzgs(zzgr zzgrVar) {
    }
}
