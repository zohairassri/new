package yb;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
abstract class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f140214a;

    n(List list) {
        this.f140214a = list;
    }

    @Override // yb.m
    public List b() {
        return this.f140214a;
    }

    @Override // yb.m
    public boolean c() {
        return this.f140214a.isEmpty() || (this.f140214a.size() == 1 && ((fc.a) this.f140214a.get(0)).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f140214a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f140214a.toArray()));
        }
        return sb2.toString();
    }
}
