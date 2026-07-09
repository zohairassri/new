package ck;

import ck.z;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f17803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f17805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17808g;

    public d(long j11, long j12, int i11, int i12, boolean z11) {
        this.f17802a = j11;
        this.f17803b = j12;
        this.f17804c = i12 == -1 ? 1 : i12;
        this.f17806e = i11;
        this.f17808g = z11;
        if (j11 == -1) {
            this.f17805d = -1L;
            this.f17807f = -9223372036854775807L;
        } else {
            this.f17805d = j11 - j12;
            this.f17807f = h(j11, j12, i11);
        }
    }

    private long a(long j11) {
        long j12 = (j11 * ((long) this.f17806e)) / 8000000;
        int i11 = this.f17804c;
        long jMin = (j12 / ((long) i11)) * ((long) i11);
        long j13 = this.f17805d;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - ((long) i11));
        }
        return this.f17803b + Math.max(jMin, 0L);
    }

    private static long h(long j11, long j12, int i11) {
        return (Math.max(0L, j11 - j12) * 8000000) / ((long) i11);
    }

    @Override // ck.z
    public z.a c(long j11) {
        if (this.f17805d == -1 && !this.f17808g) {
            return new z.a(new a0(0L, this.f17803b));
        }
        long jA = a(j11);
        long jG = g(jA);
        a0 a0Var = new a0(jG, jA);
        if (this.f17805d != -1 && jG < j11) {
            int i11 = this.f17804c;
            if (((long) i11) + jA < this.f17802a) {
                long j12 = jA + ((long) i11);
                return new z.a(a0Var, new a0(g(j12), j12));
            }
        }
        return new z.a(a0Var);
    }

    @Override // ck.z
    public boolean e() {
        return this.f17805d != -1 || this.f17808g;
    }

    @Override // ck.z
    public long f() {
        return this.f17807f;
    }

    public long g(long j11) {
        return h(j11, this.f17803b, this.f17806e);
    }
}
