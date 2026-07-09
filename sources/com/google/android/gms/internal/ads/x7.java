package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class x7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37808c;

    public x7(String str, String str2, String str3) {
        super(str);
        this.f37807b = str2;
        this.f37808c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x7.class == obj.getClass()) {
            x7 x7Var = (x7) obj;
            if (this.f34013a.equals(x7Var.f34013a) && Objects.equals(this.f37807b, x7Var.f37807b) && Objects.equals(this.f37808c, x7Var.f37808c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f34013a.hashCode() + 527;
        String str = this.f37807b;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f37808c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final String toString() {
        String str = this.f34013a;
        int length = String.valueOf(str).length();
        String str2 = this.f37808c;
        StringBuilder sb2 = new StringBuilder(length + 6 + str2.length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }
}
