package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class wt implements jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f41932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f41934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41935d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public wt(String str, Key key) throws GeneralSecurityException {
        int i11;
        vt vtVar = new vt(this);
        this.f41932a = vtVar;
        if (!xh.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f41933b = str;
        this.f41934c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    this.f41935d = 20;
                    vtVar.get();
                    return;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i11 = 28;
                    this.f41935d = i11;
                    vtVar.get();
                    return;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i11 = 32;
                    this.f41935d = i11;
                    vtVar.get();
                    return;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i11 = 48;
                    this.f41935d = i11;
                    vtVar.get();
                    return;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i11 = 64;
                    this.f41935d = i11;
                    vtVar.get();
                    return;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.pal.jm
    public final byte[] a(byte[] bArr, int i11) throws InvalidAlgorithmParameterException {
        if (i11 > this.f41935d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f41932a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f41932a.get()).doFinal(), i11);
    }
}
