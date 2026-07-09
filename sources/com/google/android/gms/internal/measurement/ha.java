package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class ha extends x6 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ha f40391d = new ha(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f40392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40393c;

    private ha(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f40392b = objArr;
        this.f40393c = i11;
    }

    private final String a(int i11) {
        return "Index:" + i11 + ", Size:" + this.f40393c;
    }

    private final void b(int i11) {
        if (i11 < 0 || i11 >= this.f40393c) {
            throw new IndexOutOfBoundsException(a(i11));
        }
    }

    public static ha d() {
        return f40391d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.f40393c)) {
            throw new IndexOutOfBoundsException(a(i11));
        }
        Object[] objArr = this.f40392b;
        if (i12 < objArr.length) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
        } else {
            Object[] objArr2 = new Object[((i12 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            System.arraycopy(this.f40392b, i11, objArr2, i11 + 1, this.f40393c - i11);
            this.f40392b = objArr2;
        }
        this.f40392b[i11] = obj;
        this.f40393c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        b(i11);
        return this.f40392b[i11];
    }

    @Override // com.google.android.gms.internal.measurement.x6, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        b(i11);
        Object[] objArr = this.f40392b;
        Object obj = objArr[i11];
        if (i11 < this.f40393c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f40393c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        b(i11);
        Object[] objArr = this.f40392b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40393c;
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final /* synthetic */ s8 zza(int i11) {
        if (i11 >= this.f40393c) {
            return new ha(Arrays.copyOf(this.f40392b, i11), this.f40393c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.x6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i11 = this.f40393c;
        Object[] objArr = this.f40392b;
        if (i11 == objArr.length) {
            this.f40392b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f40392b;
        int i12 = this.f40393c;
        this.f40393c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
