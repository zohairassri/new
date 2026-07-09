package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class y0 extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f42635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42637c;

    y0(int i11) {
        n0.a(i11, "initialCapacity");
        this.f42635a = new Object[i11];
        this.f42636b = 0;
    }

    private final void d(int i11) {
        int length = this.f42635a.length;
        int iA = z0.a(length, this.f42636b + i11);
        if (iA > length || this.f42637c) {
            this.f42635a = Arrays.copyOf(this.f42635a, iA);
            this.f42637c = false;
        }
    }

    public final y0 b(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.f42635a;
        int i11 = this.f42636b;
        this.f42636b = i11 + 1;
        objArr[i11] = obj;
        return this;
    }

    final void c(Object[] objArr, int i11) {
        v1.b(objArr, i11);
        d(i11);
        System.arraycopy(objArr, 0, this.f42635a, this.f42636b, i11);
        this.f42636b += i11;
    }
}
