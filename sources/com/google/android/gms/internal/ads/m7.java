package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class m7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f30623e;

    public m7(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f30620b = str;
        this.f30621c = str2;
        this.f30622d = str3;
        this.f30623e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m7.class == obj.getClass()) {
            m7 m7Var = (m7) obj;
            if (Objects.equals(this.f30620b, m7Var.f30620b) && Objects.equals(this.f30621c, m7Var.f30621c) && Objects.equals(this.f30622d, m7Var.f30622d) && Arrays.equals(this.f30623e, m7Var.f30623e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f30620b;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.f30621c.hashCode()) * 31) + this.f30622d.hashCode()) * 31) + Arrays.hashCode(this.f30623e);
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final String toString() {
        String str = this.f34013a;
        int length = String.valueOf(str).length();
        String str2 = this.f30620b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f30621c;
        int length3 = length + 11 + length2 + 11 + str3.length();
        String str4 = this.f30622d;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }
}
