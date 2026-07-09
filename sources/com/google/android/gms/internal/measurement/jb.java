package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class jb implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ListIterator f40460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ gb f40462c;

    jb(gb gbVar, int i11) {
        this.f40462c = gbVar;
        this.f40461b = i11;
        this.f40460a = gbVar.f40375a.listIterator(i11);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f40460a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40460a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f40460a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40460a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f40460a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40460a.previousIndex();
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
