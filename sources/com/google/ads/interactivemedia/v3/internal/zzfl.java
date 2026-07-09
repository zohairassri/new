package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfl implements com.google.ads.interactivemedia.v3.impl.zzbh {
    private final Context zza;
    private boolean zzb = false;

    private zzfl(Context context, zzfm zzfmVar) {
        this.zza = context;
    }

    public static zzfl zzb(Context context) {
        return new zzfl(context, new zzfm());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        boolean z11;
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = javaScriptMessage.zzb().ordinal();
        if (iOrdinal == 53) {
            zzcj.zza(this.zza);
            z11 = true;
        } else if (iOrdinal != 54) {
            return;
        } else {
            z11 = false;
        }
        this.zzb = z11;
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
