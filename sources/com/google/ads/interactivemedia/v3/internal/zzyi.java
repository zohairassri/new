package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzyi extends zzyl {
    final /* synthetic */ Method zza;
    final /* synthetic */ int zzb;

    zzyi(Method method, int i11) {
        this.zza = method;
        this.zzb = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyl
    public final Object zza(Class cls) throws Exception {
        zzyl.zzb(cls);
        return this.zza.invoke(null, cls, Integer.valueOf(this.zzb));
    }
}
