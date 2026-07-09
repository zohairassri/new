package bm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14787a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f14788b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f14789c = new ArrayList();

    public final d0 a(String str, double d11, double d12) {
        List list;
        int i11 = 0;
        while (true) {
            list = this.f14787a;
            if (i11 >= list.size()) {
                break;
            }
            double dDoubleValue = ((Double) this.f14789c.get(i11)).doubleValue();
            double dDoubleValue2 = ((Double) this.f14788b.get(i11)).doubleValue();
            if (d11 < dDoubleValue || (dDoubleValue == d11 && d12 < dDoubleValue2)) {
                break;
            }
            i11++;
        }
        list.add(i11, str);
        this.f14789c.add(i11, Double.valueOf(d11));
        this.f14788b.add(i11, Double.valueOf(d12));
        return this;
    }

    public final e0 b() {
        return new e0(this, null);
    }

    final /* synthetic */ List c() {
        return this.f14787a;
    }

    final /* synthetic */ List d() {
        return this.f14788b;
    }

    final /* synthetic */ List e() {
        return this.f14789c;
    }
}
