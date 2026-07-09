package com.google.ads.interactivemedia.v3.impl;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzw {
    public static zzw create(int i11, String str) {
        return new AutoValue_AdsLoaderImpl_MarketAppInfo(i11, str);
    }

    public abstract int appVersion();

    public abstract String packageName();
}
