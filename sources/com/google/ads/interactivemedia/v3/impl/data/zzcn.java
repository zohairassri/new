package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
@zzps(zza = zzaw.class)
public abstract class zzcn {
    public static zzcn create(Integer num, boolean z11) {
        return new zzaw(num, z11);
    }

    public abstract Integer downloadBandwidthKbps();

    public abstract boolean rendersUiNatively();
}
