package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzaes implements zzaez {
    private final zzaez[] zza;

    zzaes(zzaez... zzaezVarArr) {
        this.zza = zzaezVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final zzaey zzb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            zzaez zzaezVar = this.zza[i11];
            if (zzaezVar.zzc(cls)) {
                return zzaezVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final boolean zzc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.zza[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
