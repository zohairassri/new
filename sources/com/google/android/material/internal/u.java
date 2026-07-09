package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f44905a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f44906b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ValueAnimator f44907c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f44908d = new a();

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u uVar = u.this;
            if (uVar.f44907c == animator) {
                uVar.f44907c = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f44910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ValueAnimator f44911b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f44910a = iArr;
            this.f44911b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f44908d);
        this.f44905a.add(bVar);
    }
}
