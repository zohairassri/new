package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class i7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f41451f = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41452a = "googleads.g.doubleclick.net";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41453b = "/pagead/ads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f41454c = "ad.doubleclick.net";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f41455d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d7 f41456e;

    public i7(d7 d7Var) {
        this.f41456e = d7Var;
    }

    private final Uri h(Uri uri, String str) throws zzcw {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f41454c)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzcw("Parameter already exists: dc_ms");
                    }
                    String string = uri.toString();
                    int iIndexOf = string.indexOf(";adurl");
                    if (iIndexOf != -1) {
                        int i11 = iIndexOf + 1;
                        return Uri.parse(string.substring(0, i11) + "dc_ms=" + str + ";" + string.substring(i11));
                    }
                    String encodedPath = uri.getEncodedPath();
                    int iIndexOf2 = string.indexOf(encodedPath);
                    return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzcw("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i12 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i12) + "ms=" + str + "&" + string2.substring(i12));
        } catch (UnsupportedOperationException unused2) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws zzcw {
        try {
            return h(uri, this.f41456e.d(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final Uri b(Uri uri, Context context) {
        return h(uri, this.f41456e.c(context));
    }

    public final void c(MotionEvent motionEvent) {
        this.f41456e.f(motionEvent);
    }

    public final void d(String str, String str2) {
        this.f41452a = str;
        this.f41453b = str2;
    }

    public final void e(String str) {
        this.f41455d = str.split(",");
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.f41455d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean g(Uri uri) {
        uri.getClass();
        try {
            if (uri.getHost().equals(this.f41452a)) {
                if (uri.getPath().equals(this.f41453b)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
