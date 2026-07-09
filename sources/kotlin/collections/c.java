package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f111655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f111656b;

    private final boolean e() {
        this.f111655a = 3;
        a();
        return this.f111655a == 1;
    }

    protected abstract void a();

    protected final void c() {
        this.f111655a = 2;
    }

    protected final void d(Object obj) {
        this.f111656b = obj;
        this.f111655a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i11 = this.f111655a;
        if (i11 == 0) {
            return e();
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i11 = this.f111655a;
        if (i11 == 1) {
            this.f111655a = 0;
            return this.f111656b;
        }
        if (i11 == 2 || !e()) {
            throw new NoSuchElementException();
        }
        this.f111655a = 0;
        return this.f111656b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
