package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class m3 implements a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30576f;

    public m3(long j11, long j12, int i11, int i12, boolean z11) {
        long jC;
        this.f30571a = j11;
        this.f30572b = j12;
        this.f30573c = i12 == -1 ? 1 : i12;
        this.f30575e = i11;
        if (j11 == -1) {
            this.f30574d = -1L;
            jC = -9223372036854775807L;
        } else {
            this.f30574d = j11 - j12;
            jC = c(j11, j12, i11);
        }
        this.f30576f = jC;
    }

    private static long c(long j11, long j12, int i11) {
        return (Math.max(0L, j11 - j12) * 8000000) / ((long) i11);
    }

    public final long b(long j11) {
        return c(j11, this.f30572b, this.f30575e);
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final long zza() {
        return this.f30576f;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final boolean zzb() {
        return this.f30574d != -1;
    }

    @Override // com.google.android.gms.internal.ads.a5
    public final y4 zzc(long j11) {
        long j12 = this.f30574d;
        if (j12 == -1) {
            b5 b5Var = new b5(0L, this.f30572b);
            return new y4(b5Var, b5Var);
        }
        long j13 = ((long) this.f30575e) * j11;
        long j14 = this.f30573c;
        long jMin = ((j13 / 8000000) / j14) * j14;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - j14);
        }
        long jMax = this.f30572b + Math.max(jMin, 0L);
        long jB = b(jMax);
        b5 b5Var2 = new b5(jB, jMax);
        if (j12 != -1 && jB < j11) {
            long j15 = jMax + j14;
            if (j15 < this.f30571a) {
                return new y4(b5Var2, new b5(b(j15), j15));
            }
        }
        return new y4(b5Var2, b5Var2);
    }
}
