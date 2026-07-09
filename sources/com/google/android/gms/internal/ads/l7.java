package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class l7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30046d;

    public l7(String str, String str2, String str3) {
        super("COMM");
        this.f30044b = str;
        this.f30045c = str2;
        this.f30046d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l7.class == obj.getClass()) {
            l7 l7Var = (l7) obj;
            if (Objects.equals(this.f30045c, l7Var.f30045c) && Objects.equals(this.f30044b, l7Var.f30044b) && Objects.equals(this.f30046d, l7Var.f30046d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f30044b.hashCode() + 527) * 31) + this.f30045c.hashCode();
        String str = this.f30046d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final String toString() {
        String str = this.f34013a;
        int length = String.valueOf(str).length();
        String str2 = this.f30046d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f30044b;
        int length3 = length + 11 + str3.length();
        String str4 = this.f30045c;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        sb2.append(", text=");
        sb2.append(str2);
        return sb2.toString();
    }
}
