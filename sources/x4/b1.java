package x4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f137025a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1 f137026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f137027b;

        a(c1 c1Var, View view) {
            this.f137026a = c1Var;
            this.f137027b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f137026a.a(this.f137027b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f137026a.b(this.f137027b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f137026a.c(this.f137027b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f11) {
            return viewPropertyAnimator.translationZ(f11);
        }
    }

    b1(View view) {
        this.f137025a = new WeakReference(view);
    }

    private void h(View view, c1 c1Var) {
        if (c1Var != null) {
            view.animate().setListener(new a(c1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public b1 b(float f11) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f137025a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public b1 e(long j11) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
        return this;
    }

    public b1 f(Interpolator interpolator) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public b1 g(c1 c1Var) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            h(view, c1Var);
        }
        return this;
    }

    public b1 i(long j11) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
        return this;
    }

    public b1 j(final e1 e1Var) {
        final View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().setUpdateListener(e1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: x4.a1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e1Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public b1 l(float f11) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }

    public b1 m(float f11) {
        View view = (View) this.f137025a.get();
        if (view != null) {
            b.a(view.animate(), f11);
        }
        return this;
    }
}
