package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzahv extends zzahw {
    private static final zzahv zzc = new zzahv(null, null);
    public final Object zza;
    public final Object zzb;

    public zzahv(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    public static zzahv zzc(Object obj, Object obj2) {
        return (obj == null && obj2 == null) ? zzc : new zzahv(obj, obj2);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahw
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzahw
    public final Object zzb() {
        return this.zzb;
    }
}
