package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzev implements zzex {
    private final String zza;

    public zzev(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzex
    public final boolean zza(zzew zzewVar, Context context, boolean z11, boolean z12) {
        String str;
        String host;
        if (z11 || !z12 || (str = this.zza) == null || !str.contains("GOOGLE_INSTREAM_VIDEO_NONCE")) {
            return false;
        }
        String str2 = this.zza;
        List list = zzewVar.zzc;
        if (str2 == null || list == null || (host = Uri.parse(str2).getHost()) == null) {
            return true;
        }
        if (host.startsWith("www.")) {
            host = host.substring(4);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Objects.equals(host, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
