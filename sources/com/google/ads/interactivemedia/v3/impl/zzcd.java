package com.google.ads.interactivemedia.v3.impl;

import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcd {
    private final WebView zza;
    private final ViewGroup zzb;

    public zzcd(WebView webView, ViewGroup viewGroup) {
        this.zza = webView;
        this.zzb = viewGroup;
    }

    public final void zza() {
        this.zza.setVisibility(4);
    }

    public final void zzb() {
        if (((ViewGroup) this.zza.getParent()) == null) {
            this.zzb.addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        }
        this.zza.setVisibility(0);
        this.zzb.bringChildToFront(this.zza);
    }
}
