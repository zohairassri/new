package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35317d;

    public t7(String str, String str2, String str3) {
        super("----");
        this.f35315b = str;
        this.f35316c = str2;
        this.f35317d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t7.class == obj.getClass()) {
            t7 t7Var = (t7) obj;
            if (Objects.equals(this.f35316c, t7Var.f35316c) && Objects.equals(this.f35315b, t7Var.f35315b) && Objects.equals(this.f35317d, t7Var.f35317d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f35315b.hashCode() + 527) * 31) + this.f35316c.hashCode()) * 31) + this.f35317d.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final String toString() {
        String str = this.f34013a;
        int length = String.valueOf(str).length();
        String str2 = this.f35315b;
        int length2 = length + 9 + str2.length();
        String str3 = this.f35316c;
        StringBuilder sb2 = new StringBuilder(length2 + 14 + str3.length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
