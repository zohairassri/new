package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class m05 extends ix4 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f30529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final m05 f30530e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f30531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30532c;

    static {
        Object[] objArr = new Object[0];
        f30529d = objArr;
        f30530e = new m05(objArr, 0, false);
    }

    private m05(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f30531b = objArr;
        this.f30532c = i11;
    }

    public static m05 b() {
        return f30530e;
    }

    private static int e(int i11) {
        return Math.max(((i11 * 3) / 2) + 1, 10);
    }

    private final void i(int i11) {
        if (i11 < 0 || i11 >= this.f30532c) {
            throw new IndexOutOfBoundsException(j(i11));
        }
    }

    private final String j(int i11) {
        int i12 = this.f30532c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 13 + String.valueOf(i12).length());
        sb2.append("Index:");
        sb2.append(i11);
        sb2.append(", Size:");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        a();
        if (i11 < 0 || i11 > (i12 = this.f30532c)) {
            throw new IndexOutOfBoundsException(j(i11));
        }
        int i13 = i11 + 1;
        Object[] objArr = this.f30531b;
        int length = objArr.length;
        if (i12 < length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f30531b, 0, objArr2, 0, i11);
            System.arraycopy(this.f30531b, i11, objArr2, i13, this.f30532c - i11);
            this.f30531b = objArr2;
        }
        this.f30531b[i11] = obj;
        this.f30532c++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i11) {
        int length = this.f30531b.length;
        if (i11 <= length) {
            return;
        }
        if (length == 0) {
            this.f30531b = new Object[Math.max(i11, 10)];
            return;
        }
        while (length < i11) {
            length = e(length);
        }
        this.f30531b = Arrays.copyOf(this.f30531b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        i(i11);
        return this.f30531b[i11];
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        i(i11);
        Object[] objArr = this.f30531b;
        Object obj = objArr[i11];
        if (i11 < this.f30532c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f30532c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        a();
        i(i11);
        Object[] objArr = this.f30531b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30532c;
    }

    @Override // com.google.android.gms.internal.ads.iz4
    public final /* bridge */ /* synthetic */ iz4 zzh(int i11) {
        if (i11 >= this.f30532c) {
            return new m05(i11 == 0 ? f30529d : Arrays.copyOf(this.f30531b, i11), this.f30532c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i11 = this.f30532c;
        int length = this.f30531b.length;
        if (i11 == length) {
            this.f30531b = Arrays.copyOf(this.f30531b, e(length));
        }
        Object[] objArr = this.f30531b;
        int i12 = this.f30532c;
        this.f30532c = i12 + 1;
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
