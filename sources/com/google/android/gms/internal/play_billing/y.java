package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class y extends p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42634b;

    protected y(int i11, int i12) {
        v.b(i12, i11, "index");
        this.f42633a = i11;
        this.f42634b = i12;
    }

    protected abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f42634b < this.f42633a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f42634b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f42634b;
        this.f42634b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f42634b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f42634b - 1;
        this.f42634b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f42634b - 1;
    }
}
