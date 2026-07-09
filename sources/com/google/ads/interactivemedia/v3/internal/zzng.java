package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzng extends Exception {
    private final int zza;

    public zzng(int i11) {
        super("Signal SDK error code: " + i11);
        this.zza = i11;
    }

    public final int zza() {
        return this.zza;
    }
}
