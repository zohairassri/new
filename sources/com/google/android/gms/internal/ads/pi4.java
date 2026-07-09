package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class pi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f32969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f32970b;

    /* synthetic */ pi4(Class cls, Class cls2, byte[] bArr) {
        this.f32969a = cls;
        this.f32970b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pi4)) {
            return false;
        }
        pi4 pi4Var = (pi4) obj;
        return pi4Var.f32969a.equals(this.f32969a) && pi4Var.f32970b.equals(this.f32970b);
    }

    public final int hashCode() {
        return Objects.hash(this.f32969a, this.f32970b);
    }

    public final String toString() {
        Class cls = this.f32970b;
        String simpleName = this.f32969a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 26 + simpleName2.length());
        sb2.append(simpleName);
        sb2.append(" with serialization type: ");
        sb2.append(simpleName2);
        return sb2.toString();
    }
}
