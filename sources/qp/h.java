package qp;

import cp.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements cp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f122951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f122952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f122953c;

    public h(l lVar, t tVar, int i11) {
        this.f122951a = lVar;
        this.f122952b = tVar;
        this.f122953c = i11;
    }

    @Override // cp.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f122951a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(bArrA, this.f122952b.b(f.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // cp.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i11 = this.f122953c;
        if (length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f122953c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f122952b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.f122951a.b(bArrCopyOfRange);
    }
}
