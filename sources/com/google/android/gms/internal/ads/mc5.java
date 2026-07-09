package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class mc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jh5 f30693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f30694b;

    public mc5(jh5 jh5Var, SparseArray sparseArray) {
        this.f30693a = jh5Var;
        SparseArray sparseArray2 = new SparseArray(jh5Var.b());
        for (int i11 = 0; i11 < jh5Var.b(); i11++) {
            int iC = jh5Var.c(i11);
            lc5 lc5Var = (lc5) sparseArray.get(iC);
            lc5Var.getClass();
            sparseArray2.append(iC, lc5Var);
        }
        this.f30694b = sparseArray2;
    }

    public final lc5 a(int i11) {
        lc5 lc5Var = (lc5) this.f30694b.get(i11);
        lc5Var.getClass();
        return lc5Var;
    }

    public final boolean b(int i11) {
        return this.f30693a.a(i11);
    }

    public final int c() {
        return this.f30693a.b();
    }

    public final int d(int i11) {
        return this.f30693a.c(i11);
    }
}
