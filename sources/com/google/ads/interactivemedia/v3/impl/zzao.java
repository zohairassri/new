package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.internal.zzgi;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
final class zzao extends WebChromeClient {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzgi zzb;
    final /* synthetic */ List zzc;

    zzao(Context context, zzgi zzgiVar, List list) {
        this.zza = context;
        this.zzb = zzgiVar;
        this.zzc = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(this.zza);
        webViewTransport.setWebView(webView2);
        webView2.setWebViewClient(new zzan(this));
        message.sendToTarget();
        return true;
    }
}
