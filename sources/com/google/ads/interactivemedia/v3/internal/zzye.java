package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class zzye {
    public static final zzye zzb;

    static {
        zzye zzybVar = null;
        if (zzxo.zza()) {
            try {
                zzybVar = new zzyb(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzybVar == null) {
            zzybVar = new zzyc();
        }
        zzb = zzybVar;
    }

    /* synthetic */ zzye(zzyd zzydVar) {
    }

    public abstract boolean zza(AccessibleObject accessibleObject, Object obj);
}
