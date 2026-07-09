package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class y3 extends AbstractList implements RandomAccess, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f42228a;

    public y3(k2 k2Var) {
        this.f42228a = k2Var;
    }

    @Override // com.google.android.gms.internal.pal.k2
    public final void E0(a1 a1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.pal.k2
    public final Object f(int i11) {
        return this.f42228a.f(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return ((j2) this.f42228a).get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new w3(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42228a.size();
    }

    @Override // com.google.android.gms.internal.pal.k2
    public final List zzh() {
        return this.f42228a.zzh();
    }

    @Override // com.google.android.gms.internal.pal.k2
    public final k2 zze() {
        return this;
    }
}
