package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ev4 implements vk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal f25943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f25945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25946d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ev4(String str, Key key) throws GeneralSecurityException {
        int i11;
        dv4 dv4Var = new dv4(this);
        this.f25943a = dv4Var;
        if (!gf4.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f25944b = str;
        this.f25945c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i11 = 20;
                    this.f25946d = i11;
                    dv4Var.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i11 = 28;
                    this.f25946d = i11;
                    dv4Var.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i11 = 32;
                    this.f25946d = i11;
                    dv4Var.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i11 = 48;
                    this.f25946d = i11;
                    dv4Var.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i11 = 64;
                    this.f25946d = i11;
                    dv4Var.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.vk4
    public final byte[] a(byte[] bArr, int i11) throws InvalidAlgorithmParameterException {
        if (i11 > this.f25946d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.f25943a;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i11);
    }

    final /* synthetic */ String b() {
        return this.f25944b;
    }

    final /* synthetic */ Key c() {
        return this.f25945c;
    }
}
