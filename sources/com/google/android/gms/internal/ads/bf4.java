package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class bf4 implements p74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f23881a = new ze4();

    public static p74 a(na4 na4Var) {
        return rd4.b(na4Var, af4.f23282a);
    }

    static /* synthetic */ Cipher b() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) f23881a.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e11) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e11);
        }
    }
}
