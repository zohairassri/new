package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfk {
    public static void zza(String str) {
        if (zze(2)) {
            Log.e("IMASDK", str);
        }
    }

    public static void zzb(String str, Throwable th2) {
        if (zze(2)) {
            Log.e("IMASDK", str, th2);
        }
    }

    public static void zzc(String str) {
        if (zze(1)) {
            Log.i("IMASDK", str);
        }
    }

    public static void zzd(String str) {
        if (zze(2)) {
            Log.w("IMASDK", str);
        }
    }

    private static boolean zze(int i11) {
        return i11 + (-1) > 0;
    }
}
