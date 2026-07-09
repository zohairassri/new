package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import fn.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ImageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22661a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f22662b = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    @KeepName
    final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f22663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f22664b;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i11, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            ImageManager.h(null).execute(new a(null, this.f22663a, parcelFileDescriptor));
        }
    }

    static /* bridge */ /* synthetic */ Context a(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ Handler b(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ e c(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ Map f(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ Map g(ImageManager imageManager) {
        throw null;
    }

    static /* bridge */ /* synthetic */ ExecutorService h(ImageManager imageManager) {
        throw null;
    }
}
