package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class b34 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f23665a;

    b34(Iterator it) {
        it.getClass();
        this.f23665a = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23665a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f23665a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f23665a.remove();
    }
}
