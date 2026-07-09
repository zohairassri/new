package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;
import zo.o;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f extends g {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    private static class a extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f46079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f46080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f46081c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i11) {
            o.i(i11, size());
            return Integer.valueOf(this.f46079a[this.f46080b + i11]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i11, Integer num) {
            o.i(i11, size());
            int[] iArr = this.f46079a;
            int i12 = this.f46080b;
            int i13 = iArr[i12 + i11];
            iArr[i12 + i11] = ((Integer) o.k(num)).intValue();
            return Integer.valueOf(i13);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.k(this.f46079a, ((Integer) obj).intValue(), this.f46080b, this.f46081c) != -1;
        }

        int[] d() {
            return Arrays.copyOfRange(this.f46079a, this.f46080b, this.f46081c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f46079a[this.f46080b + i11] != aVar.f46079a[aVar.f46080b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iJ = 1;
            for (int i11 = this.f46080b; i11 < this.f46081c; i11++) {
                iJ = (iJ * 31) + f.j(this.f46079a[i11]);
            }
            return iJ;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iK;
            if (!(obj instanceof Integer) || (iK = f.k(this.f46079a, ((Integer) obj).intValue(), this.f46080b, this.f46081c)) < 0) {
                return -1;
            }
            return iK - this.f46080b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iL;
            if (!(obj instanceof Integer) || (iL = f.l(this.f46079a, ((Integer) obj).intValue(), this.f46080b, this.f46081c)) < 0) {
                return -1;
            }
            return iL - this.f46080b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f46081c - this.f46080b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i11, int i12) {
            o.o(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f46079a;
            int i13 = this.f46080b;
            return new a(iArr, i11 + i13, i13 + i12);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f46079a[this.f46080b]);
            int i11 = this.f46080b;
            while (true) {
                i11++;
                if (i11 >= this.f46081c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f46079a[i11]);
            }
        }

        a(int[] iArr, int i11, int i12) {
            this.f46079a = iArr;
            this.f46080b = i11;
            this.f46081c = i12;
        }
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    private static int d(long j11) {
        int i11 = (int) j11;
        o.g(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static int e(long j11) {
        int i11 = (int) j11;
        o.g(((long) i11) == j11, "Out of range: %s", j11);
        return i11;
    }

    public static int[] f(int[]... iArr) {
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int[] iArr3 = new int[d(length)];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int g(int i11, int i12, int i13) {
        o.f(i12 <= i13, "min (%s) must be less than or equal to max (%s)", i12, i13);
        return Math.min(Math.max(i11, i12), i13);
    }

    public static int h(byte[] bArr) {
        o.f(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return i(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int i(byte b11, byte b12, byte b13, byte b14) {
        return (b11 << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int[] iArr, int i11, int i12, int i13) {
        while (i12 < i13) {
            if (iArr[i12] == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int[] iArr, int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            if (iArr[i14] == i11) {
                return i14;
            }
        }
        return -1;
    }

    public static int m(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j11 < -2147483648L ? IntCompanionObject.MIN_VALUE : (int) j11;
    }

    public static int[] n(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = ((Number) o.k(array[i11])).intValue();
        }
        return iArr;
    }

    public static Integer o(String str) {
        return p(str, 10);
    }

    public static Integer p(String str, int i11) {
        Long lE = h.e(str, i11);
        if (lE == null || lE.longValue() != lE.intValue()) {
            return null;
        }
        return Integer.valueOf(lE.intValue());
    }

    public static int j(int i11) {
        return i11;
    }
}
