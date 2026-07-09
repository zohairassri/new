package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ab5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pl5 f23225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f23234j;

    ab5(pl5 pl5Var, long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16 = true;
        jx3.a(!z15 || z13);
        if (z14 && !z13) {
            z16 = false;
        }
        jx3.a(z16);
        this.f23225a = pl5Var;
        this.f23226b = j11;
        this.f23227c = j12;
        this.f23228d = j13;
        this.f23229e = j14;
        this.f23230f = false;
        this.f23231g = false;
        this.f23232h = z13;
        this.f23233i = z14;
        this.f23234j = z15;
    }

    public final ab5 a(long j11) {
        return j11 == this.f23226b ? this : new ab5(this.f23225a, j11, this.f23227c, this.f23228d, this.f23229e, false, false, this.f23232h, this.f23233i, this.f23234j);
    }

    public final ab5 b(long j11) {
        return j11 == this.f23227c ? this : new ab5(this.f23225a, this.f23226b, j11, this.f23228d, this.f23229e, false, false, this.f23232h, this.f23233i, this.f23234j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ab5.class == obj.getClass()) {
            ab5 ab5Var = (ab5) obj;
            if (this.f23226b == ab5Var.f23226b && this.f23227c == ab5Var.f23227c && this.f23228d == ab5Var.f23228d && this.f23229e == ab5Var.f23229e && this.f23232h == ab5Var.f23232h && this.f23233i == ab5Var.f23233i && this.f23234j == ab5Var.f23234j && Objects.equals(this.f23225a, ab5Var.f23225a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23225a.hashCode() + 527;
        long j11 = this.f23229e;
        long j12 = this.f23228d;
        return (((((((((((((iHashCode * 31) + ((int) this.f23226b)) * 31) + ((int) this.f23227c)) * 31) + ((int) j12)) * 31) + ((int) j11)) * 29791) + (this.f23232h ? 1 : 0)) * 31) + (this.f23233i ? 1 : 0)) * 31) + (this.f23234j ? 1 : 0);
    }
}
