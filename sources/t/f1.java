package t;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f127530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f127531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f127532c;

    public f1() {
        this(0, 1, null);
    }

    private final int d(Object obj, int i11) {
        int i12 = this.f127532c;
        if (i12 == 0) {
            return -1;
        }
        int iA = u.a.a(this.f127530a, i12, i11);
        if (iA < 0 || Intrinsics.areEqual(obj, this.f127531b[iA << 1])) {
            return iA;
        }
        int i13 = iA + 1;
        while (i13 < i12 && this.f127530a[i13] == i11) {
            if (Intrinsics.areEqual(obj, this.f127531b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = iA - 1; i14 >= 0 && this.f127530a[i14] == i11; i14--) {
            if (Intrinsics.areEqual(obj, this.f127531b[i14 << 1])) {
                return i14;
            }
        }
        return ~i13;
    }

    private final int g() {
        int i11 = this.f127532c;
        if (i11 == 0) {
            return -1;
        }
        int iA = u.a.a(this.f127530a, i11, 0);
        if (iA < 0 || this.f127531b[iA << 1] == null) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f127530a[i12] == 0) {
            if (this.f127531b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f127530a[i13] == 0; i13--) {
            if (this.f127531b[i13 << 1] == null) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int a(Object obj) {
        int i11 = this.f127532c * 2;
        Object[] objArr = this.f127531b;
        if (obj == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public void c(int i11) {
        int i12 = this.f127532c;
        int[] iArr = this.f127530a;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f127530a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f127531b, i11 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f127531b = objArrCopyOf;
        }
        if (this.f127532c != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f127532c > 0) {
            this.f127530a = u.a.f130789a;
            this.f127531b = u.a.f130791c;
            this.f127532c = 0;
        }
        if (this.f127532c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof f1) {
                if (size() != ((f1) obj).size()) {
                    return false;
                }
                f1 f1Var = (f1) obj;
                int i11 = this.f127532c;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object objH = h(i12);
                    Object objL = l(i12);
                    Object obj2 = f1Var.get(objH);
                    if (objL == null) {
                        if (obj2 != null || !f1Var.containsKey(objH)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(objL, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i13 = this.f127532c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object objH2 = h(i14);
                Object objL2 = l(i14);
                Object obj3 = ((Map) obj).get(objH2);
                if (objL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objH2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objL2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : d(obj, obj.hashCode());
    }

    public Object get(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return this.f127531b[(iF << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iF = f(obj);
        return iF >= 0 ? this.f127531b[(iF << 1) + 1] : obj2;
    }

    public Object h(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f127532c) {
            z11 = true;
        }
        if (!z11) {
            u.d.a("Expected index to be within 0..size()-1, but was " + i11);
        }
        return this.f127531b[i11 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f127530a;
        Object[] objArr = this.f127531b;
        int i11 = this.f127532c;
        int i12 = 1;
        int i13 = 0;
        int iHashCode = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return iHashCode;
    }

    public void i(f1 map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i11 = map.f127532c;
        c(this.f127532c + i11);
        if (this.f127532c != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(map.h(i12), map.l(i12));
            }
        } else if (i11 > 0) {
            kotlin.collections.n.l(map.f127530a, this.f127530a, 0, 0, i11);
            kotlin.collections.n.n(map.f127531b, this.f127531b, 0, 0, i11 << 1);
            this.f127532c = i11;
        }
    }

    public boolean isEmpty() {
        return this.f127532c <= 0;
    }

    public Object j(int i11) {
        if (!(i11 >= 0 && i11 < this.f127532c)) {
            u.d.a("Expected index to be within 0..size()-1, but was " + i11);
        }
        Object[] objArr = this.f127531b;
        int i12 = i11 << 1;
        Object obj = objArr[i12 + 1];
        int i13 = this.f127532c;
        if (i13 <= 1) {
            clear();
            return obj;
        }
        int i14 = i13 - 1;
        int[] iArr = this.f127530a;
        if (iArr.length <= 8 || i13 >= iArr.length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                kotlin.collections.n.l(iArr, iArr, i11, i15, i13);
                Object[] objArr2 = this.f127531b;
                kotlin.collections.n.n(objArr2, objArr2, i12, i15 << 1, i13 << 1);
            }
            Object[] objArr3 = this.f127531b;
            int i16 = i14 << 1;
            objArr3[i16] = null;
            objArr3[i16 + 1] = null;
        } else {
            int i17 = i13 > 8 ? i13 + (i13 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i17);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f127530a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f127531b, i17 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f127531b = objArrCopyOf;
            if (i13 != this.f127532c) {
                throw new ConcurrentModificationException();
            }
            if (i11 > 0) {
                kotlin.collections.n.l(iArr, this.f127530a, 0, 0, i11);
                kotlin.collections.n.n(objArr, this.f127531b, 0, 0, i12);
            }
            if (i11 < i14) {
                int i18 = i11 + 1;
                kotlin.collections.n.l(iArr, this.f127530a, i11, i18, i13);
                kotlin.collections.n.n(objArr, this.f127531b, i12, i18 << 1, i13 << 1);
            }
        }
        if (i13 != this.f127532c) {
            throw new ConcurrentModificationException();
        }
        this.f127532c = i14;
        return obj;
    }

    public Object k(int i11, Object obj) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f127532c) {
            z11 = true;
        }
        if (!z11) {
            u.d.a("Expected index to be within 0..size()-1, but was " + i11);
        }
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.f127531b;
        Object obj2 = objArr[i12];
        objArr[i12] = obj;
        return obj2;
    }

    public Object l(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f127532c) {
            z11 = true;
        }
        if (!z11) {
            u.d.a("Expected index to be within 0..size()-1, but was " + i11);
        }
        return this.f127531b[(i11 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i11 = this.f127532c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(obj, iHashCode) : g();
        if (iD >= 0) {
            int i12 = (iD << 1) + 1;
            Object[] objArr = this.f127531b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~iD;
        int[] iArr = this.f127530a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f127530a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f127531b, i14 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f127531b = objArrCopyOf;
            if (i11 != this.f127532c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr2 = this.f127530a;
            int i15 = i13 + 1;
            kotlin.collections.n.l(iArr2, iArr2, i15, i13, i11);
            Object[] objArr2 = this.f127531b;
            kotlin.collections.n.n(objArr2, objArr2, i15 << 1, i13 << 1, this.f127532c << 1);
        }
        int i16 = this.f127532c;
        if (i11 == i16) {
            int[] iArr3 = this.f127530a;
            if (i13 < iArr3.length) {
                iArr3[i13] = iHashCode;
                Object[] objArr3 = this.f127531b;
                int i17 = i13 << 1;
                objArr3[i17] = obj;
                objArr3[i17 + 1] = obj2;
                this.f127532c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return j(iF);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF, obj2);
        }
        return null;
    }

    public int size() {
        return this.f127532c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f127532c * 28);
        sb2.append('{');
        int i11 = this.f127532c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object objH = h(i12);
            if (objH != sb2) {
                sb2.append(objH);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objL = l(i12);
            if (objL != sb2) {
                sb2.append(objL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public f1(int i11) {
        this.f127530a = i11 == 0 ? u.a.f130789a : new int[i11];
        this.f127531b = i11 == 0 ? u.a.f130791c : new Object[i11 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0 || !Intrinsics.areEqual(obj2, l(iF))) {
            return false;
        }
        j(iF);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iF = f(obj);
        if (iF < 0 || !Intrinsics.areEqual(obj2, l(iF))) {
            return false;
        }
        k(iF, obj3);
        return true;
    }

    public /* synthetic */ f1(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public f1(f1 f1Var) {
        this(0, 1, null);
        if (f1Var != null) {
            i(f1Var);
        }
    }
}
