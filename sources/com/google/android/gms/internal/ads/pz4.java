package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class pz4 extends ix4 implements RandomAccess, hz4, k05 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f33322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final pz4 f33323e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f33324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33325c;

    static {
        long[] jArr = new long[0];
        f33322d = jArr;
        f33323e = new pz4(jArr, 0, false);
    }

    private pz4(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f33324b = jArr;
        this.f33325c = i11;
    }

    public static pz4 e() {
        return f33323e;
    }

    private static int i(int i11) {
        return Math.max(((i11 * 3) / 2) + 1, 10);
    }

    private final void j(int i11) {
        if (i11 < 0 || i11 >= this.f33325c) {
            throw new IndexOutOfBoundsException(l(i11));
        }
    }

    private final String l(int i11) {
        int i12 = this.f33325c;
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
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f33325c)) {
            throw new IndexOutOfBoundsException(l(i11));
        }
        int i13 = i11 + 1;
        long[] jArr = this.f33324b;
        int length = jArr.length;
        if (i12 < length) {
            System.arraycopy(jArr, i11, jArr, i13, i12 - i11);
        } else {
            long[] jArr2 = new long[i(length)];
            System.arraycopy(this.f33324b, 0, jArr2, 0, i11);
            System.arraycopy(this.f33324b, i11, jArr2, i13, this.f33325c - i11);
            this.f33324b = jArr2;
        }
        this.f33324b[i11] = jLongValue;
        this.f33325c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = jz4.f29317b;
        collection.getClass();
        if (!(collection instanceof pz4)) {
            return super.addAll(collection);
        }
        pz4 pz4Var = (pz4) collection;
        int i11 = pz4Var.f33325c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f33325c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f33324b;
        if (i13 > jArr.length) {
            this.f33324b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(pz4Var.f33324b, 0, this.f33324b, this.f33325c, pz4Var.f33325c);
        this.f33325c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i11) {
        j(i11);
        return this.f33324b[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i11, long j11) {
        a();
        j(i11);
        long[] jArr = this.f33324b;
        long j12 = jArr[i11];
        jArr[i11] = j11;
        return j12;
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz4)) {
            return super.equals(obj);
        }
        pz4 pz4Var = (pz4) obj;
        if (this.f33325c != pz4Var.f33325c) {
            return false;
        }
        long[] jArr = pz4Var.f33324b;
        for (int i11 = 0; i11 < this.f33325c; i11++) {
            if (this.f33324b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.iz4
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final hz4 zzh(int i11) {
        if (i11 >= this.f33325c) {
            return new pz4(i11 == 0 ? f33322d : Arrays.copyOf(this.f33324b, i11), this.f33325c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        j(i11);
        return Long.valueOf(this.f33324b[i11]);
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f33325c; i12++) {
            long j11 = this.f33324b[i12];
            byte[] bArr = jz4.f29317b;
            i11 = (i11 * 31) + ((int) (j11 ^ (j11 >>> 32)));
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i11 = this.f33325c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f33324b[i12] == jLongValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.hz4
    public final void r(long j11) {
        a();
        int i11 = this.f33325c;
        int length = this.f33324b.length;
        if (i11 == length) {
            long[] jArr = new long[i(length)];
            System.arraycopy(this.f33324b, 0, jArr, 0, this.f33325c);
            this.f33324b = jArr;
        }
        long[] jArr2 = this.f33324b;
        int i12 = this.f33325c;
        this.f33325c = i12 + 1;
        jArr2[i12] = j11;
    }

    @Override // com.google.android.gms.internal.ads.ix4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        a();
        j(i11);
        long[] jArr = this.f33324b;
        long j11 = jArr[i11];
        if (i11 < this.f33325c - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.f33325c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f33324b;
        System.arraycopy(jArr, i12, jArr, i11, this.f33325c - i12);
        this.f33325c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        return Long.valueOf(d(i11, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33325c;
    }

    final void zzi(int i11) {
        int length = this.f33324b.length;
        if (i11 <= length) {
            return;
        }
        if (length == 0) {
            this.f33324b = new long[Math.max(i11, 10)];
            return;
        }
        while (length < i11) {
            length = i(length);
        }
        this.f33324b = Arrays.copyOf(this.f33324b, length);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        r(((Long) obj).longValue());
        return true;
    }
}
