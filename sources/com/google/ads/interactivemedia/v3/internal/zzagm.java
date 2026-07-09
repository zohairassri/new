package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzagm extends zzagn {
    zzagm(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j11));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j11));
    }

    /* JADX WARN: Failed to inline method: com.google.ads.interactivemedia.v3.internal.zzago.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.ads.interactivemedia.v3.internal.zzago.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z11' boolean)' in method call: com.google.ads.interactivemedia.v3.internal.zzago.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z11' boolean)' in method call: com.google.ads.interactivemedia.v3.internal.zzago.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzago.zzb) {
            zzago.zzi(obj, j11, z11);
        } else {
            zzago.zzj(obj, j11, z11);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zzd(Object obj, long j11, byte b11) {
        if (zzago.zzb) {
            zzago.zzD(obj, j11, b11);
        } else {
            zzago.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zze(Object obj, long j11, double d11) {
        this.zza.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zzf(Object obj, long j11, float f11) {
        this.zza.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final boolean zzg(Object obj, long j11) {
        return zzago.zzb ? zzago.zzt(obj, j11) : zzago.zzu(obj, j11);
    }
}
