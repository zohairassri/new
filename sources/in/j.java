package in;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f103927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103928b;

    protected j(int i11, int i12) {
        h.b(i12, i11, "index");
        this.f103927a = i11;
        this.f103928b = i12;
    }

    protected abstract Object a(int i11);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f103928b < this.f103927a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f103928b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f103928b;
        this.f103928b = i11 + 1;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f103928b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i11 = this.f103928b - 1;
        this.f103928b = i11;
        return a(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f103928b - 1;
    }
}
