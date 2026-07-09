package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import x4.r0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45691a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f45692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f45693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ co.a f45694c;

        a(View view, int i11, co.a aVar) {
            this.f45692a = view;
            this.f45693b = i11;
            this.f45694c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f45692a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f45691a == this.f45693b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                co.a aVar = this.f45694c;
                expandableBehavior.L((View) aVar, this.f45692a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f45691a = 0;
    }

    private boolean J(boolean z11) {
        if (!z11) {
            return this.f45691a == 1;
        }
        int i11 = this.f45691a;
        return i11 == 0 || i11 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected co.a K(CoordinatorLayout coordinatorLayout, View view) {
        List listV = coordinatorLayout.v(view);
        int size = listV.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) listV.get(i11);
            if (i(coordinatorLayout, view, view2)) {
                return (co.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean L(View view, View view2, boolean z11, boolean z12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        co.a aVar = (co.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f45691a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i11) {
        co.a aVarK;
        if (r0.Q(view) || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i12 = aVarK.a() ? 1 : 2;
        this.f45691a = i12;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45691a = 0;
    }
}
