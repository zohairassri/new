package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f28893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28895d;

    public j5(int i11, byte[] bArr, int i12, int i13) {
        this.f28892a = i11;
        this.f28893b = bArr;
        this.f28894c = i12;
        this.f28895d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j5.class == obj.getClass()) {
            j5 j5Var = (j5) obj;
            if (this.f28892a == j5Var.f28892a && this.f28894c == j5Var.f28894c && this.f28895d == j5Var.f28895d && Arrays.equals(this.f28893b, j5Var.f28893b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f28892a * 31) + Arrays.hashCode(this.f28893b)) * 31) + this.f28894c) * 31) + this.f28895d;
    }
}
