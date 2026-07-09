package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class je4 extends ge4 {
    public je4(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.ge4
    final int[] a(int[] iArr, int i11) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        ee4.a(iArr2, ee4.e(this.f26968a, iArr));
        iArr2[12] = i11;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.ge4
    final int b() {
        return 24;
    }
}
