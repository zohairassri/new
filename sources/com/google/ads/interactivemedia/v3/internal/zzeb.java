package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzeb extends AsyncTask {
    private zzec zza;
    protected final zzdt zzd;

    public zzeb(zzdt zzdtVar) {
        this.zzd = zzdtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzec zzecVar = this.zza;
        if (zzecVar != null) {
            zzecVar.zza(this);
        }
    }

    public final void zzb(zzec zzecVar) {
        this.zza = zzecVar;
    }
}
