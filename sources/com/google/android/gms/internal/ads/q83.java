package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class q83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c93 f33476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f33477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33478c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f33479d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f33480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f33481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r83 f33482g;

    private q83(c93 c93Var, WebView webView, String str, List list, String str2, String str3, r83 r83Var) {
        this.f33476a = c93Var;
        this.f33477b = webView;
        this.f33482g = r83Var;
        this.f33481f = str2;
        this.f33480e = str3;
    }

    public static q83 a(c93 c93Var, WebView webView, String str, String str2) {
        if (str2 != null) {
            na3.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new q83(c93Var, webView, null, null, str, str2, r83.HTML);
    }

    public static q83 b(c93 c93Var, WebView webView, String str, String str2) {
        na3.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new q83(c93Var, webView, null, null, str, "", r83.JAVASCRIPT);
    }

    public final c93 c() {
        return this.f33476a;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f33478c);
    }

    public final Map e() {
        return Collections.unmodifiableMap(this.f33479d);
    }

    public final WebView f() {
        return this.f33477b;
    }

    public final String g() {
        return this.f33481f;
    }

    public final String h() {
        return this.f33480e;
    }

    public final r83 i() {
        return this.f33482g;
    }
}
