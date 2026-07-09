package i8;

import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class p extends p6.e implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f103282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f103283f;

    @Override // i8.k
    public int a(long j11) {
        return ((k) k6.a.e(this.f103282e)).a(j11 - this.f103283f);
    }

    @Override // i8.k
    public List b(long j11) {
        return ((k) k6.a.e(this.f103282e)).b(j11 - this.f103283f);
    }

    @Override // i8.k
    public long c(int i11) {
        return ((k) k6.a.e(this.f103282e)).c(i11) + this.f103283f;
    }

    @Override // i8.k
    public int e() {
        return ((k) k6.a.e(this.f103282e)).e();
    }

    @Override // p6.e, p6.a
    public void g() {
        super.g();
        this.f103282e = null;
    }

    public void t(long j11, k kVar, long j12) {
        this.f121188b = j11;
        this.f103282e = kVar;
        if (j12 != LongCompanionObject.MAX_VALUE) {
            j11 = j12;
        }
        this.f103283f = j11;
    }
}
