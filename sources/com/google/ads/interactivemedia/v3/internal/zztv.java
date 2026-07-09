package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zztv extends zzts {
    private zztv() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzts
    final int zza(zztw zztwVar) {
        int i11;
        synchronized (zztwVar) {
            i11 = zztwVar.remaining - 1;
            zztwVar.remaining = i11;
        }
        return i11;
    }

    /* synthetic */ zztv(zztu zztuVar) {
        super(null);
    }
}
