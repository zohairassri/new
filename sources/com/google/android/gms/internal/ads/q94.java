package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class q94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f33492a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f33493b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f33494c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f33495d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r94 f33496e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s94 f33497f = s94.f34665d;

    /* synthetic */ q94(byte[] bArr) {
    }

    public final q94 a(int i11) throws InvalidAlgorithmParameterException {
        if (i11 != 16 && i11 != 24 && i11 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
        }
        this.f33492a = Integer.valueOf(i11);
        return this;
    }

    public final q94 b(int i11) throws InvalidAlgorithmParameterException {
        if (i11 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i11)));
        }
        this.f33493b = Integer.valueOf(i11);
        return this;
    }

    public final q94 c(int i11) throws GeneralSecurityException {
        if (i11 < 12 || i11 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i11)));
        }
        this.f33494c = Integer.valueOf(i11);
        return this;
    }

    public final q94 d(int i11) throws GeneralSecurityException {
        if (i11 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i11)));
        }
        this.f33495d = Integer.valueOf(i11);
        return this;
    }

    public final q94 e(s94 s94Var) {
        this.f33497f = s94Var;
        return this;
    }

    public final q94 f(r94 r94Var) {
        this.f33496e = r94Var;
        return this;
    }

    public final t94 g() throws GeneralSecurityException {
        if (this.f33492a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.f33493b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.f33494c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f33495d;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.f33496e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f33497f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        r94 r94Var = this.f33496e;
        if (r94Var == r94.f34056b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (r94Var == r94.f34057c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (r94Var == r94.f34058d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (r94Var == r94.f34059e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (r94Var != r94.f34060f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new t94(this.f33492a.intValue(), this.f33493b.intValue(), this.f33494c.intValue(), this.f33495d.intValue(), this.f33497f, this.f33496e, null);
    }
}
