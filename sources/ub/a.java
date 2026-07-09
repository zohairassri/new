package ub;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f131195c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected fc.c f131197e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f131193a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f131194b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f131196d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f131198f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f131199g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f131200h = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class c implements d {
        private c() {
        }

        @Override // ub.a.d
        public boolean a(float f11) {
            throw new IllegalStateException("not implemented");
        }

        @Override // ub.a.d
        public fc.a b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // ub.a.d
        public boolean c(float f11) {
            return false;
        }

        @Override // ub.a.d
        public float d() {
            return 0.0f;
        }

        @Override // ub.a.d
        public float e() {
            return 1.0f;
        }

        @Override // ub.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private interface d {
        boolean a(float f11);

        fc.a b();

        boolean c(float f11);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f131201a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private fc.a f131203c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f131204d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private fc.a f131202b = f(0.0f);

        e(List list) {
            this.f131201a = list;
        }

        private fc.a f(float f11) {
            List list = this.f131201a;
            fc.a aVar = (fc.a) list.get(list.size() - 1);
            if (f11 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f131201a.size() - 2; size >= 1; size--) {
                fc.a aVar2 = (fc.a) this.f131201a.get(size);
                if (this.f131202b != aVar2 && aVar2.a(f11)) {
                    return aVar2;
                }
            }
            return (fc.a) this.f131201a.get(0);
        }

        @Override // ub.a.d
        public boolean a(float f11) {
            fc.a aVar = this.f131203c;
            fc.a aVar2 = this.f131202b;
            if (aVar == aVar2 && this.f131204d == f11) {
                return true;
            }
            this.f131203c = aVar2;
            this.f131204d = f11;
            return false;
        }

        @Override // ub.a.d
        public fc.a b() {
            return this.f131202b;
        }

        @Override // ub.a.d
        public boolean c(float f11) {
            if (this.f131202b.a(f11)) {
                return !this.f131202b.i();
            }
            this.f131202b = f(f11);
            return true;
        }

        @Override // ub.a.d
        public float d() {
            return ((fc.a) this.f131201a.get(0)).f();
        }

        @Override // ub.a.d
        public float e() {
            return ((fc.a) this.f131201a.get(r1.size() - 1)).c();
        }

        @Override // ub.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fc.a f131205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f131206b = -1.0f;

        f(List list) {
            this.f131205a = (fc.a) list.get(0);
        }

        @Override // ub.a.d
        public boolean a(float f11) {
            if (this.f131206b == f11) {
                return true;
            }
            this.f131206b = f11;
            return false;
        }

        @Override // ub.a.d
        public fc.a b() {
            return this.f131205a;
        }

        @Override // ub.a.d
        public boolean c(float f11) {
            return !this.f131205a.i();
        }

        @Override // ub.a.d
        public float d() {
            return this.f131205a.f();
        }

        @Override // ub.a.d
        public float e() {
            return this.f131205a.c();
        }

        @Override // ub.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    a(List list) {
        this.f131195c = p(list);
    }

    private float g() {
        if (this.f131199g == -1.0f) {
            this.f131199g = this.f131195c.d();
        }
        return this.f131199g;
    }

    private static d p(List list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f131193a.add(bVar);
    }

    protected fc.a b() {
        if (com.airbnb.lottie.e.g()) {
            com.airbnb.lottie.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        fc.a aVarB = this.f131195c.b();
        if (com.airbnb.lottie.e.g()) {
            com.airbnb.lottie.e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return aVarB;
    }

    float c() {
        if (this.f131200h == -1.0f) {
            this.f131200h = this.f131195c.e();
        }
        return this.f131200h;
    }

    protected float d() {
        Interpolator interpolator;
        fc.a aVarB = b();
        if (aVarB == null || aVarB.i() || (interpolator = aVarB.f94132d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(e());
    }

    float e() {
        if (this.f131194b) {
            return 0.0f;
        }
        fc.a aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f131196d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f131196d;
    }

    public Object h() {
        float fE = e();
        if (this.f131197e == null && this.f131195c.a(fE)) {
            return this.f131198f;
        }
        fc.a aVarB = b();
        Interpolator interpolator = aVarB.f94133e;
        Object objI = (interpolator == null || aVarB.f94134f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f94134f.getInterpolation(fE));
        this.f131198f = objI;
        return objI;
    }

    abstract Object i(fc.a aVar, float f11);

    protected Object j(fc.a aVar, float f11, float f12, float f13) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f131197e != null;
    }

    public void l() {
        if (com.airbnb.lottie.e.g()) {
            com.airbnb.lottie.e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i11 = 0; i11 < this.f131193a.size(); i11++) {
            ((b) this.f131193a.get(i11)).a();
        }
        if (com.airbnb.lottie.e.g()) {
            com.airbnb.lottie.e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void m() {
        this.f131194b = true;
    }

    public void n(float f11) {
        if (com.airbnb.lottie.e.g()) {
            com.airbnb.lottie.e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f131195c.isEmpty()) {
            if (com.airbnb.lottie.e.g()) {
                com.airbnb.lottie.e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f11 < g()) {
            f11 = g();
        } else if (f11 > c()) {
            f11 = c();
        }
        if (f11 == this.f131196d) {
            if (com.airbnb.lottie.e.g()) {
                com.airbnb.lottie.e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f131196d = f11;
            if (this.f131195c.c(f11)) {
                l();
            }
            if (com.airbnb.lottie.e.g()) {
                com.airbnb.lottie.e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void o(fc.c cVar) {
        fc.c cVar2 = this.f131197e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f131197e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
