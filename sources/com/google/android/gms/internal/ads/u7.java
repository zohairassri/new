package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class u7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f35928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f35929f;

    public u7(int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f35925b = i11;
        this.f35926c = i12;
        this.f35927d = i13;
        this.f35928e = iArr;
        this.f35929f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u7.class == obj.getClass()) {
            u7 u7Var = (u7) obj;
            if (this.f35925b == u7Var.f35925b && this.f35926c == u7Var.f35926c && this.f35927d == u7Var.f35927d && Arrays.equals(this.f35928e, u7Var.f35928e) && Arrays.equals(this.f35929f, u7Var.f35929f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f35925b + 527) * 31) + this.f35926c) * 31) + this.f35927d) * 31) + Arrays.hashCode(this.f35928e)) * 31) + Arrays.hashCode(this.f35929f);
    }
}
