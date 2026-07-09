package zo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f142453a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f142454b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f142453a = a.FAILED;
        this.f142454b = a();
        if (this.f142453a == a.DONE) {
            return false;
        }
        this.f142453a = a.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object b() {
        this.f142453a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        o.p(this.f142453a != a.FAILED);
        int iOrdinal = this.f142453a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f142453a = a.NOT_READY;
        Object objA = j.a(this.f142454b);
        this.f142454b = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
