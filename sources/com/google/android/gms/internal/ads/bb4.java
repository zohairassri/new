package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class bb4 extends f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ab4 f23773a;

    private bb4(ab4 ab4Var) {
        this.f23773a = ab4Var;
    }

    public static bb4 b(ab4 ab4Var) {
        return new bb4(ab4Var);
    }

    @Override // com.google.android.gms.internal.ads.n84
    public final boolean a() {
        return this.f23773a != ab4.f23223d;
    }

    public final ab4 c() {
        return this.f23773a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bb4) && ((bb4) obj).f23773a == this.f23773a;
    }

    public final int hashCode() {
        return Objects.hash(bb4.class, this.f23773a);
    }

    public final String toString() {
        String string = this.f23773a.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 39);
        sb2.append("ChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
