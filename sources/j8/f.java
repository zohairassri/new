package j8;

import i8.k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f105315a;

    public f(List list) {
        this.f105315a = list;
    }

    @Override // i8.k
    public int a(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // i8.k
    public List b(long j11) {
        return j11 >= 0 ? this.f105315a : Collections.EMPTY_LIST;
    }

    @Override // i8.k
    public long c(int i11) {
        k6.a.a(i11 == 0);
        return 0L;
    }

    @Override // i8.k
    public int e() {
        return 1;
    }
}
