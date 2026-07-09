package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class gc1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f26925a;

    @Override // java.lang.Runnable
    public final void run() {
        ic1 ic1Var = (ic1) this.f26925a.get();
        if (ic1Var != null) {
            ic1Var.j0(fc1.f26228a);
        }
    }
}
