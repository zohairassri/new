package hn;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class u extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102510b;

    protected u(int i11, int i12) {
        s.c(i12, i11, "index");
        this.f102509a = i11;
        this.f102510b = i12;
    }

    protected abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f102510b < this.f102509a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f102510b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f102510b;
        this.f102510b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f102510b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f102510b - 1;
        this.f102510b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f102510b - 1;
    }
}
