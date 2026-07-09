package com.google.android.gms.internal.pal;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class a4 extends c4 {
    a4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final double a(Object obj, long j11) {
        return Double.longBitsToDouble(k(obj, j11));
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final float b(Object obj, long j11) {
        return Float.intBitsToFloat(j(obj, j11));
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final void c(Object obj, long j11, boolean z11) {
        if (d4.f41212h) {
            d4.d(obj, j11, z11 ? (byte) 1 : (byte) 0);
        } else {
            d4.e(obj, j11, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final void d(Object obj, long j11, byte b11) {
        if (d4.f41212h) {
            d4.d(obj, j11, b11);
        } else {
            d4.e(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final void e(Object obj, long j11, double d11) {
        o(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final void f(Object obj, long j11, float f11) {
        n(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.pal.c4
    public final boolean g(Object obj, long j11) {
        return d4.f41212h ? d4.y(obj, j11) : d4.z(obj, j11);
    }
}
