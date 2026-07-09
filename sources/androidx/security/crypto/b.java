package androidx.security.crypto;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyGenParameterSpec f12623b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12624a;

        static {
            int[] iArr = new int[c.values().length];
            f12624a = iArr;
            try {
                iArr[c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.security.crypto.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static final class C0189b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f12625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        KeyGenParameterSpec f12626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f12627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f12628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f12630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Context f12631g;

        /* JADX INFO: renamed from: androidx.security.crypto.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        static class a {

            /* JADX INFO: renamed from: androidx.security.crypto.b$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
            static class C0190a {
                static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: renamed from: androidx.security.crypto.b$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
            static class C0191b {
                static void a(KeyGenParameterSpec.Builder builder, int i11, int i12) {
                    builder.setUserAuthenticationParameters(i11, i12);
                }
            }

            static b a(C0189b c0189b) {
                c cVar = c0189b.f12627c;
                if (cVar == null && c0189b.f12626b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (cVar == c.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(c0189b.f12625a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (c0189b.f12628d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C0191b.a(keySize, c0189b.f12629e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(c0189b.f12629e);
                        }
                    }
                    if (c0189b.f12630f && c0189b.f12631g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0190a.a(keySize);
                    }
                    c0189b.f12626b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = c0189b.f12626b;
                if (keyGenParameterSpec != null) {
                    return new b(androidx.security.crypto.c.c(keyGenParameterSpec), c0189b.f12626b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public C0189b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public b a() {
            return a.a(this);
        }

        public C0189b b(c cVar) {
            if (a.f12624a[cVar.ordinal()] == 1) {
                if (this.f12626b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f12627c = cVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + cVar);
        }

        public C0189b(Context context, String str) {
            this.f12631g = context.getApplicationContext();
            this.f12625a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public enum c {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f12622a = str;
        this.f12623b = (KeyGenParameterSpec) obj;
    }

    String a() {
        return this.f12622a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f12622a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f12622a + ", isKeyStoreBacked=" + b() + "}";
    }
}
