package qp;

import cp.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final op.a f122975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f122976b;

    public o(op.a aVar, int i11) throws InvalidAlgorithmParameterException {
        this.f122975a = aVar;
        this.f122976b = i11;
        if (i11 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i11);
    }

    @Override // cp.t
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // cp.t
    public byte[] b(byte[] bArr) {
        return this.f122975a.a(bArr, this.f122976b);
    }
}
