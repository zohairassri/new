package com.google.android.gms.internal.pal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class x3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f41941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y3 f41942b;

    x3(y3 y3Var) {
        this.f41942b = y3Var;
        this.f41941a = y3Var.f42228a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41941a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f41941a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
