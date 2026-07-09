package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f22783a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f22784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f22785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22786d;

    public static int a(Context context) {
        b(context);
        return f22786d;
    }

    private static void b(Context context) {
        synchronized (f22783a) {
            try {
                if (f22784b) {
                    return;
                }
                f22784b = true;
                try {
                    Bundle bundle = bn.d.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f22785c = bundle.getString("com.google.app.id");
                    f22786d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
