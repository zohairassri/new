package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class i15 extends j15 {
    i15(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final void a(Object obj, long j11, byte b11) {
        if (k15.f29343i) {
            k15.f(obj, j11, b11);
        } else {
            k15.g(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final boolean b(Object obj, long j11) {
        return k15.f29343i ? k15.D(obj, j11) : k15.E(obj, j11);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.k15.F(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.k15.G(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z11' boolean)' in method call: com.google.android.gms.internal.ads.k15.F(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z11' boolean)' in method call: com.google.android.gms.internal.ads.k15.G(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.j15
    public final void c(Object obj, long j11, boolean z11) {
        if (k15.f29343i) {
            k15.F(obj, j11, z11);
        } else {
            k15.G(obj, j11, z11);
        }
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final float d(Object obj, long j11) {
        return Float.intBitsToFloat(this.f28836a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final void e(Object obj, long j11, float f11) {
        this.f28836a.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final double f(Object obj, long j11) {
        return Double.longBitsToDouble(this.f28836a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final void g(Object obj, long j11, double d11) {
        this.f28836a.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.ads.j15
    public final byte h(long j11) {
        return Memory.peekByte(j11);
    }
}
