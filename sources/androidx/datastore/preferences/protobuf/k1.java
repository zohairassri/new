package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class k1 extends AbstractList implements b0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f7621a;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ListIterator f7622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7623b;

        a(int i11) {
            this.f7623b = i11;
            this.f7622a = k1.this.f7621a.listIterator(i11);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f7622a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f7622a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f7622a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7622a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7622a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7622a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Iterator f7625a;

        b() {
            this.f7625a = k1.this.f7621a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f7625a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7625a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public k1(b0 b0Var) {
        this.f7621a = b0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i11) {
        return (String) this.f7621a.get(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public List h() {
        return this.f7621a.h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i11) {
        return new a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public Object o(int i11) {
        return this.f7621a.o(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public void p1(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7621a.size();
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public b0 n() {
        return this;
    }
}
