package com.comscore.util.log;

import com.comscore.util.setup.Setup;

/* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
/* JADX INFO: loaded from: classes8.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f19490a = 30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f19491b = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static OnErrorLogListener f19492c;
    public static LogHelper log;

    /* JADX INFO: compiled from: r8-map-id-9e7ee9a42fe7cc4cda6cf7a37f69f1db09989c88ba665561dcfb218d3d1b2345 */
    public interface OnErrorLogListener {
        void onLogError(String str, Throwable th2);
    }

    private static void a(String str, Throwable th2) {
        OnErrorLogListener onErrorLogListener = f19492c;
        if (onErrorLogListener == null) {
            return;
        }
        onErrorLogListener.onLogError(str, th2);
    }

    public static void d(String str) {
        LogHelper logHelper;
        if (f19491b >= 30003 && (logHelper = log) != null) {
            logHelper.d(str);
        }
    }

    public static void e(String str) {
        LogHelper logHelper;
        a(str, null);
        if (f19491b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str);
        }
    }

    public static int getLogLevel() {
        if (Setup.isSetUpFinished()) {
            try {
                return getLogLevelNative();
            } catch (UnsatisfiedLinkError e11) {
                e("Error using the native library: ", e11);
            }
        }
        return f19491b;
    }

    private static native int getLogLevelNative();

    public static void i(String str) {
        LogHelper logHelper;
        if (f19491b >= 30004 && (logHelper = log) != null) {
            logHelper.i(str);
        }
    }

    public static void setLogLevel(int i11) {
        if (i11 < 30000 || i11 > 30004) {
            return;
        }
        if (Setup.isSetUpFinished()) {
            try {
                setLogLevelNative(i11);
            } catch (UnsatisfiedLinkError e11) {
                e("Error using the native library: ", e11);
            }
        }
        f19491b = i11;
    }

    private static native void setLogLevelNative(int i11);

    public static void setOnErrorLogListener(OnErrorLogListener onErrorLogListener) {
        f19492c = onErrorLogListener;
    }

    public static void syncrhonizeLogLevelWithNative() {
        try {
            int i11 = f19491b;
            if (30000 != i11) {
                setLogLevelNative(i11);
            } else {
                f19491b = getLogLevelNative();
            }
        } catch (UnsatisfiedLinkError e11) {
            e("Error using the native library: ", e11);
        }
    }

    public static void w(String str) {
        LogHelper logHelper;
        if (f19491b >= 30002 && (logHelper = log) != null) {
            logHelper.w(str);
        }
    }

    public static void d(String str, String str2) {
        LogHelper logHelper;
        if (f19491b >= 30003 && (logHelper = log) != null) {
            logHelper.d(str, str2);
        }
    }

    public static void i(String str, String str2) {
        LogHelper logHelper;
        if (f19491b >= 30004 && (logHelper = log) != null) {
            logHelper.i(str, str2);
        }
    }

    public static void w(String str, String str2) {
        LogHelper logHelper;
        if (f19491b >= 30002 && (logHelper = log) != null) {
            logHelper.w(str, str2);
        }
    }

    public static void e(String str, String str2) {
        LogHelper logHelper;
        a(str2, null);
        if (f19491b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str, str2);
        }
    }

    public static void e(String str, Throwable th2) {
        LogHelper logHelper;
        a(str, th2);
        if (f19491b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        LogHelper logHelper;
        a(str2, th2);
        if (f19491b >= 30001 && (logHelper = log) != null) {
            logHelper.e(str, str2, th2);
        }
    }
}
