package l7;

import l7.j0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class i implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f113510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f113511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f113512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f113513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f113514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f113515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f113516g;

    public i(long j11, long j12, int i11, int i12, boolean z11) {
        this.f113510a = j11;
        this.f113511b = j12;
        this.f113512c = i12 == -1 ? 1 : i12;
        this.f113514e = i11;
        this.f113516g = z11;
        if (j11 == -1) {
            this.f113513d = -1L;
            this.f113515f = -9223372036854775807L;
        } else {
            this.f113513d = j11 - j12;
            this.f113515f = i(j11, j12, i11);
        }
    }

    private long a(long j11) {
        long j12 = (j11 * ((long) this.f113514e)) / 8000000;
        int i11 = this.f113512c;
        long jMin = (j12 / ((long) i11)) * ((long) i11);
        long j13 = this.f113513d;
        if (j13 != -1) {
            jMin = Math.min(jMin, j13 - ((long) i11));
        }
        return this.f113511b + Math.max(jMin, 0L);
    }

    private static long i(long j11, long j12, int i11) {
        return (Math.max(0L, j11 - j12) * 8000000) / ((long) i11);
    }

    @Override // l7.j0
    public j0.a c(long j11) {
        if (this.f113513d == -1 && !this.f113516g) {
            return new j0.a(new k0(0L, this.f113511b));
        }
        long jA = a(j11);
        long jH = h(jA);
        k0 k0Var = new k0(jH, jA);
        if (this.f113513d != -1 && jH < j11) {
            int i11 = this.f113512c;
            if (((long) i11) + jA < this.f113510a) {
                long j12 = jA + ((long) i11);
                return new j0.a(k0Var, new k0(h(j12), j12));
            }
        }
        return new j0.a(k0Var);
    }

    @Override // l7.j0
    public boolean e() {
        return this.f113513d != -1 || this.f113516g;
    }

    @Override // l7.j0
    public long f() {
        return this.f113515f;
    }

    public long h(long j11) {
        return i(j11, this.f113511b, this.f113514e);
    }
}
