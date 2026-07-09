package com.google.android.gms.internal.ads;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class kd4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f29561a = new jd4();

    public static Cipher a() {
        return (Cipher) f29561a.get();
    }

    public static SecretKey b(byte[] bArr) throws InvalidAlgorithmParameterException {
        ov4.a(bArr.length);
        return new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i11, int i12) {
        si4.d();
        return new GCMParameterSpec(128, bArr, i11, 12);
    }
}
