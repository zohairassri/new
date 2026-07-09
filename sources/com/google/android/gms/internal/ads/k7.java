package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class k7 extends r7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f29416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r7[] f29417f;

    public k7(String str, boolean z11, boolean z12, String[] strArr, r7[] r7VarArr) {
        super("CTOC");
        this.f29413b = str;
        this.f29414c = z11;
        this.f29415d = z12;
        this.f29416e = strArr;
        this.f29417f = r7VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k7.class == obj.getClass()) {
            k7 k7Var = (k7) obj;
            if (this.f29414c == k7Var.f29414c && this.f29415d == k7Var.f29415d && Objects.equals(this.f29413b, k7Var.f29413b) && Arrays.equals(this.f29416e, k7Var.f29416e) && Arrays.equals(this.f29417f, k7Var.f29417f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f29414c ? 1 : 0) + 527) * 31) + (this.f29415d ? 1 : 0)) * 31) + this.f29413b.hashCode();
    }
}
