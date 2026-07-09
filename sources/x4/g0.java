package x4;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f137045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f137046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f137047c;

    private g0(View view, Runnable runnable) {
        this.f137045a = view;
        this.f137046b = view.getViewTreeObserver();
        this.f137047c = runnable;
    }

    public static g0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        g0 g0Var = new g0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(g0Var);
        view.addOnAttachStateChangeListener(g0Var);
        return g0Var;
    }

    public void b() {
        if (this.f137046b.isAlive()) {
            this.f137046b.removeOnPreDrawListener(this);
        } else {
            this.f137045a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f137045a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f137047c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f137046b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
