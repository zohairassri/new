package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f41628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41629b;

    public oh(byte[] bArr, int i11) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f41628a = kh.d(bArr);
        this.f41629b = i11;
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i11);

    final ByteBuffer c(byte[] bArr, int i11) {
        int[] iArrB = b(kh.d(bArr), i11);
        int[] iArr = (int[]) iArrB.clone();
        kh.c(iArr);
        for (int i12 = 0; i12 < 16; i12++) {
            iArrB[i12] = iArrB[i12] + iArr[i12];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBufferWrap.remaining();
        int i11 = iRemaining / 64;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            ByteBuffer byteBufferC = c(bArr, this.f41629b + i13);
            if (i13 == i11) {
                vs.a(byteBuffer, byteBufferWrap, byteBufferC, iRemaining % 64);
            } else {
                vs.a(byteBuffer, byteBufferWrap, byteBufferC, 64);
            }
        }
    }
}
