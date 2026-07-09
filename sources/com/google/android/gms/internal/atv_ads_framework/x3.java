package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class x3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x3 f40061f = new x3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f40063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f40064c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40066e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f40065d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40062a = 0;

    private x3(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f40063b = iArr;
        this.f40064c = objArr;
        this.f40066e = z11;
    }

    public static x3 c() {
        return f40061f;
    }

    static x3 e(x3 x3Var, x3 x3Var2) {
        int i11 = x3Var.f40062a;
        int i12 = x3Var2.f40062a;
        int[] iArrCopyOf = Arrays.copyOf(x3Var.f40063b, 0);
        System.arraycopy(x3Var2.f40063b, 0, iArrCopyOf, 0, 0);
        Object[] objArrCopyOf = Arrays.copyOf(x3Var.f40064c, 0);
        System.arraycopy(x3Var2.f40064c, 0, objArrCopyOf, 0, 0);
        return new x3(0, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int i11 = this.f40065d;
        if (i11 != -1) {
            return i11;
        }
        this.f40065d = 0;
        return 0;
    }

    public final int b() {
        int i11 = this.f40065d;
        if (i11 != -1) {
            return i11;
        }
        this.f40065d = 0;
        return 0;
    }

    final x3 d(x3 x3Var) {
        if (x3Var.equals(f40061f)) {
            return this;
        }
        if (!this.f40066e) {
            throw new UnsupportedOperationException();
        }
        int[] iArr = this.f40063b;
        int length = iArr.length;
        System.arraycopy(x3Var.f40063b, 0, iArr, 0, 0);
        System.arraycopy(x3Var.f40064c, 0, this.f40064c, 0, 0);
        this.f40062a = 0;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x3)) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (this.f40066e) {
            this.f40066e = false;
        }
    }

    public final int hashCode() {
        return 506991;
    }

    final void g(StringBuilder sb2, int i11) {
    }
}
