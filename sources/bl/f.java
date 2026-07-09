package bl;

import al.h;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14759a;

    public f(List list) {
        this.f14759a = list;
    }

    @Override // al.h
    public int a(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // al.h
    public List b(long j11) {
        return j11 >= 0 ? this.f14759a : Collections.EMPTY_LIST;
    }

    @Override // al.h
    public long c(int i11) {
        ml.a.a(i11 == 0);
        return 0L;
    }

    @Override // al.h
    public int e() {
        return 1;
    }
}
