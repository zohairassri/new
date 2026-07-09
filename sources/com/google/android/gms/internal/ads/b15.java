package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
abstract class b15 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f23648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f23650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile a15 f23652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f23653f;

    /* synthetic */ b15(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f23650c = map;
        this.f23653f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object i(int i11) {
        j();
        Object value = ((x05) this.f23648a[i11]).getValue();
        Object[] objArr = this.f23648a;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f23649b - i11) - 1);
        this.f23649b--;
        if (!this.f23650c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            Object[] objArr2 = this.f23648a;
            int i12 = this.f23649b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new x05(this, (Comparable) entry.getKey(), entry.getValue());
            this.f23649b++;
            it.remove();
        }
        return value;
    }

    private final int o(Comparable comparable) {
        int i11 = this.f23649b;
        int i12 = i11 - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((x05) this.f23648a[i12]).a());
            if (iCompareTo > 0) {
                return -(i11 + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((x05) this.f23648a[i14]).a());
            if (iCompareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void j() {
        if (this.f23651d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap r() {
        j();
        if (this.f23650c.isEmpty() && !(this.f23650c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23650c = treeMap;
            this.f23653f = treeMap.descendingMap();
        }
        return (SortedMap) this.f23650c;
    }

    public void a() {
        if (this.f23651d) {
            return;
        }
        this.f23650c = this.f23650c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f23650c);
        this.f23653f = this.f23653f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f23653f);
        this.f23651d = true;
    }

    public final boolean c() {
        return this.f23651d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        if (this.f23649b != 0) {
            this.f23648a = null;
            this.f23649b = 0;
        }
        if (this.f23650c.isEmpty()) {
            return;
        }
        this.f23650c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return o(comparable) >= 0 || this.f23650c.containsKey(comparable);
    }

    public final int d() {
        return this.f23649b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f23652e == null) {
            this.f23652e = new a15(this, null);
        }
        return this.f23652e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b15)) {
            return super.equals(obj);
        }
        b15 b15Var = (b15) obj;
        int size = size();
        if (size != b15Var.size()) {
            return false;
        }
        int i11 = this.f23649b;
        if (i11 != b15Var.f23649b) {
            return entrySet().equals(b15Var.entrySet());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!f(i12).equals(b15Var.f(i12))) {
                return false;
            }
        }
        if (i11 != size) {
            return this.f23650c.equals(b15Var.f23650c);
        }
        return true;
    }

    public final Map.Entry f(int i11) {
        if (i11 < this.f23649b) {
            return (x05) this.f23648a[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final Iterable g() {
        return this.f23650c.isEmpty() ? Collections.EMPTY_SET : this.f23650c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iO = o(comparable);
        return iO >= 0 ? ((x05) this.f23648a[iO]).getValue() : this.f23650c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        j();
        int iO = o(comparable);
        if (iO >= 0) {
            return ((x05) this.f23648a[iO]).setValue(obj);
        }
        j();
        if (this.f23648a == null) {
            this.f23648a = new Object[16];
        }
        int i11 = -(iO + 1);
        if (i11 >= 16) {
            return r().put(comparable, obj);
        }
        if (this.f23649b == 16) {
            x05 x05Var = (x05) this.f23648a[15];
            this.f23649b = 15;
            r().put(x05Var.a(), x05Var.getValue());
        }
        Object[] objArr = this.f23648a;
        int length = objArr.length;
        System.arraycopy(objArr, i11, objArr, i11 + 1, 15 - i11);
        this.f23648a[i11] = new x05(this, comparable, obj);
        this.f23649b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.f23649b;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += this.f23648a[i12].hashCode();
        }
        return this.f23650c.size() > 0 ? iHashCode + this.f23650c.hashCode() : iHashCode;
    }

    final /* synthetic */ Object[] k() {
        return this.f23648a;
    }

    final /* synthetic */ int l() {
        return this.f23649b;
    }

    final /* synthetic */ Map m() {
        return this.f23650c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int iO = o(comparable);
        if (iO >= 0) {
            return i(iO);
        }
        if (this.f23650c.isEmpty()) {
            return null;
        }
        return this.f23650c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23649b + this.f23650c.size();
    }
}
