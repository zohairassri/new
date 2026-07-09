package jc0;

import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public final class g extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f105526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f105527b;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class a extends c {
        a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            int iD;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || (iD = g.this.d(entry.getKey())) == -1) {
                    return false;
                }
                return g.this.g(iD + 1).equals(entry.getValue());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jc0.g.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i11) {
            return new AbstractMap.SimpleImmutableEntry(g.this.f(i11), g.this.g(i11 + 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class b extends c {
        b() {
            super();
        }

        @Override // jc0.g.c
        Object b(int i11) {
            return g.this.f(i11);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    abstract class c implements Set {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        final class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f105531a = 0;

            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f105531a < g.this.f105526a.size();
            }

            @Override // java.util.Iterator
            public Object next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object objB = c.this.b(this.f105531a);
                this.f105531a += 2;
                return objB;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        c() {
        }

        Object[] a(Object[] objArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < g.this.f105526a.size()) {
                objArr[i12] = b(i11);
                i11 += 2;
                i12++;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        abstract Object b(int i11);

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            if (collection == null) {
                return false;
            }
            if (collection.isEmpty()) {
                return true;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.f105527b;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return a(new Object[g.this.f105527b]);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            if (objArr.length < g.this.f105527b) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size());
            }
            return a(objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class d extends c {
        d() {
            super();
        }

        @Override // jc0.g.c
        Object b(int i11) {
            return g.this.g(i11 + 1);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.containsValue(obj);
        }
    }

    private g(List list) {
        this.f105526a = list;
        this.f105527b = list.size() / 2;
    }

    public static Map h(List list) {
        return list.isEmpty() ? Collections.EMPTY_MAP : new g(list);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return (obj == null || d(obj) == -1) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i11 = 0; i11 < this.f105526a.size(); i11 += 2) {
            if (g(i11 + 1).equals(obj)) {
                return true;
            }
        }
        return false;
    }

    int d(Object obj) {
        for (int i11 = 0; i11 < this.f105526a.size(); i11 += 2) {
            if (obj.equals(f(i11))) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return new a();
    }

    Object f(int i11) {
        return this.f105526a.get(i11);
    }

    Object g(int i11) {
        return this.f105526a.get(i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int iD;
        if (obj == null || (iD = d(obj)) == -1) {
            return null;
        }
        return g(iD + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f105527b;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ReadOnlyArrayMap{");
        for (int i11 = 0; i11 < this.f105526a.size(); i11 += 2) {
            sb2.append(f(i11));
            sb2.append('=');
            sb2.append(g(i11 + 1));
            sb2.append(',');
        }
        sb2.setLength(sb2.length() - 1);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        return new d();
    }
}
