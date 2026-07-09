package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class az4 extends ix4 implements RandomAccess, ez4, k05 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f23618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final az4 f23619e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f23620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23621c;

    static {
        int[] iArr = new int[0];
        f23618d = iArr;
        f23619e = new az4(iArr, 0, false);
    }

    private az4(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f23620b = iArr;
        this.f23621c = i11;
    }

    public static az4 b() {
        return f23619e;
    }

    private static int j(int i11) {
        return Math.max(((i11 * 3) / 2) + 1, 10);
    }

    private final void l(int i11) {
        if (i11 < 0 || i11 >= this.f23621c) {
            throw new IndexOutOfBoundsException(m(i11));
        }
    }

    private final String m(int i11) {
        int i12 = this.f23621c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 13 + String.valueOf(i12).length());
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f23621c)) {
            throw new IndexOutOfBoundsException(m(i11));
        }
        int i13 = i11 + 1;
        int[] iArr = this.f23620b;
        int length = iArr.length;
        if (i12 < length) {
            System.arraycopy(iArr, i11, iArr, i13, i12 - i11);
        } else {
            int[] iArr2 = new int[j(length)];
            System.arraycopy(this.f23620b, 0, iArr2, 0, i11);
            System.arraycopy(this.f23620b, i11, iArr2, i13, this.f23621c - i11);
            this.f23620b = iArr2;
        }
        this.f23620b[i11] = iIntValue;
        this.f23621c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = jz4.f29317b;
        collection.getClass();
        if (!(collection instanceof az4)) {
            return super.addAll(collection);
        }
        az4 az4Var = (az4) collection;
        int i11 = az4Var.f23621c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f23621c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f23620b;
        if (i13 > iArr.length) {
            this.f23620b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(az4Var.f23620b, 0, this.f23620b, this.f23621c, az4Var.f23621c);
        this.f23621c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i11) {
        l(i11);
        return this.f23620b[i11];
    }

    public final int e(int i11, int i12) {
        a();
        l(i11);
        int[] iArr = this.f23620b;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az4)) {
            return super.equals(obj);
        }
        az4 az4Var = (az4) obj;
        if (this.f23621c != az4Var.f23621c) {
            return false;
        }
        int[] iArr = az4Var.f23620b;
        for (int i11 = 0; i11 < this.f23621c; i11++) {
            if (this.f23620b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        l(i11);
        return Integer.valueOf(this.f23620b[i11]);
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f23621c; i12++) {
            i11 = (i11 * 31) + this.f23620b[i12];
        }
        return i11;
    }

    final void i(int i11) {
        int length = this.f23620b.length;
        if (i11 <= length) {
            return;
        }
        if (length == 0) {
            this.f23620b = new int[Math.max(i11, 10)];
            return;
        }
        while (length < i11) {
            length = j(length);
        }
        this.f23620b = Arrays.copyOf(this.f23620b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f23621c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f23620b[i12] == iIntValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        a();
        l(i11);
        int[] iArr = this.f23620b;
        int i12 = iArr[i11];
        if (i11 < this.f23621c - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.f23621c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f23620b;
        System.arraycopy(iArr, i12, iArr, i11, this.f23621c - i12);
        this.f23621c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        return Integer.valueOf(e(i11, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23621c;
    }

    @Override // com.google.android.gms.internal.ads.iz4
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ez4 zzh(int i11) {
        if (i11 >= this.f23621c) {
            return new az4(i11 == 0 ? f23618d : Arrays.copyOf(this.f23620b, i11), this.f23621c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.ez4
    public final void zzi(int i11) {
        a();
        int i12 = this.f23621c;
        int length = this.f23620b.length;
        if (i12 == length) {
            int[] iArr = new int[j(length)];
            System.arraycopy(this.f23620b, 0, iArr, 0, this.f23621c);
            this.f23620b = iArr;
        }
        int[] iArr2 = this.f23620b;
        int i13 = this.f23621c;
        this.f23621c = i13 + 1;
        iArr2[i13] = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
