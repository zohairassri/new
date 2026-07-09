package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class jk4 {
    public static byte[] a(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            byte b11 = bArr[i11];
            byte b12 = (byte) ((b11 + b11) & 254);
            bArr2[i11] = b12;
            if (i11 < 15) {
                bArr2[i11] = (byte) (((bArr[i12] >> 7) & 1) | b12);
            }
            i11 = i12;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
