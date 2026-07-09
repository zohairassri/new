package al;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class l extends ak.f implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f1082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f1083e;

    @Override // al.h
    public int a(long j11) {
        return ((h) ml.a.e(this.f1082d)).a(j11 - this.f1083e);
    }

    @Override // al.h
    public List b(long j11) {
        return ((h) ml.a.e(this.f1082d)).b(j11 - this.f1083e);
    }

    @Override // al.h
    public long c(int i11) {
        return ((h) ml.a.e(this.f1082d)).c(i11) + this.f1083e;
    }

    @Override // al.h
    public int e() {
        return ((h) ml.a.e(this.f1082d)).e();
    }

    @Override // ak.a
    public void g() {
        super.g();
        this.f1082d = null;
    }

    public void u(long j11, h hVar, long j12) {
        this.f996b = j11;
        this.f1082d = hVar;
        if (j12 != LongCompanionObject.MAX_VALUE) {
            j11 = j12;
        }
        this.f1083e = j11;
    }
}
