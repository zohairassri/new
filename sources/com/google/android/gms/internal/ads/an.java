package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class an implements Runnable {
    /* synthetic */ an(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            bn.f24022b = MessageDigest.getInstance("MD5");
            countDownLatch = bn.f24025e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = bn.f24025e;
        } catch (Throwable th2) {
            bn.f24025e.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
