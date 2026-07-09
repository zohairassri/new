package com.google.android.gms.internal.pal;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class w3 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ListIterator f41906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f41907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y3 f41908c;

    w3(y3 y3Var, int i11) {
        this.f41908c = y3Var;
        this.f41907b = i11;
        this.f41906a = y3Var.f42228a.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f41906a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f41906a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f41906a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f41906a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f41906a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f41906a.previousIndex();
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
