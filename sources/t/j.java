package t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f127556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f127557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f127558c;

    public j(int i11) {
        this.f127556a = i11;
    }

    protected abstract Object a(int i11);

    protected abstract void c(int i11);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f127557b < this.f127556a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f127557b);
        this.f127557b++;
        this.f127558c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f127558c) {
            u.d.b("Call next() before removing an element.");
        }
        int i11 = this.f127557b - 1;
        this.f127557b = i11;
        c(i11);
        this.f127556a--;
        this.f127558c = false;
    }
}
