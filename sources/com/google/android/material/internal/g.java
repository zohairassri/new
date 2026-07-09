package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f44861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f44862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f44863c = new float[2];

    public g(View view, View view2) {
        this.f44861a = view;
        this.f44862b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        h.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f44863c);
        View view = this.f44861a;
        if (view != null) {
            view.setAlpha(this.f44863c[0]);
        }
        View view2 = this.f44862b;
        if (view2 != null) {
            view2.setAlpha(this.f44863c[1]);
        }
    }
}
