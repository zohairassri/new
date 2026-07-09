package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class ub5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tb5 f35986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sb5 f35987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final au f35988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f35990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f35991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f35993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35994i;

    public ub5(sb5 sb5Var, tb5 tb5Var, au auVar, int i11, jl1 jl1Var, Looper looper) {
        this.f35987b = sb5Var;
        this.f35986a = tb5Var;
        this.f35988c = auVar;
        this.f35991f = looper;
        this.f35992g = i11;
    }

    public final tb5 a() {
        return this.f35986a;
    }

    public final ub5 b(int i11) {
        jx3.i(!this.f35993h);
        this.f35989d = i11;
        return this;
    }

    public final int c() {
        return this.f35989d;
    }

    public final ub5 d(Object obj) {
        jx3.i(!this.f35993h);
        this.f35990e = obj;
        return this;
    }

    public final Object e() {
        return this.f35990e;
    }

    public final Looper f() {
        return this.f35991f;
    }

    public final ub5 g() {
        jx3.i(!this.f35993h);
        this.f35993h = true;
        this.f35987b.a(this);
        return this;
    }

    public final synchronized boolean h() {
        return false;
    }

    public final synchronized void i(boolean z11) {
        this.f35994i = z11 | this.f35994i;
        notifyAll();
    }
}
