package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class eo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f25823d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25824a = "ad.doubleclick.net";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f25825b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yn f25826c;

    public eo(yn ynVar) {
        this.f25826c = ynVar;
    }

    private final Uri f(Uri uri, String str) throws zzazi {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f25824a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzazi("Parameter already exists: dc_ms");
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
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzazi("Query parameter already exists: ms");
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
            throw new zzazi("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f25825b;
            for (int i11 = 0; i11 < 3; i11++) {
                if (host.endsWith(strArr[i11])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final yn b() {
        return this.f25826c;
    }

    public final void c(MotionEvent motionEvent) {
        this.f25826c.e(motionEvent);
    }

    public final Uri d(Uri uri, Context context, View view, Activity activity) throws zzazi {
        try {
            return f(uri, this.f25826c.f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzazi("Provided Uri is not in a valid state");
        }
    }

    public final boolean e(Uri uri) {
        if (a(uri)) {
            String[] strArr = f25823d;
            for (int i11 = 0; i11 < 3; i11++) {
                if (uri.getPath().endsWith(strArr[i11])) {
                    return true;
                }
            }
        }
        return false;
    }
}
