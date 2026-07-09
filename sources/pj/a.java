package pj;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(d(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (Log.isLoggable(d(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        String strD = d(str);
        if (Log.isLoggable(strD, 6)) {
            Log.e(strD, str2, th2);
        }
    }

    private static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        String strD = d(str);
        if (Log.isLoggable(strD, 4)) {
            Log.i(strD, String.format(str2, obj));
        }
    }

    public static void f(String str, String str2, Object obj) {
        String strD = d(str);
        if (Log.isLoggable(strD, 5)) {
            Log.w(strD, String.format(str2, obj));
        }
    }
}
