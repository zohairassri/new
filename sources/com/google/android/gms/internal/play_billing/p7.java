package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class p7 extends b5 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f42520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p7 f42521e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f42522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42523c;

    static {
        Object[] objArr = new Object[0];
        f42520d = objArr;
        f42521e = new p7(objArr, 0, false);
    }

    private p7(Object[] objArr, int i11, boolean z11) {
        super(z11);
        this.f42522b = objArr;
        this.f42523c = i11;
    }

    public static p7 a() {
        return f42521e;
    }

    private static int d(int i11) {
        return Math.max(((i11 * 3) / 2) + 1, 10);
    }

    private final String e(int i11) {
        return "Index:" + i11 + ", Size:" + this.f42523c;
    }

    private final void zzi(int i11) {
        if (i11 < 0 || i11 >= this.f42523c) {
            throw new IndexOutOfBoundsException(e(i11));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zza();
        if (i11 < 0 || i11 > (i12 = this.f42523c)) {
            throw new IndexOutOfBoundsException(e(i11));
        }
        int i13 = i11 + 1;
        Object[] objArr = this.f42522b;
        int length = objArr.length;
        if (i12 < length) {
            System.arraycopy(objArr, i11, objArr, i13, i12 - i11);
        } else {
            Object[] objArr2 = new Object[d(length)];
            System.arraycopy(this.f42522b, 0, objArr2, 0, i11);
            System.arraycopy(this.f42522b, i11, objArr2, i13, this.f42523c - i11);
            this.f42522b = objArr2;
        }
        this.f42522b[i11] = obj;
        this.f42523c++;
        ((AbstractList) this).modCount++;
    }

    final void b(int i11) {
        int length = this.f42522b.length;
        if (i11 <= length) {
            return;
        }
        if (length == 0) {
            this.f42522b = new Object[Math.max(i11, 10)];
            return;
        }
        while (length < i11) {
            length = d(length);
        }
        this.f42522b = Arrays.copyOf(this.f42522b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        zzi(i11);
        return this.f42522b[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.b5, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        zza();
        zzi(i11);
        Object[] objArr = this.f42522b;
        Object obj = objArr[i11];
        if (i11 < this.f42523c - 1) {
            System.arraycopy(objArr, i11 + 1, objArr, i11, (r2 - i11) - 1);
        }
        this.f42523c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        zza();
        zzi(i11);
        Object[] objArr = this.f42522b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42523c;
    }

    @Override // com.google.android.gms.internal.play_billing.p6
    public final /* bridge */ /* synthetic */ p6 zzd(int i11) {
        if (i11 >= this.f42523c) {
            return new p7(i11 == 0 ? f42520d : Arrays.copyOf(this.f42522b, i11), this.f42523c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i11 = this.f42523c;
        int length = this.f42522b.length;
        if (i11 == length) {
            this.f42522b = Arrays.copyOf(this.f42522b, d(length));
        }
        Object[] objArr = this.f42522b;
        int i12 = this.f42523c;
        this.f42523c = i12 + 1;
        objArr[i12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
