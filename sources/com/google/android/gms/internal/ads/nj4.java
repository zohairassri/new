package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class nj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f31457a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f31458b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private oj4 f31459c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private pj4 f31460d = pj4.f32987e;

    /* synthetic */ nj4(byte[] bArr) {
    }

    public final nj4 a(int i11) {
        this.f31457a = Integer.valueOf(i11);
        return this;
    }

    public final nj4 b(int i11) {
        this.f31458b = Integer.valueOf(i11);
        return this;
    }

    public final nj4 c(pj4 pj4Var) {
        this.f31460d = pj4Var;
        return this;
    }

    public final nj4 d(oj4 oj4Var) {
        this.f31459c = oj4Var;
        return this;
    }

    public final qj4 e() throws GeneralSecurityException {
        Integer num = this.f31457a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f31458b == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f31459c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f31460d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f31457a));
        }
        Integer num2 = this.f31458b;
        int iIntValue = num2.intValue();
        oj4 oj4Var = this.f31459c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (oj4Var == oj4.f31960b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (oj4Var == oj4.f31961c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (oj4Var == oj4.f31962d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (oj4Var == oj4.f31963e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (oj4Var != oj4.f31964f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new qj4(this.f31457a.intValue(), this.f31458b.intValue(), this.f31460d, this.f31459c, null);
    }
}
