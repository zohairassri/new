package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class ie4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ge4 f28370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ge4 f28371b;

    public ie4(byte[] bArr) throws GeneralSecurityException {
        if (!gf4.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f28370a = a(bArr, 1);
        this.f28371b = a(bArr, 0);
    }

    abstract ge4 a(byte[] bArr, int i11);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f28371b.d(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i11 = length & 15;
            int i12 = i11 == 0 ? length : (length + 16) - i11;
            int iRemaining = byteBuffer.remaining();
            int i13 = iRemaining % 16;
            int i14 = (i13 == 0 ? iRemaining : (iRemaining + 16) - i13) + i12;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i12);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i14);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(me4.a(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f28370a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e11) {
            throw new AEADBadTagException(e11.toString());
        }
    }
}
