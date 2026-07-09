package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzacn extends zzacj implements RandomAccess, zzaed {
    private boolean[] zza;
    private int zzb;

    static {
        new zzacn(new boolean[0], 0, false);
    }

    zzacn() {
        this(new boolean[10], 0, true);
    }

    private final String zzg(int i11) {
        return "Index:" + i11 + ", Size:" + this.zzb;
    }

    private final void zzh(int i11) {
        if (i11 < 0 || i11 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i11, Object obj) {
        int i12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
        int i13 = i11 + 1;
        boolean[] zArr = this.zza;
        if (i12 < zArr.length) {
            System.arraycopy(zArr, i11, zArr, i13, i12 - i11);
        } else {
            boolean[] zArr2 = new boolean[((i12 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            System.arraycopy(this.zza, i11, zArr2, i13, this.zzb - i11);
            this.zza = zArr2;
        }
        this.zza[i11] = zBooleanValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzaee.zzb;
        collection.getClass();
        if (!(collection instanceof zzacn)) {
            return super.addAll(collection);
        }
        zzacn zzacnVar = (zzacn) collection;
        int i11 = zzacnVar.zzb;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzb;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.zza;
        if (i13 > zArr.length) {
            this.zza = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(zzacnVar.zza, 0, this.zza, this.zzb, zzacnVar.zzb);
        this.zzb = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacn)) {
            return super.equals(obj);
        }
        zzacn zzacnVar = (zzacn) obj;
        if (this.zzb != zzacnVar.zzb) {
            return false;
        }
        boolean[] zArr = zzacnVar.zza;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zza[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzh(i11);
        return Boolean.valueOf(this.zza[i11]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            iZza = (iZza * 31) + zzaee.zza(this.zza[i11]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[i12] == zBooleanValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        zzh(i11);
        boolean[] zArr = this.zza;
        boolean z11 = zArr[i11];
        if (i11 < this.zzb - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (r2 - i11) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zza;
        System.arraycopy(zArr, i12, zArr, i11, this.zzb - i12);
        this.zzb -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i11);
        boolean[] zArr = this.zza;
        boolean z11 = zArr[i11];
        zArr[i11] = zBooleanValue;
        return Boolean.valueOf(z11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaed
    public final /* bridge */ /* synthetic */ zzaed zzd(int i11) {
        if (i11 >= this.zzb) {
            return new zzacn(Arrays.copyOf(this.zza, i11), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z11) {
        zza();
        int i11 = this.zzb;
        boolean[] zArr = this.zza;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i11);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        zArr3[i12] = z11;
    }

    public final boolean zzf(int i11) {
        zzh(i11);
        return this.zza[i11];
    }

    private zzacn(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.zza = zArr;
        this.zzb = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
