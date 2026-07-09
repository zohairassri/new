package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzag.class)
public abstract class zzbz {
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    private static zzbz create(String str, String str2, String str3, int i11) {
        return new zzag(str, str2, str3, i11);
    }

    public static zzbz forError(String str, int i11) {
        return create(str, "", "unknown", i11);
    }

    public static zzbz forResponse(String str, String str2) {
        return forResponse(str, str2, "unknown");
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();

    public static zzbz forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }
}
