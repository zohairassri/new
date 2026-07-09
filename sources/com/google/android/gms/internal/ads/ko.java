package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Cipher f29779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f29780b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f29781c = new Object();

    public ko(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f29781c) {
            try {
                if (f29779a == null) {
                    f29779a = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
                }
                cipher = f29779a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws zzazo {
        byte[] bArrDoFinal;
        byte[] iv2;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (f29780b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv2 = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv2.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv2).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return vm.a(bArr3, false);
        } catch (InvalidKeyException e11) {
            throw new zzazo(this, e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new zzazo(this, e12);
        } catch (BadPaddingException e13) {
            throw new zzazo(this, e13);
        } catch (IllegalBlockSizeException e14) {
            throw new zzazo(this, e14);
        } catch (NoSuchPaddingException e15) {
            throw new zzazo(this, e15);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws zzazo {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = vm.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new zzazo(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            synchronized (f29780b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e11) {
            throw new zzazo(this, e11);
        } catch (InvalidAlgorithmParameterException e12) {
            throw new zzazo(this, e12);
        } catch (InvalidKeyException e13) {
            throw new zzazo(this, e13);
        } catch (NoSuchAlgorithmException e14) {
            throw new zzazo(this, e14);
        } catch (BadPaddingException e15) {
            throw new zzazo(this, e15);
        } catch (IllegalBlockSizeException e16) {
            throw new zzazo(this, e16);
        } catch (NoSuchPaddingException e17) {
            throw new zzazo(this, e17);
        }
    }
}
