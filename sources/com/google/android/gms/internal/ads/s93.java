package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
final class s93 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f34661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f34662b;

    s93(t93 t93Var, WebView webView, String str) {
        this.f34661a = webView;
        this.f34662b = str;
        Objects.requireNonNull(t93Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        t93.k(this.f34661a, this.f34662b);
    }
}
