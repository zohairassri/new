package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xc4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wc4 f37895a;

    private xc4(wc4 wc4Var) {
        this.f37895a = wc4Var;
    }

    public static xc4 b(wc4 wc4Var) {
        return new xc4(wc4Var);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f37895a != wc4.f37310d;
    }

    public final wc4 c() {
        return this.f37895a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xc4) && ((xc4) obj).f37895a == this.f37895a;
    }

    public final int hashCode() {
        return Objects.hash(xc4.class, this.f37895a);
    }

    public final String toString() {
        String string = this.f37895a.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 40);
        sb2.append("XChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
