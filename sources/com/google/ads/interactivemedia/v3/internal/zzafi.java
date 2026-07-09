package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzafi {
    public static final /* synthetic */ int zza = 0;
    private static final zzafi zzb = new zzafi();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzafu zzc = new zzaet();

    private zzafi() {
    }

    public static zzafi zza() {
        return zzb;
    }

    public final zzaft zzb(Class cls) {
        zzaee.zzc(cls, "messageType");
        zzaft zzaftVar = (zzaft) this.zzd.get(cls);
        if (zzaftVar != null) {
            return zzaftVar;
        }
        zzaft zzaftVarZza = this.zzc.zza(cls);
        zzaee.zzc(cls, "messageType");
        zzaft zzaftVar2 = (zzaft) this.zzd.putIfAbsent(cls, zzaftVarZza);
        return zzaftVar2 == null ? zzaftVarZza : zzaftVar2;
    }
}
