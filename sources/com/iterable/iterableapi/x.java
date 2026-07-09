package com.iterable.iterableapi;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class x {
    public static void a(String str, String str2) {
        e(3);
    }

    public static void b(String str, String str2) {
        if (e(6)) {
            Log.e(str, " ❤️ " + str2);
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        if (e(6)) {
            Log.e(str, " ❤️ " + str2, th2);
        }
    }

    private static int d() {
        if (g.f47667t == null) {
            return 6;
        }
        if (g.f47667t.q()) {
            return 2;
        }
        return g.f47667t.f47669b.f47771f;
    }

    private static boolean e(int i11) {
        return i11 >= d();
    }

    public static void f() {
        try {
            g("Iterable Call", Thread.currentThread().getStackTrace()[3].getFileName() + " => " + Thread.currentThread().getStackTrace()[3].getClassName() + " => " + Thread.currentThread().getStackTrace()[3].getMethodName() + " => Line #" + Thread.currentThread().getStackTrace()[3].getLineNumber());
        } catch (Exception unused) {
            b("Iterable Call", "Couldn't print info");
        }
    }

    public static void g(String str, String str2) {
        e(2);
    }

    public static void h(String str, String str2) {
        if (e(5)) {
            Log.w(str, " 🧡️ " + str2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (e(5)) {
            Log.w(str, " 🧡 " + str2, th2);
        }
    }
}
