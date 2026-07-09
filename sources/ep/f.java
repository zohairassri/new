package ep;

import hp.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b.EnumC1214b f92803c = b.EnumC1214b.f102540a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f92804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f92805b;

    public f(byte[] bArr) throws GeneralSecurityException {
        if (!f92803c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f92804a = e(bArr, 1);
        this.f92805b = e(bArr, 0);
    }

    private byte[] c(byte[] bArr) {
        ByteBuffer byteBufferA = this.f92805b.a(bArr, 0);
        byte[] bArr2 = new byte[32];
        byteBufferA.get(bArr2);
        return bArr2;
    }

    private static byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i11 = iRemaining % 16;
        int i12 = (i11 == 0 ? iRemaining : (iRemaining + 16) - i11) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i12 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i12);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
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
            i.f(c(bArr), d(bArr2, byteBuffer), bArr3);
            byteBuffer.position(iPosition);
            return this.f92804a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e11) {
            throw new AEADBadTagException(e11.toString());
        }
    }

    public void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        this.f92804a.d(byteBuffer, bArr, bArr2);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArrA = i.a(c(bArr), d(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrA);
    }

    abstract d e(byte[] bArr, int i11);
}
