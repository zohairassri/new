package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzsn extends zzsd implements Serializable {
    final zzsd zza;

    zzsn(zzsd zzsdVar) {
        this.zza = zzsdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsn) {
            return this.zza.equals(((zzsn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd
    public final zzsd zza() {
        return this.zza;
    }
}
