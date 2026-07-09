package jc0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f105517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105518b;

    protected c(Object[] objArr) {
        this.f105517a = objArr;
    }

    private static int a(Object obj, Object obj2, Comparator comparator) {
        if (obj == null) {
            return obj2 == null ? 0 : -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    private static Object[] e(Object[] objArr, Comparator comparator) {
        Object obj = null;
        int i11 = 0;
        for (int i12 = 0; i12 < objArr.length; i12 += 2) {
            Object obj2 = objArr[i12];
            Object obj3 = objArr[i12 + 1];
            if (obj2 != null) {
                if (obj != null && comparator.compare(obj2, obj) == 0) {
                    i11 -= 2;
                }
                if (obj3 == null) {
                    obj = null;
                } else {
                    int i13 = i11 + 1;
                    objArr[i11] = obj2;
                    i11 += 2;
                    objArr[i13] = obj3;
                    obj = obj2;
                }
            }
        }
        if (objArr.length == i11) {
            return objArr;
        }
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        return objArr2;
    }

    private static void h(Object[] objArr, int i11, int i12, int i13, Object[] objArr2, Comparator comparator) {
        int i14 = i11;
        int i15 = i12;
        while (i11 < i13) {
            if (i14 >= i12 - 1 || (i15 < i13 - 1 && a(objArr[i14], objArr[i15], comparator) > 0)) {
                objArr2[i11] = objArr[i15];
                objArr2[i11 + 1] = objArr[i15 + 1];
                i15 += 2;
            } else {
                objArr2[i11] = objArr[i14];
                objArr2[i11 + 1] = objArr[i14 + 1];
                i14 += 2;
            }
            i11 += 2;
        }
    }

    private static void i(Object[] objArr, Comparator comparator) {
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        k(objArr2, 0, objArr.length, objArr, comparator);
    }

    private static Object[] j(Object[] objArr, Comparator comparator) {
        j.a(objArr.length % 2 == 0, "You must provide an even number of key/value pair arguments.");
        if (objArr.length == 0) {
            return objArr;
        }
        i(objArr, comparator);
        return e(objArr, comparator);
    }

    private static void k(Object[] objArr, int i11, int i12, Object[] objArr2, Comparator comparator) {
        if (i12 - i11 <= 2) {
            return;
        }
        int i13 = ((i12 + i11) / 4) * 2;
        k(objArr2, i11, i13, objArr, comparator);
        k(objArr2, i13, i12, objArr, comparator);
        h(objArr, i11, i13, i12, objArr2, comparator);
    }

    protected final List b() {
        return Arrays.asList(this.f105517a);
    }

    public final Map c() {
        return g.h(b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Arrays.equals(this.f105517a, ((c) obj).f105517a);
        }
        return false;
    }

    public final void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f105517a;
            if (i11 >= objArr.length) {
                return;
            }
            biConsumer.accept(objArr[i11], objArr[i11 + 1]);
            i11 += 2;
        }
    }

    public final Object g(Object obj) {
        if (obj == null) {
            return null;
        }
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f105517a;
            if (i11 >= objArr.length) {
                return null;
            }
            if (obj.equals(objArr[i11])) {
                return this.f105517a[i11 + 1];
            }
            i11 += 2;
        }
    }

    public int hashCode() {
        int i11 = this.f105518b;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = Arrays.hashCode(this.f105517a) ^ 1000003;
        this.f105518b = iHashCode;
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f105517a.length == 0;
    }

    public final int size() {
        return this.f105517a.length / 2;
    }

    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("{");
        int i11 = 0;
        while (true) {
            Object[] objArr = this.f105517a;
            if (i11 >= objArr.length) {
                break;
            }
            Object obj = objArr[i11 + 1];
            if (obj instanceof String) {
                string = '\"' + ((String) obj) + '\"';
            } else {
                string = obj.toString();
            }
            sb2.append(this.f105517a[i11]);
            sb2.append("=");
            sb2.append(string);
            sb2.append(", ");
            i11 += 2;
        }
        if (sb2.length() > 1) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("}");
        return sb2.toString();
    }

    protected c(Object[] objArr, Comparator comparator) {
        this(j(objArr, comparator));
    }
}
