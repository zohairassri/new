package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class r extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator f48828i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f48829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g[] f48830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g f48831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f48832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f48833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f48834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f48835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f48836h;

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
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f48837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f48839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f48840d;

        b() {
        }

        void a(g gVar) {
            gVar.f48852c = null;
            gVar.f48850a = null;
            gVar.f48851b = null;
            gVar.f48858i = 1;
            int i11 = this.f48838b;
            if (i11 > 0) {
                int i12 = this.f48840d;
                if ((i12 & 1) == 0) {
                    this.f48840d = i12 + 1;
                    this.f48838b = i11 - 1;
                    this.f48839c++;
                }
            }
            gVar.f48850a = this.f48837a;
            this.f48837a = gVar;
            int i13 = this.f48840d;
            int i14 = i13 + 1;
            this.f48840d = i14;
            int i15 = this.f48838b;
            if (i15 > 0 && (i14 & 1) == 0) {
                this.f48840d = i13 + 2;
                this.f48838b = i15 - 1;
                this.f48839c++;
            }
            int i16 = 4;
            while (true) {
                int i17 = i16 - 1;
                if ((this.f48840d & i17) != i17) {
                    return;
                }
                int i18 = this.f48839c;
                if (i18 == 0) {
                    g gVar2 = this.f48837a;
                    g gVar3 = gVar2.f48850a;
                    g gVar4 = gVar3.f48850a;
                    gVar3.f48850a = gVar4.f48850a;
                    this.f48837a = gVar3;
                    gVar3.f48851b = gVar4;
                    gVar3.f48852c = gVar2;
                    gVar3.f48858i = gVar2.f48858i + 1;
                    gVar4.f48850a = gVar3;
                    gVar2.f48850a = gVar3;
                } else if (i18 == 1) {
                    g gVar5 = this.f48837a;
                    g gVar6 = gVar5.f48850a;
                    this.f48837a = gVar6;
                    gVar6.f48852c = gVar5;
                    gVar6.f48858i = gVar5.f48858i + 1;
                    gVar5.f48850a = gVar6;
                    this.f48839c = 0;
                } else if (i18 == 2) {
                    this.f48839c = 0;
                }
                i16 *= 2;
            }
        }

        void b(int i11) {
            this.f48838b = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
            this.f48840d = 0;
            this.f48839c = 0;
            this.f48837a = null;
        }

        g c() {
            g gVar = this.f48837a;
            if (gVar.f48850a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f48841a;

        c() {
        }

        public g a() {
            g gVar = this.f48841a;
            if (gVar == null) {
                return null;
            }
            g gVar2 = gVar.f48850a;
            gVar.f48850a = null;
            g gVar3 = gVar.f48852c;
            while (true) {
                g gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f48841a = gVar4;
                    return gVar;
                }
                gVar2.f48850a = gVar4;
                gVar3 = gVar2.f48851b;
            }
        }

        void b(g gVar) {
            g gVar2 = null;
            while (gVar != null) {
                gVar.f48850a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f48851b;
            }
            this.f48841a = gVar2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class d extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.g((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g gVarG;
            if (!(obj instanceof Map.Entry) || (gVarG = r.this.g((Map.Entry) obj)) == null) {
                return false;
            }
            r.this.j(gVarG, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r.this.f48832d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    final class e extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f48855f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            r.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return r.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return r.this.k(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return r.this.f48832d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    abstract class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f48846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f48847b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48848c;

        f() {
            this.f48846a = r.this.f48831c.f48853d;
            this.f48848c = r.this.f48833e;
        }

        final g a() {
            g gVar = this.f48846a;
            r rVar = r.this;
            if (gVar == rVar.f48831c) {
                throw new NoSuchElementException();
            }
            if (rVar.f48833e != this.f48848c) {
                throw new ConcurrentModificationException();
            }
            this.f48846a = gVar.f48853d;
            this.f48847b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f48846a != r.this.f48831c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g gVar = this.f48847b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            r.this.j(gVar, true);
            this.f48847b = null;
            this.f48848c = r.this.f48833e;
        }
    }

    r() {
        this(null);
    }

    private void a() {
        g[] gVarArrC = c(this.f48830b);
        this.f48830b = gVarArrC;
        this.f48834f = (gVarArrC.length / 2) + (gVarArrC.length / 4);
    }

    static g[] c(g[] gVarArr) {
        int length = gVarArr.length;
        g[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i11 = 0; i11 < length; i11++) {
            g gVar = gVarArr[i11];
            if (gVar != null) {
                cVar.b(gVar);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    g gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f48856g & length) == 0) {
                        i12++;
                    } else {
                        i13++;
                    }
                }
                bVar.b(i12);
                bVar2.b(i13);
                cVar.b(gVar);
                while (true) {
                    g gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f48856g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i11] = i12 > 0 ? bVar.c() : null;
                gVarArr2[i11 + length] = i13 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void i(g gVar, boolean z11) {
        while (gVar != null) {
            g gVar2 = gVar.f48851b;
            g gVar3 = gVar.f48852c;
            int i11 = gVar2 != null ? gVar2.f48858i : 0;
            int i12 = gVar3 != null ? gVar3.f48858i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                g gVar4 = gVar3.f48851b;
                g gVar5 = gVar3.f48852c;
                int i14 = (gVar4 != null ? gVar4.f48858i : 0) - (gVar5 != null ? gVar5.f48858i : 0);
                if (i14 != -1 && (i14 != 0 || z11)) {
                    n(gVar3);
                }
                m(gVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                g gVar6 = gVar2.f48851b;
                g gVar7 = gVar2.f48852c;
                int i15 = (gVar6 != null ? gVar6.f48858i : 0) - (gVar7 != null ? gVar7.f48858i : 0);
                if (i15 != 1 && (i15 != 0 || z11)) {
                    m(gVar2);
                }
                n(gVar);
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                gVar.f48858i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                gVar.f48858i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            gVar = gVar.f48850a;
        }
    }

    private void l(g gVar, g gVar2) {
        g gVar3 = gVar.f48850a;
        gVar.f48850a = null;
        if (gVar2 != null) {
            gVar2.f48850a = gVar3;
        }
        if (gVar3 == null) {
            int i11 = gVar.f48856g;
            this.f48830b[i11 & (r2.length - 1)] = gVar2;
        } else if (gVar3.f48851b == gVar) {
            gVar3.f48851b = gVar2;
        } else {
            gVar3.f48852c = gVar2;
        }
    }

    private void m(g gVar) {
        g gVar2 = gVar.f48851b;
        g gVar3 = gVar.f48852c;
        g gVar4 = gVar3.f48851b;
        g gVar5 = gVar3.f48852c;
        gVar.f48852c = gVar4;
        if (gVar4 != null) {
            gVar4.f48850a = gVar;
        }
        l(gVar, gVar3);
        gVar3.f48851b = gVar;
        gVar.f48850a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f48858i : 0, gVar4 != null ? gVar4.f48858i : 0) + 1;
        gVar.f48858i = iMax;
        gVar3.f48858i = Math.max(iMax, gVar5 != null ? gVar5.f48858i : 0) + 1;
    }

    private void n(g gVar) {
        g gVar2 = gVar.f48851b;
        g gVar3 = gVar.f48852c;
        g gVar4 = gVar2.f48851b;
        g gVar5 = gVar2.f48852c;
        gVar.f48851b = gVar5;
        if (gVar5 != null) {
            gVar5.f48850a = gVar;
        }
        l(gVar, gVar2);
        gVar2.f48852c = gVar;
        gVar.f48850a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f48858i : 0, gVar5 != null ? gVar5.f48858i : 0) + 1;
        gVar.f48858i = iMax;
        gVar2.f48858i = Math.max(iMax, gVar4 != null ? gVar4.f48858i : 0) + 1;
    }

    private static int o(int i11) {
        int i12 = i11 ^ ((i11 >>> 20) ^ (i11 >>> 12));
        return (i12 >>> 4) ^ ((i12 >>> 7) ^ i12);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f48830b, (Object) null);
        this.f48832d = 0;
        this.f48833e++;
        g gVar = this.f48831c;
        g gVar2 = gVar.f48853d;
        while (gVar2 != gVar) {
            g gVar3 = gVar2.f48853d;
            gVar2.f48854e = null;
            gVar2.f48853d = null;
            gVar2 = gVar3;
        }
        gVar.f48854e = gVar;
        gVar.f48853d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        d dVar = this.f48835g;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        this.f48835g = dVar2;
        return dVar2;
    }

    g f(Object obj, boolean z11) {
        int iCompareTo;
        g gVar;
        Comparator comparator = this.f48829a;
        g[] gVarArr = this.f48830b;
        int iO = o(obj.hashCode());
        int length = (gVarArr.length - 1) & iO;
        g gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f48828i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f48855f) : comparator.compare(obj, gVar2.f48855f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g gVar3 = iCompareTo < 0 ? gVar2.f48851b : gVar2.f48852c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i11 = iCompareTo;
        if (!z11) {
            return null;
        }
        g gVar4 = this.f48831c;
        if (gVar2 != null) {
            g gVar5 = gVar2;
            gVar = new g(gVar5, obj, iO, gVar4, gVar4.f48854e);
            if (i11 < 0) {
                gVar5.f48851b = gVar;
            } else {
                gVar5.f48852c = gVar;
            }
            i(gVar5, true);
        } else {
            if (comparator == f48828i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            gVar = new g(gVar2, obj, iO, gVar4, gVar4.f48854e);
            gVarArr[length] = gVar;
        }
        int i12 = this.f48832d;
        this.f48832d = i12 + 1;
        if (i12 > this.f48834f) {
            a();
        }
        this.f48833e++;
        return gVar;
    }

    g g(Map.Entry entry) {
        g gVarH = h(entry.getKey());
        if (gVarH == null || !d(gVarH.f48857h, entry.getValue())) {
            return null;
        }
        return gVarH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        g gVarH = h(obj);
        if (gVarH != null) {
            return gVarH.f48857h;
        }
        return null;
    }

    g h(Object obj) {
        if (obj != null) {
            try {
                return f(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    void j(g gVar, boolean z11) {
        int i11;
        if (z11) {
            g gVar2 = gVar.f48854e;
            gVar2.f48853d = gVar.f48853d;
            gVar.f48853d.f48854e = gVar2;
            gVar.f48854e = null;
            gVar.f48853d = null;
        }
        g gVar3 = gVar.f48851b;
        g gVar4 = gVar.f48852c;
        g gVar5 = gVar.f48850a;
        int i12 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                l(gVar, gVar3);
                gVar.f48851b = null;
            } else if (gVar4 != null) {
                l(gVar, gVar4);
                gVar.f48852c = null;
            } else {
                l(gVar, null);
            }
            i(gVar5, false);
            this.f48832d--;
            this.f48833e++;
            return;
        }
        g gVarB = gVar3.f48858i > gVar4.f48858i ? gVar3.b() : gVar4.a();
        j(gVarB, false);
        g gVar6 = gVar.f48851b;
        if (gVar6 != null) {
            i11 = gVar6.f48858i;
            gVarB.f48851b = gVar6;
            gVar6.f48850a = gVarB;
            gVar.f48851b = null;
        } else {
            i11 = 0;
        }
        g gVar7 = gVar.f48852c;
        if (gVar7 != null) {
            i12 = gVar7.f48858i;
            gVarB.f48852c = gVar7;
            gVar7.f48850a = gVarB;
            gVar.f48852c = null;
        }
        gVarB.f48858i = Math.max(i11, i12) + 1;
        l(gVar, gVarB);
    }

    g k(Object obj) {
        g gVarH = h(obj);
        if (gVarH != null) {
            j(gVarH, true);
        }
        return gVarH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        e eVar = this.f48836h;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f48836h = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        g gVarF = f(obj, true);
        Object obj3 = gVarF.f48857h;
        gVarF.f48857h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g gVarK = k(obj);
        if (gVarK != null) {
            return gVarK.f48857h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f48832d;
    }

    r(Comparator comparator) {
        this.f48832d = 0;
        this.f48833e = 0;
        this.f48829a = comparator == null ? f48828i : comparator;
        this.f48831c = new g();
        g[] gVarArr = new g[16];
        this.f48830b = gVarArr;
        this.f48834f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    static final class g implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f48850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f48851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        g f48852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        g f48853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g f48854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f48855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f48856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f48857h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f48858i;

        g() {
            this.f48855f = null;
            this.f48856g = -1;
            this.f48854e = this;
            this.f48853d = this;
        }

        public g a() {
            g gVar = this.f48851b;
            while (true) {
                g gVar2 = gVar;
                g gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f48851b;
            }
        }

        public g b() {
            g gVar = this.f48852c;
            while (true) {
                g gVar2 = gVar;
                g gVar3 = this;
                this = gVar2;
                if (this == null) {
                    return gVar3;
                }
                gVar = this.f48852c;
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f48855f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f48857h;
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
            return this.f48855f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f48857h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f48855f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f48857h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f48857h;
            this.f48857h = obj;
            return obj2;
        }

        public String toString() {
            return this.f48855f + "=" + this.f48857h;
        }

        g(g gVar, Object obj, int i11, g gVar2, g gVar3) {
            this.f48850a = gVar;
            this.f48855f = obj;
            this.f48856g = i11;
            this.f48858i = 1;
            this.f48853d = gVar2;
            this.f48854e = gVar3;
            gVar3.f48853d = this;
            gVar2.f48854e = this;
        }
    }
}
