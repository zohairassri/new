package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgj {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzgj(byte[] bArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            this.zza[i11] = (byte) i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.zza;
            byte b11 = bArr2[i13];
            i12 = (i12 + b11 + bArr[i13 % bArr.length]) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b11;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i11 = this.zzb;
        int i12 = this.zzc;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.zza;
            i11 = (i11 + 1) & 255;
            byte b11 = bArr2[i11];
            i12 = (i12 + b11) & 255;
            bArr2[i11] = bArr2[i12];
            bArr2[i12] = b11;
            bArr[i13] = (byte) (bArr2[(bArr2[i11] + b11) & 255] ^ bArr[i13]);
        }
        this.zzb = i11;
        this.zzc = i12;
    }
}
