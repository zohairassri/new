package qp;

import hp.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements op.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b.EnumC1214b f122969e = b.EnumC1214b.f102541b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f122970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f122971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f122972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f122973d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) i.f122955c.a(n.this.f122971b);
                mac.init(n.this.f122972c);
                return mac;
            } catch (GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public n(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f122970a = aVar;
        if (!f122969e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f122971b = str;
        this.f122972c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f122973d = 20;
                break;
            case "HMACSHA224":
                this.f122973d = 28;
                break;
            case "HMACSHA256":
                this.f122973d = 32;
                break;
            case "HMACSHA384":
                this.f122973d = 48;
                break;
            case "HMACSHA512":
                this.f122973d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // op.a
    public byte[] a(byte[] bArr, int i11) throws InvalidAlgorithmParameterException {
        if (i11 > this.f122973d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f122970a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f122970a.get()).doFinal(), i11);
    }
}
