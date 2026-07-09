package zb;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f142168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f142169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f142170c;

    public o(PointF pointF, boolean z11, List list) {
        this.f142169b = pointF;
        this.f142170c = z11;
        this.f142168a = new ArrayList(list);
    }

    public List a() {
        return this.f142168a;
    }

    public PointF b() {
        return this.f142169b;
    }

    public void c(o oVar, o oVar2, float f11) {
        if (this.f142169b == null) {
            this.f142169b = new PointF();
        }
        this.f142170c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            ec.d.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f142168a.size() < iMin) {
            for (int size = this.f142168a.size(); size < iMin; size++) {
                this.f142168a.add(new xb.a());
            }
        } else if (this.f142168a.size() > iMin) {
            for (int size2 = this.f142168a.size() - 1; size2 >= iMin; size2--) {
                List list = this.f142168a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(ec.i.i(pointFB.x, pointFB2.x, f11), ec.i.i(pointFB.y, pointFB2.y, f11));
        for (int size3 = this.f142168a.size() - 1; size3 >= 0; size3--) {
            xb.a aVar = (xb.a) oVar.a().get(size3);
            xb.a aVar2 = (xb.a) oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            ((xb.a) this.f142168a.get(size3)).d(ec.i.i(pointFA.x, pointFA2.x, f11), ec.i.i(pointFA.y, pointFA2.y, f11));
            ((xb.a) this.f142168a.get(size3)).e(ec.i.i(pointFB3.x, pointFB4.x, f11), ec.i.i(pointFB3.y, pointFB4.y, f11));
            ((xb.a) this.f142168a.get(size3)).f(ec.i.i(pointFC.x, pointFC2.x, f11), ec.i.i(pointFC.y, pointFC2.y, f11));
        }
    }

    public boolean d() {
        return this.f142170c;
    }

    public void e(boolean z11) {
        this.f142170c = z11;
    }

    public void f(float f11, float f12) {
        if (this.f142169b == null) {
            this.f142169b = new PointF();
        }
        this.f142169b.set(f11, f12);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f142168a.size() + "closed=" + this.f142170c + '}';
    }

    public o() {
        this.f142168a = new ArrayList();
    }
}
