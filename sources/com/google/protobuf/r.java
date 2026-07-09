package com.google.protobuf;

import com.google.protobuf.s;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
final class r extends c implements s.d, RandomAccess, r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r f47523d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f47524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47525c;

    static {
        r rVar = new r(new int[0], 0);
        f47523d = rVar;
        rVar.g();
    }

    private r(int[] iArr, int i11) {
        this.f47524b = iArr;
        this.f47525c = i11;
    }

    private void e(int i11, int i12) {
        int i13;
        a();
        if (i11 < 0 || i11 > (i13 = this.f47525c)) {
            throw new IndexOutOfBoundsException(m(i11));
        }
        int[] iArr = this.f47524b;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
        } else {
            int[] iArr2 = new int[((i13 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f47524b, i11, iArr2, i11 + 1, this.f47525c - i11);
            this.f47524b = iArr2;
        }
        this.f47524b[i11] = i12;
        this.f47525c++;
        ((AbstractList) this).modCount++;
    }

    public static r i() {
        return f47523d;
    }

    private void j(int i11) {
        if (i11 < 0 || i11 >= this.f47525c) {
            throw new IndexOutOfBoundsException(m(i11));
        }
    }

    private String m(int i11) {
        return "Index:" + i11 + ", Size:" + this.f47525c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        s.a(collection);
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i11 = rVar.f47525c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f47525c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f47524b;
        if (i13 > iArr.length) {
            this.f47524b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(rVar.f47524b, 0, this.f47524b, this.f47525c, rVar.f47525c);
        this.f47525c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i11, Integer num) {
        e(i11, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        g1(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f47525c != rVar.f47525c) {
            return false;
        }
        int[] iArr = rVar.f47524b;
        for (int i11 = 0; i11 < this.f47525c; i11++) {
            if (this.f47524b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.s.d
    public void g1(int i11) {
        a();
        int i12 = this.f47525c;
        int[] iArr = this.f47524b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f47524b = iArr2;
        }
        int[] iArr3 = this.f47524b;
        int i13 = this.f47525c;
        this.f47525c = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // com.google.protobuf.s.d
    public int getInt(int i11) {
        j(i11);
        return this.f47524b[i11];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f47525c; i12++) {
            i11 = (i11 * 31) + this.f47524b[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f47524b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i11) {
        a();
        j(i11);
        int[] iArr = this.f47524b;
        int i12 = iArr[i11];
        if (i11 < this.f47525c - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f47525c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f47524b;
        System.arraycopy(iArr, i12, iArr, i11, this.f47525c - i12);
        this.f47525c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer set(int i11, Integer num) {
        return Integer.valueOf(u(i11, num.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f47525c;
    }

    public int u(int i11, int i12) {
        a();
        j(i11);
        int[] iArr = this.f47524b;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    @Override // com.google.protobuf.s.e, com.google.protobuf.s.d
    public s.d c(int i11) {
        if (i11 >= this.f47525c) {
            return new r(Arrays.copyOf(this.f47524b, i11), this.f47525c);
        }
        throw new IllegalArgumentException();
    }
}
