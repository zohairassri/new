package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38285a = new Object();

    public static void a(String str, String str2) {
        synchronized (f38285a) {
            g(str2, null);
        }
    }

    public static void b(String str, String str2) {
        synchronized (f38285a) {
            Log.i(str, g(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f38285a) {
            Log.w(str, g(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f38285a) {
            Log.w(str, g(str2, th2));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f38285a) {
            Log.e(str, g(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        synchronized (f38285a) {
            Log.e(str, g(str2, th2));
        }
    }

    public static String g(String str, Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (f38285a) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(strReplace2).length() + 1);
        sb2.append(str);
        sb2.append("\n  ");
        sb2.append(strReplace2);
        sb2.append("\n");
        return sb2.toString();
    }
}
