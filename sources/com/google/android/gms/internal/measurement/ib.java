package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ib implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f40429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ gb f40430b;

    ib(gb gbVar) {
        this.f40430b = gbVar;
        this.f40429a = gbVar.f40375a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40429a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f40429a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
