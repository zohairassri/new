package e8;

import l7.f0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class a extends l7.i implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f91461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f91462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f91463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f91464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f91465l;

    public a(long j11, long j12, f0.a aVar, boolean z11) {
        this(j11, j12, aVar.f113501f, aVar.f113498c, z11);
    }

    @Override // e8.g
    public long b(long j11) {
        return h(j11);
    }

    @Override // e8.g
    public long d() {
        return this.f91465l;
    }

    @Override // e8.g
    public long g() {
        return this.f91461h;
    }

    public a j(long j11) {
        return new a(j11, this.f91461h, this.f91462i, this.f91463j, this.f91464k);
    }

    @Override // e8.g
    public int m() {
        return this.f91462i;
    }

    public a(long j11, long j12, int i11, int i12, boolean z11) {
        super(j11, j12, i11, i12, z11);
        this.f91461h = j12;
        this.f91462i = i11;
        this.f91463j = i12;
        this.f91464k = z11;
        this.f91465l = j11 == -1 ? -1L : j11;
    }
}
