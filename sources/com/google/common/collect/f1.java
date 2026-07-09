package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class f1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f45914a;

    f1(Iterator it) {
        this.f45914a = (Iterator) zo.o.k(it);
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45914a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f45914a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f45914a.remove();
    }
}
