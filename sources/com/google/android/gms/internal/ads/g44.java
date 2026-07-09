package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class g44 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g44 f26816c = new g44(new int[0], 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f26817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26818b;

    private g44(int[] iArr, int i11, int i12) {
        this.f26817a = iArr;
        this.f26818b = i12;
    }

    public static g44 a() {
        return f26816c;
    }

    public static g44 b(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new g44(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final int c() {
        return this.f26818b;
    }

    public final int d(int i11) {
        jx3.m(i11, this.f26818b, "index");
        return this.f26817a[i11];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g44)) {
            return false;
        }
        g44 g44Var = (g44) obj;
        int i11 = this.f26818b;
        if (i11 != g44Var.f26818b) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (d(i12) != g44Var.d(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i11 = 0; i11 < this.f26818b; i11++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f26817a[i11]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i11 = this.f26818b;
        if (i11 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i11 * 5);
        sb2.append('[');
        int[] iArr = this.f26817a;
        sb2.append(iArr[0]);
        for (int i12 = 1; i12 < i11; i12++) {
            sb2.append(", ");
            sb2.append(iArr[i12]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
