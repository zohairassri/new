package oc0;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
abstract class a extends ReferenceQueue implements Runnable, Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ConcurrentMap f120297a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f120298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map.Entry f120299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f120300c;

        private void a() {
            if (!this.f120298a.hasNext()) {
                this.f120299b = null;
                this.f120300c = null;
            } else {
                Map.Entry entry = (Map.Entry) this.f120298a.next();
                this.f120299b = entry;
                android.support.v4.media.a.a(entry.getKey());
                throw null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Object obj = this.f120300c;
            if (obj == null) {
                throw new NoSuchElementException();
            }
            try {
                return new c(obj, this.f120299b);
            } finally {
                a();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f120300c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(Iterator it) {
            this.f120298a = it;
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f120302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map.Entry f120303b;

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f120302a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f120303b.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            obj.getClass();
            return this.f120303b.setValue(obj);
        }

        private c(Object obj, Map.Entry entry) {
            this.f120302a = obj;
            this.f120303b = entry;
        }
    }

    protected a(ConcurrentMap concurrentMap) {
        this.f120297a = concurrentMap;
    }

    public void a() {
        while (true) {
            Reference referencePoll = poll();
            if (referencePoll == null) {
                return;
            } else {
                this.f120297a.remove(referencePoll);
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(this.f120297a.entrySet().iterator());
    }

    public String toString() {
        return this.f120297a.toString();
    }
}
