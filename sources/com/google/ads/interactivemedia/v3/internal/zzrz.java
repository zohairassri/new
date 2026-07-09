package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzrz {
    static Object zza(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap zzb(int i11) {
        int iCeil;
        if (i11 < 3) {
            zzqt.zza(i11, "expectedSize");
            iCeil = i11 + 1;
        } else {
            iCeil = i11 < 1073741824 ? (int) Math.ceil(((double) i11) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashMap(iCeil);
    }
}
