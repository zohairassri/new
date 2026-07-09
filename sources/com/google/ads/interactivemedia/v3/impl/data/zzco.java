package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzco {
    public abstract zzcp build();

    public abstract zzco volume(float f11);

    public zzco volumePercentage(int i11) {
        return volume(Math.min(Math.max(i11, 0), 100) / 100.0f);
    }
}
