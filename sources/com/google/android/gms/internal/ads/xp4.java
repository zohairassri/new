package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xp4 extends ds4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wp4 f38100a;

    private xp4(wp4 wp4Var) {
        this.f38100a = wp4Var;
    }

    public static xp4 b(wp4 wp4Var) {
        return new xp4(wp4Var);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f38100a != wp4.f37539e;
    }

    public final wp4 c() {
        return this.f38100a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xp4) && ((xp4) obj).f38100a == this.f38100a;
    }

    public final int hashCode() {
        return Objects.hash(xp4.class, this.f38100a);
    }

    public final String toString() {
        String string = this.f38100a.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 30);
        sb2.append("Ed25519 Parameters (variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
