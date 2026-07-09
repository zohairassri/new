package cm;

import android.util.Log;
import com.google.android.gms.internal.ads.yx3;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final yx3 f17991a = yx3.c(4000);

    public static void a(String str) {
        if (!j(3) || str.length() <= 4000) {
            return;
        }
        for (String str2 : f17991a.d(str)) {
        }
    }

    public static void b(String str, Throwable th2) {
        j(3);
    }

    public static void c(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z11 = true;
            for (String str2 : f17991a.d(str)) {
                if (z11) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z11 = false;
            }
        }
    }

    public static void d(String str, Throwable th2) {
        if (j(6)) {
            Log.e("Ads", str, th2);
        }
    }

    public static void e(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z11 = true;
            for (String str2 : f17991a.d(str)) {
                if (z11) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z11 = false;
            }
        }
    }

    public static void f(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z11 = true;
            for (String str2 : f17991a.d(str)) {
                if (z11) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z11 = false;
            }
        }
    }

    public static void g(String str, Throwable th2) {
        if (j(5)) {
            Log.w("Ads", str, th2);
        }
    }

    static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb2.append(str);
        sb2.append(" @");
        sb2.append(lineNumber);
        return sb2.toString();
    }

    public static void i(String str, Throwable th2) {
        if (j(5)) {
            if (th2 != null) {
                g(h(str), th2);
            } else {
                f(h(str));
            }
        }
    }

    public static boolean j(int i11) {
        return i11 >= 5 || Log.isLoggable("Ads", i11);
    }
}
