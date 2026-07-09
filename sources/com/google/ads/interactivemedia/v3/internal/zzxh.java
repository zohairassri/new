package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzxh implements zzya {
    final /* synthetic */ Type zza;

    zzxh(Type type) {
        this.zza = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzya
    public final Object zza() {
        Type type = this.zza;
        if (!(type instanceof ParameterizedType)) {
            throw new zzvx("Invalid EnumMap type: ".concat(String.valueOf(type.toString())));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new zzvx("Invalid EnumMap type: ".concat(String.valueOf(this.zza.toString())));
    }
}
