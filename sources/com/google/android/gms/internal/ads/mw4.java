package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class mw4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    nw4 f31087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    nw4 f31088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f31089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ow4 f31090d;

    mw4(ow4 ow4Var) {
        Objects.requireNonNull(ow4Var);
        this.f31090d = ow4Var;
        this.f31087a = ow4Var.f32134f.f31673d;
        this.f31088b = null;
        this.f31089c = ow4Var.f32133e;
    }

    final nw4 a() {
        ow4 ow4Var = this.f31090d;
        nw4 nw4Var = this.f31087a;
        if (nw4Var == ow4Var.f32134f) {
            throw new NoSuchElementException();
        }
        if (ow4Var.f32133e != this.f31089c) {
            throw new ConcurrentModificationException();
        }
        this.f31087a = nw4Var.f31673d;
        this.f31088b = nw4Var;
        return nw4Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31087a != this.f31090d.f32134f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        nw4 nw4Var = this.f31088b;
        if (nw4Var == null) {
            throw new IllegalStateException();
        }
        ow4 ow4Var = this.f31090d;
        ow4Var.f(nw4Var, true);
        this.f31088b = null;
        this.f31089c = ow4Var.f32133e;
    }
}
