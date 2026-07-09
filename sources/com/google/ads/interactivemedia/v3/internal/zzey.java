package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzey implements zzex {
    @Override // com.google.ads.interactivemedia.v3.internal.zzex
    public final boolean zza(zzew zzewVar, Context context, boolean z11, boolean z12) {
        String packageName = context.getApplicationContext().getPackageName();
        List list = zzewVar.zzd;
        return (list == null || !list.contains(packageName)) && !z11 && z12;
    }
}
