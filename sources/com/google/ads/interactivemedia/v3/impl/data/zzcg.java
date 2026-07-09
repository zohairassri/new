package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.internal.zzps;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzap.class)
public abstract class zzcg {
    public static zzcg create(int i11, int i12, int i13) {
        return new zzap(i11, i12, i13);
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();

    public static zzcg create(VersionInfo versionInfo) {
        return create(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }
}
