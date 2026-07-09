package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class h44 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f27513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f27514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f27515c;

    h44(int[] iArr, int i11, int i12) {
        this.f27513a = iArr;
        this.f27514b = i11;
        this.f27515c = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && i44.i(this.f27513a, ((Integer) obj).intValue(), this.f27514b, this.f27515c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h44)) {
            return super.equals(obj);
        }
        h44 h44Var = (h44) obj;
        int i11 = this.f27515c;
        int i12 = this.f27514b;
        int i13 = h44Var.f27515c;
        int i14 = h44Var.f27514b;
        int i15 = i11 - i12;
        if (i13 - i14 != i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f27513a[i12 + i16] != h44Var.f27513a[i14 + i16]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12 = this.f27515c;
        int i13 = this.f27514b;
        jx3.m(i11, i12 - i13, "index");
        return Integer.valueOf(this.f27513a[i13 + i11]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i11 = this.f27514b; i11 < this.f27515c; i11++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f27513a[i11]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.f27513a;
        int iIntValue = ((Integer) obj).intValue();
        int i11 = this.f27514b;
        int i12 = i44.i(iArr, iIntValue, i11, this.f27515c);
        if (i12 >= 0) {
            return i12 - i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f27513a;
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f27514b;
            int i12 = this.f27515c - 1;
            while (true) {
                if (i12 < i11) {
                    i12 = -1;
                    break;
                }
                if (iArr[i12] == iIntValue) {
                    break;
                }
                i12--;
            }
            if (i12 >= 0) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        int i12 = this.f27515c;
        int i13 = this.f27514b;
        Integer num = (Integer) obj;
        jx3.m(i11, i12 - i13, "index");
        int[] iArr = this.f27513a;
        int i14 = i13 + i11;
        int i15 = iArr[i14];
        num.getClass();
        iArr[i14] = num.intValue();
        return Integer.valueOf(i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27515c - this.f27514b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f27513a, this.f27514b, this.f27515c, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i11, int i12) {
        int i13 = this.f27515c;
        int i14 = this.f27514b;
        jx3.o(i11, i12, i13 - i14);
        return i11 == i12 ? Collections.EMPTY_LIST : new h44(this.f27513a, i11 + i14, i14 + i12);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i11 = this.f27515c;
        int i12 = this.f27514b;
        StringBuilder sb2 = new StringBuilder((i11 - i12) * 5);
        sb2.append('[');
        int[] iArr = this.f27513a;
        sb2.append(iArr[i12]);
        while (true) {
            i12++;
            if (i12 >= i11) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i12]);
        }
    }
}
