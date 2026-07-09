package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class kf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f29610a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        String[] strArr = f29610a;
        for (int i11 = 0; i11 < 3; i11++) {
            Provider provider = Security.getProvider(strArr[i11]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
