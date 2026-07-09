package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c04 extends e04 implements Collection {
    protected c04() {
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return l().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        l().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return l().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return l().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return l().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return l().iterator();
    }

    protected abstract Collection l();

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return l().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return l().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return l().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return l().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return l().toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l().toArray(objArr);
    }
}
