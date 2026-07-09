package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class bi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f23942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f23943b;

    /* synthetic */ bi4(Class cls, Class cls2, byte[] bArr) {
        this.f23942a = cls;
        this.f23943b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bi4)) {
            return false;
        }
        bi4 bi4Var = (bi4) obj;
        return bi4Var.f23942a.equals(this.f23942a) && bi4Var.f23943b.equals(this.f23943b);
    }

    public final int hashCode() {
        return Objects.hash(this.f23942a, this.f23943b);
    }

    public final String toString() {
        Class cls = this.f23943b;
        String simpleName = this.f23942a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb2.append(simpleName);
        sb2.append(" with primitive type: ");
        sb2.append(simpleName2);
        return sb2.toString();
    }
}
