package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f22905a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            com.google.android.gms.common.internal.n.l(context);
            com.google.android.gms.common.internal.n.l(th2);
            return false;
        } catch (Exception e11) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e11);
            return false;
        }
    }
}
