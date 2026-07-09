package p1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f120913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f120914b;

    public a(int i11, int i12) {
        this.f120913a = i11;
        this.f120914b = i12;
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f120913a;
    }

    public final int e() {
        return this.f120914b;
    }

    public final void f(int i11) {
        this.f120913a = i11;
    }

    public final void g(int i11) {
        this.f120914b = i11;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f120913a < this.f120914b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f120913a > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f120913a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f120913a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
