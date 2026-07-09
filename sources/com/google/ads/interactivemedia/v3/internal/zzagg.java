package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzagg extends RuntimeException {
    public zzagg(zzafb zzafbVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzaeg zza() {
        return new zzaeg(getMessage());
    }
}
