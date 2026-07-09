package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class v7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f36632c;

    public v7(String str, byte[] bArr) {
        super("PRIV");
        this.f36631b = str;
        this.f36632c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v7.class == obj.getClass()) {
            v7 v7Var = (v7) obj;
            if (Objects.equals(this.f36631b, v7Var.f36631b) && Arrays.equals(this.f36632c, v7Var.f36632c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36631b.hashCode() + 527) * 31) + Arrays.hashCode(this.f36632c);
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final String toString() {
        String str = this.f34013a;
        int length = String.valueOf(str).length();
        String str2 = this.f36631b;
        StringBuilder sb2 = new StringBuilder(length + 8 + str2.length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }
}
