package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfq {
    public static boolean zza(BaseDisplayContainer baseDisplayContainer, com.google.ads.interactivemedia.v3.impl.data.zzce zzceVar) {
        return zzceVar.x().intValue() >= 0 && zzceVar.width().intValue() >= 0 && zzceVar.x().intValue() + zzceVar.width().intValue() <= baseDisplayContainer.getAdContainer().getWidth() && zzceVar.y().intValue() >= 0 && zzceVar.height().intValue() >= 0 && zzceVar.y().intValue() + zzceVar.height().intValue() <= baseDisplayContainer.getAdContainer().getHeight();
    }
}
