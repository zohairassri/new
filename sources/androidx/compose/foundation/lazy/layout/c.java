package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f3666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f3669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f3670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3671f = -1;

    private final int a(int i11, int i12) {
        return i12 == -1 ? i11 : ((i12 * 3) + i11) / 4;
    }

    private final long b(long j11, long j12) {
        if (j12 == 0) {
            return j11;
        }
        long j13 = 4;
        return ((j12 / j13) * ((long) 3)) + (j11 / j13);
    }

    public final void c() {
        this.f3670e = 0L;
    }

    public final long d() {
        return this.f3669d;
    }

    public final long e() {
        return this.f3666a;
    }

    public final long f() {
        return this.f3670e;
    }

    public final int g() {
        return this.f3671f;
    }

    public final long h() {
        return this.f3668c;
    }

    public final long i() {
        return this.f3667b;
    }

    public final void j(long j11) {
        this.f3669d = b(j11, this.f3669d);
    }

    public final void k(long j11) {
        this.f3666a = b(j11, this.f3666a);
    }

    public final void l(long j11) {
        this.f3670e = b(j11, this.f3670e);
    }

    public final void m(int i11) {
        this.f3671f = a(i11, this.f3671f);
    }

    public final void n(long j11) {
        this.f3668c = b(j11, this.f3668c);
    }

    public final void o(long j11) {
        this.f3667b = b(j11, this.f3667b);
    }
}
