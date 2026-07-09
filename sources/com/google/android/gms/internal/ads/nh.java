package com.google.android.gms.internal.ads;

import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31376a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f31377b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31378c = nh.class.getName();

    public static void a(String str, Object... objArr) {
        if (f31377b) {
            e(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        e(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        Log.e(f31376a, e(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Log.e(f31376a, e(str, objArr), th2);
    }

    private static String e(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i11 = 2;
        while (true) {
            if (i11 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i11].getClassName().equals(f31378c)) {
                String className = stackTrace[i11].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i11].getMethodName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length());
                sb2.append(strSubstring2);
                sb2.append(InstructionFileId.DOT);
                sb2.append(methodName);
                string = sb2.toString();
                break;
            }
            i11++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str2);
    }
}
