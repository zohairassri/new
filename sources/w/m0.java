package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f133730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f133731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f133732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f133733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f133734e;

    public m0(int i11, int i12, e0 e0Var) {
        this.f133730a = i11;
        this.f133731b = i12;
        this.f133732c = e0Var;
        this.f133733d = ((long) i11) * 1000000;
        this.f133734e = ((long) i12) * 1000000;
    }

    @Override // w.i0
    public float c(long j11, float f11, float f12, float f13) {
        long j12 = j11 - this.f133734e;
        long j13 = this.f133733d;
        if (j12 < 0) {
            j12 = 0;
        }
        if (j12 > j13) {
            j12 = j13;
        }
        float fA = this.f133732c.a(this.f133730a == 0 ? 1.0f : j12 / j13);
        return (f11 * (1 - fA)) + (f12 * fA);
    }

    @Override // w.i0
    public float d(long j11, float f11, float f12, float f13) {
        long j12 = j11 - this.f133734e;
        long j13 = this.f133733d;
        if (j12 < 0) {
            j12 = 0;
        }
        long j14 = j12 > j13 ? j13 : j12;
        if (j14 == 0) {
            return f13;
        }
        return (c(j14, f11, f12, f13) - c(j14 - 1000000, f11, f12, f13)) * 1000.0f;
    }

    @Override // w.i0
    public long e(float f11, float f12, float f13) {
        return this.f133734e + this.f133733d;
    }
}
