package jb0;

import android.util.Base64;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f105508a = "RSA/ECB/PKCS1Padding";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fb0.a f105509b;

    i(fb0.a aVar) {
        this.f105509b = aVar;
    }

    private byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = bArr[i11];
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            bArr3[bArr.length + i12] = bArr2[i12];
        }
        return bArr3;
    }

    private byte[] b(Cipher cipher, byte[] bArr, int i11) {
        byte[] bArrA = new byte[0];
        byte[] bArr2 = new byte[bArr.length > i11 ? i11 : bArr.length];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            if (i12 > 0 && i12 % i11 == 0) {
                bArrA = a(bArrA, cipher.doFinal(bArr2));
                bArr2 = new byte[i12 + i11 > bArr.length ? bArr.length - i12 : i11];
            }
            bArr2[i12 % i11] = bArr[i12];
        }
        return a(bArrA, cipher.doFinal(bArr2));
    }

    private String d(String str, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, key);
            return "" + Base64.encodeToString(b(cipher, str.getBytes("UTF-8"), 245), 0);
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e11) {
            this.f105509b.d("data cannot be encrypted", e11);
            return "";
        }
    }

    private Key e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e11) {
            e11.printStackTrace();
            return null;
        } catch (InvalidKeySpecException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public String c(String str, String str2) {
        try {
            Key keyE = e(str2);
            if (keyE != null) {
                return d(str, keyE);
            }
            this.f105509b.d("wrong public key", null);
            return null;
        } catch (Exception e11) {
            this.f105509b.d("data cannot be encrypted", e11);
            return null;
        }
    }
}
