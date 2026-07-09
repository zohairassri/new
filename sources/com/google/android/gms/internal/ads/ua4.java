package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ua4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ta4 f35969b;

    /* synthetic */ ua4(int i11, ta4 ta4Var, byte[] bArr) {
        this.f35968a = i11;
        this.f35969b = ta4Var;
    }

    public static sa4 b() {
        return new sa4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f35969b != ta4.f35371d;
    }

    public final int c() {
        return this.f35968a;
    }

    public final ta4 d() {
        return this.f35969b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ua4)) {
            return false;
        }
        ua4 ua4Var = (ua4) obj;
        return ua4Var.f35968a == this.f35968a && ua4Var.f35969b == this.f35969b;
    }

    public final int hashCode() {
        return Objects.hash(ua4.class, Integer.valueOf(this.f35968a), this.f35969b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f35969b);
        int length = strValueOf.length();
        int i11 = this.f35968a;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i11).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
