package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class km0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f29754a;

    public km0(View view) {
        this.f29754a = new WeakReference(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    public final void c() {
        ViewTreeObserver viewTreeObserverE = e();
        if (viewTreeObserverE != null) {
            a(viewTreeObserverE);
        }
    }

    public final void d() {
        ViewTreeObserver viewTreeObserverE = e();
        if (viewTreeObserverE != null) {
            b(viewTreeObserverE);
        }
    }

    protected final ViewTreeObserver e() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f29754a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
