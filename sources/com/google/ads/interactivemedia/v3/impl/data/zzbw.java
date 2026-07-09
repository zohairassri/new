package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;
import com.google.ads.interactivemedia.v3.internal.zzqo;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzae.class)
public abstract class zzbw {
    static zzbw create(String str, String str2, String str3) {
        return new zzae(str, str2, str3);
    }

    public abstract String message();

    public abstract String name();

    public abstract String stackTrace();

    public static zzbw create(Throwable th2) {
        return new zzae(th2.getClass().getName(), th2.getMessage(), zzqo.zza(th2));
    }
}
