package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f27541e;

    public h7(String str, String str2, int i11, byte[] bArr) {
        super("APIC");
        this.f27538b = str;
        this.f27539c = str2;
        this.f27540d = i11;
        this.f27541e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.gd
    public final void a(fb fbVar) {
        fbVar.C(this.f27541e, this.f27540d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h7.class == obj.getClass()) {
            h7 h7Var = (h7) obj;
            if (this.f27540d == h7Var.f27540d && Objects.equals(this.f27538b, h7Var.f27538b) && Objects.equals(this.f27539c, h7Var.f27539c) && Arrays.equals(this.f27541e, h7Var.f27541e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27538b;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i11 = this.f27540d;
        String str2 = this.f27539c;
        return ((((((i11 + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f27541e);
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final String toString() {
        String str = this.f34013a;
        int length = String.valueOf(str).length();
        String str2 = this.f27538b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f27539c;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
