package com.google.common.collect;

import com.google.common.collect.l0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class f implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Collection f45907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f45908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection f45909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Map f45910d;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends l0.b {
        a() {
        }

        @Override // com.google.common.collect.l0.b
        j0 a() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends a implements Set {
        b() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return b1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return b1.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class c extends AbstractCollection {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    f() {
    }

    public boolean a(Object obj) {
        Iterator it = c().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map b();

    @Override // com.google.common.collect.j0
    public Map c() {
        Map map = this.f45910d;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f45910d = mapB;
        return mapB;
    }

    @Override // com.google.common.collect.j0
    public Collection d() {
        Collection collection = this.f45907a;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.f45907a = collectionF;
        return collectionF;
    }

    @Override // com.google.common.collect.j0
    public boolean e(Object obj, Object obj2) {
        Collection collection = (Collection) c().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean equals(Object obj) {
        return l0.a(this, obj);
    }

    abstract Collection f();

    abstract Set g();

    abstract Collection h();

    public int hashCode() {
        return c().hashCode();
    }

    abstract Iterator i();

    public Set j() {
        Set set = this.f45908b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f45908b = setG;
        return setG;
    }

    abstract Iterator k();

    @Override // com.google.common.collect.j0
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) c().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return c().toString();
    }

    @Override // com.google.common.collect.j0
    public Collection values() {
        Collection collection = this.f45909c;
        if (collection != null) {
            return collection;
        }
        Collection collectionH = h();
        this.f45909c = collectionH;
        return collectionH;
    }
}
