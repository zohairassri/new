package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class uk4 extends xk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36183a;

    private uk4(int i11) {
        this.f36183a = i11;
    }

    public static uk4 b(int i11) throws InvalidAlgorithmParameterException {
        if (i11 == 16 || i11 == 32) {
            return new uk4(i11);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i11 * 8)));
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return false;
    }

    public final int c() {
        return this.f36183a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uk4) && ((uk4) obj).f36183a == this.f36183a;
    }

    public final int hashCode() {
        return Objects.hash(uk4.class, Integer.valueOf(this.f36183a));
    }

    public final String toString() {
        int i11 = this.f36183a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 34);
        sb2.append("AesCmac PRF Parameters (");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
