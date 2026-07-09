package t7;

import l7.q;
import l7.z;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
final class d extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f129398b;

    public d(q qVar, long j11) {
        super(qVar);
        k6.a.a(qVar.getPosition() >= j11);
        this.f129398b = j11;
    }

    @Override // l7.z, l7.q
    public long g() {
        return super.g() - this.f129398b;
    }

    @Override // l7.z, l7.q
    public long getLength() {
        return super.getLength() - this.f129398b;
    }

    @Override // l7.z, l7.q
    public long getPosition() {
        return super.getPosition() - this.f129398b;
    }
}
