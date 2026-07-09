package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amazonaws.services.s3.internal.Constants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class t93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t93 f35349a = new t93();

    private t93() {
    }

    public static final t93 a() {
        return f35349a;
    }

    public static final boolean k(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                    sb2.append("javascript: ");
                    sb2.append(str);
                    webView.loadUrl(sb2.toString());
                    return true;
                }
            } catch (Exception e11) {
                e11.getMessage();
                l83.f30108a.getClass();
            }
        }
        return false;
    }

    public final void b(WebView webView, String str, JSONObject jSONObject) {
        j(webView, "init", jSONObject, str);
    }

    public final void c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        j(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void d(WebView webView, String str) {
        j(webView, "finishSession", str);
    }

    public final void e(WebView webView, String str, String str2) {
        j(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void f(WebView webView, String str, String str2) {
        j(webView, "setState", str2, str);
    }

    public final void g(WebView webView, String str, String str2) {
        j(webView, "setDeviceLockState", str2);
    }

    public final void h(WebView webView, String str, float f11) {
        j(webView, "setDeviceVolume", Float.valueOf(f11), str);
    }

    public final void i(WebView webView, JSONObject jSONObject) {
        j(webView, "setLastActivity", jSONObject);
    }

    final void j(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            l83.f30108a.getClass();
            return;
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("if(window.omidBridge!==undefined){omidBridge.");
        sb2.append(str);
        sb2.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb2.append(Constants.NULL_VERSION_ID);
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb2.append(string);
                } else {
                    sb2.append('\"');
                    sb2.append(string);
                    sb2.append('\"');
                }
            } else {
                sb2.append(obj);
            }
            sb2.append(",");
        }
        sb2.setLength(sb2.length() - 1);
        sb2.append(")}");
        String string2 = sb2.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            k(webView, string2);
        } else {
            handler.post(new s93(this, webView, string2));
        }
    }
}
