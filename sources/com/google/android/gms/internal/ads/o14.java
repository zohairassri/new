package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class o14 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f31744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ax3 f31745b;

    o14(List list, ax3 ax3Var) {
        list.getClass();
        this.f31744a = list;
        this.f31745b = ax3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f31744a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new n14(this, this.f31744a.listIterator(i11));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        this.f31744a.subList(i11, i12).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31744a.size();
    }
}
