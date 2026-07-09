package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
class zzagd extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzagb zze;
    private Map zzf;

    private zzagd() {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    private final int zzl(Comparable comparable) {
        int i11 = this.zzb;
        int i12 = i11 - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int iCompareTo = comparable.compareTo(((zzafx) this.zza[i12]).zza());
            if (iCompareTo > 0) {
                return -(i11 + 1);
            }
            if (iCompareTo == 0) {
                return i12;
            }
        }
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int iCompareTo2 = comparable.compareTo(((zzafx) this.zza[i14]).zza());
            if (iCompareTo2 < 0) {
                i12 = i14 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i14;
                }
                i13 = i14 + 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i11) {
        zzo();
        Object value = ((zzafx) this.zza[i11]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i11 + 1, objArr, i11, (this.zzb - i11) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i12 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i12] = new zzafx(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzl(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzagb(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagd)) {
            return super.equals(obj);
        }
        zzagd zzagdVar = (zzagd) obj;
        int size = size();
        if (size != zzagdVar.size()) {
            return false;
        }
        int i11 = this.zzb;
        if (i11 != zzagdVar.zzb) {
            return entrySet().equals(zzagdVar.entrySet());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!zzg(i12).equals(zzagdVar.zzg(i12))) {
                return false;
            }
        }
        if (i11 != size) {
            return this.zzc.equals(zzagdVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZzl = zzl(comparable);
        return iZzl >= 0 ? ((zzafx) this.zza[iZzl]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = this.zzb;
        int iHashCode = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode += this.zza[i12].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return zzm(iZzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int iZzl = zzl(comparable);
        if (iZzl >= 0) {
            return ((zzafx) this.zza[iZzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i11 = -(iZzl + 1);
        if (i11 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzafx zzafxVar = (zzafx) this.zza[15];
            this.zzb = 15;
            zzn().put(zzafxVar.zza(), zzafxVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i11, objArr, i11 + 1, 15 - i11);
        this.zza[i11] = new zzafx(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i11) {
        if (i11 < this.zzb) {
            return (zzafx) this.zza[i11];
        }
        throw new ArrayIndexOutOfBoundsException(i11);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    /* synthetic */ zzagd(zzagc zzagcVar) {
        Map map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }
}
