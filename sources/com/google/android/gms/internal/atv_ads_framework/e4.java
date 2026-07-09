package com.google.android.gms.internal.atv_ads_framework;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class e4 extends f4 {
    e4(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final double a(Object obj, long j11) {
        return Double.longBitsToDouble(this.f39911a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final float b(Object obj, long j11) {
        return Float.intBitsToFloat(this.f39911a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final void c(Object obj, long j11, boolean z11) {
        if (g4.f39925h) {
            g4.d(obj, j11, z11 ? (byte) 1 : (byte) 0);
        } else {
            g4.e(obj, j11, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final void d(Object obj, long j11, byte b11) {
        if (g4.f39925h) {
            g4.d(obj, j11, b11);
        } else {
            g4.e(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final void e(Object obj, long j11, double d11) {
        this.f39911a.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final void f(Object obj, long j11, float f11) {
        this.f39911a.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.f4
    public final boolean g(Object obj, long j11) {
        return g4.f39925h ? g4.y(obj, j11) : g4.z(obj, j11);
    }
}
