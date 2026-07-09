package jp;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import cp.r;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import qp.p;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f105880c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f105881d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private KeyStore f105883b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f105884a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        KeyStore f105885b;

        public a() {
            this.f105885b = null;
            if (!c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f105885b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public c() {
        this(new a());
    }

    static boolean d(String str) {
        c cVar = new c();
        synchronized (f105880c) {
            try {
                if (cVar.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void e(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = qp.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        return true;
    }

    private static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    private static cp.a i(cp.a aVar) throws KeyStoreException {
        byte[] bArrC = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(bArrC, aVar.b(aVar.a(bArrC, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    @Override // cp.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f105882a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.f105882a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.c.a(java.lang.String):boolean");
    }

    @Override // cp.r
    public synchronized cp.a b(String str) {
        try {
            String str2 = this.f105882a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f105882a, str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i(new b(qp.r.b("android-keystore://", str), this.f105883b));
    }

    synchronized boolean f(String str) {
        String strB;
        strB = qp.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f105881d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f105883b = keyStore;
                keyStore.load(null);
                return this.f105883b.containsAlias(strB);
            } catch (IOException e11) {
                throw new GeneralSecurityException(e11);
            }
        }
        return this.f105883b.containsAlias(strB);
    }

    private c(a aVar) {
        this.f105882a = aVar.f105884a;
        this.f105883b = aVar.f105885b;
    }
}
