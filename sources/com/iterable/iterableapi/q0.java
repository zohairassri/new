package com.iterable.iterableapi;

import android.content.Context;
import android.webkit.WebView;
import com.amazonaws.services.s3.util.Mimetypes;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
class q0 extends WebView {

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    interface a {
        void T(boolean z11);

        void Z(String str);

        void r();
    }

    q0(Context context) {
        super(context);
    }

    void a(a aVar, String str) {
        r0 r0Var = new r0(aVar);
        p0 p0Var = new p0(aVar);
        setWebViewClient(r0Var);
        setWebChromeClient(p0Var);
        setOverScrollMode(2);
        setBackgroundColor(0);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setJavaScriptEnabled(false);
        loadDataWithBaseURL("", str, Mimetypes.MIMETYPE_HTML, "UTF-8", "");
    }
}
