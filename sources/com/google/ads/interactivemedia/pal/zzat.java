package com.google.ads.interactivemedia.pal;

import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.pal.m4;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzat {
    static final String zza = l.a().b("play-services-pal");
    public static final int zzb;
    public static final int zzc;
    public static final m4 zzd;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzb = (int) timeUnit.toMillis(20L);
        zzc = (int) timeUnit.toMillis(20L);
        zzd = m4.a(150L);
    }
}
