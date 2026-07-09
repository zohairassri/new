package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oh f41692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oh f41693b;

    public qh(byte[] bArr) throws GeneralSecurityException {
        if (!xh.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f41692a = a(bArr, 1);
        this.f41693b = a(bArr, 0);
    }

    abstract oh a(byte[] bArr, int i11);

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f41692a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        ByteBuffer byteBufferC = this.f41693b.c(bArr, 0);
        byte[] bArr4 = new byte[32];
        byteBufferC.get(bArr4);
        int iRemaining = byteBuffer.remaining();
        int i11 = iRemaining % 16;
        int i12 = i11 == 0 ? iRemaining : (iRemaining + 16) - i11;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i12 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr3);
        byteBufferOrder.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i12);
        byteBufferOrder.putLong(0L);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrA = th.a(bArr4, byteBufferOrder.array());
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrA);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 16);
        b(byteBufferAllocate, bArr, bArr2, bArr3);
        return byteBufferAllocate.array();
    }
}
