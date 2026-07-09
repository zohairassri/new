package com.google.android.gms.internal.atv_ads_framework;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class z3 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f40097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f40098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b4 f40099c;

    z3(b4 b4Var, int i11) {
        this.f40099c = b4Var;
        this.f40098b = i11;
        this.f40097a = b4Var.f39849a.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f40097a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40097a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f40097a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40097a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f40097a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40097a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
