package w;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f133497a;

    public b4(int i11) {
        this.f133497a = i11;
    }

    @Override // w.u3
    public int c() {
        return 0;
    }

    @Override // w.r3
    public s d(long j11, s sVar, s sVar2, s sVar3) {
        return j11 < ((long) f()) * 1000000 ? sVar : sVar2;
    }

    @Override // w.u3
    public int f() {
        return this.f133497a;
    }

    @Override // w.r3
    public s e(long j11, s sVar, s sVar2, s sVar3) {
        return sVar3;
    }
}
