package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
abstract class e1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f7544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f7545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile g f7547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f7548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile c f7549g;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a extends e1 {
        a(int i11) {
            super(i11, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            android.support.v4.media.a.a(obj);
            return super.x(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.e1
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
            super(e1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.e1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(e1.this, null);
        }

        /* synthetic */ c(e1 e1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f7554a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f7555b = new b();

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        static class a implements Iterator {
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
        static class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f7554a;
            }
        }

        static Iterable b() {
            return f7555b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f7556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f7557b;

        e(e1 e1Var, Map.Entry entry) {
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
            return this.f7556a;
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
            return b(this.f7556a, entry.getKey()) && b(this.f7557b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f7557b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f7556a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f7557b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            e1.this.i();
            Object obj2 = this.f7557b;
            this.f7557b = obj;
            return obj2;
        }

        public String toString() {
            return this.f7556a + "=" + this.f7557b;
        }

        e(Comparable comparable, Object obj) {
            this.f7556a = comparable;
            this.f7557b = obj;
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
            e1.this.x((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = e1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(e1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            e1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e1.this.size();
        }

        /* synthetic */ g(e1 e1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ e1(int i11, a aVar) {
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
            java.util.List r0 = r4.f7544b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f7544b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.e1$e r2 = (androidx.datastore.preferences.protobuf.e1.e) r2
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
            java.util.List r3 = r4.f7544b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.e1$e r3 = (androidx.datastore.preferences.protobuf.e1.e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e1.h(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f7546d) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f7544b.isEmpty() || (this.f7544b instanceof ArrayList)) {
            return;
        }
        this.f7544b = new ArrayList(this.f7543a);
    }

    private SortedMap q() {
        i();
        if (this.f7545c.isEmpty() && !(this.f7545c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7545c = treeMap;
            this.f7548f = treeMap.descendingMap();
        }
        return (SortedMap) this.f7545c;
    }

    static e1 t(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object z(int i11) {
        i();
        Object value = ((e) this.f7544b.remove(i11)).getValue();
        if (!this.f7545c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f7544b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f7544b.isEmpty()) {
            this.f7544b.clear();
        }
        if (this.f7545c.isEmpty()) {
            return;
        }
        this.f7545c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f7545c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f7547e == null) {
            this.f7547e = new g(this, null);
        }
        return this.f7547e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return super.equals(obj);
        }
        e1 e1Var = (e1) obj;
        int size = size();
        if (size != e1Var.size()) {
            return false;
        }
        int iM = m();
        if (iM != e1Var.m()) {
            return entrySet().equals(e1Var.entrySet());
        }
        for (int i11 = 0; i11 < iM; i11++) {
            if (!l(i11).equals(e1Var.l(i11))) {
                return false;
            }
        }
        if (iM != size) {
            return this.f7545c.equals(e1Var.f7545c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? ((e) this.f7544b.get(iH)).getValue() : this.f7545c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM = m();
        int iHashCode = 0;
        for (int i11 = 0; i11 < iM; i11++) {
            iHashCode += ((e) this.f7544b.get(i11)).hashCode();
        }
        return n() > 0 ? iHashCode + this.f7545c.hashCode() : iHashCode;
    }

    Set j() {
        if (this.f7549g == null) {
            this.f7549g = new c(this, null);
        }
        return this.f7549g;
    }

    public Map.Entry l(int i11) {
        return (Map.Entry) this.f7544b.get(i11);
    }

    public int m() {
        return this.f7544b.size();
    }

    public int n() {
        return this.f7545c.size();
    }

    public Iterable o() {
        return this.f7545c.isEmpty() ? d.b() : this.f7545c.entrySet();
    }

    public boolean r() {
        return this.f7546d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return z(iH);
        }
        if (this.f7545c.isEmpty()) {
            return null;
        }
        return this.f7545c.remove(comparable);
    }

    public void s() {
        if (this.f7546d) {
            return;
        }
        this.f7545c = this.f7545c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f7545c);
        this.f7548f = this.f7548f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f7548f);
        this.f7546d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7544b.size() + this.f7545c.size();
    }

    public Object x(Comparable comparable, Object obj) {
        i();
        int iH = h(comparable);
        if (iH >= 0) {
            return ((e) this.f7544b.get(iH)).setValue(obj);
        }
        k();
        int i11 = -(iH + 1);
        if (i11 >= this.f7543a) {
            return q().put(comparable, obj);
        }
        int size = this.f7544b.size();
        int i12 = this.f7543a;
        if (size == i12) {
            e eVar = (e) this.f7544b.remove(i12 - 1);
            q().put(eVar.getKey(), eVar.getValue());
        }
        this.f7544b.add(i11, new e(comparable, obj));
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f7551b;

        private b() {
            this.f7550a = e1.this.f7544b.size();
        }

        private Iterator a() {
            if (this.f7551b == null) {
                this.f7551b = e1.this.f7548f.entrySet().iterator();
            }
            return this.f7551b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = e1.this.f7544b;
            int i11 = this.f7550a - 1;
            this.f7550a = i11;
            return (Map.Entry) list.get(i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.f7550a;
            return (i11 > 0 && i11 <= e1.this.f7544b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(e1 e1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f7561c;

        private f() {
            this.f7559a = -1;
        }

        private Iterator a() {
            if (this.f7561c == null) {
                this.f7561c = e1.this.f7545c.entrySet().iterator();
            }
            return this.f7561c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f7560b = true;
            int i11 = this.f7559a + 1;
            this.f7559a = i11;
            return i11 < e1.this.f7544b.size() ? (Map.Entry) e1.this.f7544b.get(this.f7559a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7559a + 1 < e1.this.f7544b.size() || (!e1.this.f7545c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f7560b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f7560b = false;
            e1.this.i();
            if (this.f7559a >= e1.this.f7544b.size()) {
                a().remove();
                return;
            }
            e1 e1Var = e1.this;
            int i11 = this.f7559a;
            this.f7559a = i11 - 1;
            e1Var.z(i11);
        }

        /* synthetic */ f(e1 e1Var, a aVar) {
            this();
        }
    }

    private e1(int i11) {
        this.f7543a = i11;
        this.f7544b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f7545c = map;
        this.f7548f = map;
    }
}
