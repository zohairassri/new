package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class ge4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f26968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26969b;

    public ge4(byte[] bArr, int i11) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f26968a = ee4.d(bArr);
        this.f26969b = i11;
    }

    abstract int[] a(int[] iArr, int i11);

    abstract int b();

    public final byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != b()) {
            int iB = b();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iB).length() + 36);
            sb2.append("The nonce length (in bytes) must be ");
            sb2.append(iB);
            throw new GeneralSecurityException(sb2.toString());
        }
        int iRemaining = byteBuffer.remaining();
        int i11 = iRemaining / 64;
        for (int i12 = 0; i12 < i11 + 1; i12++) {
            ByteBuffer byteBufferD = d(bArr, this.f26969b + i12);
            if (i12 == i11) {
                bu4.c(byteBufferAllocate, byteBuffer, byteBufferD, iRemaining % 64);
            } else {
                bu4.c(byteBufferAllocate, byteBuffer, byteBufferD, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    final ByteBuffer d(byte[] bArr, int i11) {
        int[] iArrA = a(ee4.d(bArr), i11);
        int[] iArr = (int[]) iArrA.clone();
        ee4.b(iArr);
        for (int i12 = 0; i12 < 16; i12++) {
            iArrA[i12] = iArrA[i12] + iArr[i12];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrA, 0, 16);
        return byteBufferOrder;
    }
}
