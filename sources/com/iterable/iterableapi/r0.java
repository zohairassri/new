package com.iterable.iterableapi;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iterable.iterableapi.q0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class r0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    q0.a f47834a;

    r0(q0.a aVar) {
        this.f47834a = aVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f47834a.T(true);
        this.f47834a.r();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f47834a.Z(str);
        return true;
    }
}
