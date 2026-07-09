package com.iterable.iterableapi;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.iterable.iterableapi.q0;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public class p0 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    q0.a f47809a;

    p0(q0.a aVar) {
        this.f47809a = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i11) {
        this.f47809a.r();
    }
}
