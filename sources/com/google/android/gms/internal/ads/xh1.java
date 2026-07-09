package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class xh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o63 f37982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cm.u f37983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37984d;

    public xh1(qy2 qy2Var, o63 o63Var) {
        this.f37981a = qy2Var.f33867p;
        this.f37982b = o63Var;
        this.f37983c = qy2Var.f33884x0;
    }

    public final void a() {
        if (this.f37984d) {
            return;
        }
        this.f37982b.a(this.f37981a, this.f37983c);
        this.f37984d = true;
    }
}
