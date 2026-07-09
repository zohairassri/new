package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class h93 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ i93 f27596a;

    h93(i93 i93Var) {
        Objects.requireNonNull(i93Var);
        this.f27596a = i93Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i93 i93Var = this.f27596a;
        AtomicBoolean atomicBooleanF = i93Var.f();
        float fC = i93Var.c();
        atomicBooleanF.set(false);
        if (((Float) i93Var.e().getAndSet(Float.valueOf(fC))).floatValue() != fC) {
            i93Var.d().post(new g93(this, fC));
        }
    }
}
