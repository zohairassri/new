package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzwq implements WildcardType, Serializable {
    private final Type zza;
    private final Type zzb;

    public zzwq(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        zzwn.zza(length <= 1);
        zzwn.zza(typeArr.length == 1);
        if (length != 1) {
            Objects.requireNonNull(typeArr[0]);
            zzwr.zzf(typeArr[0]);
            this.zzb = null;
            this.zza = zzwr.zzc(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        zzwr.zzf(typeArr2[0]);
        zzwn.zza(typeArr[0] == Object.class);
        this.zzb = zzwr.zzc(typeArr2[0]);
        this.zza = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && zzwr.zzg(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.zzb;
        return type != null ? new Type[]{type} : zzwr.zza;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.zza};
    }

    public final int hashCode() {
        Type type = this.zzb;
        return (this.zza.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.zzb;
        if (type != null) {
            return "? super ".concat(String.valueOf(zzwr.zzb(type)));
        }
        Type type2 = this.zza;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(zzwr.zzb(type2)));
    }
}
