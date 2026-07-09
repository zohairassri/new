package ko;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f111611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f111612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f111613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f111614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f111615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f111616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f111617g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f111618h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f111619i;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f111620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f111621d;

        a(List list, Matrix matrix) {
            this.f111620c = list;
            this.f111621d = matrix;
        }

        @Override // ko.p.g
        public void a(Matrix matrix, jo.a aVar, int i11, Canvas canvas) {
            Iterator it = this.f111620c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f111621d, aVar, i11, canvas);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f111623c;

        public b(d dVar) {
            this.f111623c = dVar;
        }

        @Override // ko.p.g
        public void a(Matrix matrix, jo.a aVar, int i11, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f111623c.k(), this.f111623c.o(), this.f111623c.l(), this.f111623c.j()), i11, this.f111623c.m(), this.f111623c.n());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f111624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f111625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f111626e;

        public c(e eVar, float f11, float f12) {
            this.f111624c = eVar;
            this.f111625d = f11;
            this.f111626e = f12;
        }

        @Override // ko.p.g
        public void a(Matrix matrix, jo.a aVar, int i11, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f111624c.f111635c - this.f111626e, this.f111624c.f111634b - this.f111625d), 0.0f);
            this.f111638a.set(matrix);
            this.f111638a.preTranslate(this.f111625d, this.f111626e);
            this.f111638a.preRotate(c());
            aVar.b(canvas, this.f111638a, rectF, i11);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f111624c.f111635c - this.f111626e) / (this.f111624c.f111634b - this.f111625d)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f111627h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f111628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f111629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f111630d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f111631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f111632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f111633g;

        public d(float f11, float f12, float f13, float f14) {
            q(f11);
            u(f12);
            r(f13);
            p(f14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f111631e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f111628b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f111630d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f111632f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f111633g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f111629c;
        }

        private void p(float f11) {
            this.f111631e = f11;
        }

        private void q(float f11) {
            this.f111628b = f11;
        }

        private void r(float f11) {
            this.f111630d = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f11) {
            this.f111632f = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f11) {
            this.f111633g = f11;
        }

        private void u(float f11) {
            this.f111629c = f11;
        }

        @Override // ko.p.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f111636a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f111627h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f111634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f111635c;

        @Override // ko.p.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f111636a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f111634b, this.f111635c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f111636a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f111637b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f111638a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, jo.a aVar, int i11, Canvas canvas);

        public final void b(jo.a aVar, int i11, Canvas canvas) {
            a(f111637b, aVar, i11, canvas);
        }
    }

    public p() {
        n(0.0f, 0.0f);
    }

    private void b(float f11) {
        if (g() == f11) {
            return;
        }
        float fG = ((f11 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f111618h.add(new b(dVar));
        p(f11);
    }

    private void c(g gVar, float f11, float f12) {
        b(f11);
        this.f111618h.add(gVar);
        p(f12);
    }

    private float g() {
        return this.f111615e;
    }

    private float h() {
        return this.f111616f;
    }

    private void p(float f11) {
        this.f111615e = f11;
    }

    private void q(float f11) {
        this.f111616f = f11;
    }

    private void r(float f11) {
        this.f111613c = f11;
    }

    private void s(float f11) {
        this.f111614d = f11;
    }

    private void t(float f11) {
        this.f111611a = f11;
    }

    private void u(float f11) {
        this.f111612b = f11;
    }

    public void a(float f11, float f12, float f13, float f14, float f15, float f16) {
        d dVar = new d(f11, f12, f13, f14);
        dVar.s(f15);
        dVar.t(f16);
        this.f111617g.add(dVar);
        b bVar = new b(dVar);
        float f17 = f15 + f16;
        boolean z11 = f16 < 0.0f;
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        c(bVar, f15, z11 ? (180.0f + f17) % 360.0f : f17);
        double d11 = f17;
        r(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d11)))));
        s(((f12 + f14) * 0.5f) + (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d11)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f111617g.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((f) this.f111617g.get(i11)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f111619i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f111618h), new Matrix(matrix));
    }

    float i() {
        return this.f111613c;
    }

    float j() {
        return this.f111614d;
    }

    float k() {
        return this.f111611a;
    }

    float l() {
        return this.f111612b;
    }

    public void m(float f11, float f12) {
        e eVar = new e();
        eVar.f111634b = f11;
        eVar.f111635c = f12;
        this.f111617g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f11);
        s(f12);
    }

    public void n(float f11, float f12) {
        o(f11, f12, 270.0f, 0.0f);
    }

    public void o(float f11, float f12, float f13, float f14) {
        t(f11);
        u(f12);
        r(f11);
        s(f12);
        p(f13);
        q((f13 + f14) % 360.0f);
        this.f111617g.clear();
        this.f111618h.clear();
        this.f111619i = false;
    }
}
