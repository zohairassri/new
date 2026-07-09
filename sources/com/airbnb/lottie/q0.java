package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f18346b;

    public q0(Object obj) {
        this.f18345a = obj;
        this.f18346b = null;
    }

    public Throwable a() {
        return this.f18346b;
    }

    public Object b() {
        return this.f18345a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (b() != null && b().equals(q0Var.b())) {
            return true;
        }
        if (a() == null || q0Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public q0(Throwable th2) {
        this.f18346b = th2;
        this.f18345a = null;
    }
}
