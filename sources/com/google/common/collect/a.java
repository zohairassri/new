package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class a extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45838b;

    protected a(int i11, int i12) {
        zo.o.m(i12, i11);
        this.f45837a = i11;
        this.f45838b = i12;
    }

    protected abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f45838b < this.f45837a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f45838b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f45838b;
        this.f45838b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f45838b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f45838b - 1;
        this.f45838b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f45838b - 1;
    }
}
