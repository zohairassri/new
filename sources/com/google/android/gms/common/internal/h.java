package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22764b;

    public h(String str, String str2) {
        n.m(str, "log tag cannot be null");
        n.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f22763a = str;
        this.f22764b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    private final String f(String str) {
        String str2 = this.f22764b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i11) {
        return Log.isLoggable(this.f22763a, i11);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            f(str2);
        }
    }

    public void c(String str, String str2, Throwable th2) {
        if (a(6)) {
            Log.e(str, f(str2), th2);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            f(str2);
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }
}
