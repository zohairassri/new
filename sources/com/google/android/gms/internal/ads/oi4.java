package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class oi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f31951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qv4 f31952b;

    /* synthetic */ oi4(Class cls, qv4 qv4Var, byte[] bArr) {
        this.f31951a = cls;
        this.f31952b = qv4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oi4)) {
            return false;
        }
        oi4 oi4Var = (oi4) obj;
        return oi4Var.f31951a.equals(this.f31951a) && oi4Var.f31952b.equals(this.f31952b);
    }

    public final int hashCode() {
        return Objects.hash(this.f31951a, this.f31952b);
    }

    public final String toString() {
        qv4 qv4Var = this.f31952b;
        String simpleName = this.f31951a.getSimpleName();
        String strValueOf = String.valueOf(qv4Var);
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb2.append(simpleName);
        sb2.append(", object identifier: ");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
