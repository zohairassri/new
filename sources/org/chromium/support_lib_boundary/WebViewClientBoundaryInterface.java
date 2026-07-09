package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes7.dex */
public interface WebViewClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onPageCommitVisible(WebView webView, String str);

    void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler);

    void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i11, InvocationHandler invocationHandler);

    boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest);
}
