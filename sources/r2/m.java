package r2;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f123529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f123530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f123531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f123532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f123533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f123534f;

    public m(List list, f fVar) {
        this.f123529a = list;
        this.f123530b = fVar;
        MotionEvent motionEventF = f();
        this.f123531c = motionEventF != null ? motionEventF.getClassification() : 0;
        MotionEvent motionEventF2 = f();
        this.f123532d = l.a(motionEventF2 != null ? motionEventF2.getButtonState() : 0);
        MotionEvent motionEventF3 = f();
        this.f123533e = j0.b(motionEventF3 != null ? motionEventF3.getMetaState() : 0);
        this.f123534f = a();
    }

    private final int a() {
        MotionEvent motionEventF = f();
        if (motionEventF == null) {
            List list = this.f123529a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                x xVar = (x) list.get(i11);
                if (n.d(xVar)) {
                    return p.f123541a.e();
                }
                if (n.b(xVar)) {
                    return p.f123541a.d();
                }
            }
            return p.f123541a.c();
        }
        int actionMasked = motionEventF.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return p.f123541a.f();
                        case 9:
                            return p.f123541a.a();
                        case 10:
                            return p.f123541a.b();
                        default:
                            return p.f123541a.g();
                    }
                }
                return p.f123541a.c();
            }
            return p.f123541a.e();
        }
        return p.f123541a.d();
    }

    public final int b() {
        return this.f123532d;
    }

    public final List c() {
        return this.f123529a;
    }

    public final int d() {
        return this.f123531c;
    }

    public final f e() {
        return this.f123530b;
    }

    public final MotionEvent f() {
        f fVar = this.f123530b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public final int g() {
        return this.f123534f;
    }

    public final void h(int i11) {
        this.f123534f = i11;
    }

    public m(List list) {
        this(list, null);
    }
}
