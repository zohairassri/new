package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f22671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f22672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CountDownLatch f22673c;

    public b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z11, CountDownLatch countDownLatch) {
        this.f22671a = uri;
        this.f22672b = bitmap;
        this.f22673c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.c.a("OnBitmapLoadedRunnable must be executed in the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.g(null).remove(this.f22671a);
        if (imageReceiver != null) {
            ArrayList arrayList = imageReceiver.f22664b;
            if (arrayList.size() > 0) {
                android.support.v4.media.a.a(arrayList.get(0));
                if (this.f22672b != null) {
                    ImageManager.a(null);
                    throw null;
                }
                ImageManager.f(null).put(this.f22671a, Long.valueOf(SystemClock.elapsedRealtime()));
                ImageManager.a(null);
                ImageManager.c(null);
                throw null;
            }
        }
        this.f22673c.countDown();
        synchronized (ImageManager.f22661a) {
            ImageManager.f22662b.remove(this.f22671a);
        }
    }
}
