package com.google.ads.interactivemedia.pal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class NonceLoaderException extends Exception {
    private final int zza;

    public NonceLoaderException(int i11, @NonNull Exception exc) {
        super("NonceLoader exception, errorCode : " + i11, exc);
        this.zza = i11;
    }

    @NonNull
    public static NonceLoaderException zzb(int i11) {
        return new NonceLoaderException(i11, new Exception());
    }

    final int zza() {
        return this.zza;
    }
}
