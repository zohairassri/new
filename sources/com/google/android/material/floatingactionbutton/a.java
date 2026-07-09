package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animator f44650a;

    a() {
    }

    public void a() {
        Animator animator = this.f44650a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f44650a = null;
    }

    public void c(Animator animator) {
        a();
        this.f44650a = animator;
    }
}
