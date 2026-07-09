package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class gb extends AbstractList implements w8, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w8 f40375a;

    public gb(w8 w8Var) {
        this.f40375a = w8Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        return (String) this.f40375a.get(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ib(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new jb(this, i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40375a.size();
    }

    @Override // com.google.android.gms.internal.measurement.w8
    public final void w1(c7 c7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.w8
    public final Object zzb(int i11) {
        return this.f40375a.zzb(i11);
    }

    @Override // com.google.android.gms.internal.measurement.w8
    public final List zzb() {
        return this.f40375a.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.w8
    public final w8 U() {
        return this;
    }
}
