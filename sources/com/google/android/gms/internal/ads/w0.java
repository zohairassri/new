package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f37089g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37090h;

    public final void a() {
        this.f37086d = 0L;
        this.f37087e = 0L;
        this.f37088f = 0L;
        this.f37090h = 0;
        Arrays.fill(this.f37089g, false);
    }

    public final boolean b() {
        return this.f37086d > 15 && this.f37090h == 0;
    }

    public final boolean c() {
        long j11 = this.f37086d;
        if (j11 == 0) {
            return false;
        }
        return this.f37089g[(int) ((j11 - 1) % 15)];
    }

    public final long d() {
        return this.f37088f;
    }

    public final long e() {
        long j11 = this.f37087e;
        if (j11 == 0) {
            return 0L;
        }
        return this.f37088f / j11;
    }

    public final void f(long j11) {
        long j12 = this.f37086d;
        if (j12 == 0) {
            this.f37083a = j11;
        } else if (j12 == 1) {
            long j13 = j11 - this.f37083a;
            this.f37084b = j13;
            this.f37088f = j13;
            this.f37087e = 1L;
        } else {
            long j14 = j11 - this.f37085c;
            int i11 = (int) (j12 % 15);
            if (Math.abs(j14 - this.f37084b) <= 1000000) {
                this.f37087e++;
                this.f37088f += j14;
                boolean[] zArr = this.f37089g;
                if (zArr[i11]) {
                    zArr[i11] = false;
                    this.f37090h--;
                }
            } else {
                boolean[] zArr2 = this.f37089g;
                if (!zArr2[i11]) {
                    zArr2[i11] = true;
                    this.f37090h++;
                }
            }
        }
        this.f37086d++;
        this.f37085c = j11;
    }
}
