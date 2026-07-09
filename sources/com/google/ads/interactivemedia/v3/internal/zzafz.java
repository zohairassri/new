package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzafz implements Iterator {
    final /* synthetic */ zzagd zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzafz(zzagd zzagdVar, zzafy zzafyVar) {
        this.zza = zzagdVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.zzb + 1;
        zzagd zzagdVar = this.zza;
        if (i11 >= zzagdVar.zzb) {
            return !zzagdVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i11 = this.zzb + 1;
        this.zzb = i11;
        zzagd zzagdVar = this.zza;
        return i11 < zzagdVar.zzb ? (zzafx) zzagdVar.zza[i11] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i11 = this.zzb;
        zzagd zzagdVar = this.zza;
        if (i11 >= zzagdVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i11 - 1;
            zzagdVar.zzm(i11);
        }
    }
}
