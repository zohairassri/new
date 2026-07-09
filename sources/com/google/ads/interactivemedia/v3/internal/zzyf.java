package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzyf {
    public static boolean zza(AccessibleObject accessibleObject, Object obj) {
        return zzye.zzb.zza(accessibleObject, obj);
    }

    public static int zzb(List list, Class cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iZza = ((zzwf) it.next()).zza();
            if (iZza != 2) {
                return iZza;
            }
        }
        return 1;
    }
}
