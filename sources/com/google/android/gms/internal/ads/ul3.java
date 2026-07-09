package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ul3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Cipher f36196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36197b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f36198c = new Object();

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f36198c) {
            try {
                if (f36196a == null) {
                    f36196a = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                }
                cipher = f36196a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public final byte[] a(byte[] bArr, String str) throws zzgfv {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = xh3.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new zzgfv();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (f36197b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e11) {
            throw new zzgfv(e11);
        }
    }

    public final String b(byte[] bArr, String str) {
        return new String(a(bArr, str), "UTF-8");
    }
}
