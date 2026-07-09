package com.google.android.gms.internal.pal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class nh extends oh {
    public nh(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    @Override // com.google.android.gms.internal.pal.oh
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.pal.oh
    public final int[] b(int[] iArr, int i11) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        kh.b(iArr2, this.f41628a);
        iArr2[12] = i11;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
