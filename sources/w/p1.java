package w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class p1 implements r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r3 f133756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f133757b;

    public p1(r3 r3Var, long j11) {
        this.f133756a = r3Var;
        this.f133757b = j11;
    }

    @Override // w.r3
    public boolean a() {
        return this.f133756a.a();
    }

    @Override // w.r3
    public long b(s sVar, s sVar2, s sVar3) {
        return this.f133756a.b(sVar, sVar2, sVar3) + this.f133757b;
    }

    @Override // w.r3
    public s d(long j11, s sVar, s sVar2, s sVar3) {
        long j12 = this.f133757b;
        return j11 < j12 ? sVar : this.f133756a.d(j11 - j12, sVar, sVar2, sVar3);
    }

    @Override // w.r3
    public s e(long j11, s sVar, s sVar2, s sVar3) {
        long j12 = this.f133757b;
        return j11 < j12 ? sVar3 : this.f133756a.e(j11 - j12, sVar, sVar2, sVar3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return p1Var.f133757b == this.f133757b && Intrinsics.areEqual(p1Var.f133756a, this.f133756a);
    }

    public int hashCode() {
        return (this.f133756a.hashCode() * 31) + Long.hashCode(this.f133757b);
    }
}
