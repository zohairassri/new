package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzdo {
    private static int zza = 2;

    public static void zza(@NonNull Context context) {
        context.registerReceiver(new zzdn(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzdk.zza() != com.google.ads.interactivemedia.omid.library.adsession.zzg.CTV) {
            return 2;
        }
        return zza;
    }
}
