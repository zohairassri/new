package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzaf.class)
public abstract class zzby {
    public static zzby create(zzbx zzbxVar, String str, String str2, String str3, String str4, int i11, int i12) {
        return new zzaf(zzbxVar, str, str2, str4, str3, i11, i12);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract zzbx requestType();

    public abstract String url();

    public abstract String userAgent();
}
