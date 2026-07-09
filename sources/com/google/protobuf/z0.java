package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class z0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f47571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f47572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile g f47574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f47575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c f47576g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a extends z0 {
        a(int i11) {
            super(i11, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.x((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.z0
        public void s() {
            if (!r()) {
                if (m() > 0) {
                    android.support.v4.media.a.a(l(0).getKey());
                    throw null;
                }
                Iterator it = o().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.s();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class c extends g {
        private c() {
            super(z0.this, null);
        }

        @Override // com.google.protobuf.z0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(z0.this, null);
        }

        /* synthetic */ c(z0 z0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f47581a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f47582b = new b();

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f47581a;
            }
        }

        static Iterable b() {
            return f47582b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f47583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f47584b;

        e(z0 z0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f47583a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f47583a, entry.getKey()) && b(this.f47584b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f47584b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f47583a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f47584b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            z0.this.i();
            Object obj2 = this.f47584b;
            this.f47584b = obj;
            return obj2;
        }

        public String toString() {
            return this.f47583a + "=" + this.f47584b;
        }

        e(Comparable comparable, Object obj) {
            this.f47583a = comparable;
            this.f47584b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            z0.this.x((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = z0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(z0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            z0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z0.this.size();
        }

        /* synthetic */ g(z0 z0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ z0(int i11, a aVar) {
        this(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int h(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f47571b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f47571b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.z0$e r2 = (com.google.protobuf.z0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r4 = -r0
            return r4
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f47571b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.z0$e r3 = (com.google.protobuf.z0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.h(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f47573d) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f47571b.isEmpty() || (this.f47571b instanceof ArrayList)) {
            return;
        }
        this.f47571b = new ArrayList(this.f47570a);
    }

    private SortedMap q() {
        i();
        if (this.f47572c.isEmpty() && !(this.f47572c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f47572c = treeMap;
            this.f47575f = treeMap.descendingMap();
        }
        return (SortedMap) this.f47572c;
    }

    static z0 t(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object z(int i11) {
        i();
        Object value = ((e) this.f47571b.remove(i11)).getValue();
        if (!this.f47572c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f47571b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f47571b.isEmpty()) {
            this.f47571b.clear();
        }
        if (this.f47572c.isEmpty()) {
            return;
        }
        this.f47572c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f47572c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f47574e == null) {
            this.f47574e = new g(this, null);
        }
        return this.f47574e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        int size = size();
        if (size != z0Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != z0Var.m()) {
            return entrySet().equals(z0Var.entrySet());
        }
        for (int i11 = 0; i11 < iM; i11++) {
            if (!l(i11).equals(z0Var.l(i11))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f47572c.equals(z0Var.f47572c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? ((e) this.f47571b.get(iH)).getValue() : this.f47572c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i11 = 0; i11 < iM; i11++) {
            iHashCode += ((e) this.f47571b.get(i11)).hashCode();
        }
        return n() > 0 ? iHashCode + this.f47572c.hashCode() : iHashCode;
    }

    Set j() {
        if (this.f47576g == null) {
            this.f47576g = new c(this, null);
        }
        return this.f47576g;
    }

    public Map.Entry l(int i11) {
        return (Map.Entry) this.f47571b.get(i11);
    }

    public int m() {
        return this.f47571b.size();
    }

    public int n() {
        return this.f47572c.size();
    }

    public Iterable o() {
        return this.f47572c.isEmpty() ? d.b() : this.f47572c.entrySet();
    }

    public boolean r() {
        return this.f47573d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return z(iH);
        }
        if (this.f47572c.isEmpty()) {
            return null;
        }
        return this.f47572c.remove(comparable);
    }

    public void s() {
        if (this.f47573d) {
            return;
        }
        this.f47572c = this.f47572c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f47572c);
        this.f47575f = this.f47575f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f47575f);
        this.f47573d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f47571b.size() + this.f47572c.size();
    }

    public Object x(Comparable comparable, Object obj) {
        i();
        int iH = h(comparable);
        if (iH >= 0) {
            return ((e) this.f47571b.get(iH)).setValue(obj);
        }
        k();
        int i11 = -(iH + 1);
        if (i11 >= this.f47570a) {
            return q().put(comparable, obj);
        }
        int size = this.f47571b.size();
        int i12 = this.f47570a;
        if (size == i12) {
            e eVar = (e) this.f47571b.remove(i12 - 1);
            q().put(eVar.getKey(), eVar.getValue());
        }
        this.f47571b.add(i11, new e(comparable, obj));
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f47578b;

        private b() {
            this.f47577a = z0.this.f47571b.size();
        }

        private Iterator a() {
            if (this.f47578b == null) {
                this.f47578b = z0.this.f47575f.entrySet().iterator();
            }
            return this.f47578b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = z0.this.f47571b;
            int i11 = this.f47577a - 1;
            this.f47577a = i11;
            return (Map.Entry) list.get(i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.f47577a;
            return (i11 > 0 && i11 <= z0.this.f47571b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(z0 z0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f47588c;

        private f() {
            this.f47586a = -1;
        }

        private Iterator a() {
            if (this.f47588c == null) {
                this.f47588c = z0.this.f47572c.entrySet().iterator();
            }
            return this.f47588c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f47587b = true;
            int i11 = this.f47586a + 1;
            this.f47586a = i11;
            return i11 < z0.this.f47571b.size() ? (Map.Entry) z0.this.f47571b.get(this.f47586a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f47586a + 1 < z0.this.f47571b.size() || (!z0.this.f47572c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f47587b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f47587b = false;
            z0.this.i();
            if (this.f47586a >= z0.this.f47571b.size()) {
                a().remove();
                return;
            }
            z0 z0Var = z0.this;
            int i11 = this.f47586a;
            this.f47586a = i11 - 1;
            z0Var.z(i11);
        }

        /* synthetic */ f(z0 z0Var, a aVar) {
            this();
        }
    }

    private z0(int i11) {
        this.f47570a = i11;
        this.f47571b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f47572c = map;
        this.f47575f = map;
    }
}
