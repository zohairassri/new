package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ip4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lp4 f28521a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private jp4 f28522b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kp4 f28523c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mp4 f28524d = mp4.f30970e;

    /* synthetic */ ip4(byte[] bArr) {
    }

    public final ip4 a(lp4 lp4Var) {
        this.f28521a = lp4Var;
        return this;
    }

    public final ip4 b(jp4 jp4Var) {
        this.f28522b = jp4Var;
        return this;
    }

    public final ip4 c(kp4 kp4Var) {
        this.f28523c = kp4Var;
        return this;
    }

    public final ip4 d(mp4 mp4Var) {
        this.f28524d = mp4Var;
        return this;
    }

    public final np4 e() throws GeneralSecurityException {
        lp4 lp4Var = this.f28521a;
        if (lp4Var == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        jp4 jp4Var = this.f28522b;
        if (jp4Var == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        kp4 kp4Var = this.f28523c;
        if (kp4Var == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        mp4 mp4Var = this.f28524d;
        if (mp4Var == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (jp4Var == jp4.f29160c && kp4Var != kp4.f29800b) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (jp4Var == jp4.f29161d && kp4Var != kp4.f29801c && kp4Var != kp4.f29802d) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (jp4Var != jp4.f29162e || kp4Var == kp4.f29802d) {
            return new np4(lp4Var, jp4Var, kp4Var, mp4Var, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
