package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class h extends ViewGroup implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ViewGroup f12968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f12969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f12970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Matrix f12972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f12973f;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            h.this.postInvalidateOnAnimation();
            h hVar = h.this;
            ViewGroup viewGroup = hVar.f12968a;
            if (viewGroup == null || (view = hVar.f12969b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            h.this.f12968a.postInvalidateOnAnimation();
            h hVar2 = h.this;
            hVar2.f12968a = null;
            hVar2.f12969b = null;
            return true;
        }
    }

    h(View view) {
        super(view.getContext());
        this.f12973f = new a();
        this.f12970c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static h b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i11;
        g gVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        g gVarB = g.b(viewGroup);
        h hVarE = e(view);
        if (hVarE == null || (gVar = (g) hVarE.getParent()) == gVarB) {
            i11 = 0;
        } else {
            i11 = hVarE.f12971d;
            gVar.removeView(hVarE);
            hVarE = null;
        }
        if (hVarE == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            hVarE = new h(view);
            hVarE.h(matrix);
            if (gVarB == null) {
                gVarB = new g(viewGroup);
            } else {
                gVarB.g();
            }
            d(viewGroup, gVarB);
            d(viewGroup, hVarE);
            gVarB.a(hVarE);
            hVarE.f12971d = i11;
        } else if (matrix != null) {
            hVarE.h(matrix);
        }
        hVarE.f12971d++;
        return hVarE;
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        i0.h(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        i0.i(viewGroup, matrix);
    }

    static void d(View view, View view2) {
        i0.e(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static h e(View view) {
        return (h) view.getTag(n.ghost_view);
    }

    static void f(View view) {
        h hVarE = e(view);
        if (hVarE != null) {
            int i11 = hVarE.f12971d - 1;
            hVarE.f12971d = i11;
            if (i11 <= 0) {
                ((g) hVarE.getParent()).removeView(hVarE);
            }
        }
    }

    static void g(View view, h hVar) {
        view.setTag(n.ghost_view, hVar);
    }

    @Override // androidx.transition.f
    public void a(ViewGroup viewGroup, View view) {
        this.f12968a = viewGroup;
        this.f12969b = view;
    }

    void h(Matrix matrix) {
        this.f12972e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.f12970c, this);
        this.f12970c.getViewTreeObserver().addOnPreDrawListener(this.f12973f);
        i0.g(this.f12970c, 4);
        if (this.f12970c.getParent() != null) {
            ((View) this.f12970c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f12970c.getViewTreeObserver().removeOnPreDrawListener(this.f12973f);
        i0.g(this.f12970c, 0);
        g(this.f12970c, null);
        if (this.f12970c.getParent() != null) {
            ((View) this.f12970c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        androidx.transition.a.a(canvas, true);
        canvas.setMatrix(this.f12972e);
        i0.g(this.f12970c, 0);
        this.f12970c.invalidate();
        i0.g(this.f12970c, 4);
        drawChild(canvas, this.f12970c, getDrawingTime());
        androidx.transition.a.a(canvas, false);
    }

    @Override // android.view.View, androidx.transition.f
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (e(this.f12970c) == this) {
            i0.g(this.f12970c, i11 == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
