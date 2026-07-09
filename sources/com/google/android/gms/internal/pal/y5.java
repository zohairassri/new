package com.google.android.gms.internal.pal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class y5 implements Runnable {
    /* synthetic */ y5(x5 x5Var) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            z5.f42260b = MessageDigest.getInstance("MD5");
            countDownLatch = z5.f42263e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = z5.f42263e;
        } catch (Throwable th2) {
            z5.f42263e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
