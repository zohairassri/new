package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class l3 extends l0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l3 f41531d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f41532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41533c;

    static {
        l3 l3Var = new l3(new Object[0], 0);
        f41531d = l3Var;
        l3Var.zzb();
    }

    private l3(Object[] objArr, int i11) {
        this.f41532b = objArr;
        this.f41533c = i11;
    }

    public static l3 a() {
        return f41531d;
    }

    private final String b(int i11) {
        return "Index:" + i11 + ", Size:" + this.f41533c;
    }

    private final void d(int i11) {
        if (i11 < 0 || i11 >= this.f41533c) {
            throw new IndexOutOfBoundsException(b(i11));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.f41533c)) {
            throw new IndexOutOfBoundsException(b(i11));
        }
        Object[] objArr = this.f41532b;
        if (i12 < objArr.length) {
            System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
        } else {
            Object[] objArr2 = new Object[((i12 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i11);
            System.arraycopy(this.f41532b, i11, objArr2, i11 + 1, this.f41533c - i11);
            this.f41532b = objArr2;
        }
        this.f41532b[i11] = obj;
        this.f41533c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        d(i11);
        return this.f41532b[i11];
    }

    @Override // com.google.android.gms.internal.pal.l0, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        d(i11);
        Object[] objArr = this.f41532b;
        Object obj = objArr[i11];
        if (i11 < this.f41533c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f41533c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        d(i11);
        Object[] objArr = this.f41532b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41533c;
    }

    @Override // com.google.android.gms.internal.pal.g2
    public final /* bridge */ /* synthetic */ g2 zzd(int i11) {
        if (i11 >= this.f41533c) {
            return new l3(Arrays.copyOf(this.f41532b, i11), this.f41533c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.pal.l0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i11 = this.f41533c;
        Object[] objArr = this.f41532b;
        if (i11 == objArr.length) {
            this.f41532b = Arrays.copyOf(objArr, ((i11 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f41532b;
        int i12 = this.f41533c;
        this.f41533c = i12 + 1;
        objArr2[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
