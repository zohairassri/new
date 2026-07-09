package com.instacart.library.truetime;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes10.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f47601a = false;

    static void b(String str, String str2) {
        if (f47601a) {
            Log.i(str, str2);
        }
    }

    static void c(boolean z11) {
        f47601a = z11;
    }

    static void d(String str, String str2) {
        if (f47601a) {
            Log.w(str, str2);
        }
    }

    static void a(String str, String str2) {
    }
}
