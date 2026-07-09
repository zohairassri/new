package mi0;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.j;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class a extends AbstractQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicReferenceArray f116346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f116347b;

    public a(int i11) {
        int iA = j.a(i11);
        this.f116347b = iA - 1;
        this.f116346a = new AtomicReferenceArray(iA);
    }

    protected final int a(long j11) {
        return this.f116347b & ((int) j11);
    }

    protected final int b(long j11, int i11) {
        return ((int) j11) & i11;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == 0 && isEmpty()) {
                return;
            }
        }
    }

    protected final Object d(int i11) {
        return e(this.f116346a, i11);
    }

    protected final Object e(AtomicReferenceArray atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    protected final void i(AtomicReferenceArray atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }
}
