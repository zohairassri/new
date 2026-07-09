package com.google.ads.interactivemedia.v3.internal;

import okhttp3.internal.http2.Settings;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzadj {
    private final Object zza;
    private final int zzb;

    zzadj(Object obj, int i11) {
        this.zza = obj;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzadj)) {
            return false;
        }
        zzadj zzadjVar = (zzadj) obj;
        return this.zza == zzadjVar.zza && this.zzb == zzadjVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
