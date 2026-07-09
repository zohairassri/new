package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile zo.l f40186a = zo.l.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40187b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z11 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f40186a.c()) {
            return ((Boolean) f40186a.b()).booleanValue();
        }
        synchronized (f40187b) {
            try {
                if (f40186a.c()) {
                    return ((Boolean) f40186a.b()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    if (a(context)) {
                        z11 = true;
                    }
                }
                f40186a = zo.l.d(Boolean.valueOf(z11));
                return ((Boolean) f40186a.b()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
