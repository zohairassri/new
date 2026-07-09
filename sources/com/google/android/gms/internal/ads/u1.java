package com.google.android.gms.internal.ads;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f35860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f35862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Range f35863d;

    public u1(float f11) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f35863d = range;
        this.f35862c = ((Double) range.getUpper()).doubleValue();
        this.f35860a = -9223372036854775807L;
        this.f35861b = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r7, long r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Ld
            r2 = r4
            goto Le
        Ld:
            r2 = r3
        Le:
            com.google.android.gms.internal.ads.jx3.a(r2)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L16
            r3 = r4
        L16:
            com.google.android.gms.internal.ads.jx3.a(r3)
            long r2 = r6.f35860a
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r6.f35861b
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L31
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 == 0) goto L31
            long r0 = r9 - r4
            long r2 = r7 - r2
            double r0 = (double) r0
            double r2 = (double) r2
            double r0 = r0 / r2
            goto L3d
        L31:
            android.util.Range r0 = r6.f35863d
            java.lang.Comparable r0 = r0.getUpper()
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
        L3d:
            android.util.Range r2 = r6.f35863d
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Comparable r0 = r2.clamp(r0)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            double r2 = r6.f35862c
            r4 = 4605380979056443392(0x3fe99999a0000000, double:0.800000011920929)
            double r2 = r2 * r4
            r4 = 4596373779801702400(0x3fc99999a0000000, double:0.20000000298023224)
            double r0 = r0 * r4
            double r2 = r2 + r0
            r6.f35862c = r2
            r6.f35860a = r7
            r6.f35861b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u1.a(long, long):void");
    }

    public final long b(long j11) {
        long j12 = this.f35860a;
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f35861b + ((j11 - j12) * this.f35862c));
    }

    public final void c(float f11) {
        jx3.a(f11 > 0.0f);
        this.f35863d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f11)));
        d();
    }

    public final void d() {
        this.f35862c = ((Double) this.f35863d.getUpper()).doubleValue();
        this.f35860a = -9223372036854775807L;
        this.f35861b = -9223372036854775807L;
    }
}
