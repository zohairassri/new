package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class qj4 extends tj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pj4 f33670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oj4 f33671d;

    /* synthetic */ qj4(int i11, int i12, pj4 pj4Var, oj4 oj4Var, byte[] bArr) {
        this.f33668a = i11;
        this.f33669b = i12;
        this.f33670c = pj4Var;
        this.f33671d = oj4Var;
    }

    public static nj4 b() {
        return new nj4(null);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f33670c != pj4.f32987e;
    }

    public final int c() {
        return this.f33668a;
    }

    public final int d() {
        return this.f33669b;
    }

    public final int e() {
        pj4 pj4Var = this.f33670c;
        if (pj4Var == pj4.f32987e) {
            return this.f33669b;
        }
        if (pj4Var == pj4.f32984b || pj4Var == pj4.f32985c || pj4Var == pj4.f32986d) {
            return this.f33669b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qj4)) {
            return false;
        }
        qj4 qj4Var = (qj4) obj;
        return qj4Var.f33668a == this.f33668a && qj4Var.e() == e() && qj4Var.f33670c == this.f33670c && qj4Var.f33671d == this.f33671d;
    }

    public final pj4 f() {
        return this.f33670c;
    }

    public final oj4 g() {
        return this.f33671d;
    }

    public final int hashCode() {
        return Objects.hash(qj4.class, Integer.valueOf(this.f33668a), Integer.valueOf(this.f33669b), this.f33670c, this.f33671d);
    }

    public final String toString() {
        oj4 oj4Var = this.f33671d;
        String strValueOf = String.valueOf(this.f33670c);
        String strValueOf2 = String.valueOf(oj4Var);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i11 = this.f33669b;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f33668a;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i12).length() + 10);
        sb2.append("HMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", hashType: ");
        sb2.append(strValueOf2);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append("-byte tags, and ");
        sb2.append(i12);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
