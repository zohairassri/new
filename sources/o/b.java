package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f119875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f119876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f119877c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f119878d = 0;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        c b(c cVar) {
            return cVar.f119882d;
        }

        @Override // o.b.e
        c c(c cVar) {
            return cVar.f119881c;
        }
    }

    /* JADX INFO: renamed from: o.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class C1564b extends e {
        C1564b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        c b(c cVar) {
            return cVar.f119881c;
        }

        @Override // o.b.e
        c c(c cVar) {
            return cVar.f119882d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f119879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f119880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f119881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f119882d;

        c(Object obj, Object obj2) {
            this.f119879a = obj;
            this.f119880b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f119879a.equals(cVar.f119879a) && this.f119880b.equals(cVar.f119880b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f119879a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f119880b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f119880b.hashCode() ^ this.f119879a.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f119879a + "=" + this.f119880b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f119883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f119884b = true;

        d() {
        }

        @Override // o.b.f
        void a(c cVar) {
            c cVar2 = this.f119883a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f119882d;
                this.f119883a = cVar3;
                this.f119884b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f119884b) {
                this.f119884b = false;
                this.f119883a = b.this.f119875a;
            } else {
                c cVar = this.f119883a;
                this.f119883a = cVar != null ? cVar.f119881c : null;
            }
            return this.f119883a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f119884b) {
                return b.this.f119875a != null;
            }
            c cVar = this.f119883a;
            return (cVar == null || cVar.f119881c == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f119886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f119887b;

        e(c cVar, c cVar2) {
            this.f119886a = cVar2;
            this.f119887b = cVar;
        }

        private c e() {
            c cVar = this.f119887b;
            c cVar2 = this.f119886a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // o.b.f
        public void a(c cVar) {
            if (this.f119886a == cVar && cVar == this.f119887b) {
                this.f119887b = null;
                this.f119886a = null;
            }
            c cVar2 = this.f119886a;
            if (cVar2 == cVar) {
                this.f119886a = b(cVar2);
            }
            if (this.f119887b == cVar) {
                this.f119887b = e();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f119887b;
            this.f119887b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f119887b != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry a() {
        return this.f119875a;
    }

    protected c b(Object obj) {
        c cVar = this.f119875a;
        while (cVar != null && !cVar.f119879a.equals(obj)) {
            cVar = cVar.f119881c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f119877c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C1564b c1564b = new C1564b(this.f119876b, this.f119875a);
        this.f119877c.put(c1564b, Boolean.FALSE);
        return c1564b;
    }

    public Map.Entry e() {
        return this.f119876b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    c i(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f119878d++;
        c cVar2 = this.f119876b;
        if (cVar2 == null) {
            this.f119875a = cVar;
            this.f119876b = cVar;
            return cVar;
        }
        cVar2.f119881c = cVar;
        cVar.f119882d = cVar2;
        this.f119876b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f119875a, this.f119876b);
        this.f119877c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f119880b;
        }
        i(obj, obj2);
        return null;
    }

    public Object l(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f119878d--;
        if (!this.f119877c.isEmpty()) {
            Iterator it = this.f119877c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f119882d;
        if (cVar != null) {
            cVar.f119881c = cVarB.f119881c;
        } else {
            this.f119875a = cVarB.f119881c;
        }
        c cVar2 = cVarB.f119881c;
        if (cVar2 != null) {
            cVar2.f119882d = cVar;
        } else {
            this.f119876b = cVar;
        }
        cVarB.f119881c = null;
        cVarB.f119882d = null;
        return cVarB.f119880b;
    }

    public int size() {
        return this.f119878d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
