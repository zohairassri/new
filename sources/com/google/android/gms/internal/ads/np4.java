package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class np4 extends ds4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lp4 f31541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jp4 f31542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kp4 f31543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp4 f31544d;

    /* synthetic */ np4(lp4 lp4Var, jp4 jp4Var, kp4 kp4Var, mp4 mp4Var, byte[] bArr) {
        this.f31541a = lp4Var;
        this.f31542b = jp4Var;
        this.f31543c = kp4Var;
        this.f31544d = mp4Var;
    }

    public static ip4 b() {
        return new ip4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f31544d != mp4.f30970e;
    }

    public final lp4 c() {
        return this.f31541a;
    }

    public final jp4 d() {
        return this.f31542b;
    }

    public final kp4 e() {
        return this.f31543c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof np4)) {
            return false;
        }
        np4 np4Var = (np4) obj;
        return np4Var.f31541a == this.f31541a && np4Var.f31542b == this.f31542b && np4Var.f31543c == this.f31543c && np4Var.f31544d == this.f31544d;
    }

    public final mp4 f() {
        return this.f31544d;
    }

    public final int hashCode() {
        return Objects.hash(np4.class, this.f31541a, this.f31542b, this.f31543c, this.f31544d);
    }

    public final String toString() {
        String string = this.f31544d.toString();
        int length = string.length();
        String string2 = this.f31543c.toString();
        int length2 = string2.length();
        String string3 = this.f31541a.toString();
        int length3 = string3.length();
        String string4 = this.f31542b.toString();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        sb2.append("ECDSA Parameters (variant: ");
        sb2.append(string);
        sb2.append(", hashType: ");
        sb2.append(string2);
        sb2.append(", encoding: ");
        sb2.append(string3);
        sb2.append(", curve: ");
        sb2.append(string4);
        sb2.append(")");
        return sb2.toString();
    }
}
