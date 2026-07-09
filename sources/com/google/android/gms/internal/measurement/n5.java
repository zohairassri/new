package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserManager f40588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f40589b = !a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f40590c = false;

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    private static boolean d(Context context) {
        if (f40589b) {
            return true;
        }
        synchronized (n5.class) {
            try {
                if (f40589b) {
                    return true;
                }
                boolean zE = e(context);
                if (zE) {
                    f40589b = zE;
                }
                return zE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean e(Context context) {
        boolean z11;
        boolean z12 = true;
        int i11 = 1;
        while (true) {
            z11 = false;
            if (i11 > 2) {
                break;
            }
            if (f40588a == null) {
                f40588a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f40588a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z12 = false;
                }
            } catch (NullPointerException e11) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e11);
                f40588a = null;
                i11++;
            }
        }
        z11 = z12;
        if (z11) {
            f40588a = null;
        }
        return z11;
    }
}
