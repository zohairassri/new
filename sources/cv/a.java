package cv;

import bv.f;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f87327a = new a();

    private a() {
    }

    public final PrivateKey a(InputStream keystoreStream, String aliasName, String p12Password, f keystoreType) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        Intrinsics.checkNotNullParameter(keystoreStream, "keystoreStream");
        Intrinsics.checkNotNullParameter(aliasName, "aliasName");
        Intrinsics.checkNotNullParameter(p12Password, "p12Password");
        Intrinsics.checkNotNullParameter(keystoreType, "keystoreType");
        KeyStore keyStore = KeyStore.getInstance(keystoreType.name());
        char[] charArray = p12Password.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        keyStore.load(keystoreStream, charArray);
        char[] charArray2 = p12Password.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        Key key = keyStore.getKey(aliasName, charArray2);
        Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.security.PrivateKey");
        return (PrivateKey) key;
    }
}
