package ep;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f92801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f92802b;

    public d(byte[] bArr, int i11) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f92801a = a.e(bArr);
        this.f92802b = i11;
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int iRemaining = byteBuffer2.remaining();
        int i11 = iRemaining / 64;
        int i12 = i11 + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            ByteBuffer byteBufferA = a(bArr, this.f92802b + i13);
            if (i13 == i11) {
                qp.f.c(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                qp.f.c(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    ByteBuffer a(byte[] bArr, int i11) {
        int[] iArrB = b(a.e(bArr), i11);
        int[] iArr = (int[]) iArrB.clone();
        a.d(iArr);
        for (int i12 = 0; i12 < iArrB.length; i12++) {
            iArrB[i12] = iArrB[i12] + iArr[i12];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    abstract int[] b(int[] iArr, int i11);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    abstract int e();
}
