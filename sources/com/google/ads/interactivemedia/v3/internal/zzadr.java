package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzadr extends zzacj implements RandomAccess, zzaed {
    private float[] zza;
    private int zzb;

    static {
        new zzadr(new float[0], 0, false);
    }

    zzadr() {
        this(new float[10], 0, true);
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
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i11 < 0 || i11 > (i12 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i11));
        }
        int i13 = i11 + 1;
        float[] fArr = this.zza;
        if (i12 < fArr.length) {
            System.arraycopy(fArr, i11, fArr, i13, i12 - i11);
        } else {
            float[] fArr2 = new float[((i12 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            System.arraycopy(this.zza, i11, fArr2, i13, this.zzb - i11);
            this.zza = fArr2;
        }
        this.zza[i11] = fFloatValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzaee.zzb;
        collection.getClass();
        if (!(collection instanceof zzadr)) {
            return super.addAll(collection);
        }
        zzadr zzadrVar = (zzadr) collection;
        int i11 = zzadrVar.zzb;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.zzb;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.zza;
        if (i13 > fArr.length) {
            this.zza = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(zzadrVar.zza, 0, this.zza, this.zzb, zzadrVar.zzb);
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
        if (!(obj instanceof zzadr)) {
            return super.equals(obj);
        }
        zzadr zzadrVar = (zzadr) obj;
        if (this.zzb != zzadrVar.zzb) {
            return false;
        }
        float[] fArr = zzadrVar.zza;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (Float.floatToIntBits(this.zza[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i11) {
        zzh(i11);
        return Float.valueOf(this.zza[i11]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zza[i11]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i11 = this.zzb;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[i12] == fFloatValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        zza();
        zzh(i11);
        float[] fArr = this.zza;
        float f11 = fArr[i11];
        if (i11 < this.zzb - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (r2 - i11) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        zza();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zza;
        System.arraycopy(fArr, i12, fArr, i11, this.zzb - i12);
        this.zzb -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzh(i11);
        float[] fArr = this.zza;
        float f11 = fArr[i11];
        fArr[i11] = fFloatValue;
        return Float.valueOf(f11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaed
    public final /* bridge */ /* synthetic */ zzaed zzd(int i11) {
        if (i11 >= this.zzb) {
            return new zzadr(Arrays.copyOf(this.zza, i11), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i11) {
        zzh(i11);
        return this.zza[i11];
    }

    public final void zzf(float f11) {
        zza();
        int i11 = this.zzb;
        float[] fArr = this.zza;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        fArr3[i12] = f11;
    }

    private zzadr(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.zza = fArr;
        this.zzb = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
