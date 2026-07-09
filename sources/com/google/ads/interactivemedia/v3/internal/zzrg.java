package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzrg {
    static int zza(int i11, double d11) {
        int iMax = Math.max(i11, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i12 = iHighestOneBit + iHighestOneBit;
        if (i12 > 0) {
            return i12;
        }
        return 1073741824;
    }

    static int zzb(int i11) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i11) * (-862048943)), 15)) * 461845907);
    }

    static int zzc(Object obj) {
        return zzb(obj == null ? 0 : obj.hashCode());
    }
}
