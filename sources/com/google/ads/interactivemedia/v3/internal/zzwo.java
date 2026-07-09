package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzwo implements GenericArrayType, Serializable {
    private final Type zza;

    public zzwo(Type type) {
        Objects.requireNonNull(type);
        this.zza = zzwr.zzc(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && zzwr.zzg(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return String.valueOf(zzwr.zzb(this.zza)).concat("[]");
    }
}
