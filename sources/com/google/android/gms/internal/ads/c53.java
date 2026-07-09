package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class c53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24394a;

    public c53(Context context, Looper looper, jl1 jl1Var) {
        context.getApplicationContext();
        jl1Var.a(looper, null);
        jl1Var.a(Looper.getMainLooper(), null);
    }

    public final void a(boolean z11) {
        if (this.f24394a == z11) {
            return;
        }
        this.f24394a = z11;
    }
}
