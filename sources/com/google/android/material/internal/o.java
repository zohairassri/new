package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View[] f44865b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        void a(ValueAnimator valueAnimator, View view);
    }

    public o(a aVar, View... viewArr) {
        this.f44864a = aVar;
        this.f44865b = viewArr;
    }

    public static o e(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.n
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.g(valueAnimator, view);
            }
        }, viewArr);
    }

    public static o f(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.m
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.h(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(ValueAnimator valueAnimator, View view) {
        Float f11 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f11.floatValue());
        view.setScaleY(f11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static o k(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.k
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.i(valueAnimator, view);
            }
        }, viewArr);
    }

    public static o l(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.l
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.j(valueAnimator, view);
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f44865b) {
            this.f44864a.a(valueAnimator, view);
        }
    }
}
