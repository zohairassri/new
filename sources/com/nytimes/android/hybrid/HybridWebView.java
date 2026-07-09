package com.nytimes.android.hybrid;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vu.a;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/nytimes/android/hybrid/HybridWebView;", "Landroid/webkit/WebView;", "Landroid/webkit/WebViewClient;", "client", "", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "Lvu/a;", "scriptInjector", "Lvu/a;", "getScriptInjector", "()Lvu/a;", "hybrid_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
public class HybridWebView extends WebView {
    @NotNull
    public final a getScriptInjector() {
        return null;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        throw null;
    }
}
