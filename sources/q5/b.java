package q5;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import q5.a;
import x4.r0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f122390m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f122391n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f122392o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f122393p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f122394q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f122395r = new l("rotation");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f122396s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f122397t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f122398u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f122399v = new a(QueryKeys.CONTENT_HEIGHT);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f122400w = new C1625b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f122401x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f122402y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f122403z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f122404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f122405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f122406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f122407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q5.c f122408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f122409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f122410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f122411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f122412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f122413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f122414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f122415l;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setY(f11);
        }
    }

    /* JADX INFO: renamed from: q5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class C1625b extends s {
        C1625b(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return r0.K(view);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            r0.H0(view, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setAlpha(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScrollX((int) f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScrollY((int) f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class f extends q5.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q5.d f122416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, q5.d dVar) {
            super(str);
            this.f122416b = dVar;
        }

        @Override // q5.c
        public float a(Object obj) {
            return this.f122416b.a();
        }

        @Override // q5.c
        public void b(Object obj, float f11) {
            this.f122416b.b(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setTranslationX(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setTranslationY(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return r0.H(view);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            r0.F0(view, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScaleX(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setScaleY(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setRotation(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setRotationX(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setRotationY(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // q5.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // q5.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f11) {
            view.setX(f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f122418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f122419b;

        p() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface q {
        void a(b bVar, boolean z11, float f11, float f12);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface r {
        void l(b bVar, float f11, float f12);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class s extends q5.c {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    b(q5.d dVar) {
        this.f122404a = 0.0f;
        this.f122405b = Float.MAX_VALUE;
        this.f122406c = false;
        this.f122409f = false;
        this.f122410g = Float.MAX_VALUE;
        this.f122411h = -Float.MAX_VALUE;
        this.f122412i = 0L;
        this.f122414k = new ArrayList();
        this.f122415l = new ArrayList();
        this.f122407d = null;
        this.f122408e = new f("FloatValueHolder", dVar);
        this.f122413j = 1.0f;
    }

    private void d(boolean z11) {
        this.f122409f = false;
        q5.a.d().g(this);
        this.f122412i = 0L;
        this.f122406c = false;
        for (int i11 = 0; i11 < this.f122414k.size(); i11++) {
            if (this.f122414k.get(i11) != null) {
                ((q) this.f122414k.get(i11)).a(this, z11, this.f122405b, this.f122404a);
            }
        }
        h(this.f122414k);
    }

    private float e() {
        return this.f122408e.a(this.f122407d);
    }

    private static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void q() {
        if (this.f122409f) {
            return;
        }
        this.f122409f = true;
        if (!this.f122406c) {
            this.f122405b = e();
        }
        float f11 = this.f122405b;
        if (f11 > this.f122410g || f11 < this.f122411h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        q5.a.d().a(this, 0L);
    }

    @Override // q5.a.b
    public boolean a(long j11) {
        long j12 = this.f122412i;
        if (j12 == 0) {
            this.f122412i = j11;
            l(this.f122405b);
            return false;
        }
        this.f122412i = j11;
        boolean zR = r(j11 - j12);
        float fMin = Math.min(this.f122405b, this.f122410g);
        this.f122405b = fMin;
        float fMax = Math.max(fMin, this.f122411h);
        this.f122405b = fMax;
        l(fMax);
        if (zR) {
            d(false);
        }
        return zR;
    }

    public b b(q qVar) {
        if (!this.f122414k.contains(qVar)) {
            this.f122414k.add(qVar);
        }
        return this;
    }

    public b c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f122415l.contains(rVar)) {
            this.f122415l.add(rVar);
        }
        return this;
    }

    float f() {
        return this.f122413j * 0.75f;
    }

    public boolean g() {
        return this.f122409f;
    }

    public b i(float f11) {
        this.f122410g = f11;
        return this;
    }

    public b j(float f11) {
        this.f122411h = f11;
        return this;
    }

    public b k(float f11) {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f122413j = f11;
        o(f11 * 0.75f);
        return this;
    }

    void l(float f11) {
        this.f122408e.b(this.f122407d, f11);
        for (int i11 = 0; i11 < this.f122415l.size(); i11++) {
            if (this.f122415l.get(i11) != null) {
                ((r) this.f122415l.get(i11)).l(this, this.f122405b, this.f122404a);
            }
        }
        h(this.f122415l);
    }

    public b m(float f11) {
        this.f122405b = f11;
        this.f122406c = true;
        return this;
    }

    public b n(float f11) {
        this.f122404a = f11;
        return this;
    }

    abstract void o(float f11);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f122409f) {
            return;
        }
        q();
    }

    abstract boolean r(long j11);

    b(Object obj, q5.c cVar) {
        this.f122404a = 0.0f;
        this.f122405b = Float.MAX_VALUE;
        this.f122406c = false;
        this.f122409f = false;
        this.f122410g = Float.MAX_VALUE;
        this.f122411h = -Float.MAX_VALUE;
        this.f122412i = 0L;
        this.f122414k = new ArrayList();
        this.f122415l = new ArrayList();
        this.f122407d = obj;
        this.f122408e = cVar;
        if (cVar != f122395r && cVar != f122396s && cVar != f122397t) {
            if (cVar == f122401x) {
                this.f122413j = 0.00390625f;
                return;
            } else if (cVar != f122393p && cVar != f122394q) {
                this.f122413j = 1.0f;
                return;
            } else {
                this.f122413j = 0.00390625f;
                return;
            }
        }
        this.f122413j = 0.1f;
    }
}
