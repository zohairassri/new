package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f42339a;

    c8(Unsafe unsafe) {
        this.f42339a = unsafe;
    }

    public abstract double a(Object obj, long j11);

    public abstract float b(Object obj, long j11);

    public abstract void c(Object obj, long j11, boolean z11);

    public abstract void d(Object obj, long j11, byte b11);

    public abstract void e(Object obj, long j11, double d11);

    public abstract void f(Object obj, long j11, float f11);

    public abstract boolean g(Object obj, long j11);
}
