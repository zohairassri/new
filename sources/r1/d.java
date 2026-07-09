package r1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class d implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f123440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f123441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f123442c;

    public d(Object obj, Map map) {
        this.f123440a = obj;
        this.f123441b = map;
    }

    private final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final int c() {
        return this.f123442c;
    }

    public final void d(int i11) {
        this.f123442c = i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f123442c < this.f123441b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object obj = this.f123440a;
        this.f123442c++;
        Object obj2 = this.f123441b.get(obj);
        if (obj2 != null) {
            this.f123440a = ((a) obj2).c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
