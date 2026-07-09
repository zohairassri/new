package hk;

import ck.l;
import ck.u;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class c extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f102172b;

    public c(l lVar, long j11) {
        super(lVar);
        ml.a.a(lVar.getPosition() >= j11);
        this.f102172b = j11;
    }

    @Override // ck.u, ck.l
    public long g() {
        return super.g() - this.f102172b;
    }

    @Override // ck.u, ck.l
    public long getLength() {
        return super.getLength() - this.f102172b;
    }

    @Override // ck.u, ck.l
    public long getPosition() {
        return super.getPosition() - this.f102172b;
    }
}
