package com.google.ads.interactivemedia.pal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.pal.l4;
import com.google.android.gms.internal.pal.oc;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaj implements l4 {
    zzaj() {
    }

    public static final Handler zza() {
        return new oc(Looper.getMainLooper());
    }
}
