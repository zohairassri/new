package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class b8 extends c8 {
    b8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.c8
    public final double a(Object obj, long j11) {
        return Double.longBitsToDouble(this.f42339a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.play_billing.c8
    public final float b(Object obj, long j11) {
        return Float.intBitsToFloat(this.f42339a.getInt(obj, j11));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.d8.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.play_billing.d8.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z11' boolean)' in method call: com.google.android.gms.internal.play_billing.d8.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z11' boolean)' in method call: com.google.android.gms.internal.play_billing.d8.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.play_billing.c8
    public final void c(Object obj, long j11, boolean z11) {
        if (d8.f42357h) {
            d8.n(obj, j11, z11);
        } else {
            d8.o(obj, j11, z11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.c8
    public final void d(Object obj, long j11, byte b11) {
        if (d8.f42357h) {
            d8.d(obj, j11, b11);
        } else {
            d8.e(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.c8
    public final void e(Object obj, long j11, double d11) {
        this.f42339a.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.play_billing.c8
    public final void f(Object obj, long j11, float f11) {
        this.f42339a.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.play_billing.c8
    public final boolean g(Object obj, long j11) {
        return d8.f42357h ? d8.y(obj, j11) : d8.z(obj, j11);
    }
}
