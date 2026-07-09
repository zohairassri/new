package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xa5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f37861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37862c;

    /* synthetic */ xa5(wa5 wa5Var, byte[] bArr) {
        this.f37860a = wa5Var.e();
        this.f37861b = wa5Var.f();
        this.f37862c = wa5Var.g();
    }

    public final wa5 a() {
        return new wa5(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa5)) {
            return false;
        }
        xa5 xa5Var = (xa5) obj;
        return this.f37860a == xa5Var.f37860a && this.f37861b == xa5Var.f37861b && this.f37862c == xa5Var.f37862c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f37860a), Float.valueOf(this.f37861b), Long.valueOf(this.f37862c));
    }
}
