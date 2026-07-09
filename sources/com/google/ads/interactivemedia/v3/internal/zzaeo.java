package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaeo {
    zzaeo() {
    }

    public static final List zza(Object obj, long j11) {
        zzaed zzaedVar = (zzaed) zzago.zzf(obj, j11);
        if (zzaedVar.zzc()) {
            return zzaedVar;
        }
        int size = zzaedVar.size();
        zzaed zzaedVarZzd = zzaedVar.zzd(size == 0 ? 10 : size + size);
        zzago.zzs(obj, j11, zzaedVarZzd);
        return zzaedVarZzd;
    }
}
