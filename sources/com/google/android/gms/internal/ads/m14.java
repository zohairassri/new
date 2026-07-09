package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class m14 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f30539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ax3 f30540b;

    m14(List list, ax3 ax3Var) {
        list.getClass();
        this.f30539a = list;
        this.f30540b = ax3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return this.f30540b.apply(this.f30539a.get(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f30539a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new l14(this, this.f30539a.listIterator(i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        return this.f30540b.apply(this.f30539a.remove(i11));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        this.f30539a.subList(i11, i12).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30539a.size();
    }
}
