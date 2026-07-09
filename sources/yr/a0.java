package yr;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f140882i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f140883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f140884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f140885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f140886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f140887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e f140888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f140889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f140890h;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    class b extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && a0.this.d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarD;
            if (!(obj instanceof Map.Entry) || (eVarD = a0.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            a0.this.h(eVarD, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.f140886d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class c extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f140904f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return a0.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a0.this.f140886d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f140895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f140896b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f140897c;

        d() {
            this.f140895a = a0.this.f140888f.f140902d;
            this.f140897c = a0.this.f140887e;
        }

        final e a() {
            e eVar = this.f140895a;
            a0 a0Var = a0.this;
            if (eVar == a0Var.f140888f) {
                throw new NoSuchElementException();
            }
            if (a0Var.f140887e != this.f140897c) {
                throw new ConcurrentModificationException();
            }
            this.f140895a = eVar.f140902d;
            this.f140896b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f140895a != a0.this.f140888f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f140896b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            a0.this.h(eVar, true);
            this.f140896b = null;
            this.f140897c = a0.this.f140887e;
        }
    }

    public a0() {
        this(f140882i, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void g(e eVar, boolean z11) {
        while (eVar != null) {
            e eVar2 = eVar.f140900b;
            e eVar3 = eVar.f140901c;
            int i11 = eVar2 != null ? eVar2.f140907i : 0;
            int i12 = eVar3 != null ? eVar3.f140907i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e eVar4 = eVar3.f140900b;
                e eVar5 = eVar3.f140901c;
                int i14 = (eVar4 != null ? eVar4.f140907i : 0) - (eVar5 != null ? eVar5.f140907i : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    k(eVar);
                } else {
                    l(eVar3);
                    k(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                e eVar6 = eVar2.f140900b;
                e eVar7 = eVar2.f140901c;
                int i15 = (eVar6 != null ? eVar6.f140907i : 0) - (eVar7 != null ? eVar7.f140907i : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    l(eVar);
                } else {
                    k(eVar2);
                    l(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f140907i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                eVar.f140907i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            eVar = eVar.f140899a;
        }
    }

    private void j(e eVar, e eVar2) {
        e eVar3 = eVar.f140899a;
        eVar.f140899a = null;
        if (eVar2 != null) {
            eVar2.f140899a = eVar3;
        }
        if (eVar3 == null) {
            this.f140885c = eVar2;
        } else if (eVar3.f140900b == eVar) {
            eVar3.f140900b = eVar2;
        } else {
            eVar3.f140901c = eVar2;
        }
    }

    private void k(e eVar) {
        e eVar2 = eVar.f140900b;
        e eVar3 = eVar.f140901c;
        e eVar4 = eVar3.f140900b;
        e eVar5 = eVar3.f140901c;
        eVar.f140901c = eVar4;
        if (eVar4 != null) {
            eVar4.f140899a = eVar;
        }
        j(eVar, eVar3);
        eVar3.f140900b = eVar;
        eVar.f140899a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f140907i : 0, eVar4 != null ? eVar4.f140907i : 0) + 1;
        eVar.f140907i = iMax;
        eVar3.f140907i = Math.max(iMax, eVar5 != null ? eVar5.f140907i : 0) + 1;
    }

    private void l(e eVar) {
        e eVar2 = eVar.f140900b;
        e eVar3 = eVar.f140901c;
        e eVar4 = eVar2.f140900b;
        e eVar5 = eVar2.f140901c;
        eVar.f140900b = eVar5;
        if (eVar5 != null) {
            eVar5.f140899a = eVar;
        }
        j(eVar, eVar2);
        eVar2.f140901c = eVar;
        eVar.f140899a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f140907i : 0, eVar5 != null ? eVar5.f140907i : 0) + 1;
        eVar.f140907i = iMax;
        eVar2.f140907i = Math.max(iMax, eVar4 != null ? eVar4.f140907i : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e c(Object obj, boolean z11) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f140883a;
        e eVar2 = this.f140885c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f140882i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f140904f) : comparator.compare(obj, eVar2.f140904f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f140900b : eVar2.f140901c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e eVar4 = eVar2;
        if (!z11) {
            return null;
        }
        e eVar5 = this.f140888f;
        if (eVar4 != null) {
            eVar = new e(this.f140884b, eVar4, obj, eVar5, eVar5.f140903e);
            if (iCompareTo < 0) {
                eVar4.f140900b = eVar;
            } else {
                eVar4.f140901c = eVar;
            }
            g(eVar4, true);
        } else {
            if (comparator == f140882i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f140884b, eVar4, obj, eVar5, eVar5.f140903e);
            this.f140885c = eVar;
        }
        this.f140886d++;
        this.f140887e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f140885c = null;
        this.f140886d = 0;
        this.f140887e++;
        e eVar = this.f140888f;
        eVar.f140903e = eVar;
        eVar.f140902d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    e d(Map.Entry entry) {
        e eVarF = f(entry.getKey());
        if (eVarF == null || !a(eVarF.f140906h, entry.getValue())) {
            return null;
        }
        return eVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f140889g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f140889g = bVar2;
        return bVar2;
    }

    e f(Object obj) {
        if (obj != null) {
            try {
                return c(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarF = f(obj);
        if (eVarF != null) {
            return eVarF.f140906h;
        }
        return null;
    }

    void h(e eVar, boolean z11) {
        int i11;
        if (z11) {
            e eVar2 = eVar.f140903e;
            eVar2.f140902d = eVar.f140902d;
            eVar.f140902d.f140903e = eVar2;
        }
        e eVar3 = eVar.f140900b;
        e eVar4 = eVar.f140901c;
        e eVar5 = eVar.f140899a;
        int i12 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                j(eVar, eVar3);
                eVar.f140900b = null;
            } else if (eVar4 != null) {
                j(eVar, eVar4);
                eVar.f140901c = null;
            } else {
                j(eVar, null);
            }
            g(eVar5, false);
            this.f140886d--;
            this.f140887e++;
            return;
        }
        e eVarB = eVar3.f140907i > eVar4.f140907i ? eVar3.b() : eVar4.a();
        h(eVarB, false);
        e eVar6 = eVar.f140900b;
        if (eVar6 != null) {
            i11 = eVar6.f140907i;
            eVarB.f140900b = eVar6;
            eVar6.f140899a = eVarB;
            eVar.f140900b = null;
        } else {
            i11 = 0;
        }
        e eVar7 = eVar.f140901c;
        if (eVar7 != null) {
            i12 = eVar7.f140907i;
            eVarB.f140901c = eVar7;
            eVar7.f140899a = eVarB;
            eVar.f140901c = null;
        }
        eVarB.f140907i = Math.max(i11, i12) + 1;
        j(eVar, eVarB);
    }

    e i(Object obj) {
        e eVarF = f(obj);
        if (eVarF != null) {
            h(eVarF, true);
        }
        return eVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f140890h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f140890h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f140884b) {
            throw new NullPointerException("value == null");
        }
        e eVarC = c(obj, true);
        Object obj3 = eVarC.f140906h;
        eVarC.f140906h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarI = i(obj);
        if (eVarI != null) {
            return eVarI.f140906h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f140886d;
    }

    public a0(boolean z11) {
        this(f140882i, z11);
    }

    public a0(Comparator comparator, boolean z11) {
        this.f140886d = 0;
        this.f140887e = 0;
        this.f140883a = comparator == null ? f140882i : comparator;
        this.f140884b = z11;
        this.f140888f = new e(z11);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f140899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f140900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f140901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f140902d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f140903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f140904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f140905g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f140906h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f140907i;

        e(boolean z11) {
            this.f140904f = null;
            this.f140905g = z11;
            this.f140903e = this;
            this.f140902d = this;
        }

        public e a() {
            e eVar = this.f140900b;
            while (true) {
                e eVar2 = eVar;
                e eVar3 = this;
                this = eVar2;
                if (this == null) {
                    return eVar3;
                }
                eVar = this.f140900b;
            }
        }

        public e b() {
            e eVar = this.f140901c;
            while (true) {
                e eVar2 = eVar;
                e eVar3 = this;
                this = eVar2;
                if (this == null) {
                    return eVar3;
                }
                eVar = this.f140901c;
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f140904f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f140906h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f140904f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f140906h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f140904f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f140906h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f140905g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f140906h;
            this.f140906h = obj;
            return obj2;
        }

        public String toString() {
            return this.f140904f + "=" + this.f140906h;
        }

        e(boolean z11, e eVar, Object obj, e eVar2, e eVar3) {
            this.f140899a = eVar;
            this.f140904f = obj;
            this.f140905g = z11;
            this.f140907i = 1;
            this.f140902d = eVar2;
            this.f140903e = eVar3;
            eVar3.f140902d = this;
            eVar2.f140903e = this;
        }
    }
}
